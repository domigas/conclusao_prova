package questao_1;

public class Principal {
	public static void main(String[] args) {

		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		animal.fazerBarulho();
		cachorro.fazerBarulho();
		gato.fazerBarulho();
	}
}
