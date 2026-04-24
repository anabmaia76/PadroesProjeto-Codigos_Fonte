package facade;

import subsystem.*;

/**
 * Interface simplificada para o subsistema de home theater.
 * O cliente interage apenas com esta classe — nunca com o subsistema diretamente.
 */
public class HomeTheaterFacade {

    // Composição com os componentes do subsistema (injeção via construtor — DIP)
    private final Amplifier amplificador;
    private final Projetor projetor;
    private final LeitorDeDVD leitorDVD;
    private final SistemaDeIluminacao iluminacao;

    public HomeTheaterFacade(Amplifier amp, Projetor proj, LeitorDeDVD dvd, SistemaDeIluminacao luz) {
        this.amplificador = amp;
        this.projetor = proj;
        this.leitorDVD = dvd;
        this.iluminacao = luz;
    }

    /** Operação de alto nível: coordena todo o subsistema para iniciar o filme. */
    public void assistirFilme(String nomeFilme) {
        System.out.println("\n=== Preparando sessão: " + nomeFilme + " ===");
        iluminacao.diminuirBrilho(20);
        projetor.ligar();
        projetor.definirEntrada("HDMI-1");
        amplificador.ligar();
        amplificador.ajustarVolume(8);
        leitorDVD.ligar();
        leitorDVD.inserirDisco(nomeFilme);
        leitorDVD.play();
        System.out.println("=== Sessão iniciada. Aproveite! ===\n");
    }

    /** Operação de alto nível: encerra a sessão e desliga todos os componentes. */
    public void encerrarFilme() {
        System.out.println("\n=== Encerrando sessão ===");
        leitorDVD.stop();
        leitorDVD.desligar();
        amplificador.desligar();
        projetor.desligar();
        iluminacao.restaurarBrilho();
        System.out.println("=== Sistema desligado. ===\n");
    }
}