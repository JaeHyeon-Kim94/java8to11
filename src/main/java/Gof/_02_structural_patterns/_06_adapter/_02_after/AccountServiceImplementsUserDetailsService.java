package Gof._02_structural_patterns._06_adapter._02_after;

import Gof._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import Gof._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

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
