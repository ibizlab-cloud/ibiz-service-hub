package net.ibizsys.runtime.codelist;

import java.util.List;

import net.ibizsys.model.codelist.IPSCodeItem;

/**
 * 静态代码表运行时对象
 * 
 * @author lionlau
 *
 */
public class StaticCodeListRuntime extends CodeListRuntimeBase {

	@Override
	public List<IPSCodeItem> getPSCodeItems() {
		return this.getPSCodeList().getPSCodeItems();
	}
}
