package Gof.구조관련디자인패턴.라_데코레이터패턴._02_after;

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
