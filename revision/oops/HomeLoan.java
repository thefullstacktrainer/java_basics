package revision.oops;

public class HomeLoan extends Loan {

    @Override
    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public void setTenure(int tenure) {
        // TODO Auto-generated method stub
        this.tenure = tenure;
    }

    @Override
    public void setRoi(float roi) {
        // TODO Auto-generated method stub
        this.roi = roi;
    }

}
