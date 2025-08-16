package net.ibizsys.model.proxy.res;

import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.res.PSSysSFPluginImpl;

public class PSSysSFPluginImplEx extends PSSysSFPluginImpl {

	@Override
	public String getTemplCode() {
		String strContent = super.getTemplCode();
		if(StringUtils.hasLength(strContent)) {
			return strContent;
		}
		
		if(this.getObjectNode().has("_file") && StringUtils.hasLength(this.getDynaModelFilePath())) {
			String strFilePath = String.format("%1$s.txt", this.getDynaModelFilePath());
			IPSSystemService iPSSystemService = (IPSSystemService) this.getPSModelService();
			try {
				return iPSSystemService.getRawContent(strFilePath, true);
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return strContent;
	}
}
