import java.util.Scanner;
void main(){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter applicant name: ");
    String applicantName = scanner.nextLine();
    System.out.print("Enter the loan amount requested: ");
    double loanAmount = scanner.nextDouble();
    System.out.print("Enter the applicant's credit score: ");
    int creditScore = scanner.nextInt();

    LoanDecision decision = new LoanDecision(applicantName, loanAmount, creditScore);
    decision.PrintLoanDecision();

    scanner.close();
//make sure you use a small letter first to name things e.g applicantName not ApplicantName
}