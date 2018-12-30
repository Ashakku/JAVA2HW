package ENUMtask;

import ENUMtask.misc.DayOfWeek;

import static ENUMtask.misc.Calculation.getWorkingHours;

public class DayOfWeekMain {

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }
}
