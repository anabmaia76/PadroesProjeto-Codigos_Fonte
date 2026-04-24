package Observer;

/** ConcreteObserver 1: exibe a temperatura em um painel visual. */
public class PainelGrafico implements Observer {
    @Override
    public void atualizar(double temperatura) {
        System.out.println("[Painel] Temperatura exibida: " + temperatura + "°C");
    }
}

/** ConcreteObserver 2: dispara alertas quando temperatura ultrapassa limiar. */
 class SistemaDeAlertas implements Observer {
    private static final double LIMIAR = 40.0;
    @Override
    public void atualizar(double temperatura) {
        if (temperatura > LIMIAR) {
            System.out.println("[ALERTA] Temperatura crítica: " + temperatura + "°C!");
        } else {
            System.out.println("[Alertas] Temperatura normal: " + temperatura + "°C");
        }
    }
}

/** ConcreteObserver 3: registra cada leitura em log persistente. */
 class LogDeDados implements Observer {
    @Override
    public void atualizar(double temperatura) {
        System.out.println("[Log] Registro salvo: " + temperatura + "°C em " +
                           java.time.LocalTime.now());
    }
}
