import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IncorrectArgumentException {
        System.out.println(Arrays.toString(Type.values()));
        DailyTask anton = new DailyTask(" Задача ежедневная ", Type.PERSONAL,LocalDateTime.of(2023,01,29,10,00), " Чистка зубов. ");
        OneTimeTask irina = new OneTimeTask(" Задача однократная ", Type.WORK,LocalDateTime.of(2023,01,29,10,00), " Изучение истории. ");
        WeeklyTask vova = new WeeklyTask(" Задача еженедельная ", Type.WORK,LocalDateTime.of(2023,01,29,10,00), " Учить детей чтению. ");
        MonthlyTask lida = new MonthlyTask(" Задача ежемесячная ", Type.WORK,LocalDateTime.of(2023,01,29,10,00), " Работать на кассе. ");
        YearlyTask luka = new YearlyTask(" Задача  ежегодная", Type.PERSONAL,LocalDateTime.of(2023,01,29,10,00), " Праздновать Рождество. ");
        System.out.println(anton.toString());
        System.out.println(irina.toString());
        System.out.println(vova.toString());
        System.out.println(luka.toString());
        System.out.println(lida.toString());
        anton.getDescription();
        anton.ex1();
        anton.ex2();
        List<Task> zD;
        zD = new LinkedList<>();
        zD.add(anton);
        zD.add(lida);
        zD.add(vova);
        System.out.println(" Список задач: "+zD);

//        System.out.println(anton.appearsln());
//        Scanner scanner = new Scanner(System.in);
//        String title;
//        do {
//            System.out.println(" Вы можете прервать комаду , набрав букву<А>");
//            title = scanner.nextLine();
//            System.out.println(" Можно вводить данные " + title);
//        } while (!title.equals("А"));
    }
}