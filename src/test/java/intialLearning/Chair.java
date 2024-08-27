package intialLearning;

public class Chair {
	
	
	int legs=4;
	int hands=2;
	String person="";
	
	public void sitting(String p1) {
		this.person=p1;
		System.out.println("Person sitting in char "+ person);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gest="pooja";
		Chair ch1=new Chair();
		System.out.println(ch1.legs);
		System.out.println(ch1.hands);
		System.out.println("person "+ch1.person);
		ch1.sitting(gest);
		System.out.println("===========================================");
		
		String gest2="Srikanth";
		Chair ch2=new Chair();
		System.out.println("27 person "+ch2.person);
		ch2.sitting(gest2);
		System.out.println("29 person "+ch2.person);

	}

}
