package net.ibizsys.model.proxy.res;

import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.model.res.PSSysContentImpl;

public class PSSysContentImplEx extends PSSysContentImpl {

	@Override
	public String getContent() {
		String strContent = super.getContent();
		if(StringUtils.hasLength(strContent)) {
			return strContent;
		}
		
		
		String strCodeName = this.getCodeName();
		if(!StringUtils.hasLength(strCodeName)) {
			return null;
		}
		
		//从文件中提取
		if(this.getParentPSModelObject() instanceof IPSSysContentCat) {
			IPSSysContentCat iPSSysContentCat = (IPSSysContentCat)this.getParentPSModelObject();
			String strFilePath = String.format("%1$s.%2$s.txt", iPSSysContentCat.getDynaModelFilePath(), this.getCodeName().toLowerCase());
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
