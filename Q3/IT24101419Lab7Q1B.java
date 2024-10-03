import java.util.Scanner;

public class IT24101419Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int student = 1; student <= 3; student++) {
            System.out.print("Student " + student+": " );
            
            String[] marksInput = input.nextLine().split(" ");
            
            
            int[] marks = new int[4];
            int totalMarks = 0;
            
            for (int i = 0; i < 4; i++) {
                marks[i] = Integer.parseInt(marksInput[i]);
                totalMarks += marks[i];
            }

         
            double average = totalMarks / 4.0;

            
            String grade;
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else if (average >= 0 && average < 50) {
                grade = "Fail";
            } else {
                grade = "Invalid Marks";
            }


            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

            }
}