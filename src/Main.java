import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Main {
    public static void printSeparator() {
        System.out.println("===================================================================================");
    }

    public static void main(String[] args) throws IncorrectArgumentException {
        System.out.println(Arrays.toString(Type.values()));
        DailyTask anton = new DailyTask(" Задача ежедневная ", Type.PERSONAL, LocalDateTime.now(), " Почистить зубы. ");
        OneTimeTask irina = new OneTimeTask(" Задача однократная ", Type.WORK, LocalDateTime.now(), " Изучение истории. ");
        WeeklyTask vova = new WeeklyTask(" Задача еженедельная ", Type.WORK, LocalDateTime.now(), " Учить детей чтению. ");
        MonthlyTask lida = new MonthlyTask(" Задача ежемесячная ", Type.WORK, LocalDateTime.now(), " Работать на кассе. ");
        YearlyTask luka = new YearlyTask(" Задача  ежегодная", Type.PERSONAL, LocalDateTime.now(), " Праздновать Рождество. ");
        System.out.println(anton.toString());
        System.out.println(irina.toString());
        System.out.println(vova.toString());
        System.out.println(lida.toString());
        System.out.println(luka.toString());
        printSeparator();
        List<Task> zD;
        zD = new LinkedList<>();
        zD.add(anton);
        zD.add(lida);
        zD.add(vova);
        System.out.println(" Список задач: " + zD);
        printSeparator();
        Map<Integer, Task> taskMap = new HashMap<>();
        taskMap.put(1, anton);
        taskMap.put(2, irina);
        taskMap.put(3, lida);
        taskMap.put(4, luka);
        taskMap.put(5, vova);
        for (Map.Entry<Integer, Task> element : taskMap.entrySet()) {
            System.out.println(" КЛЮЧ: " + element.getKey() + " ЗНАЧЕНИЕ: " + element.getValue());
            System.out.println(" Хешкод ключа " + element.getKey().hashCode() + " хешкод значения " + element.getValue().hashCode());
        }
        printSeparator();
        System.out.println(" Задача задействована = " + anton.appearsln(LocalDate.now()) + " " + anton.toString());
        printSeparator();
        Scanner scanner = new Scanner(System.in);
        String title;
        do {
            System.out.println(" ПИШИТЕ / Вы можете прервать комаду , набрав русскую букву<А>");
            title = scanner.nextLine();
            System.out.println(" Можно вводить данные " + title);
        } while (!title.equals("А"));
    }
}