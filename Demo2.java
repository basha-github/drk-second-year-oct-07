import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		int[] num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total num of elements");
		int size = sc.nextInt();
		
		num = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter "+(i+1)+" element");
			num[i] = sc.nextInt();
		}
		// print all elements
		for(int i =0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}

}
