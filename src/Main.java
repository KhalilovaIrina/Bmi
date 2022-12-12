public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float bmi = service.calculate(50f, 1.6f);

        System.out.printf("%.2f", bmi);
    }
}