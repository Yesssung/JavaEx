import java.util.HashMap;


public class dkdk {

	public static void main(String[] args) {
		
		printCoffeePrice(1);
		printCoffeePrice(99);
	}
		
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
//		ArrayList<Integer>myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
//		myList.sort(Comparator.reverseOrder());
//		System.out.println(myList);
		
//		6.
//		ArrayList<String>myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
//		String result = "";
//		for(int i = 0; i < myList.size();i++) {
//			result += myList.get(i);
//			result +=" ";
//		}
//		System.out.println(result);
		
//		7.
//		HashMap<String, Integer> grade = new HashMap<>();
//		grade.put("A", 90);
//		grade.put("B", 80);
//		grade.put("C", 70);
//		
//		int result = grade.remove("B");
//		System.out.println(result);
//		System.out.println(grade);
//		
//		8. 중복 숫자 제거하기
//		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5)); // 이 중에서
//		HashSet<Integer> temp = new HashSet<>(numbers); // 중복 제거하고(교집합 차용)
//		ArrayList<Integer> result = new ArrayList<>(temp);
//		System.out.println(result); // 결과값 출력하기
		
//		9.
		static void printCoffeePrice(int type) {
		HashMap<Integer, Integer> priceMap = new HashMap<>();
		priceMap.put(1, 3000);
		priceMap.put(2, 4000);
		priceMap.put(3, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원입니다.", price));
		
		
	}
		


}
