package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class OpenQRCodeRequest extends EntityBase {

	public final static String FIELD_EXPIRESECONDS = "expireseconds";
	
	public final static String FIELD_SCENE = "scene";
	
	
	
	/**
     * 设置「失效时长」
     *
     * @param val
    */
    @JsonIgnore
    public OpenQRCodeRequest setExpireSeconds(Integer val) {
        this.set(FIELD_EXPIRESECONDS, val);
        return this;
    }

    /**
     * 获取「失效时长」值
     *
    */
    @JsonIgnore
    public Integer getExpireSeconds() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_EXPIRESECONDS),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「失效时长」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpireSeconds() {
        return this.contains(FIELD_EXPIRESECONDS);
    }

    /**
     * 重置 「失效时长」
     *
    */
    @JsonIgnore
    public OpenQRCodeRequest resetExpireSeconds() {
        this.reset(FIELD_EXPIRESECONDS);
        return this;
    }
    
    /**
     * 设置「场景」
     *
     * @param val
    */
    @JsonIgnore
    public OpenQRCodeRequest setScene(String val) {
        this.set(FIELD_SCENE, val);
        return this;
    }

    /**
     * 获取「场景」值
     *
    */
    @JsonIgnore
    public String getScene() {
        return (String) this.get(FIELD_SCENE);
    }

    /**
     * 判断 「场景」是否有值
     *
    */
    @JsonIgnore
    public boolean containsScene() {
        return this.contains(FIELD_SCENE);
    }

    /**
     * 重置 「场景」
     *
    */
    @JsonIgnore
    public OpenQRCodeRequest resetScene() {
        this.reset(FIELD_SCENE);
        return this;
    }
    

}
