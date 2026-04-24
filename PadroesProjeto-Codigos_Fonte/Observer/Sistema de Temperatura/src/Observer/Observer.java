package Observer;
//Fonte: https://refactoring.guru/design-patterns/observer/java/example


/**
* Contrato para todos os observadores concretos.
* O Subject depende apenas desta interface — nunca das implementações concretas.
*/
public interface Observer {
 /**
  * Invocado pelo Subject sempre que seu estado for alterado.
  * @param temperatura novo valor de temperatura registrado pelo sensor
  */
 void atualizar(double temperatura);
}
