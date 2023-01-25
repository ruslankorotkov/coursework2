import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DailyTask anton = new DailyTask(" Почистить зубы ", Type.PERSONAL,1, LocalDateTime.now()," Тщательно почистить зубы ");
        OneTimeTask irina = new OneTimeTask(" Учить уроки ", Type.WORK,2,LocalDateTime.now()," Изучение истории ");
        WeeklyTask vova = new WeeklyTask(" Учить детей ", Type.WORK,1,LocalDateTime.now()," Учить детей чтению ");
        MonthlyTask lida = new MonthlyTask(" Выдовать зарплату ", Type.WORK,1,LocalDateTime.now()," работать на кассе ");
        YearlyTask luka = new YearlyTask(" Праздновать рождество ", Type.PERSONAL,1,LocalDateTime.now()," веселится ");
        System.out.println(anton.toString());
        System.out.println(irina.toString());
        System.out.println(vova.toString());
        System.out.println(luka.toString());
        System.out.println(lida.toString());
    }
}