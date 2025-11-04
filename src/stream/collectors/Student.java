package stream.collectors;

public class Student {
    private String name;
    private int grade;
    private int score;

    public Student(String name, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
