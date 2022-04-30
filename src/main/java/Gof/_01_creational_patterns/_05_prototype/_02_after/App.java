package Gof._01_creational_patterns._05_prototype._02_after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
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

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());


        //TODO (특징)
        //1. clone != githubIssue
        //2. clone.equlas(githubIssue) == true  // 그 안의 데이터가 같은지를 비교하는 것.
        //3. clone.getClass() == githubIssue.getClass()
        System.out.println(clone != githubIssue);                       //true
        System.out.println(clone.equals(githubIssue));                  //true
        System.out.println(clone.getClass() == githubIssue.getClass()); //true
                                                                        // 이 셋이 모두 true여야 조건 적합



        //+++

        //Shallow copy(얕은 복사), Deep copy
        //java에서 clone은 Shallow copy

        //알아서 githubrepository라는 객체를 생성하고 데이터를 집어넣어서 clone에 넣어놨는지 (deep copy)
        //동일한 githubIssue가 참조하고 있던 repository를 clone에서도 그대로 참조하고 있는지 (shallow copy)

        System.out.println(clone.getRepository() == githubIssue.getRepository());

        //프로토타입의 변화에 clone도 영향 받음.
        //이를 해결하려면 clone()를 오버라이드 해서 deep copy로
    }
}
