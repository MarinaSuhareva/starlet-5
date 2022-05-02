public class BmiService {
    public int calculate(int cost, int height) {
        int h = height * height;
        int i = (cost * 10 / h);
        return i;
    }
}
