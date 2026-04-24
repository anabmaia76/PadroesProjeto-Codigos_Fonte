package product;

/**
 * ConcreteProduct: encapsula a geração de relatórios em formato HTML.
 */

public class HtmlRelatorio implements Relatorio {

	@Override
	public void gerar(String titulo, String conteudo) {
		System.out.println("[HTML] Gerando página: " + titulo);
		System.out.println("[HTML] Conteúdo: <p>" + conteudo + "</p>");
		System.out.println("[HTML] Arquivo salvo: " + titulo + "." + getExtensao());
	}

	@Override
	public String getExtensao() {
		return "html";
	}
}