package valynets.homework1;

import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args) {
        int index = 50;
        int counter = 2;
        BigInteger sumNumber = BigInteger.ZERO;
        BigInteger helperValue1;
        BigInteger helperValue2 = new BigInteger("0");
        BigInteger fibValue = new BigInteger("1");
        if (index != 1 && index != 0) {
            System.out.print(helperValue2 + "\t" + fibValue + "\t");
        }
        while (counter < index) {
            helperValue1 = fibValue;
            fibValue = fibValue.add(helperValue2);
            helperValue2 = helperValue1;
            System.out.print(fibValue + "\t");
            counter++;
            if (fibValue.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
                sumNumber = sumNumber.add(fibValue);
            }
        }
        System.out.println("\nСумма четных чисел из ряда равна: " + sumNumber);
    }
}
