public abstract class LoanApplication implements ILoanApplication {
    String applicantName;
    double loanAmount;
    int creditScore;

    public LoanApplication(String applicantName, double loanAmount, int creditScore){
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.creditScore = creditScore;

    }
    @Override
    public String getApplicantName() {
        return applicantName;
    }
    @Override
    public double getLoanAmount() {
        return loanAmount;
    }
    @Override
    public int getCreditScore() {
        return creditScore;
    }
    }

