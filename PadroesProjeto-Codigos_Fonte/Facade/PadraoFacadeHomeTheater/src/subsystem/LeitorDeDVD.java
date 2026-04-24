package subsystem;

public class LeitorDeDVD {
	private String filme;

	public void ligar() {
		System.out.println("[DVD] Ligado.");
	}

	public void desligar() {
		System.out.println("[DVD] Desligado.");
	}

	public void inserirDisco(String nome) {
		this.filme = nome;
		System.out.println("[DVD] Disco: " + filme);
	}

	public void play() {
		System.out.println("[DVD] Reproduzindo: " + filme);
	}

	public void stop() {
		System.out.println("[DVD] Encerrado.");
	}
}