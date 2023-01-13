import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Holydayzer holydayzer = new Holydayzer();

        System.out.println(holydayzer.getHolydays());

        Holyday niver = new Holyday("30/06/1999", "Meu niver");

        holydayzer.addHolyday(niver);

        System.out.println(holydayzer.searchHolyday("30/06/1999"));
        System.out.println(holydayzer.searchHolyday("29/06/1999"));
    }
}