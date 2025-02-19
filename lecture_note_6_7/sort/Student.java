package lecture_note_6_7.sort;

public class Student {
    private String name;
    private int[] grades; // Stores 5 grades

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Method to calculate the average grade
    public double getAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.length; // Cast to double for accurate division
    }

    // compareTo method to compare based on average
    public int compareTo(Student other) {
        return Double.compare(this.getAverage(), other.getAverage());
    }

    @Override
    public String toString() {
        return "Student{ name: " + name + " - Average: " + getAverage() + " }";
    }
}