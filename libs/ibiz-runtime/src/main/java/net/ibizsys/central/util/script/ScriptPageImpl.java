package net.ibizsys.central.util.script;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.lang.Nullable;

public class ScriptPageImpl extends org.springframework.data.domain.PageImpl {

	private long total;
	private List content = new ArrayList<>();
	public ScriptPageImpl(List content, Pageable pageable, long total) {
		super(content, pageable, total);
		this.setTotalElements(getOriginTotal());
		this.setContent(content);
	}
	
	public ScriptPageImpl(List<Object> content) {
		super(content);
		this.setContent(content);
	}
	
	private long getOriginTotal() {
		return super.getTotalElements();
	}

	@Override
	public long getTotalElements() {
		return this.total;
	}
	
	
	public void setTotalElements(long total) {
		this.total = total;
	}

	
	@Override
	public List getContent() {
		return this.content;
	}
	
	protected void setContent(List list) {
		this.content.clear();
		if(list!=null) {
			this.content.addAll(list);
		}
	}
	
	@Override
	public int getTotalPages() {
		return getSize() == 0 ? 1 : (int) Math.ceil((double) getTotalElements() / (double) getSize());
	}
	
	@Override
	public int getNumberOfElements() {
		return this.getContent().size();
	}
	
//	/*
//	 * (non-Javadoc)
//	 * @see org.springframework.data.domain.Slice#transform(org.springframework.core.convert.converter.Converter)
//	 */
//	@Override
//	public <U> Page<U> map(Function<? super T, ? extends U> converter) {
//		return new ScriptPageImpl<>(getConvertedContent(converter), getPageable(), getTotalElements());
//	}



	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(@Nullable Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScriptPageImpl)) {
			return false;
		}

		ScriptPageImpl that = (ScriptPageImpl) obj;

		return this.getTotalElements() == that.getTotalElements() && super.equals(obj);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		int result = 17;

		result += 31 * (int) (this.getTotalElements() ^ this.getTotalElements() >>> 32);
		result += 31 * super.hashCode();

		return result;
	}
	
}
