import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IncorrectArgumentException {
        System.out.println(Arrays.toString(Type.values()));
        DailyTask anton = new DailyTask(" Почистить зубы. ", Type.PERSONAL,1, LocalDateTime.now()," Тщательно почистить зубы. ");
        OneTimeTask irina = new OneTimeTask(" Учить уроки. ", Type.WORK,2,LocalDateTime.now()," Изучение истории. ");
        WeeklyTask vova = new WeeklyTask(" Учить детей. ", Type.WORK,3,LocalDateTime.now()," Учить детей чтению. ");
        MonthlyTask lida = new MonthlyTask(" Выдовать зарплату. ", Type.WORK,4,LocalDateTime.now()," работать на кассе. ");
        YearlyTask luka = new YearlyTask(" Праздновать рождество. ", Type.PERSONAL,5,LocalDateTime.now()," веселится. ");
        System.out.println(anton.toString());
        System.out.println(irina.toString());
        System.out.println(vova.toString());
        System.out.println(luka.toString());
        System.out.println(lida.toString());

    }
}