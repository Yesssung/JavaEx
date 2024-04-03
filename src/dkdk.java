import java.util.Scanner;

public class dkdk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("번호를 입력하세요: \n 단: ");
	
		int num = scanner.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println( num + "*" + i + "=" + (i*num) );
			
		}
		System.out.println();
		scanner.close();
	}


}
