package net.ibizsys.central.util.template;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptCodeItem;

public class TemplateEntity implements IScriptEntity {

	private final IScriptEntity iScriptEntity;
	private final boolean bReadOnly;
	
	private Map<String, TemplateEntity> parentTemplateEntityMap = new HashMap<String, TemplateEntity>();
	private Map<String, TemplateEntity> childTemplateEntityMap = new HashMap<String, TemplateEntity>();
	
	public TemplateEntity(IScriptEntity iScriptEntity, boolean bReadOnly) {
		Assert.notNull(iScriptEntity, "传入脚本数据对象无效");
		this.iScriptEntity = iScriptEntity;
		this.bReadOnly = bReadOnly;
	}
	
	protected void assertNotReadOnly() {
		if(this.bReadOnly) {
			throw new RuntimeException("模板数据对象仅支持只读操作");
		}
	}
	
	
	@Override
	public TemplateEntity set(String strName, Object objValue) {
		this.assertNotReadOnly();
		this.iScriptEntity.set(strName, objValue);
		return this;
	}

	@Override
	public TemplateEntity set(Object[] args) {
		this.assertNotReadOnly();
		this.iScriptEntity.set(args);
		return this;
	}

	@Override
	public TemplateEntity set(Object params) {
		this.assertNotReadOnly();
		this.iScriptEntity.set(params);
		return this;
	}

	@Override
	public TemplateEntity field(String strName, Object objValue) {
		this.assertNotReadOnly();
		this.iScriptEntity.field(strName, objValue);
		return this;
	}

	@Override
	public TemplateEntity field(Object[] args) {
		this.assertNotReadOnly();
		this.iScriptEntity.field(args);
		return this;
	}

	@Override
	public TemplateEntity field(Object params) {
		this.assertNotReadOnly();
		this.iScriptEntity.field(params);
		return this;
	}

	@Override
	public Object get(String strName) {
		return this.iScriptEntity.get(strName);
	}

	@Override
	public Object get(String strName, Object objDefault) {
		return this.iScriptEntity.get(strName, objDefault);
	}

	@Override
	public Object getId() {
		return this.iScriptEntity.getId();
	}

	@Override
	public Object getName() {
		return this.iScriptEntity.getName();
	}

	@Override
	public boolean contains(String strName) {
		return this.iScriptEntity.contains(strName);
	}

	@Override
	public TemplateEntity reset(String strName) {
		this.assertNotReadOnly();
		this.iScriptEntity.reset(strName);
		return this;
	}

	@Override
	public TemplateEntity reset(String[] args) {
		this.assertNotReadOnly();
		this.iScriptEntity.reset(args);
		return this;
	}

	@Override
	public TemplateEntity parent(String strName) {
		if(!parentTemplateEntityMap.containsKey(strName)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.parent(strName);
			if(iScriptEntity == null) {
				parentTemplateEntityMap.put(strName, null);
			}
			else {
				TemplateEntity templateEntity = new TemplateEntity((TemplateEntity)iScriptEntity, this.bReadOnly);
				parentTemplateEntityMap.put(strName, templateEntity);
			}
		}
		return parentTemplateEntityMap.get(strName);
	}

	@Override
	public TemplateEntity create() {
		this.assertNotReadOnly();
		this.iScriptEntity.create();
		return this;
	}

	@Override
	public TemplateEntity update() {
		this.assertNotReadOnly();
		this.iScriptEntity.update();
		return this;
	}

	@Override
	public void remove() {
		this.assertNotReadOnly();
		this.iScriptEntity.remove();
	}

	@Override
	public TemplateEntity wfstart() {
		this.assertNotReadOnly();
		this.iScriptEntity.wfstart();
		return this;
	}

	@Override
	public TemplateEntity call(String strName) {
		this.assertNotReadOnly();
		this.iScriptEntity.call(strName);
		return this;
	}

	@Override
	public void exception(String strErrorInfo) {
		this.iScriptEntity.exception(strErrorInfo);
	}

	@Override
	public void exception(String strErrorInfo, int nErrorCode) {
		this.iScriptEntity.exception(strErrorInfo, nErrorCode);
	}

	@Override
	public TemplateEntity child(String strName) {
		if(!childTemplateEntityMap.containsKey(strName)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.child(strName);
			if(iScriptEntity == null) {
				childTemplateEntityMap.put(strName, null);
			}
			else {
				TemplateEntity templateEntity = new TemplateEntity((TemplateEntity)iScriptEntity, this.bReadOnly);
				childTemplateEntityMap.put(strName, templateEntity);
			}
		}
		return childTemplateEntityMap.get(strName);
	}

