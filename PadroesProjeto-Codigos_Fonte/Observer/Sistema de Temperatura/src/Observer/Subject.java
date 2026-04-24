package Observer;

/**
 * Contrato para o objeto observado.
 * Define os métodos de gerenciamento da lista de observadores.
 */
public interface Subject {
    void registrarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers();
}

