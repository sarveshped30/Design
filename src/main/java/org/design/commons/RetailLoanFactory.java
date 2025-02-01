package org.design.commons;

public class RetailLoanFactory extends AbstractLoanFactory{


    @Override
    public Loan createLoan(String type) {
        Loan loan = null;
        switch(type) {
            case "personal":
                loan = new PersonlLoan();
                break;
            case "vehicle":
                loan = new VehicleLoan();
                break;
            case "home":
                loan = new HomeLoan();
                break;
            default:
                throw new IllegalArgumentException("Unknown loan type: " + type);
        }

        return loan;
    }
}


class PersonlLoan implements Loan {

    @Override
    public void loanDetails() {
        System.out.println("Personal Loan Details");
    }
}

class VehicleLoan implements Loan {

    @Override
    public void loanDetails() {
        System.out.println("Vehicle Loan Details");
    }
}

class HomeLoan implements Loan {

    @Override
    public void loanDetails() {
        System.out.println("Home Loan Details");
    }
}
