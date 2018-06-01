package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array: To store similar data type values in array variable
		//One Dimensional array
		
		//Disadvantages of array: 
		//1. size is fixed - Static array -- To overcome this problem, we use Collections -- ArrayList, HashTable -- Dynamic Array
		//2. store only similar data types -- To overcome this problem, we user Object Array.
		
		//1. int array:
		     //lowest bound/index = 0
		 	 //upper bound/index = n-1(n is the size of array)
		
		int i[] =new int[4];
		//int []i = new int[4];
		
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		
		System.out.println(i[2]);
		
		//System.out.println(i[4]);  //ArrayIdexOutOdBoundException
		
		System.out.println(i.length);  //size or length of array
		
		//print all the values of array: use for loop
		for(int j=0; j<i.length; j++){
			System.out.println(i[j]);
		}
		
		//2. double array:
		
		double d[] = new double[4];
		
		d[0] = 12.33;
		d[2] = 48.54;
		d[1] = 78.24;
		d[3] = 78.95;
		
		System.out.println(d[1]);
		
		//3. char array:
		
		char c[] = new char[3];
		
		c[0] = 'w';
		c[1] = '3';
		c[2] = '@';
		
		System.out.println(c[1]);
		
		//4. boolean array:
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. String array:
		
		String s[] = new String[3];
		s[0] = "android";
		s[1] = "iphone";
		s[2] = "windows";
		
		System.out.println(s.length);
		
		//6. Object Array: 
		// Object is Super Class of all the Classes.
		
		Object obj[] = new Object[6];
		obj[0] = "Panda";
		obj[1] = 1;
		obj[2] = 'F';
		obj[3] = 23.75;
		obj[4] = "Delhi";
		obj[5] = "26/10/1994";
		
		System.out.println(obj.length);
		
		for(int k=0; k<obj.length; k++){
			System.out.println(obj[k]);
		}
		
		
		//One Dimensional Array
		                      
				    //   -----
				    //   | 0 |  "Panda"
				    //   -----
				    //   | 1 |    1
				    //   -----
				    //   | 2 |   'F'
				    //   -----
					//   | 3 |   23.75
					//   -----
					//   | 4 |   "Delhi"
					//   -----
					//   | 5 |   "26/10/1994"
					//   -----

	}

}
