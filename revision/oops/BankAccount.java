package revision.oops;

public class BankAccount {
    public static void main(String[] args) {
        HomeLoan h = new HomeLoan();
        h.setLoanAmount(2000000);
        h.setRoi(12.5f);
        h.setTenure(15);

        System.out.println(h.getLoanAmount());
        System.out.println(h.getRoi());
        System.out.println(h.getTenure());
    }
}
