import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class dkdk {

	public static void main(String[] args) {
	
		
//		1.
//		int a = 80;
//		int b = 75;
//		int c = 55;
//		System.out.println((a+b+c)/3);
//		
//		2.
//		String pin = "881120-1068234";
//		String yyyyMMdd = "881120";
//		String num = pin.substring(7);
//		System.out.println(yyyyMMdd);
//		System.out.println(num);
		
//		3.
//		String pin="881120-1068234";
//		System.out.println(pin.charAt(7) + "BOY");
//		
//		
//		4.
//		String a = "a:b:c:d";
//		String b = a.replace(":", "#");
//		System.out.println(b);
//
//		5.
		ArrayList<Integer>myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);
	}


}
