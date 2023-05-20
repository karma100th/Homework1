package valynets.homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите колличество строк матрицы: ");
        Scanner read = new Scanner(System.in);
        int linesMatrix = read.nextInt();
        System.out.println("Введите колличество стобцов матрицы: ");
        int columnsMatrix = read.nextInt();
        read.close();
        int[][] matrix = new int[linesMatrix][columnsMatrix];
        int counter = 0;
        // create random matrix
        System.out.println("Сгенирированная матрица: ");
        for (int i = 0; i < linesMatrix; i++) {
            for (int j = 0; j < columnsMatrix; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(matrix[i][j] + "\t");
                if (matrix[i][j] > 0) {
                    counter++;
                } else if (matrix[i][j] < 0) {
                    counter--;
                }
            }
            System.out.println();
        }
        //print result
        if (counter > 0) {
            System.out.println("Больше положительных чисел");
        } else if (counter < 0) {
            System.out.println("Больше отрицательных чисел");
        } else {
            System.out.println("Положительных и отрицательных чисел равное количество");
        }
    }
}
