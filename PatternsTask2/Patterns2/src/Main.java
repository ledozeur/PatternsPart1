import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        StringBuilder a = new StringBuilder();
        Random random = new Random();
        ArrayList<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(i, random.nextInt(maxValue));
            a.append(randomList.get(i)).append(" ");
        }
        System.out.println("Вот случайный список: " + a);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        filter.filterOut(randomList);
        logger.log("Завершаем программу");

    }
}