package product;

/**
 * ConcreteProduct: encapsula a geração de relatórios em formato Excel.
 */

public class ExcelRelatorio implements Relatorio {

	@Override
	public void gerar(String titulo, String conteudo) {
		System.out.println("[XLSX] Gerando planilha: " + titulo);
		System.out.println("[XLSX] Dados: " + conteudo);
		System.out.println("[XLSX] Arquivo salvo: " + titulo + "." + getExtensao());
	}

	@Override
	public String getExtensao() {
		return "xlsx";
	}
}