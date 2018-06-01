package finalVsFinallyVsFinalize;

public class FinallyConcept {
	
	//finally is a block
	//finally is always used with try-catch block
	//Whatever code is written inside finally is always going to execute no matter what, whether exception is thrown or not
	//When any exception is coming in script, but no matter if we what we want to close the browser then we can write driver.quit() inside finally.
	//Similarly for database testing, whether connection with db is properly made or not data is retrieved from there or not we have to close the 
	//connection at the end then finally will be used/

	public static void main(String[] args) {
		//test1();
		//test2();
		division();

	}
	
	public static void test1(){
		try{
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("inside catch block");
		}
		
		finally{
			System.out.println("inside finally block");
		}
	}
	
	//
	public static void test2(){
		try{
			System.out.println("inside test2");
		}
		finally{
			System.out.println("finally code in test2 method");
		}
	}
	
	//
	public static void division(){
		int i = 10;
		try{
			System.out.println("inside try");
			int k = i/0;
		}
//		catch(ArithmeticException e){
//			System.out.println("inside catch block");
//			System.out.println("divide by 0");
//		}
		
		//If we catch wrong type of exception in catch block, exception will be thrown for code but still finally block will be executed at the end
		
		catch(NullPointerException e){  
			System.out.println("inside catch block");
			System.out.println("divide by 0");
		}
		finally{ 
			System.out.println("execute this code evenafter exception");
		}
	}

}
