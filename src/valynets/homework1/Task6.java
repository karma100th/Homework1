package valynets.homework1;

public class Task6 {
    public static void main(String[] args) {
        int[][] matrixA = {
                {0, 3, 0},
                {6, 0, 0},
                {6, 1, 0},
        };
        int[][] matrixB = {
                {0, 2, 0},
                {3, 0, 0},
                {2, 1, 0},
        };
        //матрирцы по условию квадратные, т.е. отпадает некоторые проверки :D
        if (matrixA.length != matrixB.length){
            System.out.println("Матрицы разной размерности, данные операции с ними неосуществимы");
        } else {
            System.out.println("Сумма заданных матриц (A + B): ");
            int [][] matrixSum = new int[matrixA.length][matrixA[0].length];
            for (int i = 0; i < matrixSum.length; i++) {
                for (int j = 0; j < matrixSum[i].length; j++) {
                    matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(matrixSum[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Разность заданных матриц (A - B): ");
            int [][] matrixSub = new int[matrixA.length][matrixA[0].length];
            for (int i = 0; i < matrixSum.length; i++) {
                for (int j = 0; j < matrixSum[i].length; j++) {
                    matrixSum[i][j] = matrixA[i][j] - matrixB[i][j];
                    System.out.print(matrixSum[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
