import creator.*;
/**
 * Cliente — opera exclusivamente sobre RelatorioCreator (abstração).
 * Não referencia nenhuma classe concreta de Relatorio.
 * Execução no Eclipse: Run As > Java Application
 */
public class Main {
    public static void main(String[] args) {
        // Cada Creator encapsula a criação de um produto específico
        RelatorioCreator[] criadores = {
            new PdfRelatorioCreator(),
            new ExcelRelatorioCreator(),
            new HtmlRelatorioCreator()
        };
        // O cliente chama o método de negócio — nunca instancia o produto
        for (RelatorioCreator criador : criadores) {
            criador.processarRelatorio(
                "Vendas_Q2_2025",
                "Total: R$ 1.250.000 | Crescimento: 18%"
            );
        }
    }
}
