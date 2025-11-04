package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// [UnaryOperator]: 입력: 1개 (T), 출력: 1개(T, 입력과 동일)
// [BinaryOperator]: 입력: 2개 (T, T), 출력: 1개(T, 입력과 동일)
public class OperatorMain {

    public static void main(String[] args) {
        // UnaryOperator: 단항 연산
        Function<Integer, Integer> square1 = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;
        System.out.println("square1 = " + square1.apply(5));
        System.out.println("square2 = " + square2.apply(5));

        // BinaryOperator(BinaryOperator<T>): 이항 연산, T(입력), T(입력), T(출력)
        // BiFunction(BiFunction<T, T, T>): T(입력), T(입력), T(출력)
        BiFunction<Integer, Integer, Integer> additional1 = (a, b) -> a + b; // 입력
        BinaryOperator<Integer> additional2 = (a, b) -> a + b;

        System.out.println("additional1 = " + additional1.apply(1, 2));
        System.out.println("additional2 = " + additional2.apply(1,2));
    }
}
