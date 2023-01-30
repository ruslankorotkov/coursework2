import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Main {
    public static void printSeparator() {
        System.out.println("===================================================================================");
    }

    public static void main(String[] args) throws IncorrectArgumentException {
        System.out.println(" Работает сканер ");
        Scanner scanner = new Scanner(System.in);
        String task;
        System.out.println(" Можно вводить данные Класс задачи ");
        task = scanner.nextLine();
        System.out.println(" Можно вводить id задачи ");
        int id = Integer.parseInt(scanner.nextLine());
        String title;
        System.out.println(" Можно вводить данные Заголовок задачи ");
        title = scanner.nextLine();
        System.out.println(" Заголовок задачи: " + title);
        String description;
        System.out.println(" Можно вводить данные Описание задачи ");
        description = scanner.nextLine();
        System.out.println(" Описание задачи: " + description);
        Type type;
        System.out.println(" Можно вводить данные Тип задачи ");
        type = Type.valueOf(scanner.nextLine());
        System.out.println(" Тип задачи: " + type);
        LocalDateTime dateTime;
        System.out.println(" Можно вводить данные Даты задачи ");
        dateTime = LocalDateTime.now();
        System.out.println(" Тип задачи: " + dateTime);

        printSeparator();
        DailyTask anton = new DailyTask(" Задача ежедневная ", Type.PERSONAL, LocalDateTime.of(2023, 01, 30, 10, 00), " Почистить зубы. ");
        OneTimeTask irina = new OneTimeTask(" Задача однократная ", Type.WORK, LocalDateTime.of(2023, 01, 30, 10, 00), " Изучение истории. ");
        WeeklyTask vova = new WeeklyTask(" Задача еженедельная ", Type.WORK, LocalDateTime.of(2023, 01, 30, 10, 00), " Учить детей чтению. ");
        MonthlyTask lida = new MonthlyTask(" Задача ежемесячная ", Type.WORK, LocalDateTime.of(2023, 01, 30, 10, 00), " Работать на кассе. ");
        YearlyTask luka = new YearlyTask(" Задача  ежегодная", Type.PERSONAL, LocalDateTime.of(2023, 01, 30, 10, 00), " Праздновать Рождество. ");
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
        System.out.println(" Задача задействована = " + anton.appearsln(LocalDate.ofYearDay(2023, 30)) + " " + anton.toString());
        printSeparator();
    }
}