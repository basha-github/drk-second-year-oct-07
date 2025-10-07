
public class IncreasingOrder {

	public static void main(String[] args) {
	
		int[] num = {4,7,2,8,9,1,66,44,32};
		// bubble sort
		//1,2,4,8,9,7,66,44,32
		int t;
		for(int i=0;i<num.length;i++) {
			
			for(int k=i+1;k<num.length;k++) {
				if(num[i] > num[k]) {
				t = num[i];
				num[i]=num[k];
				num[k]=t;
				}//if
			}//k
			for(int m=0;m<num.length;m++) {
				System.out.print(num[m]+" ");
			}
			System.out.println();
			
		}// i
		System.out.println("final result");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		
		
		
		
	}

}
