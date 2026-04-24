package Observer;


public class Main {
    public static void main(String[] args) {
        // Criação do ConcreteSubject
        SensorDeTemperatura sensor = new SensorDeTemperatura();

        // Registro dos observadores
        Observer painel   = new PainelGrafico();
        Observer alertas  = new SistemaDeAlertas();
        Observer log      = new LogDeDados();

        sensor.registrarObserver(painel);
        sensor.registrarObserver(alertas);
        sensor.registrarObserver(log);

        // Mudanças de estado disparam notificações automáticas
        sensor.setTemperatura(35.5);
        sensor.setTemperatura(42.1);

        // Remoção dinâmica — sem alterar o código do Subject
        System.out.println("\n[Sistema] Removendo painel gráfico...");
        sensor.removerObserver(painel);
        sensor.setTemperatura(38.0);
    }
}
