package Gof.구조관련디자인패턴.라_데코레이터패턴._01_before;

public class SpamFilteringCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if(!isSpam){
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment){
        return comment.contains("http");
    }

}
