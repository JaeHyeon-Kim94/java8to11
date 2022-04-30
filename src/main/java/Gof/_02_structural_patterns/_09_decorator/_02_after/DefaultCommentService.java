package Gof._02_structural_patterns._09_decorator._02_after;


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
