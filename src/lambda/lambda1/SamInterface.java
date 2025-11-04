package lambda.lambda1;

@FunctionalInterface // [함수형 인터페이스임을 선언] : 추상 메서드 추가하면 컴파일 오류 발생
public interface SamInterface {
    void run();
//    void gogo(); // 컴파일 오류
}
