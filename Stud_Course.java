// This Java code defines a class `Stud_Course` that extends a class named `student`. Within the
// `Stud_Course` class, there is a method `course()` that initializes an array of subjects and a 2D
// array of marks. It then iterates over the marks array to check if any student has scored less than
// 40 in any subject. If a student has scored less than 40, it prints a message indicating the
// student's name, the subject, and the score.
public class Stud_Course extends student {
    void course()
    {
        String[] subjects = {"DevOps", "Machine Learning", "C#"};
        int[][] marks = {
            {50, 80, 30}
            
        };

        // Assuming each row represents a student and each column represents a subject
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println("Siya Ram " + (i + 1) + " scored less than 40 in the  " + subjects[j]);
                }
            }     
        }
        }
    public static void main(String args[])
    {
        Stud_Course sc = new Stud_Course();
        sc.stud_det();
        sc.course();
        
    }
}

