package Gof.구조관련디자인패턴.가_어댑터패턴._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
