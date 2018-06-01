package finalVsFinallyVsFinalize;

public class FinalizeConcept {
	
	public void finalize(){
		//finzlize is a method
		//Finalize method will just be called before garbage collection process for the clean up process of object. 
		//this method will be called automatically even we are not calling it in main method.
		
		System.out.println("inside finalize");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		//so now object will be there inside java memory without any reference as garbage. So to remove such objects garbage collection method is used.
		//So all these type of objects will be destroyed. Garbage Collector will also be called automatically.
		
		//Manually we can call gc like this:
		System.gc(); 

	}

}
