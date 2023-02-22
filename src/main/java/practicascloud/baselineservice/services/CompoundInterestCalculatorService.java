package practicascloud.baselineservice.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import practicascloud.baselineservice.models.CompoundInterestCalculatorModel;
import practicascloud.baselineservice.models.ResposeListModel;

@Service
public class CompoundInterestCalculatorService {

    public List<ResposeListModel> calculator(CompoundInterestCalculatorModel investment) {
        
        List<ResposeListModel> results = new ArrayList<>();

        BigDecimal balance = investment.getInitialInvestment();
        BigDecimal contribution = investment.getAnnualContribution();
        float contributionIncrement = investment.getAnnualIncrease();
        float yearsTotal = investment.getInvestmentYears();
        float investmentReturn = investment.getRateOfReturn();

        if (balance.compareTo(new BigDecimal(1000.00)) < 0) {
            throw new IllegalArgumentException("La inversión inicial no puede ser menor a $1000.00");
        }
        
        if (contribution.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("La aportación anual no puede ser menor a $0.00");
        }

        if (contributionIncrement < 0) {
            throw new IllegalArgumentException("El incremento de aportación anual no puede ser menor a $0.00");
        }

        if (yearsTotal <= 0) {
            throw new IllegalArgumentException("La Duración en años de la inversión no puede ser menor o igual a 0");
        }

        if (investmentReturn <= 0) {
            throw new IllegalArgumentException("El porcentaje de rendimiento de inversión no puede ser menor o igual a 0");
        }

        for (int i = 0; i < yearsTotal; i++) {
            ResposeListModel yearlyData = new ResposeListModel();
            yearlyData.setYear(i+1);
            yearlyData.setInitialInvestment(balance);

            if (i > 0) {
                contribution = contribution.multiply(BigDecimal.valueOf(1 + (contributionIncrement / 100)));
                balance = balance.add(contribution);
            }

            BigDecimal returnRate = (balance.add(contribution)).multiply(BigDecimal.valueOf(investmentReturn).divide(BigDecimal.valueOf(100)));
            BigDecimal endBalance = balance.add(contribution).add(returnRate);

            yearlyData.setAnualContribution(contribution);;
            yearlyData.setRateOfReturn(returnRate);
            yearlyData.setFinalInvestment(endBalance);;

            results.add(yearlyData);
            balance = endBalance;
        }
        return results;
        
    }
}
