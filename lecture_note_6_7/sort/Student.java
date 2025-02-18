package lecture_note_6_7.sort;

public class Student {
    private String name;
    private int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // compareTo method (without implementing Comparable)
    public int compareTo(Student other) {
        return this.score - other.score; // Compare based on score
    }

}