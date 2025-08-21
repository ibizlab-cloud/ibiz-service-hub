package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 下载凭证
 * @author lionlau
 *
 */
public class DownloadTicket extends EntityBase {

	/**
	 * 文件标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * 文件名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  文件分类
	 */
	public final static String FIELD_CAT = "cat";

	
	/**
	 *  文件凭证
	 */
	public final static String FIELD_TICKET = "ticket";
	
	
	/**
	 *  过期秒数
	 */
	public final static String FIELD_EXPIREIN = "expirein";
	
	
	
	/**
	 * 设置「 文件标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DownloadTicket setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「 文件标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「 文件标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「 文件标识」
	 *
	 */
	@JsonIgnore
	public DownloadTicket resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「 文件名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DownloadTicket setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「 文件名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「 文件名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「 文件名称」
	 *
	 */
	@JsonIgnore
	public DownloadTicket resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「 文件分类」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DownloadTicket setCat(String val) {
		this.set(FIELD_CAT, val);
		return this;
	}

	/**
	 * 获取「 文件分类」值
	 *
	 */
	@JsonIgnore
	public String getCat() {
		return (String) this.get(FIELD_CAT);
	}

	/**
	 * 判断 「 文件分类」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCat() {
		return this.contains(FIELD_CAT);
	}

	/**
	 * 重置 「 文件分类」
	 *
	 */
	@JsonIgnore
	public DownloadTicket resetCat() {
		this.reset(FIELD_CAT);
		return this;
	}

	
	/**
	 * 设置「 文件凭证」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DownloadTicket setTicket(String val) {
		this.set(FIELD_TICKET, val);
		return this;
	}

	/**
	 * 获取「 文件凭证」值
	 *
	 */
	@JsonIgnore
	public String getTicket() {
		return (String) this.get(FIELD_TICKET);
	}

	/**
	 * 判断 「 文件凭证」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTicket() {
		return this.contains(FIELD_TICKET);
	}

	/**
	 * 重置 「 文件凭证」
	 *
	 */
	@JsonIgnore
	public DownloadTicket resetTicket() {
		this.reset(FIELD_TICKET);
		return this;
	}

	
	 /**
     * 设置「过期秒数」
     *
     * @param val
    */
    @JsonIgnore
    public DownloadTicket setExpireIn(Integer val) {
        this.set(FIELD_EXPIREIN, val);
        return this;
    }

    /**
     * 获取「过期秒数」值
     *
    */
    @JsonIgnore
    public Integer getExpireIn() {
        try{
            return DataTypeUtils.asInteger(this.get(FIELD_EXPIREIN),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「过期秒数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpireIn() {
        return this.contains(FIELD_EXPIREIN);
    }

    /**
     * 重置 「过期秒数」
     *
    */
    @JsonIgnore
    public DownloadTicket resetExpireIn() {
        this.reset(FIELD_EXPIREIN);
        return this;
    }


}
