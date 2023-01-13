import java.util.ArrayList;
import java.util.List;

public class Holydayzer {
    private List<Holyday> holydays = new ArrayList<>();

    public Holydayzer() {
        String[][] initialHolydays = {
            {"01/01/2023", "Confraternização mundial"},
            {"21/02/2023", "Carnaval"},
            {"17/04/2023", "Páscoa"},
            {"21/04/2023", "Tiradentes"},
            {"01/05/2023", "Dia do trabalho"},
            {"08/06/2023", "Corpus Christi"},
            {"07/09/2023", "Independência do Brasil"},
            {"12/10/2023", "Nossa Senhora Aparecida"},
            {"02/11/2023", "Finados"},
            {"15/11/2023", "Proclamação da República"},
            {"25/12/2023", "Natal"}
        };

        for(int i = 0; i < initialHolydays.length; i++) {
            String currDate = initialHolydays[i][0];
            String currName = initialHolydays[i][1];

            Holyday currHolyday = new Holyday(currDate, currName);

            holydays.add(currHolyday);
        }
    }

    public String searchHolyday(String date) {
        String result = "";

        for(int i = 0; i < holydays.size(); i++) {
            Holyday compare = holydays.get(i);

            if(compare.getDate().equals(date)) {
                result = compare.getName();
            }
            else {
                result =  "O feriado no dia " + date + " não existe";
            }
        }

        return result;
    }

    public List<Holyday> getHolydays() {
        return holydays;
    }

    public void addHolyday(Holyday newHolyday) {
        holydays.add(newHolyday);
    }
}