package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

public class Ex1_Number {

    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);

        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    /**
     * 어떻게 수행해야 하는지 수행 절차를 명시 -> [명령형 프로그래밍]
     * 어떻게(How) 수행되어야 하는지, 즉 수행 절차를 명시하는 방식
     */
    static List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) { // 짝수 필터링
                int numberX2 = number * 2;
                result.add(numberX2);
            }
        }
        return result;
    }

    /**
     *  무엇을 수행해야 하는지 원하는 결과에 초점을 맞춘다. -> [선언적 프로그래밍]
     *  무엇(What)을 수행해야 하는지, 즉 원하는 결과를 명시하는 방식
     */
    static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filteredList = GenericFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> mappedList = GenericMapper.map(filteredList, n -> n * 2);
        return mappedList;
    }
}
