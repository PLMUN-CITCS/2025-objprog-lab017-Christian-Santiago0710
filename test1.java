import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            char grade = calculateGrade(score);
            System.out.println("Your Grade is: " + grade);
        } else {
            System.out.println("Invalid input. Please enter a valid integer score.");
        }
        scanner.close();
    }

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
