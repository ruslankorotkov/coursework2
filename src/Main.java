import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.MatchResult;


public class Main {
    public static void printSeparator() {
        System.out.println("===================================================================================");
    }

    public static void main(String[] args) throws IncorrectArgumentException {
        DailyTask anton = new DailyTask(" Задача ежедневная ", Type.PERSONAL, LocalDateTime.of(2023, 02, 02, 10, 00), " Почистить зубы. ");
        OneTimeTask irina = new OneTimeTask(" Задача однократная ", Type.WORK, LocalDateTime.of(2023, 02, 02, 10, 00), " Изучение истории. ");
        WeeklyTask vova = new WeeklyTask(" Задача еженедельная ", Type.WORK, LocalDateTime.of(2023, 02, 02, 10, 00), " Учить детей чтению. ");
        MonthlyTask lida = new MonthlyTask(" Задача ежемесячная ", Type.WORK, LocalDateTime.of(2023, 02, 02, 10, 00), " Работать на кассе. ");
        YearlyTask luka = new YearlyTask(" Задача  ежегодная", Type.PERSONAL, LocalDateTime.of(2023, 02, 02, 10, 00), " Праздновать Рождество. ");
        printSeparator();
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
        System.out.println(" Задача задействована = " + anton.appearsln(LocalDate.ofYearDay(2023, 34)) + " " + anton.toString());
        printSeparator();
//        System.out.println(" Работает сканер ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Можно вводить id задачи. ");
//        if (scanner.hasNextInt()) {
//            int id = scanner.nextInt();
//            System.out.println("Спасибо! Вы ввели id: " + id);
//        } else {
//            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
//        }
//        System.out.println(" Можно вводить данные Заголовок задачи. ");
//        if (scanner.hasNextLine()) {
//            String title = scanner.next();
//            System.out.println("Спасибо! Заголовок задачи: "+ title);
//        } else {
//            System.out.println("Извините, но это явно не строка. Перезапустите программу и попробуйте снова!");
//        }
//        System.out.println(" Можно вводить данные Описание задачи. ");
//        if (scanner.hasNextLine()) {
//            String description = scanner.next();
//            System.out.println("Спасибо! Описание задачи: "+ description);
//        } else {
//            System.out.println("Извините, но это явно не строка. Перезапустите программу и попробуйте снова!");
//        }
//        String type;
//        System.out.println(" Можно вводить данные Тип задачи. ");
//        type = scanner.next();
//        System.out.println(" Тип задачи: " + type);
//        System.out.println(" Можно вводить данные Дата задачи. ");
//        String dateForChecking;
//        dateForChecking = scanner.next();
//        System.out.println(" Дата задачи: " + dateForChecking);
//        scanner.close();
//        printSeparator();
//        Scanner scan = new Scanner("DailyTask antuan = new DailyTask(\" Задача ежедневная \", Type.PERSONAL, LocalDateTime.of(2023, 02, 02, 10, 00), \" Почистить туфли. \");'" +
//                "OneTimeTask iren = new OneTimeTask(\" Задача однократная \", Type.WORK, LocalDateTime.of(2023, 02, 02, 10, 00), \" Изучение книги. \");'" +
//                "WeeklyTask vovi = new WeeklyTask(\" Задача еженедельная \", Type.WORK, LocalDateTime.of(2023, 02, 02, 10, 00), \" Учить детей писать. \");'" +
//                "MonthlyTask lide = new MonthlyTask(\" Задача ежемесячная \", Type.WORK, LocalDateTime.of(2023, 02, 02, 10, 00), \" Работать в метро. \");'" +
//                "YearlyTask lukas = new YearlyTask(\" Задача  ежегодная \", Type.PERSONAL, LocalDateTime.of(2023, 02, 02, 10, 00), \" Праздновать День рождения. \");'");
//
//        scan.useDelimiter("'");
//
//        while (scan.hasNext()) {
//            System.out.println(scan.next()+"");
//        }
//
//        scan.close();
        printSeparator();
        System.out.println(" Задача на функциональное программирование. ");
        System.out.println("Input: yourapp  the quick brown fox jumps over the lazy dog");
        String input = "the quick brown fox jumps over the lazy dog";
        Scanner yourapp = new Scanner(input);
        String[] words = input.split("\\s+");
        Arrays.sort(words);
        System.out.println(" Слова отсортированы по алфавиту.");
        for (String word : words) {
            System.out.println("1 - " + word);
        }
        System.out.println("Output: В тексте " + words.length + " слов ");
        yourapp.close();
//        Scanner yourapp = new Scanner(input).useDelimiter("\\s* \\s*");
//        int count = 0;
//        while (yourapp.hasNext()) {
//            count++;
//            if (yourapp.hasNext()) {
//                System.out.println(" 1 - " + yourapp.next());
//            }
//        }
//        System.out.println("Output: В тексте " + count + " слов ");
//        yourapp.close();
    }
}