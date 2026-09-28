public class LoanDecision extends LoanApplication{
    public LoanDecision(String applicantName, double loanAmount, int creditScore){
        super(applicantName, loanAmount, creditScore);
    }
    public void PrintLoanDecision() {
        System.out.println("*******************************************");
        System.out.println("LOAN APPLICATION REPORT");
        System.out.println("********************************************");
        System.out.println("APPLICANT: " + getApplicantName());
        System.out.println("LOAN AMOUNT: " + getLoanAmount());
        System.out.println("CREDIT SCORE: " + getCreditScore());

        if (getCreditScore() >= 600) {
            System.out.println("LOAN APPROVED: YES");
        } else {
            System.out.println("LOAN APPROVED: NO");
        }
        System.out.println("****************************************");
    }
}
