	import java.util.Scanner;
	public class HelloWorld {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int scan = scanner.nextInt();
				System.out.println("몇단? :    ");
				for(int i = 2; i <= scan; i++) {
					for(int j = 1; j <= scan; j++) {
						System.out.println("입력값" +scan    );
						System.out.print(i + "단  ");
						System.out.println(i * j);
					}
				}
			}
}