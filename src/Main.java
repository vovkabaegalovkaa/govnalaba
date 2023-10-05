import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("1-Ввести данные\n2-Просмотреть данные\n3-Выход");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Введите название фабрик: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите доход в начале года: ");
                    double start = scanner.nextInt();
                    System.out.println("Введите доход в конце года: ");
                    double finish = scanner.nextInt();
                    Factory factory = new Factory(name, start, finish);
                    DataBase.add(factory);
                    System.out.println("Данные внесены");
                    break;
                case 3:
                    System.out.println("Выход из системы...");
                    System.out.println("POka");
                    System.out.println("POka 1 more");
                    flag = false;
                    break;
                case 2:
                    System.out.println("Выберите фабрику: ");
                    int i = 1;
                    for(Factory m:DataBase.factories){
                        System.out.println(i + m.toString());
                        i++;
                    }
                    int count = scanner.nextInt();
                    System.out.println(DataBase.getRez(DataBase.factories.get(count-1)));
            }
        }
    }
}