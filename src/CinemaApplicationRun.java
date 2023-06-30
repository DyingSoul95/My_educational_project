import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        List<Cinema> cinemas = new ArrayList<>();

        cinemas.add(new Cinema("Назад в будущее", "Comedy", 2));
        cinemas.add(new Cinema("Побег из Шоушенка", "Drama", 2));
        cinemas.add(new Cinema("Криминальное чтиво", "Drama", 3));

        viewers.add(new Viewer("Kate", 27, cinemas));
        viewers.add(new Viewer("Artur", 22, cinemas));
        viewers.add(new Viewer("Dan", 44, cinemas));
        viewers.add(new Viewer("Bob", 32, cinemas));
        viewers.add(new Viewer("Alena", 18, cinemas));

        System.out.println(ViewerStatistics.averageAge(viewers));
    }


}