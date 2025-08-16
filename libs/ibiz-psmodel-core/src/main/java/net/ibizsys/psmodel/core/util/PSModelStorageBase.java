package net.ibizsys.psmodel.core.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.core.type.TypeReference;

public abstract class PSModelStorageBase implements IPSModelStorage {

	@Override
	public boolean supportModel(String modelName) {
		return false;
	}
	
	@Override
	public void insert(String modelName, Map<String, Object> data) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public void update(String modelName, Map<String, Object> data, boolean append) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public int delete(String modelName, String key) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public int delete(String modelName, IPSModelFilter f) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public Map<String, Object> get(String modelName, String key, boolean tryMode) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public List<Map<String, Object>> select(String modelName, IPSModelFilter f) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public Map<String, Object> selectOne(String modelName, IPSModelFilter f) throws Exception {
		throw new Exception("没有实现");
	}
	
	@Override
	public List<Map<String, Object>> selectAll(String modelName) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public void resetAll() throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public void reset(String modelName) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public Collection<String> modelNames() throws Exception{
		throw new Exception("没有实现");
	}

	@Override
	public Page<Map<String, Object>> fetch(String modelName, String dataSetName, IPSModelFilter f) throws Exception {
		return this.onFetch(modelName, dataSetName, f);
	}
	
	protected Page<Map<String, Object>> onFetch(String modelName, String dataSetName, IPSModelFilter f) throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	public <T> T fetch(String modelName, String dataSetName, IPSModelFilter f, TypeReference<T> toValueTypeRef) throws Exception {
		return this.onFetch(modelName, dataSetName, f, toValueTypeRef);
	}
	
	protected <T> T onFetch(String modelName, String dataSetName, IPSModelFilter f, TypeReference<T> toValueTypeRef) throws Exception {
		throw new Exception("没有实现");
	}
	
}
