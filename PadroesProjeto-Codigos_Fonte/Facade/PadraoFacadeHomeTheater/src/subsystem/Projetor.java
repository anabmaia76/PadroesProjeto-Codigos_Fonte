package subsystem;

public class Projetor {
	public void ligar() {
		System.out.println("[Projetor] Ligado.");
	}

	public void desligar() {
		System.out.println("[Projetor] Desligado.");
	}

	public void definirEntrada(String entrada) {
		System.out.println("[Projetor] Entrada: " + entrada);
	}
}