package Gof._02_structural_patterns._07_bridge._03_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {
    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    //보는 관점에 따라 다른 패턴이라고 말할 순 있겠지만
    //추상화된 것과 구체적인 것이 분리되어있다는 관점에서 본다면 브릿지 패턴으로 볼 수 있음.

    //어떤 logger를 만들든 LoggerFactory.getLogger 변하지 X
    //logger를 강제당하지 않고 사용자가원하는 logger로 바꿀 수 있음.

    //로깅 퍼사드

}
