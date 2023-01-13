public class Holyday {
    private String date;
    private String name;

    public Holyday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return date + "=>" + name;
    }
}

