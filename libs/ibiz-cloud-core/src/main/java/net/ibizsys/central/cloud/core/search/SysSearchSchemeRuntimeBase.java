package net.ibizsys.central.cloud.core.search;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.search.SysSearchSchemeRuntimeException;
import net.ibizsys.model.PSModelEnums.SearchFieldDataType;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.util.Errors;

public abstract class SysSearchSchemeRuntimeBase extends net.ibizsys.central.search.SysSearchSchemeRuntimeBase implements ISysSearchSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSearchSchemeRuntimeBase.class);
	
	protected String strEmbeddingPlatform = null;
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	
	
	/**
	 * 嵌套标记：文本及向量
	 */
	public final static String NESTED_TEXT_VECTOR = "TEXT_VECTOR";
	
	@Override
	protected void onInit() throws Exception {
		this.setEmbeddingPlatform(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".embeddingplatform", this.getEmbeddingPlatform()));
		super.onInit();
	}
	
	protected void setEmbeddingPlatform(String strEmbeddingPlatform) {
		this.strEmbeddingPlatform = strEmbeddingPlatform;
	}
	
	protected String getEmbeddingPlatform() {
		return this.strEmbeddingPlatform;
	}
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if(this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}
	
	@Override
	public ISysSearchDocRuntime getSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc) {
		return (ISysSearchDocRuntime)super.getSysSearchDocRuntime(iPSSysSearchDoc);
	}
	
	@Override
	public ISysSearchDocRuntime getSysSearchDocRuntime(String strDocName, boolean bTryMode) {
		return (ISysSearchDocRuntime)super.getSysSearchDocRuntime(strDocName, bTryMode);
	}
	
	@Override
	protected Object onInsert(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable {
		processDenseVectorFields(strDocName, arg, false);
		return super.onInsert(strDocName, arg, extParamMap);
	}
	
	@Override
	protected Object onUpdate(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable {
		processDenseVectorFields(strDocName, arg, true);
		return super.onUpdate(strDocName, arg, extParamMap, bAppendMode);
	}
	
	
	protected void processDenseVectorFields(String strDocName, Map<String, Object> map, boolean bUpdate) throws Throwable {
		ISysSearchDocRuntime iSysSearchDocRuntime = this.getSysSearchDocRuntime(strDocName, false);
		
		List<IPSSysSearchField> list = iSysSearchDocRuntime.getPSSysSearchDoc().getAllPSSysSearchFields();
		if(!ObjectUtils.isEmpty(list)) {
			for(IPSSysSearchField iPSSysSearchField : list) {
				if(!map.containsKey(iPSSysSearchField.getName())) {
					continue;
				}
				if(SearchFieldDataType.DENSE_VECTOR.value.equals(iPSSysSearchField.getFieldType())) {
					String strContent = String.valueOf(map.get(iPSSysSearchField.getName()));
					if(!StringUtils.hasLength(strContent)) {
						continue;
					}
					
					map.put(iPSSysSearchField.getName(), getEmbeddingValue(strContent));
					continue;
				}
				if(SearchFieldDataType.NESTED.value.equals(iPSSysSearchField.getFieldType())) {
					
					if(NESTED_TEXT_VECTOR.equals(iPSSysSearchField.getFieldTag())) {
						String strContent = String.valueOf(map.get(iPSSysSearchField.getName()));
						if(!StringUtils.hasLength(strContent)) {
							continue;
						}
						
						map.put(iPSSysSearchField.getName(), getNestedTextVectorValue(iSysSearchDocRuntime, iPSSysSearchField, strContent));
					}
					
					
					
					continue;
				}
				
			}
		}
	}
	
	protected Object getEmbeddingValue(String strContent) {
		EmbeddingRequest embeddingRequest = new EmbeddingRequest();
		embeddingRequest.setContent(strContent);
		EmbeddingResult embeddingResult = this.getSysAIUtilRuntime().embedding(this.getEmbeddingPlatform(), embeddingRequest);
		List<Double> list = embeddingResult.getData().get(0).getEmbedding();
		double[] doubleArray = list.stream()
                .mapToDouble(Double::doubleValue) // 等价于 .mapToDouble(d -> d)
                .toArray();
		return doubleArray;
	}
	
	
	protected Object getNestedTextVectorValue(ISysSearchDocRuntime iSysSearchDocRuntime, IPSSysSearchField iPSSysSearchField, String strContent) {

		List<String> part = iSysSearchDocRuntime.splitNestedText(iPSSysSearchField, strContent);
		
		Map[] value = new Map[part.size()];
		for(int i = 0;i<part.size();i++) {
			String strPart = part.get(i);
			
			Map<String ,Object> item = new LinkedHashMap<String, Object>();
			item.put("text", strPart);
			item.put("vector", getVector(strPart));
			value[i] = item;
		}
		
		return value;
	}
	
	protected double[] getVector(String strContent){
		EmbeddingRequest embeddingRequest = new EmbeddingRequest();
		embeddingRequest.setContent(strContent);
		EmbeddingResult embeddingResult = this.getSysAIUtilRuntime().embedding(this.getEmbeddingPlatform(), embeddingRequest);
		List<Double> data = embeddingResult.getData().get(0).getEmbedding();
		double[] doubleArray = data.stream()
                .mapToDouble(Double::doubleValue) // 等价于 .mapToDouble(d -> d)
                .toArray();
		return doubleArray;
	}
	
	
	@Override
	public List<Chunk> selectChunks(String docName, IChunkSearchContext iChunkSearchContext) throws Throwable {
		Assert.hasLength(docName, "未传入文档标识");
		Assert.notNull(iChunkSearchContext, "未传入片段搜索上下文");
		try {
			return this.onSelectChunks(docName, iChunkSearchContext);
		}
		catch(Throwable ex) {
			SysSearchSchemeRuntimeException.rethrow(this, ex);
			throw new SysSearchSchemeRuntimeException(this, String.format("搜索片段发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	protected List<Chunk> onSelectChunks(String docName, IChunkSearchContext iChunkSearchContext) throws Throwable {
		throw new SysSearchSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
}
