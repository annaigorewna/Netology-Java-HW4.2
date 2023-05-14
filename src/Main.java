public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60.0;
        double height = 1.70;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.printf("Индекс массы тела: "+ "%.1f", bodyMassIndex);

    }
}
