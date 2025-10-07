
public class LeftRotation {

	public static void main(String[] args) {
		
		// 10 20 30 40 50 60
		// 20 30 40 50 60 10
		int[] num = {10, 20, 30, 40, 50, 60};
		
		int t = num[0];
		for(int i=0;i<num.length-1;i++) {// 6
			num[i]=num[i+1];//
		}
		num[num.length-1]=t;
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		//num[0]=num[1]
		//num[1]=num[2]
		//num[2]=num[3]
		
		//t=num[0]
		// num[num.length-1]=t

	}

}
