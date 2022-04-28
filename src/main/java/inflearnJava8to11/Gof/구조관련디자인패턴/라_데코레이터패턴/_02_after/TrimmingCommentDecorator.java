package Gof.구조관련디자인패턴.라_데코레이터패턴._02_after;

public class TrimmingCommentDecorator extends CommentDecorator {
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
        //System.out.println(this.getClass().getName());
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        System.out.println("trim!");
        return comment.replace("...", "");
    }
}
