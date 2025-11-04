package lambda.lambda4;

// 입력: 없음, 출력: 없음
public class RunnableMain {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> System.out.println("Hello Runnable");
        runnable2.run();
    }
}
