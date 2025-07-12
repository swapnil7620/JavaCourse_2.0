package InterfaceModification;

public interface Actor {

	public void Act();
	public void speck();
	 default void comedy() {
		System.out.println("Actor should be a comedian too");
	};
		
	
}