	@Override
	public boolean exists() {
		return this.iScriptEntity.exists();
	}

	@Override
	public TemplateEntity save() {
		this.assertNotReadOnly();
		this.iScriptEntity.save();
		return this;
	}

	@Override
	public TemplateEntity clone(boolean bResetUncopyValues) {
		net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.clone(bResetUncopyValues);
		return new TemplateEntity((TemplateEntity)iScriptEntity, this.bReadOnly);
	}

	@Override
	public TemplateEntity callEntity() {
		net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.callEntity();
		return new TemplateEntity((TemplateEntity)iScriptEntity, this.bReadOnly);
	}

	@Override
	public TemplateEntity last() {
		String strName = "--LAST--";
		if(!childTemplateEntityMap.containsKey(strName)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.last();
			if(iScriptEntity == null) {
				childTemplateEntityMap.put(strName, null);
			}
			else {
				TemplateEntity templateEntity = new TemplateEntity((TemplateEntity)iScriptEntity, this.bReadOnly);
				childTemplateEntityMap.put(strName, templateEntity);
			}
		}
		return childTemplateEntityMap.get(strName);
	}

	@Override
	public TemplateEntity copy(net.ibizsys.runtime.util.script.IScriptEntity srcScriptEntity, String[] fields) {
		this.iScriptEntity.copy(srcScriptEntity, fields);
		return this;
	}

	@Override
	public TemplateEntity copy(Object srcObject, String[] fields) {
		this.iScriptEntity.copy(srcObject, fields);
		return this;
	}

	@Override
	public TemplateEntity notify(String strName) {
		this.assertNotReadOnly();
		this.iScriptEntity.notify(strName);
		return this;
	}

	@Override
	public TemplateEntity from(Object objData) {
		this.iScriptEntity.from(objData);
		return this;
	}

	@Override
	public String dump() {
		return this.iScriptEntity.dump();
	}

	@Override
	public IScriptCodeItem codeitem(String strName) {
		return this.iScriptEntity.codeitem(strName);
	}

	@Override
	public IScriptCodeItem codeitem(String strName, boolean bTryMode) {
		return this.iScriptEntity.codeitem(strName, bTryMode);
	}

	@Override
	public String codelisttext(String strName) {
		return this.iScriptEntity.codelisttext(strName);
	}

	@Override
	public Object getReal() {
		return this.iScriptEntity.getReal();
	}

	@Override
	public Timestamp getTimestamp(String strName, Timestamp def) {
		return this.iScriptEntity.getTimestamp(strName, def);
	}

	@Override
	public BigDecimal getBigDecimal(String strName, BigDecimal fDefault) {
		return this.iScriptEntity.getBigDecimal(strName, fDefault);
	}

	@Override
	public BigInteger getBigInteger(String strName, BigInteger nDefault) {
		return this.iScriptEntity.getBigInteger(strName, nDefault);
	}

	@Override
	public Boolean getBoolean(String strName, Boolean def) {
		return this.iScriptEntity.getBoolean(strName, def);
	}

	@Override
	public Double getDouble(String strName, Double def) {
		return this.iScriptEntity.getDouble(strName, def);
	}

	@Override
	public Float getFloat(String strName, Float def) {
		return this.iScriptEntity.getFloat(strName, def);
	}

	@Override
	public Integer getInteger(String strName, Integer def) {
		return this.iScriptEntity.getInteger(strName, def);
	}

	@Override
	public Long getLong(String strName, Long def) {
		return this.iScriptEntity.getLong(strName, def);
	}

	@Override
	public String getString(String strName, String strDefault) {
		return this.iScriptEntity.getString(strName, strDefault);
	}

	@Override
	public String toJsonString() {
		return this.iScriptEntity.toJsonString();
	}

	@Override
	public String toJsonString(boolean bDTO) {
		return this.iScriptEntity.toJsonString(bDTO);
	}

	@Override
	public String toJsonString(boolean bDTO, String strSuffix) {
		return this.iScriptEntity.toJsonString(bDTO, strSuffix);
	}

	@Override
	public IScriptEntity[] children(String strName) {
		// TODO Auto-generated method stub
		return null;
	}

}
