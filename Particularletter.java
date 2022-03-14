package week5.day5;

public class Particularletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="Testleaf located in Thenampet";
String[] str=text.split(" ");
for(int i=0; i<str.length; i++) {
	
	//System.out.println(str[i]);
	if(str[i].startsWith("T")) {
		
		System.out.println(str[i]);
}
	}

}
}