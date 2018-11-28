package javademo;public class SearchMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]a = {1,2,3,4,5,6,7,};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(max>a[i]) {
				
				max=a[i];
			}
			
		}
		System.out.println("Print Min Value :"+max);

	}

}
