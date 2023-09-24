package questao_8;

public class Principal {

	public static void main(String[] args) {
		Documento documento = new Documento("Conteúdo X");
		Fotos fotos = new Fotos("Uma foto incrível Eu Tirei!");

		documento.imprimir();
		System.out.println();
		fotos.imprimir();
	}
}
