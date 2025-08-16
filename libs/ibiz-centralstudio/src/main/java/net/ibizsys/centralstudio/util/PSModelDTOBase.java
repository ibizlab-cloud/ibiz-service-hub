package net.ibizsys.centralstudio.util;

import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 模型传输对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class PSModelDTOBase extends EntityBase implements IPSModelDTO {

	public final static String FIELD_SRFSYSTEMFLAG = "srfsystemflag";
	
	  /**
     * <B>CREATEMAN</B>&nbsp;建立人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEMAN = "createman";
    
    /**
     * <B>CREATEDATE</B>&nbsp;建立时间
     */
    public final static String FIELD_CREATEDATE = "createdate";
    
    /**
     * <B>UPDATEMAN</B>&nbsp;更新人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UPDATEMAN = "updateman";
    
    /**
     * <B>UPDATEDATE</B>&nbsp;更新时间
     */
    public final static String FIELD_UPDATEDATE = "updatedate";
    
    
	@JsonIgnore
	public Integer getSrfSystemFlag() {
		Object objValue = this.get(FIELD_SRFSYSTEMFLAG);
		if (objValue == null) {
			return null;

		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_SRFSYSTEMFLAG)
	public void setSrfSystemFlag(Integer defaultFlag) {
		this.set(FIELD_SRFSYSTEMFLAG, defaultFlag);
	}

	@JsonIgnore
	public boolean isSrfSystemFlagDirty() {
		if (this.contains(FIELD_SRFSYSTEMFLAG)) {
			return true;
		}
		return false;
	}

	@JsonIgnore
	public void resetSrfSystemFlag() {
		this.reset(FIELD_SRFSYSTEMFLAG);
	}
	

	@Override
	protected void onResetAll() {
		// TODO Auto-generated method stub
		super.onResetAll();
	}

	@Override
	public void copyTo(IEntity iEntity) {
		// TODO Auto-generated method stub
		super.copyTo(iEntity);
	}
	
	
	@JsonAnyGetter
	public Map<String, Object> any() {
		return this.prepareAny();
	}
	
	protected Map<String, Object> prepareAny() {
		final Map<String, Object> map = super.any();
		if(ObjectUtils.isEmpty(map)) {
			return null;
		}
		
		Map<String, Object> any = this.createAny();
		any.putAll(map);
		
		any.remove(FIELD_CREATEMAN);
        any.remove(FIELD_UPDATEMAN);
        any.remove(FIELD_CREATEDATE);
        any.remove(FIELD_UPDATEDATE);
		 
		return any;
	}
}
