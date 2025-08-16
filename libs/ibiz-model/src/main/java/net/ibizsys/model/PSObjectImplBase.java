package net.ibizsys.model;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class PSObjectImplBase implements IPSModelObjectRuntime {

	public final static String ATTR_GETID = "id";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	
	private IPSModelObjectRuntime parentPSModelObject = null;
	private ObjectNode objectNode = null;
	private IPSModelService iPSModelService = null;
	private ObjectNode originObjectNode = null;
	
	
	public void init(IPSModelService iPSModelService,IPSModelObjectRuntime parentModel,ObjectNode objectNode){
		this.iPSModelService = iPSModelService;
		this.parentPSModelObject = parentModel;
		this.originObjectNode = objectNode;
		this.objectNode = iPSModelService.getRealObjectNode(objectNode);
		if(this.objectNode == null) {
			this.objectNode = this.originObjectNode;
		}
		
		this.onInit();
	}
	
	protected void onInit(){
		
	}
	
	@Override
	public java.lang.String getId() {
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETID);
		if(value == null){
			String strId = getDynaModelFilePath();
			if(StringUtils.hasLength(strId)) {
				return strId;
			}
			strId = this.getCodeName();
			if(StringUtils.hasLength(strId)) {
				return strId;
			}
			strId = this.getName();
			if(StringUtils.hasLength(strId)) {
				return strId;
			}
			return null;
		}
		return value.asText();
	}

	
	
	protected <T> T getPSModelObject(Class<T> cls, ObjectNode objNode,String strTag){
		
		return getPSModelService().getPSModelObject(this, cls, objNode,strTag);
	}
	
	
	protected <T> T getPSModelObject(Class<T> cls, java.util.List<T> it, Object objTag, boolean bTryMode) {
		return this.getPSModelService().getPSModelObject(this, cls, it, objTag, bTryMode);
	}
	
	
	
	protected IPSModelService getPSModelService() {
		return this.iPSModelService;
	}
	
	
	@Override
	public <T> T getChildPSModelObject(Class<T> cls, ObjectNode objNode,String strTag){
		
		return this.getChildPSModelObject(cls, objNode, strTag, false);
		//throw new Exception(String.format("无法获取指定类型[%1$s]模型，标识为[%2$s]",cls,objNode));

	}

	@Override
	public <T> T getParentPSModelObject(Class<T> cls){
		
		return this.getParentPSModelObject(cls, false);
	}
	
	@Override
	public <T> T getChildPSModelObject(Class<T> cls, ObjectNode objNode,String strTag, boolean bTryMode){
		
		return this.getPSModelService().getChildPSModelObject(this, cls, objNode, strTag, bTryMode);
		//throw new Exception(String.format("无法获取指定类型[%1$s]模型，标识为[%2$s]",cls,objNode));

	}

	@Override
	public <T> T getParentPSModelObject(Class<T> cls, boolean bTryMode){
		
		return this.getPSModelService().getParentPSModelObject(this, cls, bTryMode);
	}
	
	@Override
	public <T> T getPSModelObject(Class<T> cls, boolean bTryMode){
		return this.getPSModelService().getPSModelObject(this, cls, bTryMode);
	}
	
	
	@Override
	public IPSModelObjectRuntime getParentPSModelObject() {
		return this.parentPSModelObject;
	}
	
	
	@Override
	public ObjectNode getObjectNode() {
	
		return this.objectNode;
	}
	
	public String getCodeName()  {
		return null;
	}

	public String getName()  {
		return null;
	}
	
	public String getMemo()  {
		return null;
	}
	
	public String getLogicName()  {
		return null;
	}
	
	public String getDeployId() {
		return null;
	}
	
	public int getExtendMode() {
		return 0;
	}
	
	@Override
	public String getDynaModelFilePath() {
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	public boolean isDynaInstModel() {
		return false;
	}
	
	
	/**
	 * 获取属性字符串值
	 * @param jsonObject
	 * @param strPropertyName
	 * @param strDefault
	 * @return
	 */
	public static String getString(ObjectNode jsonObject, String strPropertyName, String strDefault){
		JsonNode valueNode = jsonObject.get(strPropertyName);
		if(valueNode == null)
			return strDefault;
		return valueNode.asText();
	}
	
	/**
	 * 获取属性布尔值
	 * @param jsonObject
	 * @param strPropertyName
	 * @param bDefault
	 * @return
	 */
	public static boolean getBoolean(ObjectNode jsonObject, String strPropertyName, boolean bDefault){
		JsonNode valueNode = jsonObject.get(strPropertyName);
		if(valueNode == null)
			return bDefault;
		return valueNode.asBoolean();
	}
	
	
	/**
	 * 获取属性整数值
	 * @param jsonObject
	 * @param strPropertyName
	 * @param strDefault
	 * @return
	 */
	public static int getInt(ObjectNode jsonObject, String strPropertyName, int nDefault){
		JsonNode valueNode = jsonObject.get(strPropertyName);
		if(valueNode == null)
			return nDefault;
		return valueNode.asInt();
	}
	
	
	/**
	 * 获取属性Long值
	 * @param jsonObject
	 * @param strPropertyName
	 * @param strDefault
	 * @return
	 */
	public static long getLong(ObjectNode jsonObject, String strPropertyName, long nDefault){
		JsonNode valueNode = jsonObject.get(strPropertyName);
		if(valueNode == null)
			return nDefault;
		return valueNode.asLong();
	}
	
	
	/**
	 * 获取属性Double值
	 * @param jsonObject
	 * @param strPropertyName
	 * @param strDefault
	 * @return
	 */
	public static double getDouble(ObjectNode jsonObject, String strPropertyName, double fDefault){
		JsonNode valueNode = jsonObject.get(strPropertyName);
		if(valueNode == null)
			return fDefault;
		return valueNode.asDouble();
	}
	
	
	

	
	/**
	 * 获取属性Json数组值
	 * @param jsonObject
	 * @param strPropertyName
	 * @return
	 * @throws Exception
	 */
	public static ArrayNode getArray(ObjectNode jsonObject, String strPropertyName)throws Exception{
		JsonNode valueNode = jsonObject.get(strPropertyName);
		if(valueNode == null)
			return null;
		
		if(!(valueNode instanceof ArrayNode)){
			throw new Exception(String.format("无法将值[%1$s]转换为Json数组",valueNode.getClass().getCanonicalName()));
		}
		return (ArrayNode)valueNode;
	}
	
	
	
	
}
