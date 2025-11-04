package lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

// 입력: 1개 (T), 출력: boolean
public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };
        System.out.println("predicate1.test(10) = " + predicate1.test(10));

        Predicate<Integer> predicate2 = value -> value % 2 == 0;
        System.out.println("predicate2.test(10) = " + predicate2.test(10));

        /**
         *  Function<T, Boolean>로도 Predicate<T>와 같은 기능 구현 가능하지만,
         *  목적(조건 검사)과 용도(필터링 등)에 대해 더 분명히 표현하고, 가독성과 유지보수를 위해 Predicate<T>라는 별도의 함수형 인터페이스가 마련되었다.
         */
        Function<Integer, Boolean> function = value -> value % 2 == 0;
        System.out.println("function.apply(10) = " + function.apply(10));
    }
}
