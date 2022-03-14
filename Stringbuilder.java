package week5.day5;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print only leaf
   String text="testleaf";
   System.out.println(text.substring(4));//start
  // System.out.println(text.substring(4, 7));//start,endyso
   
   //remove space
   String text1="  testleaf  chennai  ";
   System.out.println(text1.trim());
   
   
   //replace and replace all
   String name="welcome to testleaf";
   System.out.println(name.replace('t', 'b'));//single letter change
   System.out.println(name.replaceAll("welcome", "hello"));// change to entire string
	}

}
