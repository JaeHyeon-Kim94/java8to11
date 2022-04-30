package Gof._02_structural_patterns._07_bridge._03_java;

import java.sql.*;

public class JdbcExample {


    public static void main(String[] args) throws ClassNotFoundException {
        //브릿지 패턴이 적용된 대표적인 예제
        Class.forName("org.h2.Driver");

        try(Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")){
            String sql = "CREATE TABLE ACCOUNT" +
                    "(id INTEGER not NULL, "  +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id )) " ;

            Statement statement = conn.createStatement();
            statement.execute(sql);

            PreparedStatement statement1 = conn.prepareStatement(sql);
            ResultSet   resultSet = statement.executeQuery(sql);


        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    //DriverManager, Connection, Statement는 추상화쪽
    //Drivaer는 Implementation쪽(디테일)에 해당

    //새로운 jdbc를 사용하더라도 jdbc코드를 바꿀 필요 없음(아주 디테일한 sql, driver url등등 제외하고)
    //즉, 추상적인 인터페이스 코드(DriverManager, Connection 등)가 바뀌진 않음.    Open Closed Principle


}
