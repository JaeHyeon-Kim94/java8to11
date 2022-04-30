package Gof._02_structural_patterns._09_decorator._02_after;

public class SpamFilteringCommentDecorator extends CommentDecorator {

    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
        //System.out.println(this.getClass().getName());
    }

    @Override
    public void addComment(String comment) {
        if(isNotSpam(comment)){
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        System.out.println("filterSpam!");
        return !comment.contains("http");
    }


}
