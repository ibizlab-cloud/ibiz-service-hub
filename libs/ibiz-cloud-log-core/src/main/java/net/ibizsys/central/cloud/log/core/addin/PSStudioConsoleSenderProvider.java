package net.ibizsys.central.cloud.log.core.addin;

public class PSStudioConsoleSenderProvider extends ConsoleSenderProviderBase {

	@Override
	public IConsoleSender createConsoleSender(String strConfig) {
		return new PSStudioConsoleSender();
	}

}
