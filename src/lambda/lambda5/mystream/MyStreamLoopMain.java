package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();

        /**
         * 외부 반복: 중간에 `break` , `continue` 등이 들어가는 로직을 구현하기 쉽다.
         */
        for (String s : result) {
            System.out.println("name: " + s);
        }

        /**
         * 내부 반복: 스트림의 `forEach` 처럼, 반복 제어를 스트림에 맡기고 개발자는 "어떤 작업을 할지 (`Consumer` )"만 정의하면 된다.
         */
        MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .forEach(name -> System.out.println("name: " + name));
    }
}
