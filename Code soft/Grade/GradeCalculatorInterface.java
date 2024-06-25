public interface GradeCalculatorInterface {
    void inputMarks();
    void calculateTotalMarks();
    void calculateAveragePercentage();
    char calculateGrade(double averagePercentage);
    void displayResults();
}
