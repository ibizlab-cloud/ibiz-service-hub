package net.ibizsys.centralstudio.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public abstract class CentralSearchContextDTOBase extends SearchContextBase{

	public CentralSearchContextDTOBase() {
		this.setPage(0);
		this.setSize(1000);
	}
	
	public void setPage(int nPage) {
		this.set(PARAM_PAGE, nPage);
	}
	
	
	public void setSize(int nSize) {
		this.set(PARAM_SIZE, nSize);
	}
	
	public int getPage() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(PARAM_PAGE), 0);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int getSize() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(PARAM_SIZE), 1000);
		} catch (Exception e) {
			return 1000;
		}
	}
	
	@Override
	public Pageable getPageable() {
		return PageRequest.of(getPage(), getSize());
	}
}
