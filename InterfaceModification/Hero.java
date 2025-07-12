package InterfaceModification;

public class Hero  implements Actor{

	@Override
	public void Act() {
		
		System.out.println("yes i am hero and i know acting ");
	}

	@Override
	public void speck() {
		System.out.println("yes i am hero can to speck");
	}
	
	public void comedy() { 
		System.out.println("yes i am hero and comedian also ");
	}

}
