package Gof._02_structural_patterns._09_decorator._02_after;

public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming= true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        //동적인 조합
        if(enabledSpamFilter){
            commentService = new SpamFilteringCommentDecorator(commentService);
            System.out.println(commentService.getClass().getName() + "@");
        }

        if(enabledTrimming){
            commentService = new TrimmingCommentDecorator(commentService);
            System.out.println(commentService.getClass().getName() + "@@");
        }

        Client client = new Client(commentService);

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지");
        client.writeComment("http://whiteship.me");


        //commentService에 들어갈 인스턴스를 boolean 변수들의 값에 따라 ~Decorator로 감쌀 수 있음.

        //예를 들어 enabledTrimming이 true라면 commentService를 TrimmingCommentDecorator로 감싼다

        //둘 다 true일 때에는 SpamFilteringCommentDecorator로 감싸진 commentService를 TrimmingCommentDecorator로 또 감싼다.

        //그럼 원하는 부가적인 기능을 상속을 통하지 않고 문제를 해결할 수 있다. Decorator가 Decorator를 감싸는 걸 통해.
    }
}

/*
<result>

Gof.구조관련디자인패턴.라_데코레이터패턴._02_after.DefaultCommentService
Gof.구조관련디자인패턴.라_데코레이터패턴._02_after.SpamFilteringCommentDecorator!
Gof.구조관련디자인패턴.라_데코레이터패턴._02_after.SpamFilteringCommentDecorator@
Gof.구조관련디자인패턴.라_데코레이터패턴._02_after.TrimmingCommentDecorator!
Gof.구조관련디자인패턴.라_데코레이터패턴._02_after.TrimmingCommentDecorator@@
trim!
filterSpam!
오징어게임
trim!
filterSpam!
보는게 하는거 보다 재밌을 수가 없지
trim!
filterSpam!


*/

