
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam score: ");
        int exam = input.nextInt();

        System.out.print("Enter assessment score: ");
        int assessment = input.nextInt();

        System.out.print("Enter fees paid ( 1 for Yes, 0 for No): ");
        int fees = input.nextInt();

        int total = exam + assessment;

        // Check exam score
        if (exam >= 25) {
            System.out.println("Exam: Passed");
        } else {
            System.out.println("Exam: Failed");
        }

        // Check assessment score
        if (assessment >= 15) {
            System.out.println("Assessment: Passed");
        } else {
            System.out.println("Assessment: Failed");
        }

        // Check final result
        if (exam < 25 && assessment < 15) {
            System.out.println("Result: Repeated");
        }
        else if (exam < 25 || assessment < 15) {
            System.out.println("Result: Failed");
        }
        else if (total == 39) {
            System.out.println("Result: Condoned");
        }
        else if (total > 39 && fees == 1) {
            System.out.println("Result: Certificate Issued");
        }
        else if (total > 39 && fees == 0) {
            System.out.println("Result: Passed but fees is not paid");
        }

    
    }
}
