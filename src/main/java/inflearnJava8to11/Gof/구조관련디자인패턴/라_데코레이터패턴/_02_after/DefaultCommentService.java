package Gof.구조관련디자인패턴.라_데코레이터패턴._02_after;


//Concrete Component
public class DefaultCommentService implements CommentService {

    public DefaultCommentService() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
