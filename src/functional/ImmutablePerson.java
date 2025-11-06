package functional;

public class ImmutablePerson {

    private final String name;

    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter만 제공, Setter 없음
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // 변경이 필요한 경우, 기존 객체를 수정하지 않고 새 객체를 반환
    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(name, newAge);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
