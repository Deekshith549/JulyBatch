package intialLearning;

public class HellowWorld {
	
	 String s="Deekshith";
	 
	
	public int add(int x, int y) {
	
	
		int z=x+y;
		System.out.println("x value "+x);
		System.out.println("y value "+y);
		
		return z; 
	}

	public static void main(String[] args) {
		HellowWorld dd=new HellowWorld();
		
		String t2=dd.s;
	System.out.println(dd.add(33,28));
	System.out.println("line number 22 "+t2);
		// TODO Auto-generated method stub
		
		//System.out.println("y value "+y);
		
		HellowWorld hw=new HellowWorld();
		
		String t=hw.s;
		
		System.out.println(hw.add(20,15));
		System.out.println("line number 32 "+t);
	
		
		
	}
	
}
