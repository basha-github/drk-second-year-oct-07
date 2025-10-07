import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		
		// 10 20 30 40 50 60
		//0...6
		// num[5]=num[4]
		// num[4]=num[3]
		//num[3]=num[2]
		// 60 10 20 30 40 50
		// 50 60 10 20 30 40
		// 40 50 60 10 20 30
		int n;
		do {
		
				
				int[] num = {10, 20, 30, 40, 50, 60};
				
				Scanner sc = new Scanner(System.in);
				System.out.println("how many rotation u want");
				int r = sc.nextInt();
				
				while(r--!=0) {
					int t = num[num.length-1];
					
					for(int i=num.length-1;i>0;i--) {
						num[i]=num[i-1];//	
					}
					num[0]=  t;
					
				}
				
				for(int i=0;i<num.length;i++) {
					System.out.print(num[i]+" ");
				}
				
				System.out.println("\n do u want to repeat press 1 or press any no");
				n = sc.nextInt();
				
		}while(n == 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
