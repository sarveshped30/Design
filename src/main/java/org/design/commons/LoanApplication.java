package org.design.commons;


import java.math.BigDecimal;

//Builder design pattern demo
public class LoanApplication {

    private String type;
    private Long tenure;
    private BigDecimal amount;

    public LoanApplication(Builder builder) {
        this.type = builder.type;
        this.tenure = builder.tenure;
        this.amount = builder.amount;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "type='" + type + '\'' +
                ", tenure=" + tenure +
                ", amount=" + amount +
                '}';
    }

    public static class Builder {
        private String type;
        private Long tenure;
        private BigDecimal amount;

        public Builder () {

        }

        public Builder(String type, Long tenure, BigDecimal amount) {
            this.type = type;
            this.tenure = tenure;
            this.amount = amount;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setTenure(Long tenure) {
            this.tenure = tenure;
            return this;
        }

        public Builder setAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public LoanApplication build() {
            return new LoanApplication(this);
        }

    }
}

class LoanApplicationRun {

    public static void main(String[] args) {
        LoanApplication loanApplication = new LoanApplication.Builder()
                .setAmount(BigDecimal.valueOf(1000))
                .setTenure(1l)
                .setType("personal")
                .build();

        System.out.println(loanApplication);
    }
}
