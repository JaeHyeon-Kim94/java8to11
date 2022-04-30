package Gof._02_structural_patterns._09_decorator._02_after;

public class CommentDecorator implements CommentService {

    //감싸는 놈을 가지고 있음.
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
        System.out.println(this.getClass().getName()+"!");
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
