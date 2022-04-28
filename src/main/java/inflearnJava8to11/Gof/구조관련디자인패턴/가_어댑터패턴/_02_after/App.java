package Gof.구조관련디자인패턴.가_어댑터패턴._02_after;

import Gof.구조관련디자인패턴.가_어댑터패턴._02_after.security.LoginHandler;
import Gof.구조관련디자인패턴.가_어댑터패턴._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
