public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        int height = 168;
        int m = 63500;

        int index = bmi.calculate(m, height);
        System.out.println(" Индекс массы тела = " + index);
    }
}
