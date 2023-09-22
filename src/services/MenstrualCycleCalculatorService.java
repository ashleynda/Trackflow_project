package services;

import java.util.Date;

public class MenstrualCycleCalculatorService {
    private int averageLengthOfCycle;
    private int averagePeriodLength;
    private Date startDateOfLastPeriod;
    MenstrualCycleCalculatorService menstrualCycleCalculator = new MenstrualCycleCalculatorService();

    public void calculateAveragePeriodCycle(int firstMonth, int secondMonth, int thirdMonth){
        this.averageLengthOfCycle = (firstMonth + secondMonth + thirdMonth) / 3;
        menstrualCycleCalculator.setCycleLength(this.averageLengthOfCycle);
    }

    public int getAverageLengthOfCycle() {
        return menstrualCycleCalculator.getCycleLength();
    }

    public String ovulationPeriodCalculation() {
        int ovulationEnd = this.averageLengthOfCycle / 2;
        int ovulationBegins = ovulationEnd - 2;
        return ovulationBegins + "-" + ovulationEnd;
    }

    public String safePeriods(int averagePeriodLength) {
        this.averagePeriodLength = averagePeriodLength;
        int ovulationEnd = this.averageLengthOfCycle / 2;
        int ovulationBegins = ovulationEnd - 2;

        int firstFlowBegins = ovulationBegins - averagePeriodLength - 1;
        int firstFlowEnds = ovulationBegins - 1;

        int secondFlowBegins = ovulationEnd + 1;
        int secondFlowEnds = this.averageLengthOfCycle - 1;
        return firstFlowBegins + "-" + firstFlowEnds, secondFlowBegins + "-" + secondFlowEnds;
    }

    public int calculate
}
