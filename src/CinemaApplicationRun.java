import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();

        viewers.add(new Viewer("Kate", 27, 2));
        viewers.add(new Viewer("Artur", 22, 21));
        viewers.add(new Viewer("Dan", 44, 10));
        viewers.add(new Viewer("Bob", 32, 12));
        viewers.add(new Viewer("Alena", 18, 5));

        System.out.println(ViewerStatistics.averageAge(viewers));
    }


}