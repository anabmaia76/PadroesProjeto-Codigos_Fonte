package app;

import facade.HomeTheaterFacade;
import subsystem.*;

public class Main {
    public static void main(String[] args) {
        // Instanciação dos componentes do subsistema
        // Note como a Facade agrupa tudo aqui
        HomeTheaterFacade ht = new HomeTheaterFacade(
            new Amplifier(), 
            new Projetor(),
            new LeitorDeDVD(), 
            new SistemaDeIluminacao()
        );

        // Cliente utiliza apenas a Facade — desconhece o subsistema
        ht.assistirFilme("Interestelar");
        ht.encerrarFilme();
    }
}