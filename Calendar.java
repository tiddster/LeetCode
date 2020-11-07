import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] arg){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        date = date.minusDays(day-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int today = weekday.getValue();

        String all = String.join(("  "),"MON","TUE","WED","THU","FRI","SAT","SUN");
        System.out.println(all);
        for (int i = 1;i < today;i++)
            System.out.print("     ");
        while (date.getMonthValue()==month) {
            System.out.printf("%03d", date.getDayOfMonth());
            if (date.getDayOfMonth() == day)
                System.out.print("* ");
            else
                System.out.print("  ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
