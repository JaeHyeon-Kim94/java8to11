package me.whiteship.java8to11.바_Optional소개와API;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));


        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);

//=====================================================================================================================
        //1-1. Optional을 통한 null 체크
//        //spring_boot.getProgress().getStudyDuration()을 하기 위해서 기존에는
//        Progress progress = spring_boot.getProgress();
//
//        if(progress != null){
//            System.out.println(progress.getStudyDuration());
//        }
//        //이런 식으로 직접 null 체크를 해야했음. 그러나 체크가 생략될 시 에러가 발생할 수 있고, 애초에 null 리턴하는것 자체가 문제임.

        //Optional로 감싸는 것으로 해결 가능.
        //**Optional은 return type으로만 사용하는게 바람직함**
        //메서드 매개변수로 쓸 순 있지만(문법적 오류는 아님), 받는 Optional 자체가 null일 가능성 고려해야 함.
        //Map의 key로 사용하는 경우도 마찬가지.
        //인스턴스 필드로 사용하는 경우에는 해당 필드가 있을 수도 있고 없을 수도 있다는 의미가 되므로 필요성에 대해 고민해보아야 함. 도메인 클래스 설계의 문제.



        //1-2. Optional은 primitive type용 Optional이 존재. OptionalInt, OptionalLong, OptionalDouble
        //그냥 Optional에 primitive type을 넣을 순 있지만 안에서 boxing과 unboxing이 이루어지므로 성능 측면에서 바람직하지 못함.



        //1-3. Optional을 리턴할 때 임시로 빈 값을 리턴해야 하는 경우에는 Optional.empty() 사용할것.



        //1-4. 다른 컨테이터 성격의 인스턴스들을 Optional로 감싸지 말 것.
        //Collection, Array, Map, Optional 등은 비어있는지를 표현할 수 있는 것들임.

//=====================================================================================================================

        //2-1. Optional.isPresent(), Optional.isEmpty()
        Optional<OnlineClass> spring = springClasses.stream()
                                                .filter(oc->oc.getTitle().startsWith("spring"))
                                                .findFirst();

        boolean present1 = spring.isPresent();
        System.out.println(present1);


        Optional<OnlineClass>  onlineClass = springClasses.stream()
                                                .filter(oc->oc.getTitle().startsWith("abcd"))
                                                .findFirst();

        boolean present1_1 = onlineClass.isPresent();       //<--> Optional.isEmpty()
        System.out.println(present1_1);



        //2-2. Optional.get() : Optional에 있는 값 가져오기
//        OnlineClass onlineClass1 = onlineClass.get();
//        System.out.println(onlineClass1.getTitle());A


        //abcd라는 타이틀을 가진 객체 없으므로 onlineClass.isPresent() 시 runtime exception.

        //2-3. Optional.orElse(), Optional.orElseGet(Supplier), Optional.ifPresent(Consumer)
        //orElse : Optional에 값이 있으면 가져오고 없는 경우에 ~~를 리턴하라.
        //orElseGet : Optional에 값이 있으면 가져오고 없는 경우에 ~~를 하라.
        //ifPresent : Optional에 값이 있는 경우에 그 값을 가지고 ~~를 하라.

        OnlineClass onlineClass2 = spring.orElse(createNewClass());
        OnlineClass onlineClass2_1 = onlineClass.orElse(createNewClass());

        //orElse시 받아오는 인자값이 없으면 createNewClass()에서 받아옴.
        //있더라도 println 메서드는 호출되는 것을 알 수 있음.
        //이와 달리 orElseGet()은 Supplier를 매개변수로 받는데 이 경우는 있으면 println 메서드 차제가 실행이 안됨.
        OnlineClass onlineClass2_2 = spring.orElseGet(()->createNewClass());
                                // = spring.orElseGet(App::createNewClass);
        OnlineClass onlineClass2_3 = onlineClass.orElseGet(()->createNewClass());
                                // = onlineClass.orElseGet(App::createNewClass);


        //2-4 Optional.orElseThrow() : Optional에 값이 있으면 가져오고 없는 경우 에러를 던져라.


        //2-5 기타
        // - Optional.filter(Predicate) : Optional에 들어있는 값 걸러내기
        // - Optional.map(Function), Optional.flatMap(Function)
        // -- flatMap의 경우 Optional 안에 들어있는 인스턴스가 Optional인 경우 사용하면 편리
    }


    private static OnlineClass createNewClass(){
        System.out.println("creating new online class");
        return new OnlineClass(10, "New Class", false);
    }
}
