package net.ibizsys.central.util;

import java.util.List;

import org.springframework.data.domain.Pageable;

public class PageImpl<T> extends org.springframework.data.domain.PageImpl<T> implements IPage<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4538716391294001366L;

	
	private int totalPages = -1;
	
	private long totalX = -1;
	
	public PageImpl(List<T> content, Pageable pageable, long total, int totalPages, long totalX) {
		super(content, pageable, total);
		this.totalPages = totalPages;
		this.totalX = totalX;
	}
	
	public PageImpl(List<T> content, Pageable pageable, long total, int totalPages) {
		super(content, pageable, total);
		this.totalPages = totalPages;
	}
	
	public PageImpl(List<T> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}

	public PageImpl(List<T> content) {
		super(content);
	}

	@Override
	public int getTotalPages() {
		if(this.totalPages >=0 ) {
			return this.totalPages;
		}
		return super.getTotalPages();
	}
	
	@Override
	public long getTotalX() {
		return this.totalX;
	}
}
