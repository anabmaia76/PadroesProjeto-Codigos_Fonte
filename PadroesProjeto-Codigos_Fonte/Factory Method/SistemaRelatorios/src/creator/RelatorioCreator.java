package creator;
import product.Relatorio;
/**
 * Creator abstrato — declara o Factory Method e define o algoritmo de negócio
 * que utiliza o produto, sem conhecer qual implementação concreta será usada.
 */
public abstract class RelatorioCreator {
    /**
     * Factory Method: subclasses sobrescrevem este método para retornar
     * o ConcreteProduct adequado. O Creator não instancia nada diretamente.
     */
    public abstract Relatorio criarRelatorio();
    /**
     * Método de negócio: utiliza o produto criado pelo Factory Method.
     * O algoritmo permanece estável; apenas o produto varia.
     */
    public void processarRelatorio(String titulo, String conteudo) {
        System.out.println("\n=== Iniciando processamento: " + titulo + " ===");
        // Delega a criação ao Factory Method — polimorfismo em ação
        Relatorio relatorio = criarRelatorio();
        relatorio.gerar(titulo, conteudo);
        System.out.println("=== Relatório [." + relatorio.getExtensao() + "] concluído. ===\n");
    }
}
