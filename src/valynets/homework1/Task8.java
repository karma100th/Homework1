package valynets.homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите колличество студентов: ");
        Scanner read = new Scanner(System.in);
        int lengthArray = read.nextInt();
        read.close();
        // create random array of students marks
        int[] arrayStudents = new int[lengthArray];
        System.out.print("Массив: ");
        for (int i = 0; i < lengthArray; i++) {
            arrayStudents[i] = (int) (Math.random() * 5 + 1);
            System.out.print(arrayStudents[i] + "\t");
        }
        //sort the array and solve the problem
        Arrays.sort(arrayStudents);
        int moneyCount = 1;
        int moneySum = 1;
        for (int i = 1; i < arrayStudents.length; i++) {
            if (arrayStudents[i] != arrayStudents[i - 1]) {
                moneyCount++;
            }
            moneySum += moneyCount;
        }
        System.out.println("\nВсего деканату потребуется: " + moneySum + " рублей");
    }
}
