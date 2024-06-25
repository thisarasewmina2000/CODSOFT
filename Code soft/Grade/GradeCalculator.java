import java.util.Scanner;

public class GradeCalculator implements GradeCalculatorInterface {
    private int numSubjects;
    private double[] marks;
    private double totalMarks;
    private double averagePercentage;
    private char grade;

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        calculator.inputMarks();
        calculator.calculateTotalMarks();
        calculator.calculateAveragePercentage();
        calculator.grade = calculator.calculateGrade(calculator.averagePercentage);
        calculator.displayResults();
    }

    @Override
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        marks = new double[numSubjects];
        totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    @Override
    public void calculateTotalMarks() {
        for (double mark : marks) {
            totalMarks += mark;
        }
    }

    @Override
    public void calculateAveragePercentage() {
        averagePercentage = totalMarks / numSubjects;
    }

    @Override
    public char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    @Override
    public void displayResults() {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}

