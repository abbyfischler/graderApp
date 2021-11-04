import java.util.Scanner;

public class InteractiveGrader {
    public static void main(String[] args) {
        // Create a scanner to read in user input
        Scanner in = new Scanner(System.in);

        // Use in.nextDouble() to read in the next value
        // as a double

        System.out.println("Enter an assessment score (0-100) to add the score to the student’s record. Enter 999 when you are done.");

        int counter;
        double grades;
        double totalGrades;
        int runagain = 0;

        while (runagain == 0) {
            grades = 0;
            totalGrades = 0;
            counter = 0;

            while (grades != 999) {
                grades = in .nextDouble();
                totalGrades = totalGrades + grades;
                counter++;
            }


            totalGrades = totalGrades - 999;
            counter--;
            double average = totalGrades / counter;

            if (average >= 90) {
                if (average >= 94) {
                    System.out.printf("Current Grade: A(%2.1f / 100)\n", average);
                } else {
                    System.out.printf("Current Grade: -A(%2.1f / 100)\n", average);
                }
            } else if (average >= 80) {
                if (average >= 87) {
                    System.out.printf("Current Grade: B+(%2.1f / 100)\n", average);
                } else if (average >= 84) {
                    System.out.printf("Current Grade: B(%2.1f / 100)\n", average);
                } else {
                    System.out.printf("Current Grade: B-(%2.1f / 100)\n", average);
                }
            } else if (average >= 70) {
                if (average >= 77) {
                    System.out.printf("Current Grade: C+(%2.1f / 100)\n", average);
                } else if (average >= 74) {
                    System.out.printf("Current Grade: C(%2.1f / 100)\n", average);
                } else {
                    System.out.printf("Current Grade: C-(%2.1f / 100)\n", average);
                }
            } else if (average >= 0) {
                System.out.printf("Current Grade: F(%2.1f / 100)\n", average);
            }

            System.out.println("\nwant to go again? Input 0 for yes and 1 for no");

            runagain = in .nextInt();

            if (runagain == 1) {
                System.out.println("Ok Bye.");

                in .close();

            }
        }
    }
}
