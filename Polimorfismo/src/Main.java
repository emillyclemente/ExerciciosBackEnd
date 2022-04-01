
public class Main {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		//gato.falar();
		//cachorro.falar();
		Animal animal = new Cachorro();
		animal = gato;
		
		if(animal instanceof Cachorro) {
			System.out.println("Cachorro");
		} else if(animal instanceof Gato) {
			System.out.println("Gato");
		}
		
		falar(gato);
		falar(cachorro);
		
		
	}
	
	private static void falar(Animal a) {
		a.falar();
	}

}
