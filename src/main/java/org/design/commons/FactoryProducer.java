package org.design.commons;

public class FactoryProducer {

    public static AbstractLoanFactory getFactory(String type) {
        AbstractLoanFactory factory = null;
        switch (type) {
            case "retail":
                factory = new RetailLoanFactory();
                break;
            case "msme":
                factory = new MSMELoanFactory();
                break;
            default:
                throw new IllegalArgumentException("Unkown factory type : " + type);
        }

        return factory;
    }
}


class FactoryMain {
    public static void main(String[] args) {
        AbstractLoanFactory factory = FactoryProducer.getFactory("retail");
        Loan loan = factory.createLoan("vehicle");
        loan.loanDetails();

    }
}
