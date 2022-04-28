package Gof.객체생성관련디자인패턴.마_prototype._01_before;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jaehyeon");
        repository.setName("prototype");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바 코드는 어떻게 실행되는 것인가?");

        String url = githubIssue.getUrl();
        System.out.println(url);

        //GithubIssue의 다른 인스턴스가 필요한 경우에 데이터를 하나하나 넣어 만드는 것이 아니라
        //대부분의 데이터가 같고 url만 달라야 한다면

    //  GithubIssue clone = githubIssue.clone();    //컴파일 에러인 이유는 protected.
                                                    //Clonable인터페이스 구현하고 clone메서드 오버라이드 필요


        //TODO (특징)
        //1. clone != githubIssue
        //2. clone.equlas(githubIssue) => true여야 한다. 그 안의 데이터가 같은지를 비교하는 것.


    }
}
