package InterfaceModification;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		Villen villen = new Villen();
		
		hero.Act();
		hero.speck();
		hero.comedy();
		
		villen.Act();
		villen.speck();
//        villen.comedy();
        
       
		
	}
}

