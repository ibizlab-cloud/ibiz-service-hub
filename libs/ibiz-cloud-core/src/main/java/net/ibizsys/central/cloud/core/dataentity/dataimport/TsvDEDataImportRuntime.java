package net.ibizsys.central.cloud.core.dataentity.dataimport;

public class TsvDEDataImportRuntime extends CsvDEDataImportRuntime {

	@Override
	protected char getDelimiter() {
		return '\t';
	}

	@Override
	protected char getQuoteChar() {
		return '\0';
	}

	@Override
	protected char getEscapeChar() {
		return '\0';
	}
}
