package javaInterviewQuestions;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "#$%^&* latinASFKJSF :?><'string 0112/-+?!45689";
		
		//Regular Expression: [^a-zA-Z0-9] ^ means remove other than the stated characters/ excluding those characters
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
