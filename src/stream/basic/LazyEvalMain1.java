package stream.basic;

import java.util.List;
import lambda.lambda5.mystream.MyStreamV3;

public class LazyEvalMain1 {

    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        ex1(data);
        ex2(data);
    }

    /**
     * 일괄 처리(Batch Processing)
     * 데이터 전체를 한 번에 처리하고, 결과를 저장해두었다가 다음 공정을 또 한 번에 수행
     */
    private static void ex1(List<Integer> data) {
        System.out.println("== MyStreamV3 시작 ==");
        List<Integer> result = MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행: " + i + "(" + isEven + ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행: " + i + " -> " + mapped);
                    return mapped;
                })
                .toList();
        System.out.println("result = " + result);
        System.out.println("== MyStreamV3 종료 ==");
    }

    /**
     * 파이프 라인(Pipeline Processing)
     * 한 요소가 한 공정을 마치면, 즉시 다음 공정으로 넘어가는 구조
     */
    private static void ex2(List<Integer> data) {
        System.out.println("== Stream API 시작 ==");
        List<Integer> result = data.stream()
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행: " + i + "(" + isEven + ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행: " + i + " -> " + mapped);
                    return mapped;
                })
                .toList();
        System.out.println("result = " + result);
        System.out.println("== Stream API 종료 ==");
    }
}
