import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		int [][] matrix = {{2, 3, 5}, {3, 3, 7}, {8, 3, 9}};
		int diagonalSum = 0;
		for(int i= 0; i < matrix.length; i++) {
			//Arrays.sort(matrix[i]);
			for (int j = 0; j < matrix[i].length - 1; j++) {
			        for (int k = 0; k < matrix[i].length - j - 1; k++) {
            				if (matrix[i][k] > matrix[i][k + 1]) {
                				// Swap elements
                				int temp = matrix[i][k];
                				matrix[i][k] = matrix[i][k + 1];
                				matrix[i][k + 1] = temp;
            				}
        			}
    			}


			for(int j = 0; j < matrix.length; j++) {
				if(i==j || i+j == matrix.length - 1) {
					diagonalSum += matrix[i][j];
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Diagonal sum is: " + diagonalSum);	
	}
}
