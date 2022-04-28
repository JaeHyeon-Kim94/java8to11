package Gof.구조관련디자인패턴.가_어댑터패턴._02_after;

import Gof.구조관련디자인패턴.가_어댑터패턴._02_after.security.UserDetails;
import Gof.구조관련디자인패턴.가_어댑터패턴._02_after.security.UserDetailsService;

public class AccountServiceImplementsUserDetailsService implements UserDetailsService {

    public AccountImplementsUserDetails findAccountByUsername(String username) {
        AccountImplementsUserDetails account = new AccountImplementsUserDetails();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
