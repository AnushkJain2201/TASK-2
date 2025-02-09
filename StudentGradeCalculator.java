import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks obtained in English:");
        int englishMarks = scanner.nextInt();

        System.out.println("Enter the marks obtained in Math:");
        int mathMarks = scanner.nextInt();

        System.out.println("Enter the marks obtained in Science:");
        int scienceMarks = scanner.nextInt();

        // Calculate total marks
        int totalMarks = englishMarks + mathMarks + scienceMarks;

        // Calculate average marks
        double averagePercentage = totalMarks / 3.0;

        // Determine the grade based on average marks
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
