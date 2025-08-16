package net.ibizsys.runtime.codelist;

import java.util.List;

import net.ibizsys.model.codelist.IPSCodeItem;

/**
 * 预定义代码表运行时对象
 * @author lionlau
 *
 */
public class PredefinedCodeListRuntime extends CodeListRuntimeBase {


	@Override
	public List<IPSCodeItem> getPSCodeItems() {
		return this.getPSCodeList().getPSCodeItems();
	}

}
