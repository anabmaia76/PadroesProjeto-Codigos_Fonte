package creator;

import product.*;

/**
 * ConcreteCreator: fábrica de relatórios Excel.
 */

public class ExcelRelatorioCreator extends RelatorioCreator {

	@Override
	public Relatorio criarRelatorio() {
		return new ExcelRelatorio();
	}
}