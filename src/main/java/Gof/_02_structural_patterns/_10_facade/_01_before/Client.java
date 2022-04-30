package Gof._02_structural_patterns._10_facade._01_before;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        String to = "jaehyeon@mail.com";
        String from = "java@mail.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Gof.Test Mail from Java Program");
            message.setText("message");

            Transport.send(message);

            //너무 많은 의존성이 생김.
            //특정 library나 framework에 과하게 의존하는 것은 바람직하지 않음.
            //tightly coupled code는 유지보수에 불리.
            //해당 code는 mail 보내기 위해 java가 제공하는 라이브러리에 굉장히 의존적임.

        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
