package revision.oops;

public abstract class Loan {
    protected float roi;
    protected float loanAmount;
    protected int tenure;

    public float getLoanAmount() {
        return this.loanAmount;
    }

    public float getRoi() {
        return this.roi;
    }

    public int getTenure() {
        return this.tenure;
    }

    public abstract void setRoi(float roi);

    public abstract void setLoanAmount(float loanAmount);

    public abstract void setTenure(int tenure);

}
