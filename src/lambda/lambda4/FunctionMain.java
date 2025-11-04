package lambda.lambda4;

import java.util.function.Function;

// 입력: 1개 (T), 출력: 1개 (R)
public class FunctionMain {

    public static void main(String[] args) {
        // 익명 클래스
        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println("function1 = " + function1.apply("hello"));

        // 람다
        Function<String, Integer> function2 = s -> s.length();
        System.out.println("function2 = " + function2.apply("hello"));
    }
}
