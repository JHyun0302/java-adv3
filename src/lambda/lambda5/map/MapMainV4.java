package lambda.lambda5.map;

import static lambda.lambda5.map.StringToIntegerMapper.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV4 {

    public static void main(String[] args) {
        List<String> list = java.util.List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = map(list, s1 -> Integer.valueOf(s1));
        System.out.println("numbers = " + numbers);

        // 문자열의 길이
        List<Integer> lengths = map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }
}
