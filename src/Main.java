import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task anton = new Task(" Почистить зубы ", Task.Type.PERSONAL,1, LocalDateTime.now()," Тщательно почистить зубы ");
        Task irina = new Task(" Учить уроки ", Task.Type.WORK,2,LocalDateTime.now()," Изучение истории ");
        Task vova = new Task(" Учить детей ", Task.Type.WORK,1,LocalDateTime.now()," Учить детей чтению ");
        Task lida = new Task(" Выдовать зарплату ", Task.Type.WORK,1,LocalDateTime.now()," работать на кассе ");
        Task luka = new Task(" Праздновать рождество ", Task.Type.PERSONAL,1,LocalDateTime.of(2023,13,4,16,53,)," веселится ");
        System.out.println(anton.toString());
        System.out.println(irina.toString());
        System.out.println(vova.toString());
        System.out.println(luka.toString());
        System.out.println(lida.toString());
    }
}