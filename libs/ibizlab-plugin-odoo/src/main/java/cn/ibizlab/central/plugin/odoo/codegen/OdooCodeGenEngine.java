package cn.ibizlab.central.plugin.odoo.codegen;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import cn.ibizlab.central.plugin.odoo.support.PSModelExtension;
import groovy.text.Template;
import net.ibizsys.codegen.groovy.engine.GroovyCodeGenEngineBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.DEMethodDTOType;
import net.ibizsys.model.PSModelEnums.DEType;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

public class OdooCodeGenEngine extends GroovyCodeGenEngineBase{

	public static void main(String[] args) {
		
		if(args == null || args.length != 2) {
			throw new RuntimeException("输入参数无效");
		}
			
		

		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(args[0]);

		IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();
		
		OdooCodeGenEngine demoEngine = new OdooCodeGenEngine();
		try {
			demoEngine.init("/template", true, null);
			Map<String, IPSModelObject> psModelObjectMap = new LinkedHashMap<String, IPSModelObject>();
			demoEngine.output(iPSSystem, args[1], (Object[])null, psModelObjectMap, false);

			
			for(Map.Entry<String, IPSModelObject> entry : psModelObjectMap.entrySet()) {
				System.out.println(String.format("输出文件[%1$s]，模型[%2$s]", entry.getKey(), entry.getValue().getId()));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Override
    protected void onInit() throws Exception {
        super.onInit();
    }

	@Override
	public String getContent(IPSObject iPSObject, String strTemplateId, Map<String, Object> extparams) throws Exception {
		Template template = this.getTemplate(strTemplateId);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("item", iPSObject);
        IPSSystem iPSSystem = null;

        if (iPSObject instanceof IPSSystem) {
            iPSSystem = (IPSSystem) iPSObject;
        } else {
            if (iPSObject instanceof IPSModelObject) {
                iPSSystem = ((IPSModelObject) iPSObject).getParentPSModelObject(IPSSystem.class, false);
            }
        }
        params.put("pub", iPSSystem.getDefaultPSSysSFPub());
        params.put("sys", iPSSystem);
        params.put("ctx", this.getContext());

        StringWriter sw = new StringWriter();
        template.make(params).writeTo(sw);

        return sw.toString();
	}
	

    @Override
    protected void onOutput(IPSSystem iPSSystem, String outputPath, Object[] filters, Map<String, IPSModelObject> fileMap, boolean bIgnoreException) throws Exception {
        if (iPSSystem.getDefaultPSSysSFPub() == null) {
            throw new Exception("未定义系统默认发布对象");
        }

        if (ObjectUtils.isEmpty(iPSSystem.getDefaultPSSysSFPub().getPKGCodeName())) {
            throw new Exception("系统默认发布对象未定义包代码标识");
        }

        if (ObjectUtils.isEmpty(iPSSystem.getDefaultPSSysSFPub().getCodeName())) {
            throw new Exception("系统默认发布对象未定义代码标识");
        }

        String outputRootPath = outputPath;
//        if (true) {
//            //pom
//            output(iPSSystem, "/java/pom.xml.tpl", outputRootPath + "/pom.xml", fileMap, bIgnoreException);
//            output(iPSSystem, "/java/.gitignore", outputRootPath + "/.gitignore", fileMap, bIgnoreException);
//            //core pom
//            output(iPSSystem, "/java/core/pom.xml.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/pom.xml", fileMap, bIgnoreException)
//            //provider pom
//            output(iPSSystem, "/java/provider/pom.xml.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-provider/pom.xml", fileMap, bIgnoreException)
//
//            //core 全局基类
//            output(iPSSystem, "/java/core/runtime/ISystemRuntime.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/" + "ISystemRuntime.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/SystemRuntimeBase.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/" + "SystemRuntimeBase.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/SystemRuntime.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/" + "SystemRuntime.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/security/SystemAccessManager.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/security/" + "SystemAccessManager.java", fileMap, bIgnoreException)
//
//            output(iPSSystem, "/java/core/runtime/util/EntityDTOBase.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/util/" + "EntityDTOBase.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/util/SearchContextDTOBase.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/util/" + "SearchContextDTOBase.java", fileMap, bIgnoreException)
//
//            output(iPSSystem, "/java/core/runtime/dataentity/DataEntityRuntimeBase.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/dataentity/" + "DataEntityRuntimeBase.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/dataentity/DataEntityRuntime.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/dataentity/" + "DataEntityRuntime.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/dataentity/security/DataEntityAccessManagerBase.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/dataentity/security/" + "DataEntityAccessManagerBase.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/core/runtime/dataentity/logic/DELogicRuntimeBase.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/runtime/dataentity/logic/" + "DELogicRuntimeBase.java", fileMap, bIgnoreException)
//
//            //provider 启动类
//            output(iPSSystem, "/java/provider/RuntimeApplication.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-provider/src/main/java/" + iPSSystem.getPKGCodeName().replace(".", "/") + "/RuntimeApplication.java", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/provider/resources/logback-spring.xml.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-provider/src/main/resources/logback-spring.xml", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/provider/resources/servicehub.yml.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-provider/src/main/resources/servicehub.yml", fileMap, bIgnoreException)
//
//            output(iPSSystem, "/java/provider/resources/application.yml.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-provider/src/main/resources/application.yml", fileMap, bIgnoreException)
//            output(iPSSystem, "/java/provider/resources/application-sys.yml.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-provider/src/main/resources/application-sys.yml", fileMap, bIgnoreException)
//
//        }

        
        List<IPSDataEntity> psDataEntityList = iPSSystem.getAllPSDataEntities();
        if (!ObjectUtils.isEmpty(psDataEntityList)) {
        	output(iPSSystem, "/cn/ibizlab/central/plugin/odoo/codegen/OdooEntityDTOUtils.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/util/" + "OdooEntityDTOUtils.java", fileMap, bIgnoreException);
        	output(iPSSystem, "/cn/ibizlab/central/plugin/odoo/codegen/OdooModels.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/util/" + "OdooModels.java", fileMap, bIgnoreException);
        	
        	for(IPSDataEntity entity : psDataEntityList) {
                if (testOutput(entity, filters)) {
                	
                	if(entity.getDEType() == DEType.ABSTRACT.value) {
                		output(entity, "/cn/ibizlab/central/plugin/odoo/codegen/service2.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/service2/I" + PSModelExtension.getRealCodeName(entity) + "Service.java", fileMap, bIgnoreException);
                	}
                	else {
                		output(entity, "/cn/ibizlab/central/plugin/odoo/codegen/service.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/service/I" + PSModelExtension.getRealCodeName(entity) + "Service.java", fileMap, bIgnoreException);	
                	}
                	
                	
                	
                    // doc
                    //output(entity, "/doc/DataEntity.md.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/doc/" + entity.getPKGCodeName().replace(".", "/") + "/dataentity/" + entity.realCodeName + ".md", fileMap, bIgnoreException)

                    // service
                    //output(entity, "/java/core/entity/service.java.tpl", outputRootPath + "/" + iPSSystem.getDefaultPSSysSFPub().realCodeName.toLowerCase() + "-core/src/main/java/" + entity.getPKGCodeName().replace(".", "/") + "/service/I" + entity.realCodeName + "Service.java", fileMap, bIgnoreException)

                    // dto
                	if(ObjectUtils.isEmpty(entity.getAllPSDEMethodDTOs())) {
                		continue;
                	}
                	
                	for(IPSDEMethodDTO dto : entity.getAllPSDEMethodDTOs()) {
                		if(!DEMethodDTOType.DEFAULT.value.equals(dto.getType())) {
                			continue;
                		}
                        if (testOutput(dto, filters)) {
                        	
                        	if(entity.getDEType() == DEType.ABSTRACT.value) {
                        		output(dto, "/cn/ibizlab/central/plugin/odoo/codegen/dto2.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/dto2/I" + PSModelExtension.getRealCodeName(dto) + ".java", fileMap, bIgnoreException);
                        		output(dto, "/cn/ibizlab/central/plugin/odoo/codegen/dto3.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/dto3/" + PSModelExtension.getRealCodeName(dto) + "Utils.java", fileMap, bIgnoreException);
                        	}
                        	
                            output(dto, "/cn/ibizlab/central/plugin/odoo/codegen/dto.java.tpl", outputRootPath + "/" + PSModelExtension.getRealCodeName(iPSSystem.getDefaultPSSysSFPub()).toLowerCase() + "-core/src/main/java/dto/" + PSModelExtension.getRealCodeName(dto) + ".java", fileMap, bIgnoreException);
                        }
                    }
                }
            }
        }
    }

}
