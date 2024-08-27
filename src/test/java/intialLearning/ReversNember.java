package intialLearning;

public class ReversNember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=578678789;
		int y=0;
		
		System.out.println(k);
		
		for(int i=0;k>0;i++) {
			System.out.println(i);
			y=y*10+k%10; 
			System.out.println(y);
			k=k/10;
			System.out.println(k);
		}
		
		System.out.println(y);
//		
//		while(k>0) {
//			
//			y=y*10+k%10; //9
//			System.out.println(y);
//			k=k/10;
//			System.out.println(k);
//		}
//		
//		System.out.println("y value "+y);

	}

}
