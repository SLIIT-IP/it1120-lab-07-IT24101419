import java.util.Scanner;

public class IT24101419Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[4];
        int totalMarks = 0;

        System.out.println("Enter marks for four subjects:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter subject Mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
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

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);

    }
}