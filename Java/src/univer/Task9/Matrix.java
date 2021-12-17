package univer.Task9;

public class Matrix {
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public void setMatrixValue(int rowCount, int colCount, double value){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == rowCount && j == colCount){
                    matrix[i][j] = value;
                }
            }
        }
    }

    public double getMatrixValue(int rowCount, int colCount){
        return matrix[rowCount][colCount];
    }

    public double additionOfMatrix(){
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public double substractionOfMatrix(){
        double sub = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                sub -= matrix[i][j];
            }
        }
        return sub;
    }

    public double multiplicationOfTMatrix(){
        double mult = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                mult *= matrix[i][j];
            }
        }
        return mult;
    }
}
