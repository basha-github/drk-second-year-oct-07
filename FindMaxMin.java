
public class FindMaxMin {

	public static void main(String[] args) {
		
		int[] num = {10,6, 8,33 ,55 ,67,89,235,61,77,88};
		int min,max;
		
		min=num[num.length-1];
		max=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i] < min) {// 6 < 10
				min = num[i];
			}// if
			if(num[i] > max) {// 6 < 10
				max = num[i];
			}
		}// for
		
		System.out.println("min--->"+min);
		System.out.println("max--->"+max);


	}

}
