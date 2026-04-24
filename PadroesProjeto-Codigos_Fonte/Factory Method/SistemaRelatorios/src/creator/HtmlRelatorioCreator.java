package creator;

import product.*;

/**
 * ConcreteCreator: fábrica de relatórios HTML.
 */

public class HtmlRelatorioCreator extends RelatorioCreator {

	@Override
	public Relatorio criarRelatorio() {
		return new HtmlRelatorio();
	}
}