import java.util.List;

public class Viewer {
    private String name;
    private int age;
    private List<Cinema> cinemas;

    public Viewer(String name, int age, List<Cinema> cinemas) {
        this.name = name;
        this.age = age;
        this.cinemas = cinemas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfFilmsWatched() {
        return cinemas.size();
    }


}
