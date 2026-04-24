package subsystem;

public class Amplifier {
	public void ligar() {
		System.out.println("[Amplificador] Ligado.");
	}

	public void desligar() {
		System.out.println("[Amplificador] Desligado.");
	}

	public void ajustarVolume(int nivel) {
		System.out.println("[Amplificador] Volume: " + nivel);
	}
}