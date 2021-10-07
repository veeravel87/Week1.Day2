package Week1.day2;

public class TwoSomeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,5,4,2,7,1,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==9)
				{
					System.out.println("index"+i+"is"+arr[i]);
					System.out.println("index"+j+"is"+arr[j]);
				}
				
			}
			
		}

	}

}
