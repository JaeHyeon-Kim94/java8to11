package Gof._02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");


        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("jaheyon");
        emailMessage.setTo("java");
        emailMessage.setSubject("GoF");
        emailMessage.setText("Facade");

        emailSender.sendEmail(emailMessage);


        //특정 라이브러리에 대한 구체적인 의존성이 사라진 것을 확인할 수 있음.
        //단, Facade에 대한 의존성은 어쩔 수 없음.
        //EmailSender를 인터페이스로 만들고 이를 구현하는 클래스들을 통해 설계한다면 좀 더 유연해질 수 있음.
    }

}
