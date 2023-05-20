package valynets.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner read = new Scanner(System.in);
        int lengthArray = read.nextInt();
        read.close();
        // create random array
        int[] array = new int[lengthArray];
        System.out.print("Массив: ");
        for (int i = 0; i < lengthArray; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        //reverse array
        int numberSaver = array[0];
        int i = 0;
        for (int j = lengthArray - 1; i < j; i++, j--) {
            array[i] = array[j];
            array[j] = numberSaver;
            numberSaver = array[i + 1];
        }
        //print revers array
        System.out.print("\nИвертированный массив: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
