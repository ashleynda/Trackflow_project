package data.models;

import java.util.Date;

public class MenstrualCycle {
    private int id;
    private int averageLengthOfCycle;
    private int averagePeriodLength;
    private Date startDateOfLastPeriod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAverageLengthOfCycle() {
        return averageLengthOfCycle;
    }

    public void setAverageLengthOfCycle(int averageLengthOfCycle) {
        this.averageLengthOfCycle = averageLengthOfCycle;
    }

    public int getAveragePeriodLength() {
        return averagePeriodLength;
    }

    public void setAveragePeriodLength(int averagePeriodLength) {
        this.averagePeriodLength = averagePeriodLength;
    }

    public Date getStartDateOfLastPeriod() {
        return startDateOfLastPeriod;
    }

    public void setStartDateOfLastPeriod(Date startDateOfLastPeriod) {
        this.startDateOfLastPeriod = startDateOfLastPeriod;
    }
}
