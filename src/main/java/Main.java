import ru.netology.services.CalcService;

public class Main {

    public static void main(String[] args) {

        CalcService service = new CalcService();
        System.out.println("Месяцев отдыха в году: " + service.calculate(100000, 60000, 150000));
    }
}

