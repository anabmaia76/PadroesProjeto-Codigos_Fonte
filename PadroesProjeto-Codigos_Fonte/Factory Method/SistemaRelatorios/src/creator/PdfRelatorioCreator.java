package creator;

import product.*;

/**
 * ConcreteCreator: fábrica de relatórios PDF.
 */

public class PdfRelatorioCreator extends RelatorioCreator {

	@Override
	public Relatorio criarRelatorio() {
		return new PdfRelatorio();
	}
}