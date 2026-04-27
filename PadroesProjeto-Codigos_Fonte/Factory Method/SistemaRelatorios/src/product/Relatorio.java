// Fonte: https://refactoring.guru/design-patterns/factory-method/java/example
// Adaptado por: Grupo [Ana Beatriz] — Trabalho de Design Patterns GoF
package product;
/**
 * Interface Product — define o contrato dos objetos criados pelo Factory Method.
 * O código cliente depende exclusivamente desta abstração.
 */
public interface Relatorio {
    /** Gera o conteúdo do relatório no formato específico. */
    void gerar(String titulo, String conteudo);
    /** Retorna a extensão do arquivo gerado (ex.: "pdf", "xlsx", "html"). */
    String getExtensao();
}
