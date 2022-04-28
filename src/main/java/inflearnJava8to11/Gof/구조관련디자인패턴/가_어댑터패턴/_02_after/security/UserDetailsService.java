package Gof.구조관련디자인패턴.가_어댑터패턴._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
