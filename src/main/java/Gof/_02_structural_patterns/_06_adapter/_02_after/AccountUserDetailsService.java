package Gof._02_structural_patterns._06_adapter._02_after;

import Gof._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import Gof._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUserName = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUserName);

        //기존의 코드(target, adaptee)에는 손을 댈 수 없는 경우에
        //adapter 패턴을 통해 문제를 해결할 수 있음.

        //adaptee에 해당하는 클래스를 변경할 수 있는 경우에는
        //target interface를 구현하는 방식으로 해결할 수 있음
    }
}
