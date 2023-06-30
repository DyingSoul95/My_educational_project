public class Viewer {
    private String name;
    private int age;
    private int countOfFilmsWatched;

    public Viewer(String name, int age, int countOfFilmsWatched) {
        this.name = name;
        this.age = age;
        this.countOfFilmsWatched = countOfFilmsWatched;
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
        return countOfFilmsWatched;
    }

    public void setCountOfFilmsWatched(int countOfFilmsWatched) {
        this.countOfFilmsWatched = countOfFilmsWatched;
    }

}
