package org.design.commons;

public class MSMELoanFactory extends AbstractLoanFactory {

    public Loan createLoan(String type) {
        Loan loan = null;
        switch(type) {
            case "shishu":
                loan = new ShishuMudraLoan();
                break;
            case "business":
                loan = new BusinessLoan();
                break;
            case "gold":
                loan = new GoldLoan();
                break;
            default:
                throw new IllegalArgumentException("Unknown loan type: " + type);
        }

        return loan;
    }

}

class ShishuMudraLoan implements Loan {

    @Override
    public void loanDetails() {
        System.out.println("ShishuMudraLoan details");
    }
}

class BusinessLoan implements Loan {

    @Override
    public void loanDetails() {
        System.out.println("BusinessLoan details");

    }
}

class GoldLoan implements Loan {

    @Override
    public void loanDetails() {
        System.out.println("GoldLoan details");
    }
}
