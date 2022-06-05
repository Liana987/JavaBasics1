package ReviewClass05;

import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
		// 2D arrays are arrays of arrays

		int row0[]= {1,2,3,4,5};
		int row1[]= {1,2,3,4,5};
		int row2[]= {1,2,3,4,5};
		int row3[]= {1,2,3,4,5};
		int row4[]= {1,2,3,4,5};
		
		//we cant use advance for loop to update or insert values in an array
		int [][] matrix=new int[5][5];
		matrix[0]=row0;//row 0 contains a complete one D array
		matrix[1]=row1;
		matrix[2]=row2;
		matrix[3]=row3;
		matrix[4]=row4;
		
		//System.out.println(Arrays.toString(matrix[0]));//printing the whole row// 1,2,3,4,5
		//System.out.println(matrix[0][0]);//printing only 1 item //1
		for (int[] array:matrix) {
			//if you want the individual elements, you need the nested loop
		System.out.println(Arrays.toString(array));
		}
		}
		
	}


