package practicascloud.baselineservice.models;

import java.math.BigDecimal;

public class ResposeListModel {
    private int year;
    private BigDecimal initialInvestment;
    private BigDecimal anualContribution;
    private BigDecimal rateOfReturn;
    private BigDecimal finalInvestment;

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getInitialInvestment() {
        return this.initialInvestment;
    }

    public void setInitialInvestment(BigDecimal initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public BigDecimal getAnualContribution() {
        return this.anualContribution;
    }

    public void setAnualContribution(BigDecimal anualContribution) {
        this.anualContribution = anualContribution;
    }

    public BigDecimal getRateOfReturn() {
        return this.rateOfReturn;
    }

    public void setRateOfReturn(BigDecimal rateOfReturn) {
        this.rateOfReturn = rateOfReturn;
    }

    public BigDecimal getFinalInvestment() {
        return this.finalInvestment;
    }

    public void setFinalInvestment(BigDecimal finalInvestment) {
        this.finalInvestment = finalInvestment;
    }


}
