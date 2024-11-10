import java.util.ArrayList;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        double[] number = new double[15];
        Random random = new Random();

        number[0] = random.nextDouble();
        number[1] = random.nextDouble();

        for (int i = 2; i <= 14; i++) {
            number[i] = -5 + (10) * random.nextDouble();
        }

        boolean negativeNumber = false;
        ArrayList<Double> positiveNumber = new ArrayList<>();

        for (double num : number) {
            if (negativeNumber && num > 0) {
                positiveNumber.add(num);
            } else if (num < 0) {
                negativeNumber = true;
            }
        }



        double summa = 0;
        for (double num : positiveNumber){
            summa += num;
        }
        double average = positiveNumber.isEmpty() ? 0 : summa / positiveNumber.size();

        System.out.println("Числа: ");
        for (double num : number) {
            System.out.println(num + " ");
        }
        System.out.println("Среднее число положительных чисел: " + average);
    }
}
