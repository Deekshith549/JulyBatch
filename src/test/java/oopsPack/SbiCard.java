package oopsPack;

public abstract class SbiCard extends SBIATM{

	@Override
	public void withdraw() {
		System.out.println(" you can collect your amount");
		
	}

	abstract public void Diposit();
//	@Override
//	public void Diposit() {
//		System.out.println(" you can diposit your amount");
//		
//	}

}
