package Gof.구조관련디자인패턴.라_데코레이터패턴._02_after;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment){
        commentService.addComment(comment);
    }

}
