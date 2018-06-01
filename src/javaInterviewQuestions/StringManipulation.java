package javaInterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "Manchester United are new Champs";
		String s1 = "manchester United are new Champs";
		
		System.out.println(s.length());       //length of Strong
		
		System.out.println(s.charAt(11));     //character at specific index
		
		System.out.println(s.indexOf('e'));   //index of particular character  ----- 1st occurrence of 'e'
		
		System.out.println(s.indexOf('e', s.indexOf('e')+1));   //index of particular character from fix position ----- 2nd occurrence of 'e'
		
		System.out.println(s.indexOf('e', s.indexOf('e', s.indexOf('e')+1) + 1 ));  // -----3rd occurrence of 'e'
		
		System.out.println(s.indexOf("new"));  // ----index of specific String's starting point
		
		System.out.println(s.indexOf("barcelona"));  // --- index of string which is not present
		
		System.out.println(s.equals(s1));     //compares to strings -- case sensitive
		
		System.out.println(s.equalsIgnoreCase(s1));  //compares to strings -- Not case sensitive
		
		//substring:
		
		System.out.println(s.substring(11, 17));   //it will print 11-16 characters
		
		//trim:
		
		String str = "     hello   world    ";
		
		System.out.println(str.trim());
		
		System.out.println(str.replace(" ", ""));
		
		String date = "02-07-1994";  //    02/07/1994
		
		System.out.println(date.replace("-", "/"));
		
		//split:
		
		String test = "my_name_is_archan_bhatt";
		String testarr[] = test.split("_");
		
		for(int i=0; i<testarr.length; i++){
			System.out.println(testarr[i]);
		}
		
		//concatenate:
		
		String c1 = "arch";
		String c2 = "an";
		System.out.println(c1.concat(c2));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y);
		
	}

}
