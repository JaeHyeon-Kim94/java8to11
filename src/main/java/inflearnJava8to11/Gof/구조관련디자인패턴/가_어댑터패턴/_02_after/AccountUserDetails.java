package Gof.구조관련디자인패턴.가_어댑터패턴._02_after;

import Gof.구조관련디자인패턴.가_어댑터패턴._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
