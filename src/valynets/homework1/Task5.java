package valynets.homework1;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {6, 0, 0},
                {6, 1, 0},
        };
        int checker = 0;
        int counterZero = 0;
        matrixLoop:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length) {
                    System.out.println("Матрица не является квадратной");
                    checker++;
                    break matrixLoop;
                }
                if (j > i && matrix[i][j] != 0) {
                    System.out.println("Матррица не является нижнетреугольной");
                    checker++;
                    break matrixLoop;
                }
                if (matrix[i][j] == 0) {
                    counterZero++;
                }
            }
        }
        if (counterZero == matrix.length * matrix[0].length && checker ==0) {
            System.out.println("Матрица является нулевой");
        }else if (checker == 0) {
                System.out.println("Матррица является нижнетреугольной");
            }
    }
}
