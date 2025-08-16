package net.ibizsys.central.cloud.core.spring.swagger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.swagger.annotations.ApiOperation;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIDocAdapter;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionInputDTO;
import net.ibizsys.model.dataentity.action.IPSDEActionReturn;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn;
import net.ibizsys.model.dataentity.ds.IPSDEFilterDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.dataentity.service.IPSDEMethodReturn;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOFieldTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodReturnTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.JsonUtils;
import springfox.documentation.service.ParameterType;
import springfox.documentation.spring.web.scanners.ApiDocumentationScanner;

@Primary
@Component
@ConditionalOnProperty(name = "springfox.documentation.enabled", havingValue = "true", matchIfMissing = true)
public class DocumentationCache extends springfox.documentation.spring.web.DocumentationCache implements ISysServiceAPIDocAdapter, ApplicationContextAware {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DocumentationCache.class);

	@Autowired
	private ApiDocumentationScanner apiDocumentationScanner = null;

	private Map<String, String> schemaMap = new HashMap<String, String>();

	private class SysApiCache {

		public Map<String, ObjectNode> tagNodeMap = new TreeMap<String, ObjectNode>();
		public Map<String, ObjectNode> componentNodeMap = new LinkedHashMap<String, ObjectNode>();
		public Map<String, ObjectNode> pathNodeMap = new LinkedHashMap<String, ObjectNode>();

	}

	private Map<String, SysApiCache> sysApiCacheMap = new LinkedHashMap<String, SysApiCache>();
	private GenericApplicationContext ctx = null;

	// @Autowired
	// private DocumentationPluginsManager DocumentationPluginsManager;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if (applicationContext instanceof GenericApplicationContext) {
			ctx = (GenericApplicationContext) applicationContext;
		}
	}

	@Override
	public void registerMapping(IDEServiceAPIRuntime iDEServiceAPIRuntime, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, String... paths) {

		// 构建控制器标记
		String strSysTag = iDEServiceAPIRuntime.getSystemRuntime().getServiceId();

		String strApiTag = iDEServiceAPIRuntime.getSysServiceAPIRuntime().getPSSysServiceAPI().getServiceCodeName();

		String strFullTag = String.format("%1$s--%2$s", strSysTag, strApiTag);
		
		SysApiCache sysApiCache = null;
		synchronized (sysApiCacheMap) {
			sysApiCache = sysApiCacheMap.get(strFullTag);
			if (sysApiCache == null) {
				sysApiCache = new SysApiCache();
				sysApiCacheMap.put(strFullTag, sysApiCache);
			}
		}

		String strTag = String.format("%1$s-%2$s-%3$s-controller", strSysTag, strApiTag, iDEServiceAPIRuntime.getPSDEServiceAPI().getCodeName()).toLowerCase();
		if (!sysApiCache.tagNodeMap.containsKey(strTag)) {
			String strDesc = iDEServiceAPIRuntime.getPSDEServiceAPI().getLogicName();
			if (!StringUtils.hasLength(strDesc)) {
				strDesc = iDEServiceAPIRuntime.getPSDEServiceAPI().getPSDataEntityMust().getLogicName();
			}
			String strSysDesc = iDEServiceAPIRuntime.getSystemRuntime().getPSSystem().getLogicName();
			if (!StringUtils.hasLength(strSysDesc)) {
				strSysDesc = strSysTag;
			}

			String strApiDesc = iDEServiceAPIRuntime.getSysServiceAPIRuntime().getPSSysServiceAPI().getName();
			if (!StringUtils.hasLength(strApiDesc)) {
				strApiDesc = strApiTag;
			}

			strDesc = String.format("%1$s[%2$s] - %3$s", strSysDesc, strApiDesc, strDesc);

			ObjectNode tagNode = JsonUtils.createObjectNode();
			tagNode.put(FIELD_NAME, strTag);
			tagNode.put(FIELD_DESCRIPTION, strDesc);

			sysApiCache.tagNodeMap.put(strTag, tagNode);
		}

		String summary = iPSDEServiceAPIMethod.getLogicName();
		if (!StringUtils.hasLength(summary)) {
			if (iPSDEServiceAPIMethod.getPSDEAction() != null) {
				summary = iPSDEServiceAPIMethod.getPSDEAction().getLogicName();
			} else if (iPSDEServiceAPIMethod.getPSDEDataSet() != null) {
				summary = iPSDEServiceAPIMethod.getPSDEDataSet().getLogicName();
			}
		}

		String description = iPSDEServiceAPIMethod.getMemo();
		if (!StringUtils.hasLength(description)) {
			if (iPSDEServiceAPIMethod.getPSDEAction() != null) {
				description = iPSDEServiceAPIMethod.getPSDEAction().getMemo();
			} else if (iPSDEServiceAPIMethod.getPSDEDataSet() != null) {
				description = iPSDEServiceAPIMethod.getPSDEDataSet().getMemo();
			}
		}

		// 注册接口清单
		for (int i = 0; i < paths.length; i++) {
			String path = paths[i];
			if(!StringUtils.hasLength(path)) {
				continue;
			}

			ObjectNode pathNode = sysApiCache.pathNodeMap.get(path);
			if (pathNode == null) {
				pathNode = JsonUtils.createObjectNode();
				sysApiCache.pathNodeMap.put(path, pathNode);
			}

			ObjectNode operationNode = pathNode.putObject(iPSDEServiceAPIMethod.getRequestMethod().toLowerCase());

			ArrayNode tagsNode = operationNode.putArray(FIELD_PATH_TAGS);
			tagsNode.add(strTag);

			String uniqueId = iPSDEServiceAPIMethod.getCodeName();
			if (!StringUtils.hasLength(uniqueId)) {
				if (iPSDEServiceAPIMethod.getPSDEAction() != null) {
					uniqueId = iPSDEServiceAPIMethod.getPSDEAction().getCodeName();
				}
			}
			if (iDEServiceAPIRSRuntime != null) {
				uniqueId = String.format("%1$s__%2$s__%3$s", iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getPSDEServiceAPI().getCodeName(), uniqueId, i);
			}

			operationNode.put(FIELD_PATH_OPERATIONID, uniqueId);

			operationNode.put(FIELD_PATH_SUMMARY, summary);

			ArrayNode parametersNode = this.getParametersNode(iDEServiceAPIRuntime, iDEServiceAPIRSRuntime, iPSDEServiceAPIMethod);

			operationNode.put(FIELD_PATH_PARAMETERS, parametersNode);

			if (iPSDEServiceAPIMethod.getPSDEServiceAPIMethodInput() != null) {
				IPSDEMethodDTO iPSDEMethodDTO = iPSDEServiceAPIMethod.getPSDEServiceAPIMethodInput().getPSDEMethodDTO();
				if (iPSDEMethodDTO != null) {
					String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, iDEServiceAPIRuntime.getPSDEServiceAPI().getPSDataEntityMust(), iPSDEMethodDTO);

					ObjectNode requestBodyNode = operationNode.putObject(FIELD_PATH_REQUESTBODY);
					ObjectNode contentNode = requestBodyNode.putObject(FIELD_CONTENT);
					ObjectNode jsonNode = contentNode.putObject("application/json");
					ObjectNode schemaNode = jsonNode.putObject(FIELD_JSONSCHEMA);
					schemaNode.put(FIELD_REF, strRefTag);
				}
			}

			ObjectNode responsesNode = operationNode.putObject(FIELD_PATH_RESPONSES);
			ObjectNode okNode = responsesNode.putObject("200");
			okNode.put("description", "OK");

			if (iPSDEServiceAPIMethod.getPSDEServiceAPIMethodReturn() != null) {

				String strType = iPSDEServiceAPIMethod.getPSDEServiceAPIMethodReturn().getType();
				if (DEMethodReturnTypes.VOID.equals(strType)) {

				} else {
					ObjectNode schemaNode = okNode.putObject(FIELD_CONTENT).putObject("*/*").putObject(FIELD_JSONSCHEMA);
					IPSDEMethodDTO iPSDEMethodDTO = iPSDEServiceAPIMethod.getPSDEServiceAPIMethodReturn().getPSDEMethodDTO();
					if (iPSDEMethodDTO != null) {
						String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, iDEServiceAPIRuntime.getPSDEServiceAPI().getPSDataEntityMust(), iPSDEMethodDTO);
						if (DEMethodReturnTypes.DTOS.equals(strType) || DEMethodReturnTypes.PAGE.equals(strType)) {
							schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
							ObjectNode itemsNode = schemaNode.putObject(FIELD_JSONSCHEMA_ITEMS);
							itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
						} else {
							schemaNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
						}
					} else {
						if (DEMethodReturnTypes.SIMPLES.equals(strType)) {
							schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
							ObjectNode itemsNode = schemaNode.putObject(FIELD_JSONSCHEMA_ITEMS);
							itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(iPSDEServiceAPIMethod.getPSDEServiceAPIMethodReturn().getStdDataType()));
						} else {
							schemaNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(iPSDEServiceAPIMethod.getPSDEServiceAPIMethodReturn().getStdDataType()));
						}
					}
				}
			}
		}
	}

	protected ArrayNode getParametersNode(IDEServiceAPIRuntime iDEServiceAPIRuntime, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, IPSDEServiceAPIMethod iPSDEServiceAPIMethod) {

		ArrayNode parametersNode = JsonUtils.createArrayNode();

		if (iDEServiceAPIRSRuntime != null) {

			ObjectNode parameterNode = parametersNode.addObject();

			parameterNode.put(FIELD_NAME, "pkey");
			parameterNode.put(FIELD_PARAMETER_IN, ParameterType.PATH.getIn());
			parameterNode.put(FIELD_DESCRIPTION, "父键值");
			parameterNode.put(FIELD_PARAMETER_REQUIRED, true);
			ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
			schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_STRING);

		}

		if (iPSDEServiceAPIMethod.isNeedResourceKey()) {
			ObjectNode parameterNode = parametersNode.addObject();
			parameterNode.put(FIELD_NAME, "key");
			parameterNode.put(FIELD_PARAMETER_IN, ParameterType.PATH.getIn());
			parameterNode.put(FIELD_DESCRIPTION, "键值");
			parameterNode.put(FIELD_PARAMETER_REQUIRED, true);
			ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
			schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_STRING);
		}

		// //判断行为类型
		// if("FETCH".equals(iPSDEServiceAPIMethod.getMethodType())) {
		// RequestParameter requestParameter = new RequestParameter("filter",
		// ParameterType.BODY,
		// "过滤条件",
		// true,
		// false,
		// false,
		// getParameterSpecification(iPSDEServiceAPIMethod.getPSDEServiceAPIMethodInputMust()),
		// //ParameterSpecification parameterSpecification,
		// null, //Example scalarExample,
		// new ArrayList<Example>(),// Collection<Example> examples,
		// 0,//int precedence,
		// new ArrayList<VendorExtension>(),// List<VendorExtension> extensions,
		// parameterIndex);
		// requestParameters.add(requestParameter);
		// parameterIndex ++;
		// }
		// else
		// if("DEACTION".equals(iPSDEServiceAPIMethod.getMethodType())) {
		//
		// }

		return parametersNode;
	}

	protected ArrayNode getParametersNode(ISysServiceAPIRuntime iSysServiceAPIRuntime, IPSDataEntity iPSDataEntity, Object model) {

		ArrayNode parametersNode = JsonUtils.createArrayNode();

		if (model instanceof IPSDEAction) {

			IPSDEAction iPSDEAction = (IPSDEAction) model;
			if (DEActionModes.READ.equals(iPSDEAction.getActionMode()) || DEActionModes.REMOVE.equals(iPSDEAction.getActionMode())) {
				ObjectNode parameterNode = parametersNode.addObject();
				parameterNode.put(FIELD_NAME, "key");
				parameterNode.put(FIELD_PARAMETER_IN, ParameterType.PATH.getIn());
				parameterNode.put(FIELD_DESCRIPTION, "键值");
				parameterNode.put(FIELD_PARAMETER_REQUIRED, true);
				ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
				schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_STRING);
			}
		}

		return parametersNode;
	}

	protected ArrayNode getParametersNode(ISysServiceAPIRuntime iSysServiceAPIRuntime, Object handler, Method action) {

		ArrayNode parametersNode = JsonUtils.createArrayNode();

		Annotation[][] annotations = action.getParameterAnnotations();
		int nParamCount = action.getParameterCount();
		for (int i = 0; i < nParamCount; i++) {
			if (annotations[i].length == 0) {
				continue;
			}

			Parameter parameter = action.getParameters()[i];

			Annotation annotation = annotations[i][0];
			if (annotation instanceof RequestHeader) {
				RequestHeader requestHeader = (RequestHeader) annotation;

				ObjectNode parameterNode = parametersNode.addObject();

				if (StringUtils.hasLength(requestHeader.name())) {
					parameterNode.put(FIELD_NAME, requestHeader.name());
				} else {
					parameterNode.put(FIELD_NAME, requestHeader.value());
				}

				parameterNode.put(FIELD_PARAMETER_IN, ParameterType.HEADER.getIn());
				parameterNode.put(FIELD_PARAMETER_REQUIRED, requestHeader.required());
				ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
				this.fillJsonSchemaNode(schemaNode, iSysServiceAPIRuntime, handler, action, parameter);
				// schemaNode.put(FIELD_JSONSCHEMA_TYPE,
				// this.getJsonSchemaType(iSysServiceAPIRuntime, handler,
				// action, parameter.getType()));

				continue;
			}

			if (annotation instanceof PathVariable) {
				PathVariable pathVariable = (PathVariable) annotation;
				ObjectNode parameterNode = parametersNode.addObject();

				if (StringUtils.hasLength(pathVariable.name())) {
					parameterNode.put(FIELD_NAME, pathVariable.name());
				} else {
					parameterNode.put(FIELD_NAME, pathVariable.value());
				}

				parameterNode.put(FIELD_PARAMETER_IN, ParameterType.PATH.getIn());
				parameterNode.put(FIELD_PARAMETER_REQUIRED, pathVariable.required());
				ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
				this.fillJsonSchemaNode(schemaNode, iSysServiceAPIRuntime, handler, action, parameter);
				// schemaNode.put(FIELD_JSONSCHEMA_TYPE,
				// this.getJsonSchemaType(iSysServiceAPIRuntime, handler,
				// action, parameter.getType()));
				continue;
			}

			if (annotation instanceof RequestParam) {
				RequestParam requestParam = (RequestParam) annotation;
				ObjectNode parameterNode = parametersNode.addObject();

				if (StringUtils.hasLength(requestParam.name())) {
					parameterNode.put(FIELD_NAME, requestParam.name());
				} else {
					parameterNode.put(FIELD_NAME, requestParam.value());
				}

				parameterNode.put(FIELD_PARAMETER_IN, ParameterType.QUERY.getIn());
				parameterNode.put(FIELD_PARAMETER_REQUIRED, requestParam.required());
				ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
				this.fillJsonSchemaNode(schemaNode, iSysServiceAPIRuntime, handler, action, parameter);
				// schemaNode.put(FIELD_JSONSCHEMA_TYPE,
				// this.getJsonSchemaType(iSysServiceAPIRuntime, handler,
				// action, parameter.getType()));
				continue;
			}

			if (annotation instanceof RequestBody) {
				RequestBody requestBody = (RequestBody) annotation;
				ObjectNode parameterNode = parametersNode.addObject();

				parameterNode.put(FIELD_PARAMETER_IN, ParameterType.BODY.getIn());
				parameterNode.put(FIELD_PARAMETER_REQUIRED, requestBody.required());
				ObjectNode schemaNode = parameterNode.putObject(FIELD_PARAMETER_SCHEMA);
				//
				this.fillJsonSchemaNode(schemaNode, iSysServiceAPIRuntime, handler, action, parameter);
				// schemaNode.put(FIELD_JSONSCHEMA_TYPE,
				// this.getJsonSchemaType(iSysServiceAPIRuntime, handler,
				// action, parameter..getType()));
				continue;
			}

			log.warn(String.format("不支持的参数注解[%1$s]", annotation));
		}

		return parametersNode;
	}

	protected void fillJsonSchemaNode(ObjectNode schemaNode, ISysServiceAPIRuntime iSysServiceAPIRuntime, Object handler, Method action, Parameter parameter) {

		// 构建控制器标记
		String strSysTag = iSysServiceAPIRuntime.getSystemRuntime().getServiceId();

		String strApiTag = iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName();

		String strFullTag = String.format("%1$s--%2$s", strSysTag, strApiTag);
		
		SysApiCache sysApiCache = null;
		synchronized (sysApiCacheMap) {
			sysApiCache = sysApiCacheMap.get(strFullTag);
			if (sysApiCache == null) {
				sysApiCache = new SysApiCache();
				sysApiCacheMap.put(strFullTag, sysApiCache);
			}
		}

		if (parameter.getType().isArray() || List.class.isAssignableFrom(parameter.getType())) {

			schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
			ObjectNode itemsNode = schemaNode.putObject(FIELD_JSONSCHEMA_ITEMS);
			if (parameter.getType().isArray()) {
				if (isSimpleJSType(parameter.getType().getComponentType())) {
					itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(parameter.getType().getComponentType()));
				} else {
					String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, parameter.getType().getComponentType());
					itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
				}

			} else {
				Class<?> itemCls = null;
				Type genericReturnType = parameter.getParameterizedType();
				if (genericReturnType instanceof ParameterizedType) {

					Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
					if (actualTypeArguments != null && actualTypeArguments.length != 0) {
						Type type = actualTypeArguments[0];
						if (type instanceof Class<?>) {
							itemCls = (Class<?>) type;
						} else if (type instanceof WildcardType) {
							WildcardType wildcardType = (WildcardType) type;
							itemCls = (Class<?>) wildcardType.getUpperBounds()[0];
						}
					}
				}

				if (itemCls == null) {
					itemsNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
				} else {
					if (isSimpleJSType(itemCls)) {
						itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(itemCls));
					} else {
						String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, itemCls);
						itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
					}
				}
			}

		} else {
			if (isSimpleJSType(parameter.getType())) {
				schemaNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(parameter.getType()));
			} else {
				String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, parameter.getType());
				schemaNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
			}
		}
	}

	protected String getJsonSchemaRefId(SysApiCache sysApiCache, String strSysTag, String strApiTag, IPSDataEntity iPSDataEntity, IPSDEMethodDTO iPSDEMethodDTO) {

		if(iPSDataEntity == null || iPSDEMethodDTO == null) {
			return null;
		}
		
		String strJsonSchemaTag = String.format("%1$s__%2$s__%3$s", strSysTag, iPSDataEntity.getName().toLowerCase(), iPSDEMethodDTO.getName());
		if (!sysApiCache.componentNodeMap.containsKey(strJsonSchemaTag)) {

			ObjectNode schemaNode = JsonUtils.createObjectNode();
			// 放入Map中，解决递归问题
			sysApiCache.componentNodeMap.put(strJsonSchemaTag, schemaNode);

			schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
			ObjectNode propertiesNode = schemaNode.putObject(FIELD_JSONSCHEMA_PROPERTIES);

			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iPSDEMethodDTO.getPSDEMethodDTOFields();

			if (iPSDEMethodDTO instanceof IPSDEActionInputDTO) {
				IPSDEActionInputDTO iPSDEActionInputDTO = (IPSDEActionInputDTO) iPSDEMethodDTO;
			} else if (iPSDEMethodDTO instanceof IPSDEFilterDTO) {
				IPSDEFilterDTO iPSDEFilterDTO = (IPSDEFilterDTO) iPSDEMethodDTO;
			} else {

			}

			if (!ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
				for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					ObjectNode propertyNode = propertiesNode.putObject(iPSDEMethodDTOField.getName().toLowerCase());
					propertyNode.put(FIELD_DESCRIPTION, iPSDEMethodDTOField.getLogicName());

					String strFieldType = iPSDEMethodDTOField.getType();
					// 判断类型
					if (DEMethodDTOFieldTypes.DTO.equals(strFieldType)) {
						String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, iPSDEMethodDTOField.getRefPSDataEntity(), iPSDEMethodDTOField.getRefPSDEMethodDTO());
						// propertyNode.put(FIELD_JSONSCHEMA_TYPE,
						// iPSDEMethodDTOField.getLogicName());
						if(StringUtils.hasLength(strRefTag)) {
							propertyNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
						}
						else {
							propertyNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
						}
						
					} else if (DEMethodDTOFieldTypes.DTOS.equals(strFieldType)) {
						propertyNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
						ObjectNode itemsNode = propertyNode.putObject(FIELD_JSONSCHEMA_ITEMS);
						String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, iPSDEMethodDTOField.getRefPSDataEntity(), iPSDEMethodDTOField.getRefPSDEMethodDTO());
						if(StringUtils.hasLength(strRefTag)) {
							itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
						}
						else {
							itemsNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
						}
						
					} else if (DEMethodDTOFieldTypes.SIMPLES.equals(strFieldType)) {
						propertyNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
						ObjectNode itemsNode = propertyNode.putObject(FIELD_JSONSCHEMA_ITEMS);
						itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(iPSDEMethodDTOField.getStdDataType()));
					} else {
						propertyNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(iPSDEMethodDTOField.getStdDataType()));
					}
				}
			}

		}

		return String.format("#/components/schemas/%1$s__%2$s__%3$s", strSysTag, iPSDataEntity.getName().toLowerCase(), iPSDEMethodDTO.getName());
	}

	protected String getJsonSchemaRefId(SysApiCache sysApiCache, String strSysTag, String strApiTag, Class<?> theClass) {

		String strJsonSchemaTag = String.format("%1$s__%2$s", strSysTag, theClass.getName().replace(".", "__").toLowerCase());
		if (!sysApiCache.componentNodeMap.containsKey(strJsonSchemaTag)) {

			ObjectNode schemaNode = JsonUtils.createObjectNode();
			// 放入Map中，解决递归问题
			sysApiCache.componentNodeMap.put(strJsonSchemaTag, schemaNode);

			schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
			ObjectNode propertiesNode = schemaNode.putObject(FIELD_JSONSCHEMA_PROPERTIES);

			Map<String, Class<?>> fieldMap = new LinkedHashMap<String, Class<?>>();
			Map<String, Type> fieldMap2 = new LinkedHashMap<String, Type>();
			// fields = theClass.getFields();
			// for(Field field : fields) {
			// fieldMap.put(field.getName(), field.getType());
			// fieldMap2.put(field.getName(), field.getGenericType());
			// }

			Field[] fields = theClass.getDeclaredFields();
			for (Field field : fields) {
				if (Modifier.isTransient((field.getModifiers()))) {
					continue;
				}

				if (field.getName().indexOf("$") != -1) {
					continue;
				}

				fieldMap.put(field.getName(), field.getType());
				fieldMap2.put(field.getName(), field.getGenericType());
			}

			// Method[] methods = theClass.getMethods();
			// for(Method method : methods) {
			// if(method.getParameterCount()!=0) {
			// continue;
			// }
			// String name = method.getName();
			// if(name.indexOf("get") != 0) {
			// continue;
			// }
			//
			// name = name.substring(3);
			// if(!StringUtils.hasLength(name)) {
			// continue;
			// }
			//
			// Class<?> retType = method.getReturnType();
			// if(retType.getName().equals("void")) {
			// continue;
			// }
			//
			// name = name.substring(0,1).toLowerCase() + name.substring(1);
			// fieldMap.put(name, retType);
			// fieldMap2.put(name, method.getGenericReturnType());
			// }

			for (java.util.Map.Entry<String, Class<?>> entry : fieldMap.entrySet()) {
				ObjectNode propertyNode = propertiesNode.putObject(entry.getKey());
				Class<?> returnType = entry.getValue();
				if (returnType.isArray() || List.class.isAssignableFrom(returnType)) {
					propertyNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
					ObjectNode itemsNode = propertyNode.putObject(FIELD_JSONSCHEMA_ITEMS);
					if (returnType.isArray()) {
						if (isSimpleJSType(returnType.getComponentType())) {
							itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(returnType.getComponentType()));
						} else {
							String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, returnType.getComponentType());
							itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
						}

					} else {
						Class<?> itemCls = null;
						Type genericReturnType = fieldMap2.get(entry.getKey());
						if (genericReturnType instanceof ParameterizedType) {

							Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
							if (actualTypeArguments != null && actualTypeArguments.length != 0) {
								Type type = actualTypeArguments[0];
								if (type instanceof Class<?>) {
									itemCls = (Class<?>) type;
								} else if (type instanceof WildcardType) {
									WildcardType wildcardType = (WildcardType) type;
									itemCls = (Class<?>) wildcardType.getUpperBounds()[0];
								}
							}
						}

						if (itemCls == null) {
							itemsNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
						} else {
							if (isSimpleJSType(itemCls)) {
								itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(itemCls));
							} else {
								String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, itemCls);
								itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
							}
						}
					}
				} else {
					if (isSimpleJSType(returnType)) {
						propertyNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(returnType));
					} else {
						String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, returnType);
						propertyNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
					}
				}
			}
		}

		return String.format("#/components/schemas/%1$s__%2$s", strSysTag, theClass.getName().replace(".", "__").toLowerCase());
	}

	protected String getSimpleJSType(int nStdDataType) {
		if (DataTypeUtils.isStringDataType(nStdDataType)) {
			return TYPE_JSONSCHEMA_STRING;
		}

		if (DataTypeUtils.isIntDataType(nStdDataType)) {
			return TYPE_JSONSCHEMA_INTEGER;
		}

		if (DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			return TYPE_JSONSCHEMA_STRING;
		}

		if (DataTypeUtils.isDoubleDataType(nStdDataType)) {
			return TYPE_JSONSCHEMA_NUMBER;
		}
		return TYPE_JSONSCHEMA_STRING;
	}

	protected boolean isSimpleJSType(Class<?> type) {

		if (String.class.isAssignableFrom(type)) {
			return true;
		}

		if (int.class.isAssignableFrom(type)) {
			return true;
		}

		if (double.class.isAssignableFrom(type)) {
			return true;
		}

		if (float.class.isAssignableFrom(type)) {
			return true;
		}

		if (long.class.isAssignableFrom(type)) {
			return true;
		}

		if (Number.class.isAssignableFrom(type)) {
			return true;
		}

		if (boolean.class.isAssignableFrom(type)) {
			return true;
		}

		if (Boolean.class.isAssignableFrom(type)) {
			return true;
		}

		if (Character.class.isAssignableFrom(type)) {
			return true;
		}

		if (java.util.Date.class.isAssignableFrom(type)) {
			return true;
		}

		if (Map.class.isAssignableFrom(type)) {
			return true;
		}

		if (Object.class.equals(type)) {
			return true;
		}

		return false;
	}

	protected String getSimpleJSType(Class<?> type) {

		if (String.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_STRING;
		}

		if (Integer.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_INTEGER;
		}

		if (int.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_INTEGER;
		}

		if (double.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_NUMBER;
		}

		if (float.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_NUMBER;
		}

		if (long.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_NUMBER;
		}

		if (boolean.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_BOOLEAN;
		}

		if (Boolean.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_BOOLEAN;
		}

		if (java.util.Date.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_STRING;
		}

		if (Number.class.isAssignableFrom(type)) {
			return TYPE_JSONSCHEMA_NUMBER;
		}

		if (Map.class.equals(type)) {
			return TYPE_JSONSCHEMA_OBJECT;
		}

		if (Object.class.equals(type)) {
			return TYPE_JSONSCHEMA_OBJECT;
		}

		return TYPE_JSONSCHEMA_STRING;
	}

	@Override
	public boolean outputOpenAPIDoc(HttpServletRequest request, HttpServletResponse response) {

		String strQueryString = request.getQueryString();
		if (!StringUtils.hasLength(strQueryString)) {
			return true;
		}

		Map<String, Object> params = RestUtils.queryString2Map(strQueryString);
		if (!ObjectUtils.isEmpty(params)) {
			Object objGroup = params.get("group");
			if (objGroup instanceof String) {
				if (((String) objGroup).equalsIgnoreCase("auto")) {
					outputOpenAPIDoc((String) objGroup, response);
					return false;
				}
			}
		}

		return true;
	}

	protected void outputOpenAPIDoc(String strType, HttpServletResponse response) {

		try {
			String strContent = schemaMap.get(strType);
			if (!StringUtils.hasLength(strContent)) {
				ObjectNode apiNode = JsonUtils.createObjectNode();
				apiNode.put("openapi", "3.0.3");

				ObjectNode infoNode = apiNode.putObject("info");
				infoNode.put("title", "自动服务接口");
				infoNode.put("version", "1.0");

				ArrayNode serversNode = apiNode.putArray("servers");
				ObjectNode serverNode = serversNode.addObject();

				serverNode.put("url", ServiceHub.getInstance().getServiceUrl());

				ArrayNode tagsNode = apiNode.putArray(FIELD_SCHEMA_TAGS);
				ObjectNode pathsNode = apiNode.putObject(FIELD_SCHEMA_PATHS);
				ObjectNode componentsNode = apiNode.putObject(FIELD_SCHEMA_COMPONENTS);
				ObjectNode schemasNode = componentsNode.putObject(FIELD_JSONSCHEMAS);

				for (SysApiCache sysApiCache : sysApiCacheMap.values()) {
					for (java.util.Map.Entry<String, ObjectNode> entry : sysApiCache.tagNodeMap.entrySet()) {
						tagsNode.add(entry.getValue());
					}

					for (java.util.Map.Entry<String, ObjectNode> entry : sysApiCache.pathNodeMap.entrySet()) {

						pathsNode.put(entry.getKey(), entry.getValue());
					}

					for (java.util.Map.Entry<String, ObjectNode> entry : sysApiCache.componentNodeMap.entrySet()) {
						schemasNode.put(entry.getKey(), entry.getValue());
					}
				}

				strContent = apiNode.toString();
				schemaMap.put(strType, strContent);
			}

			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "0");

			response.setHeader("charset", "utf-8");
			// response.setHeader("Content-Disposition",
			// String.format("attachment;filename=%s", configFile.getName(),
			// getFileName(configFile.getName())));

			response.setContentType("application/json;charset=UTF-8");

			response.getWriter().write(strContent);
		} catch (Throwable ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, IPSDataEntity iPSDataEntity, IPSDEAction iPSDEAction) {
		this.doRegisterMapping(iSysServiceAPIRuntime, uris, methods, iPSDataEntity, iPSDEAction);
	}

	@Override
	public void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, IPSDataEntity iPSDataEntity, IPSDEDataSet iPSDEDataSet) {
		this.doRegisterMapping(iSysServiceAPIRuntime, uris, methods, iPSDataEntity, iPSDEDataSet);
	}

	protected void doRegisterMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, IPSDataEntity iPSDataEntity, Object model) {

		// 构建控制器标记
		String strSysTag = iSysServiceAPIRuntime.getSystemRuntime().getServiceId();

		String strApiTag = iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName();

		String strFullTag = String.format("%1$s--%2$s", strSysTag, strApiTag);
		
		SysApiCache sysApiCache = null;
		synchronized (sysApiCacheMap) {
			sysApiCache = sysApiCacheMap.get(strFullTag);
			if (sysApiCache == null) {
				sysApiCache = new SysApiCache();
				sysApiCacheMap.put(strFullTag, sysApiCache);
			}
		}

		String strTag = String.format("%1$s-%2$s-%3$s-controller", strSysTag, strApiTag, iPSDataEntity.getName()).toLowerCase();
		if (!sysApiCache.tagNodeMap.containsKey(strTag)) {
			String strDesc = iPSDataEntity.getLogicName();

			String strSysDesc = iSysServiceAPIRuntime.getSystemRuntime().getPSSystem().getLogicName();
			if (!StringUtils.hasLength(strSysDesc)) {
				strSysDesc = strSysTag;
			}

			String strApiDesc = iSysServiceAPIRuntime.getPSSysServiceAPI().getName();
			if (!StringUtils.hasLength(strApiDesc)) {
				strApiDesc = strApiTag;
			}

			strDesc = String.format("%1$s[%2$s] - %3$s", strSysDesc, strApiDesc, strDesc);

			ObjectNode tagNode = JsonUtils.createObjectNode();
			tagNode.put(FIELD_NAME, strTag);
			tagNode.put(FIELD_DESCRIPTION, strDesc);

			sysApiCache.tagNodeMap.put(strTag, tagNode);
		}

		IPSDEAction iPSDEAction = null;
		IPSDEDataSet iPSDEDataSet = null;
		if (model instanceof IPSDEAction) {
			iPSDEAction = (IPSDEAction) model;
		} else if (model instanceof IPSDEDataSet) {
			iPSDEDataSet = (IPSDEDataSet) model;
		} else {
			//
			log.error(String.format("无法识别的模型对象[%1$s]", model));
			return;
		}

		String summary = null;
		if (iPSDEAction != null) {
			summary = iPSDEAction.getLogicName();
		} else if (iPSDEDataSet != null) {
			summary = iPSDEDataSet.getLogicName();
		}

		String description = null;
		if (iPSDEAction != null) {
			description = iPSDEAction.getMemo();
		} else if (iPSDEDataSet != null) {
			description = iPSDEDataSet.getMemo();
		}

		// 注册接口清单
		for (int i = 0; i < uris.length; i++) {
			String path = uris[i];

			ObjectNode pathNode = sysApiCache.pathNodeMap.get(path);
			if (pathNode == null) {
				pathNode = JsonUtils.createObjectNode();
				sysApiCache.pathNodeMap.put(path, pathNode);
			}

			for (RequestMethod method : methods) {

				ObjectNode operationNode = pathNode.putObject(method.name().toLowerCase());

				ArrayNode tagsNode = operationNode.putArray(FIELD_PATH_TAGS);
				tagsNode.add(strTag);

				String uniqueId = null;
				if (iPSDEAction != null) {
					String codeName = iPSDEAction.getCodeName();
					String codeNameFormat = iSysServiceAPIRuntime.getSystemRuntime().getSystemRuntimeSetting().getDEActionCodeNameFormat();
					if (StringUtils.hasLength(codeNameFormat)) {
						codeName = String.format(codeNameFormat, codeName);
					}
					uniqueId = codeName;
				} else if (iPSDEDataSet != null) {
					String codeName = iPSDEDataSet.getCodeName();
					String codeNameFormat = iSysServiceAPIRuntime.getSystemRuntime().getSystemRuntimeSetting().getDEDataSetCodeNameFormat();
					if (StringUtils.hasLength(codeNameFormat)) {
						codeName = String.format(codeNameFormat, codeName);
					}
					uniqueId = codeName;
				}

				operationNode.put(FIELD_PATH_OPERATIONID, uniqueId);

				operationNode.put(FIELD_PATH_SUMMARY, summary);

				ArrayNode parametersNode = this.getParametersNode(iSysServiceAPIRuntime, iPSDataEntity, model);

				operationNode.put(FIELD_PATH_PARAMETERS, parametersNode);

				if (true) {
					IPSDEMethodDTO iPSDEMethodDTO = null;
					if (iPSDEAction != null) {
						if (iPSDEAction.getPSDEActionInput() != null) {
							iPSDEMethodDTO = iPSDEAction.getPSDEActionInput().getPSDEMethodDTO();
						}
					} else if (iPSDEDataSet != null) {
						if (iPSDEDataSet.getPSDEDataSetInput() != null) {
							iPSDEMethodDTO = iPSDEDataSet.getPSDEDataSetInput().getPSDEFilterDTO();
						}
					}

					if (iPSDEMethodDTO != null) {
						String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, iPSDataEntity, iPSDEMethodDTO);

						ObjectNode requestBodyNode = operationNode.putObject(FIELD_PATH_REQUESTBODY);
						ObjectNode contentNode = requestBodyNode.putObject(FIELD_CONTENT);
						ObjectNode jsonNode = contentNode.putObject("application/json");
						ObjectNode schemaNode = jsonNode.putObject(FIELD_JSONSCHEMA);
						schemaNode.put(FIELD_REF, strRefTag);
					}
				}

				ObjectNode responsesNode = operationNode.putObject(FIELD_PATH_RESPONSES);
				ObjectNode okNode = responsesNode.putObject("200");
				okNode.put("description", "OK");

				if (true) {
					IPSDEMethodReturn iPSDEMethodReturn = null;
					if (iPSDEAction != null) {
						iPSDEMethodReturn = iPSDEAction.getPSDEActionReturn();
					} else if (iPSDEDataSet != null) {
						iPSDEMethodReturn = iPSDEDataSet.getPSDEDataSetReturn();
					}

					String strType = iPSDEMethodReturn.getType();
					if (DEMethodReturnTypes.VOID.equals(strType)) {

					} else {
						ObjectNode schemaNode = okNode.putObject(FIELD_CONTENT).putObject("*/*").putObject(FIELD_JSONSCHEMA);
						IPSDEMethodDTO iPSDEMethodDTO = null;
						int nStdDataType = DataTypes.UNKNOWN;
						if (iPSDEMethodReturn instanceof IPSDEActionReturn) {
							iPSDEMethodDTO = ((IPSDEActionReturn) iPSDEMethodReturn).getPSDEMethodDTO();
							nStdDataType = ((IPSDEActionReturn) iPSDEMethodReturn).getStdDataType();
						} else if (iPSDEMethodReturn instanceof IPSDEDataSetReturn) {
							iPSDEMethodDTO = ((IPSDEDataSetReturn) iPSDEMethodReturn).getPSDEMethodDTO();
						}

						if (iPSDEMethodDTO != null) {
							String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, iPSDataEntity, iPSDEMethodDTO);
							if (DEMethodReturnTypes.DTOS.equals(strType) || DEMethodReturnTypes.PAGE.equals(strType)) {
								schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
								ObjectNode itemsNode = schemaNode.putObject(FIELD_JSONSCHEMA_ITEMS);
								itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
							} else {
								schemaNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
							}
						} else {
							if (DEMethodReturnTypes.SIMPLES.equals(strType)) {
								schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
								ObjectNode itemsNode = schemaNode.putObject(FIELD_JSONSCHEMA_ITEMS);
								itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(nStdDataType));
							} else {
								schemaNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(nStdDataType));
							}
						}
					}

				}
			}
		}

	}

	@Override
	public void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, Object handler, Method action) {
		// 构建控制器标记
		String strSysTag = iSysServiceAPIRuntime.getSystemRuntime().getServiceId();

		String strApiTag = iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName();

		String strFullTag = String.format("%1$s--%2$s", strSysTag, strApiTag);
		
		SysApiCache sysApiCache = null;
		synchronized (sysApiCacheMap) {
			sysApiCache = sysApiCacheMap.get(strFullTag);
			if (sysApiCache == null) {
				sysApiCache = new SysApiCache();
				sysApiCacheMap.put(strFullTag, sysApiCache);
			}
		}

		String strTag = String.format("%1$s-%2$s-controller", strSysTag, strApiTag).toLowerCase();
		if (!sysApiCache.tagNodeMap.containsKey(strTag)) {

			String strDesc = null;

			String strSysDesc = iSysServiceAPIRuntime.getSystemRuntime().getPSSystem().getLogicName();
			if (!StringUtils.hasLength(strSysDesc)) {
				strSysDesc = strSysTag;
			}

			String strApiDesc = iSysServiceAPIRuntime.getPSSysServiceAPI().getName();
			if (!StringUtils.hasLength(strApiDesc)) {
				strApiDesc = strApiTag;
			}

			strDesc = String.format("%1$s[%2$s]", strSysDesc, strApiDesc);

			ObjectNode tagNode = JsonUtils.createObjectNode();
			tagNode.put(FIELD_NAME, strTag);
			tagNode.put(FIELD_DESCRIPTION, strDesc);

			sysApiCache.tagNodeMap.put(strTag, tagNode);
		}

		String summary = null;
		ApiOperation apiOperation = action.getAnnotation(ApiOperation.class);
		if (apiOperation != null) {
			summary = apiOperation.notes();
			if (!StringUtils.hasLength(summary)) {
				summary = apiOperation.value();
			}
		}

		// 注册接口清单
		for (int i = 0; i < uris.length; i++) {
			String path = uris[i];

			ObjectNode pathNode = sysApiCache.pathNodeMap.get(path);
			if (pathNode == null) {
				pathNode = JsonUtils.createObjectNode();
				sysApiCache.pathNodeMap.put(path, pathNode);
			}

			for (RequestMethod method : methods) {

				ObjectNode operationNode = pathNode.putObject(method.name().toLowerCase());

				ArrayNode tagsNode = operationNode.putArray(FIELD_PATH_TAGS);
				tagsNode.add(strTag);

				String uniqueId = action.getName();

				operationNode.put(FIELD_PATH_OPERATIONID, uniqueId);

				operationNode.put(FIELD_PATH_SUMMARY, summary);

				ArrayNode parametersNode = this.getParametersNode(iSysServiceAPIRuntime, handler, action);

				operationNode.put(FIELD_PATH_PARAMETERS, parametersNode);

				ObjectNode responsesNode = operationNode.putObject(FIELD_PATH_RESPONSES);
				ObjectNode okNode = responsesNode.putObject("200");
				okNode.put("description", "OK");

				if (true) {

					Class<?> returnType = action.getReturnType();

					if (returnType == null || returnType.getName().equals("void")) {

					} else {
						ObjectNode schemaNode = okNode.putObject(FIELD_CONTENT).putObject("*/*").putObject(FIELD_JSONSCHEMA);
						if (returnType.isArray() || List.class.isAssignableFrom(returnType) || Page.class.isAssignableFrom(returnType)) {
							schemaNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_ARRAY);
							ObjectNode itemsNode = schemaNode.putObject(FIELD_JSONSCHEMA_ITEMS);
							if (returnType.isArray()) {
								if (isSimpleJSType(returnType.getComponentType())) {
									itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(returnType.getComponentType()));
								} else {
									String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, returnType.getComponentType());
									itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
								}

							} else {
								Class<?> itemCls = null;
								Type genericReturnType = action.getGenericReturnType();
								if (genericReturnType instanceof ParameterizedType) {

									Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
									if (actualTypeArguments != null && actualTypeArguments.length != 0) {
										Type type = actualTypeArguments[0];
										if (type instanceof Class<?>) {
											itemCls = (Class<?>) type;
										} else if (type instanceof WildcardType) {
											WildcardType wildcardType = (WildcardType) type;
											itemCls = (Class<?>) wildcardType.getUpperBounds()[0];
										}
									}
								}

								if (itemCls == null) {
									itemsNode.put(FIELD_JSONSCHEMA_TYPE, TYPE_JSONSCHEMA_OBJECT);
								} else {
									if (isSimpleJSType(itemCls)) {
										itemsNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(itemCls));
									} else {
										String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, itemCls);
										itemsNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
									}
								}
							}
						} else {
							if (isSimpleJSType(returnType)) {
								schemaNode.put(FIELD_JSONSCHEMA_TYPE, getSimpleJSType(returnType));
							} else {
								String strRefTag = this.getJsonSchemaRefId(sysApiCache, strSysTag, strApiTag, returnType);
								schemaNode.put(FIELD_JSONSCHEMA_REF, strRefTag);
							}
						}
					}

				}
			}
		}
	}

	@Override
	public void unregisterMapping(net.ibizsys.central.service.ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		String strSysTag = iSysServiceAPIRuntime.getSystemRuntime().getServiceId();

		String strApiTag = iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName();

		String strFullTag = String.format("%1$s--%2$s", strSysTag, strApiTag);
		
		synchronized (sysApiCacheMap) {
			sysApiCacheMap.remove(strFullTag);
			schemaMap.clear();
		}
	}

}
