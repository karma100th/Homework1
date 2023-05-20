package valynets.homework1;

import java.math.BigInteger;

public class Task2 {
    public static final BigInteger TWO_CONST = BigInteger.valueOf(2);

    public static void main(String[] args) {
        int index = 50;
        int counter = 2;
        BigInteger sumNumber = BigInteger.ZERO;
        BigInteger saver;
        BigInteger fibValue1 = new BigInteger("0");
        BigInteger fibValue2 = new BigInteger("1");
        if (index != 1 && index != 0) {
            System.out.print(fibValue1 + "\t" + fibValue2 + "\t");
        }
        while (counter < index) {
            saver = fibValue2;
            fibValue2 = fibValue2.add(fibValue1);
            fibValue1 = saver;
            System.out.print(fibValue2 + "\t");
            counter++;
            if (fibValue2.remainder(TWO_CONST).compareTo(BigInteger.ZERO) == 0) {
                sumNumber = sumNumber.add(fibValue2);
            }
        }
        System.out.println("\nСумма четных чисел из ряда равна: " + sumNumber);
    }
}
