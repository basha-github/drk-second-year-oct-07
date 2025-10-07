import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		
		
		
		//8 20
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of test cases");
		int tc = sc.nextInt();
		
		while(tc-- > 0) {
			
			System.out.println(" total no of elements");
			int size = sc.nextInt();
			
			System.out.println(" amount for each building found");
			int amt = sc.nextInt();
			System.out.println(" enter all "+size+" building heights");
			
			int[] bh= new int[size];
			
			for(int i=0;i<size;i++) {
				bh[i]= sc.nextInt();
			}
			
			int max = bh[0];
			int count=1;
			for(int i=1;i<bh.length;i++) {
				if(bh[i] > max) {
					max= bh[i];
					count++;
				}
			}
			
			System.out.println("total amount--->"+count * amt);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
