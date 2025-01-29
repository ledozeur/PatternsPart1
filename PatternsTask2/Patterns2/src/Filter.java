import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) <= treshold) {
                logger.log("Элемент " + "\"" + i + "\"" + " подходит");
                result.add(i);
                stringBuilder.append(i).append(" ");
            } else logger.log("Элемент " + "\"" + i + "\"" + " не подходит");
        }
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + stringBuilder);
        return result;
    }
}
