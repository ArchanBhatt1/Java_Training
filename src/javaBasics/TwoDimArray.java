package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Two Dimensional Array
		
		
		
				//(3x5 2-D Array)
				
				//      0     1     2     3     4           Real values are as below:                
				//   -------------------------------
				// 0 | 0,0 | 0,1 | 0,2 | 0,3 | 0,4 |        A    B    C    D    E
				//   -------------------------------
				// 1 | 1,1 |     |     |     |     |        A1   B1   C1   D1   E1
				//   ------------------------------- 
				// 2 | 2,1 |     |     |     | 2,4 |        A2   B2   C2   D2   E2
				//   -------------------------------
		
		//***************************************************************************************************
		
		String x[][] = new String[3][5];
		//String [][]x = new String[3][5];   //both are same
		
		System.out.println(x.length);  // it will give total number of Rows.
		System.out.println(x[0].length);  // it will give total number of Columns.
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		//3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		for(int row=0; row<x.length; row++){
			for(int col=0; col<x[0].length; col++){
				System.out.println(x[row][col]);
			}
		}

	}

}
