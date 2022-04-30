package Gof._02_structural_patterns._09_decorator._01_before;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment){
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
    }

    //단순히 출력하는 것이 아니라 trim을 하고싶은 경우, CommentService를 상속받는 TrimmingCommentService 구현.

    //but 상속을 사용하며, 컴파일 타임에 고정적으로 코드가 정해짐. 유연하지 못함.
    //--> trimming뿐만 아니라 부가기능이 더 추가된다면? 예를 들어 SpamFiltering도 하고 Trim도 하는..

    //TrimmingAndSpamFilteringService를 새로 정의해야. 다중 상속은 허용되지 않으므로.
    //상속만으로는 문제 해결을 계속 이어나가기 어렵다.


    //How?

    //->CommentService는 인터페이스(Component)로. (Wrapper라고도 함)

    //->CommentService에서 하던 구체적인 일(addComment)은 ConcreteComponent로,

    //->TrimmingCommentService와 SpamFilteringCommentService를 추상화시킨 Decorator를 만든다.

    //->TrimmingCommentService와 SpamFilteringCommentService에서 하던 구체적인 일은 Concrete Decorator에서 맡는다.
}
