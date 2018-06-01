package oopConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println(x+20);
		
		//data conversion from String to int: parseInt
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean:
		
		//data conversion from String to double: parseDouble
		String y = "12.87";
		System.out.println(y+20);
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//data conversion from String to boolean: parseBoolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		
		//data conversion from int to String: valueOf
		int j=200;
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		String  u = "100a";
		Integer.parseInt(u); // it will give NumberFormatException as String value is not purely integer

	}

}
