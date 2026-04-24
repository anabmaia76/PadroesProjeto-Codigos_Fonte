package product;

/**
 * ConcreteProduct: encapsula a geração de relatórios em formato PDF.
 */

public class PdfRelatorio implements Relatorio {

	@Override
	public void gerar(String titulo, String conteudo) {
		System.out.println("[PDF] Gerando relatório: " + titulo);
		System.out.println("[PDF] Conteúdo: " + conteudo);
		System.out.println("[PDF] Arquivo salvo: " + titulo + "." + getExtensao());
	}

	@Override
	public String getExtensao() {
		return "pdf";
	}
}