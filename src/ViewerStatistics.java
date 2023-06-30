import java.util.List;

public class ViewerStatistics {

    public static int averageAge(List<Viewer> viewers) {
        int sumAge = 0;

        for (Viewer i : viewers) {
            sumAge = i.getAge() + sumAge;
        }
        return sumAge / viewers.size();
    }
}
