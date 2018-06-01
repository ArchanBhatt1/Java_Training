package oopConceptsPart1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		obj.sum(x, y); // call by 'value' OR pass by value (copy of x and y will be given to a and b but not the original value)
		
		obj.p = 100;
		obj.q = 200;
		
		obj.swap(obj); // Call by Reference which is possible in java
		
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int sum(int a, int b){
		// initially the copy of x and y's value were given to a and b, but now if we change a and b's value it doesn't change x and y's value.
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	// call by Reference
	public void swap(CallByValueAndCallByReference t){
		
		int temp;
		temp = t.p; //temp = 100
		t.p = t.q;  //t.p = 200
		t.q = temp; //t.q = 100
	}

}
