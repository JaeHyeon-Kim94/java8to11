package Gof.구조관련디자인패턴.가_어댑터패턴._02_after;

public class AccountService {

    //security 패키지 안에 있는 클래스 및 인터페이스들은 재사용 가능하지만
    //AccountService와 Account는 Application에 따라 달라지는 것.
    //다른 Application에서는 다른 Account 정의해야.

    //security 클래스 및 인터페이스들은 target 및 client code에 해당하고,
    //Account 클래스들은 adaptee에 해당.

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
