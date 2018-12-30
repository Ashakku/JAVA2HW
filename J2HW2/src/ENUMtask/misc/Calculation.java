package ENUMtask.misc;

public class Calculation {
    public static int getWorkingHours(DayOfWeek day) {
        int hours = 0;
        for(int i = day.ordinal(); i < day.values().length; i++ )
            hours += day.values()[i].getWorkHours();
        System.out.print("Осталось рабочих часов: ");
        return  hours;
    }
}
