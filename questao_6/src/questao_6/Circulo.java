package questao_6;

public class Circulo {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5.0);
		double area = circulo.calcularArea();
		System.out.println("A área do círculo é: " + area);
	}
}
