package Gof.구조관련디자인패턴.라_데코레이터패턴._01_before;

public class TrimmingCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment){
        return comment.replace("...", "");
    }

}
