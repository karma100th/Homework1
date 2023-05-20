package valynets.homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner read = new Scanner(System.in);
        int lengthArray = read.nextInt();
        read.close();
        int sum1 = 0;
        int sum2 = 0;
        // create randomcd array
        int[] array = new int[lengthArray];
        System.out.print("Массив: ");
        for (int i = 0; i < lengthArray; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        // check array
        for (int i = 0; i < array.length; i += 2) {
            if (i == array.length - 1) {
                sum1 += array[i];
                break;
            }
            sum1 += array[i];
            sum2 += array[i + 1];
        }
        if (sum1 > sum2) {
            System.out.println("\nМаксимальная сумма: " + sum1);
        } else if (sum2 > sum1) {
            System.out.println("\nМаксимальная сумма: " + sum2);
        } else {
            System.out.println("\nОбе суммы равны: " + sum1);
        }
    }
}
