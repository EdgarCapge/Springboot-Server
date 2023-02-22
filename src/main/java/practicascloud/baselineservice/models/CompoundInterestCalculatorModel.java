package practicascloud.baselineservice.models;

import java.math.BigDecimal;

public class CompoundInterestCalculatorModel {
    
    private BigDecimal initialInvestment;
    private BigDecimal annualContribution;
    private float annualIncrease;
    private float investmentYears;
    private float rateOfReturn;

    public BigDecimal getInitialInvestment() {
        return this.initialInvestment;
    }

    public void setInitialInvestment(BigDecimal initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public BigDecimal getAnnualContribution() {
        return this.annualContribution;
    }

    public void setAnualContribution(BigDecimal anualContribution) {
        this.annualContribution = anualContribution;
    }

    public float getAnnualIncrease() {
        return this.annualIncrease;
    }

    public void setAnnualIncrease(float annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public float getInvestmentYears() {
        return this.investmentYears;
    }

    public void setInvestmentYears(float InvestmentYears) {
        this.investmentYears = InvestmentYears;
    }

    public float getRateOfReturn() {
        return this.rateOfReturn;
    }

    public void setRateOfReturn(float rateOfReturn) {
        this.rateOfReturn = rateOfReturn;
    }

}
