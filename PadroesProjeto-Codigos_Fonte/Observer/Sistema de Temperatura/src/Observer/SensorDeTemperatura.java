package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject: mantém o estado (temperatura) e gerencia os observadores.
 * Quando a temperatura muda, notifica automaticamente todos os registrados.
 */
public class SensorDeTemperatura implements Subject {

    private final List<Observer> observadores = new ArrayList<>();
    private double temperaturaAtual;

    @Override
    public void registrarObserver(Observer o)  { observadores.add(o); }

    @Override
    public void removerObserver(Observer o)    { observadores.remove(o); }

    @Override
    public void notificarObservers() {
        for (Observer o : observadores) {
            o.atualizar(temperaturaAtual);
        }
    }

    /**
     * Setter que dispara a notificação automaticamente (modelo push).
     * @param temperatura nova leitura do sensor
     */
    public void setTemperatura(double temperatura) {
        this.temperaturaAtual = temperatura;
        System.out.println("[Sensor] Nova leitura: " + temperatura + "°C");
        notificarObservers();
    }
}