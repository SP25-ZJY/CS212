package lecture_note_6_7.course;

public class CourseZee {
    private String name;
    private int [] grades;

    public CourseZee(){
        name = "none";
        grades = new int[25];
    }

    public CourseZee(String name, int [] grades){
        this.name = name;
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }

    public CourseZee(String name, int size){
        this.name = name;
        grades = new int[size];
    }

    public double averageGrade(){
        int total = 0;
        int average = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        average = total / grades.length;

        return average;
    }

    public void update(int newGrade, int pos){
        grades[pos] = newGrade;
    }

    public int search(int key){
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == key)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        String course = "Course { name: " + name;
        for (int i = 0; i < grades.length; i++) {
            course += "grades " + i + ": " + grades[i];

        }
        course += "}";
        return course;
    }
}
