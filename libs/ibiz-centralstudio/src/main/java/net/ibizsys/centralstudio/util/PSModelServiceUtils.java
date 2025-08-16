package net.ibizsys.centralstudio.util;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;

public class PSModelServiceUtils extends PSModelServiceUtilsBase  {

	private static PSModelServiceUtils instance = null;

    private static ThreadLocal<PSModelServiceUtils> current = new ThreadLocal<PSModelServiceUtils>();
	
	public static PSModelServiceUtils getInstance() {
		if(PSModelServiceUtils.instance == null){
			PSModelServiceUtils.instance = new PSModelServiceUtils();
		}
		return PSModelServiceUtils.instance;
	}

	public static void setInstance(PSModelServiceUtils instance) {
		PSModelServiceUtils.instance = instance;
	}

    public static PSModelServiceUtils getCurrent() {
        PSModelServiceUtils instance = PSModelServiceUtils.current.get();
        if(instance == null){
			return getInstance();
		}
		return instance;
	}

	public static void setCurrent(PSModelServiceUtils instance) {
		PSModelServiceUtils.current.set(instance);
	}



    /**
     * 建立 系统 [PSSYSTEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSystem(PSSystemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTEM, "pssystems", PSSystemDTO.class, dto);
	}

    /**
     * 批建立 系统 [PSSYSTEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSystems(List<PSSystemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTEM, "pssystems", dtoList);
	}

    /**
     * 更新 系统 [PSSYSTEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSystem(PSSystemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTEM, "pssystems", PSSystemDTO.class, dto);
	}

    /**
     * 批更新 系统 [PSSYSTEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSystems(List<PSSystemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTEM, "pssystems", dtoList);
	}

    /**
     * 获取 系统 [PSSYSTEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSystemDTO getPSSystem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTEM, "pssystems", PSSystemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统 [PSSYSTEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSystem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTEM, "pssystems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统 [PSSYSTEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSystemDTO> searchPSSystems(PSSystemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTEM, "pssystems", PSSystemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统 [PSSYSTEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSystemDTO> searchAllPSSystems(PSSystemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTEM, "pssystems", PSSystemDTO.class, iSearchContext);
	}

    /**
     * 建立 系统模块 [PSMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSModule(PSModuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSMODULE, "psmodules", PSModuleDTO.class, dto);
	}

    /**
     * 批建立 系统模块 [PSMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSModules(List<PSModuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSMODULE, "psmodules", dtoList);
	}

    /**
     * 更新 系统模块 [PSMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSModule(PSModuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSMODULE, "psmodules", PSModuleDTO.class, dto);
	}

    /**
     * 批更新 系统模块 [PSMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSModules(List<PSModuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSMODULE, "psmodules", dtoList);
	}

    /**
     * 获取 系统模块 [PSMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSModuleDTO getPSModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSMODULE, "psmodules", PSModuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统模块 [PSMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSMODULE, "psmodules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统模块 [PSMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSModuleDTO> searchPSModules(PSModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSMODULE, "psmodules", PSModuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统模块 [PSMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSModuleDTO> searchAllPSModules(PSModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSMODULE, "psmodules", PSModuleDTO.class, iSearchContext);
	}

    /**
     * 建立 实体 [PSDATAENTITY]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDataEntity(PSDataEntityDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDATAENTITY, "psdataentities", PSDataEntityDTO.class, dto);
	}

    /**
     * 批建立 实体 [PSDATAENTITY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDataEntities(List<PSDataEntityDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDATAENTITY, "psdataentities", dtoList);
	}

    /**
     * 更新 实体 [PSDATAENTITY]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDataEntity(PSDataEntityDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDATAENTITY, "psdataentities", PSDataEntityDTO.class, dto);
	}

    /**
     * 批更新 实体 [PSDATAENTITY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDataEntities(List<PSDataEntityDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDATAENTITY, "psdataentities", dtoList);
	}

    /**
     * 获取 实体 [PSDATAENTITY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDataEntityDTO getPSDataEntity(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDATAENTITY, "psdataentities", PSDataEntityDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体 [PSDATAENTITY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDataEntity(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDATAENTITY, "psdataentities", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体 [PSDATAENTITY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDataEntityDTO> searchPSDataEntities(PSDataEntityFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDATAENTITY, "psdataentities", PSDataEntityDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体 [PSDATAENTITY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDataEntityDTO> searchAllPSDataEntities(PSDataEntityFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDATAENTITY, "psdataentities", PSDataEntityDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性 [PSDEFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEField(PSDEFieldDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFIELD, "psdefields", PSDEFieldDTO.class, dto);
	}

    /**
     * 批建立 实体属性 [PSDEFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFields(List<PSDEFieldDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFIELD, "psdefields", dtoList);
	}

    /**
     * 更新 实体属性 [PSDEFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEField(PSDEFieldDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFIELD, "psdefields", PSDEFieldDTO.class, dto);
	}

    /**
     * 批更新 实体属性 [PSDEFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFields(List<PSDEFieldDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFIELD, "psdefields", dtoList);
	}

    /**
     * 获取 实体属性 [PSDEFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFieldDTO getPSDEField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFIELD, "psdefields", PSDEFieldDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性 [PSDEFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFIELD, "psdefields", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性 [PSDEFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFieldDTO> searchPSDEFields(PSDEFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFIELD, "psdefields", PSDEFieldDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性 [PSDEFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFieldDTO> searchAllPSDEFields(PSDEFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFIELD, "psdefields", PSDEFieldDTO.class, iSearchContext);
	}

    /**
     * 建立 实体关系 [PSDER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDER(PSDERDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDER, "psders", PSDERDTO.class, dto);
	}

    /**
     * 批建立 实体关系 [PSDER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDERs(List<PSDERDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDER, "psders", dtoList);
	}

    /**
     * 更新 实体关系 [PSDER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDER(PSDERDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDER, "psders", PSDERDTO.class, dto);
	}

    /**
     * 批更新 实体关系 [PSDER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDERs(List<PSDERDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDER, "psders", dtoList);
	}

    /**
     * 获取 实体关系 [PSDER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDERDTO getPSDER(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDER, "psders", PSDERDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体关系 [PSDER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDER(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDER, "psders", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体关系 [PSDER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDERDTO> searchPSDERs(PSDERFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDER, "psders", PSDERDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体关系 [PSDER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDERDTO> searchAllPSDERs(PSDERFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDER, "psders", PSDERDTO.class, iSearchContext);
	}

    /**
     * 建立 界面处理对象 [PSACHANDLER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSACHandler(PSACHandlerDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSACHANDLER, "psachandlers", PSACHandlerDTO.class, dto);
	}

    /**
     * 批建立 界面处理对象 [PSACHANDLER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSACHandlers(List<PSACHandlerDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSACHANDLER, "psachandlers", dtoList);
	}

    /**
     * 更新 界面处理对象 [PSACHANDLER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSACHandler(PSACHandlerDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSACHANDLER, "psachandlers", PSACHandlerDTO.class, dto);
	}

    /**
     * 批更新 界面处理对象 [PSACHANDLER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSACHandlers(List<PSACHandlerDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSACHANDLER, "psachandlers", dtoList);
	}

    /**
     * 获取 界面处理对象 [PSACHANDLER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSACHandlerDTO getPSACHandler(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSACHANDLER, "psachandlers", PSACHandlerDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 界面处理对象 [PSACHANDLER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSACHandler(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSACHANDLER, "psachandlers", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 界面处理对象 [PSACHANDLER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSACHandlerDTO> searchPSACHandlers(PSACHandlerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSACHANDLER, "psachandlers", PSACHandlerDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 界面处理对象 [PSACHANDLER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSACHandlerDTO> searchAllPSACHandlers(PSACHandlerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSACHANDLER, "psachandlers", PSACHandlerDTO.class, iSearchContext);
	}

    /**
     * 建立 界面处理对象行为 [PSACHANDLERACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSACHandlerAction(PSACHandlerActionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSACHANDLERACTION, "psachandleractions", PSACHandlerActionDTO.class, dto);
	}

    /**
     * 批建立 界面处理对象行为 [PSACHANDLERACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSACHandlerActions(List<PSACHandlerActionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSACHANDLERACTION, "psachandleractions", dtoList);
	}

    /**
     * 更新 界面处理对象行为 [PSACHANDLERACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSACHandlerAction(PSACHandlerActionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSACHANDLERACTION, "psachandleractions", PSACHandlerActionDTO.class, dto);
	}

    /**
     * 批更新 界面处理对象行为 [PSACHANDLERACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSACHandlerActions(List<PSACHandlerActionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSACHANDLERACTION, "psachandleractions", dtoList);
	}

    /**
     * 获取 界面处理对象行为 [PSACHANDLERACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSACHandlerActionDTO getPSACHandlerAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSACHANDLERACTION, "psachandleractions", PSACHandlerActionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 界面处理对象行为 [PSACHANDLERACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSACHandlerAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSACHANDLERACTION, "psachandleractions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 界面处理对象行为 [PSACHANDLERACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSACHandlerActionDTO> searchPSACHandlerActions(PSACHandlerActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSACHANDLERACTION, "psachandleractions", PSACHandlerActionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 界面处理对象行为 [PSACHANDLERACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSACHandlerActionDTO> searchAllPSACHandlerActions(PSACHandlerActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSACHANDLERACTION, "psachandleractions", PSACHandlerActionDTO.class, iSearchContext);
	}

    /**
     * 建立 应用实体关系 [PSAPPDERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppDERS(PSAppDERSDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPDERS, "psappders", PSAppDERSDTO.class, dto);
	}

    /**
     * 批建立 应用实体关系 [PSAPPDERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppDERs(List<PSAppDERSDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPDERS, "psappders", dtoList);
	}

    /**
     * 更新 应用实体关系 [PSAPPDERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppDERS(PSAppDERSDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDERS, "psappders", PSAppDERSDTO.class, dto);
	}

    /**
     * 批更新 应用实体关系 [PSAPPDERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppDERs(List<PSAppDERSDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDERS, "psappders", dtoList);
	}

    /**
     * 获取 应用实体关系 [PSAPPDERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppDERSDTO getPSAppDERS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPDERS, "psappders", PSAppDERSDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用实体关系 [PSAPPDERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppDERS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPDERS, "psappders", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用实体关系 [PSAPPDERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppDERSDTO> searchPSAppDERs(PSAppDERSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPDERS, "psappders", PSAppDERSDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用实体关系 [PSAPPDERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppDERSDTO> searchAllPSAppDERs(PSAppDERSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPDERS, "psappders", PSAppDERSDTO.class, iSearchContext);
	}

    /**
     * 建立 应用实体视图 [PSAPPDEVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppDEView(PSAppDEViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPDEVIEW, "psappdeviews", PSAppDEViewDTO.class, dto);
	}

    /**
     * 批建立 应用实体视图 [PSAPPDEVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppDEViews(List<PSAppDEViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPDEVIEW, "psappdeviews", dtoList);
	}

    /**
     * 更新 应用实体视图 [PSAPPDEVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppDEView(PSAppDEViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDEVIEW, "psappdeviews", PSAppDEViewDTO.class, dto);
	}

    /**
     * 批更新 应用实体视图 [PSAPPDEVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppDEViews(List<PSAppDEViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDEVIEW, "psappdeviews", dtoList);
	}

    /**
     * 获取 应用实体视图 [PSAPPDEVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppDEViewDTO getPSAppDEView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPDEVIEW, "psappdeviews", PSAppDEViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用实体视图 [PSAPPDEVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppDEView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPDEVIEW, "psappdeviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用实体视图 [PSAPPDEVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppDEViewDTO> searchPSAppDEViews(PSAppDEViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPDEVIEW, "psappdeviews", PSAppDEViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用实体视图 [PSAPPDEVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppDEViewDTO> searchAllPSAppDEViews(PSAppDEViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPDEVIEW, "psappdeviews", PSAppDEViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppDynaDEView(PSAppDynaDEViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", PSAppDynaDEViewDTO.class, dto);
	}

    /**
     * 批建立 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppDynaDEViews(List<PSAppDynaDEViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", dtoList);
	}

    /**
     * 更新 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppDynaDEView(PSAppDynaDEViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", PSAppDynaDEViewDTO.class, dto);
	}

    /**
     * 批更新 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppDynaDEViews(List<PSAppDynaDEViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", dtoList);
	}

    /**
     * 获取 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppDynaDEViewDTO getPSAppDynaDEView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", PSAppDynaDEViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppDynaDEView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppDynaDEViewDTO> searchPSAppDynaDEViews(PSAppDynaDEViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", PSAppDynaDEViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用动态实体视图 [PSAPPDYNADEVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppDynaDEViewDTO> searchAllPSAppDynaDEViews(PSAppDynaDEViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPDYNADEVIEW, "psappdynadeviews", PSAppDynaDEViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用功能 [PSAPPFUNC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppFunc(PSAppFuncDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPFUNC, "psappfuncs", PSAppFuncDTO.class, dto);
	}

    /**
     * 批建立 应用功能 [PSAPPFUNC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppFuncs(List<PSAppFuncDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPFUNC, "psappfuncs", dtoList);
	}

    /**
     * 更新 应用功能 [PSAPPFUNC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppFunc(PSAppFuncDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPFUNC, "psappfuncs", PSAppFuncDTO.class, dto);
	}

    /**
     * 批更新 应用功能 [PSAPPFUNC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppFuncs(List<PSAppFuncDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPFUNC, "psappfuncs", dtoList);
	}

    /**
     * 获取 应用功能 [PSAPPFUNC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppFuncDTO getPSAppFunc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPFUNC, "psappfuncs", PSAppFuncDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用功能 [PSAPPFUNC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppFunc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPFUNC, "psappfuncs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用功能 [PSAPPFUNC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppFuncDTO> searchPSAppFuncs(PSAppFuncFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPFUNC, "psappfuncs", PSAppFuncDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用功能 [PSAPPFUNC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppFuncDTO> searchAllPSAppFuncs(PSAppFuncFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPFUNC, "psappfuncs", PSAppFuncDTO.class, iSearchContext);
	}

    /**
     * 建立 应用首页视图 [PSAPPINDEXVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppIndexView(PSAppIndexViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPINDEXVIEW, "psappindexviews", PSAppIndexViewDTO.class, dto);
	}

    /**
     * 批建立 应用首页视图 [PSAPPINDEXVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppIndexViews(List<PSAppIndexViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPINDEXVIEW, "psappindexviews", dtoList);
	}

    /**
     * 更新 应用首页视图 [PSAPPINDEXVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppIndexView(PSAppIndexViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPINDEXVIEW, "psappindexviews", PSAppIndexViewDTO.class, dto);
	}

    /**
     * 批更新 应用首页视图 [PSAPPINDEXVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppIndexViews(List<PSAppIndexViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPINDEXVIEW, "psappindexviews", dtoList);
	}

    /**
     * 获取 应用首页视图 [PSAPPINDEXVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppIndexViewDTO getPSAppIndexView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPINDEXVIEW, "psappindexviews", PSAppIndexViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用首页视图 [PSAPPINDEXVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppIndexView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPINDEXVIEW, "psappindexviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用首页视图 [PSAPPINDEXVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppIndexViewDTO> searchPSAppIndexViews(PSAppIndexViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPINDEXVIEW, "psappindexviews", PSAppIndexViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用首页视图 [PSAPPINDEXVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppIndexViewDTO> searchAllPSAppIndexViews(PSAppIndexViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPINDEXVIEW, "psappindexviews", PSAppIndexViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用多语言 [PSAPPLAN]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppLan(PSAppLanDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPLAN, "psapplans", PSAppLanDTO.class, dto);
	}

    /**
     * 批建立 应用多语言 [PSAPPLAN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppLans(List<PSAppLanDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPLAN, "psapplans", dtoList);
	}

    /**
     * 更新 应用多语言 [PSAPPLAN]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppLan(PSAppLanDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPLAN, "psapplans", PSAppLanDTO.class, dto);
	}

    /**
     * 批更新 应用多语言 [PSAPPLAN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppLans(List<PSAppLanDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPLAN, "psapplans", dtoList);
	}

    /**
     * 获取 应用多语言 [PSAPPLAN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppLanDTO getPSAppLan(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPLAN, "psapplans", PSAppLanDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用多语言 [PSAPPLAN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppLan(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPLAN, "psapplans", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用多语言 [PSAPPLAN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppLanDTO> searchPSAppLans(PSAppLanFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPLAN, "psapplans", PSAppLanDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用多语言 [PSAPPLAN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppLanDTO> searchAllPSAppLans(PSAppLanFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPLAN, "psapplans", PSAppLanDTO.class, iSearchContext);
	}

    /**
     * 建立 应用实体 [PSAPPDATAENTITY]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppDataEntity(PSAppDataEntityDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPDATAENTITY, "psapplocaldes", PSAppDataEntityDTO.class, dto);
	}

    /**
     * 批建立 应用实体 [PSAPPDATAENTITY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppDataEntities(List<PSAppDataEntityDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPDATAENTITY, "psapplocaldes", dtoList);
	}

    /**
     * 更新 应用实体 [PSAPPDATAENTITY]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppDataEntity(PSAppDataEntityDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDATAENTITY, "psapplocaldes", PSAppDataEntityDTO.class, dto);
	}

    /**
     * 批更新 应用实体 [PSAPPDATAENTITY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppDataEntities(List<PSAppDataEntityDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPDATAENTITY, "psapplocaldes", dtoList);
	}

    /**
     * 获取 应用实体 [PSAPPDATAENTITY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppDataEntityDTO getPSAppDataEntity(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPDATAENTITY, "psapplocaldes", PSAppDataEntityDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用实体 [PSAPPDATAENTITY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppDataEntity(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPDATAENTITY, "psapplocaldes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用实体 [PSAPPDATAENTITY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppDataEntityDTO> searchPSAppDataEntities(PSAppDataEntityFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPDATAENTITY, "psapplocaldes", PSAppDataEntityDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用实体 [PSAPPDATAENTITY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppDataEntityDTO> searchAllPSAppDataEntities(PSAppDataEntityFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPDATAENTITY, "psapplocaldes", PSAppDataEntityDTO.class, iSearchContext);
	}

    /**
     * 建立 应用菜单 [PSAPPMENU]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppMenu(PSAppMenuDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPMENU, "psappmenus", PSAppMenuDTO.class, dto);
	}

    /**
     * 批建立 应用菜单 [PSAPPMENU]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppMenus(List<PSAppMenuDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPMENU, "psappmenus", dtoList);
	}

    /**
     * 更新 应用菜单 [PSAPPMENU]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppMenu(PSAppMenuDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPMENU, "psappmenus", PSAppMenuDTO.class, dto);
	}

    /**
     * 批更新 应用菜单 [PSAPPMENU]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppMenus(List<PSAppMenuDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPMENU, "psappmenus", dtoList);
	}

    /**
     * 获取 应用菜单 [PSAPPMENU]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppMenuDTO getPSAppMenu(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPMENU, "psappmenus", PSAppMenuDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用菜单 [PSAPPMENU]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppMenu(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPMENU, "psappmenus", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用菜单 [PSAPPMENU]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppMenuDTO> searchPSAppMenus(PSAppMenuFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPMENU, "psappmenus", PSAppMenuDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用菜单 [PSAPPMENU]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppMenuDTO> searchAllPSAppMenus(PSAppMenuFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPMENU, "psappmenus", PSAppMenuDTO.class, iSearchContext);
	}

    /**
     * 建立 应用模块 [PSAPPMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppModule(PSAppModuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPMODULE, "psappmodules", PSAppModuleDTO.class, dto);
	}

    /**
     * 批建立 应用模块 [PSAPPMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppModules(List<PSAppModuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPMODULE, "psappmodules", dtoList);
	}

    /**
     * 更新 应用模块 [PSAPPMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppModule(PSAppModuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPMODULE, "psappmodules", PSAppModuleDTO.class, dto);
	}

    /**
     * 批更新 应用模块 [PSAPPMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppModules(List<PSAppModuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPMODULE, "psappmodules", dtoList);
	}

    /**
     * 获取 应用模块 [PSAPPMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppModuleDTO getPSAppModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPMODULE, "psappmodules", PSAppModuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用模块 [PSAPPMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPMODULE, "psappmodules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用模块 [PSAPPMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppModuleDTO> searchPSAppModules(PSAppModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPMODULE, "psappmodules", PSAppModuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用模块 [PSAPPMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppModuleDTO> searchAllPSAppModules(PSAppModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPMODULE, "psappmodules", PSAppModuleDTO.class, iSearchContext);
	}

    /**
     * 建立 应用预置视图 [PSAPPPDTVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppPDTView(PSAppPDTViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPPDTVIEW, "psapppdtviews", PSAppPDTViewDTO.class, dto);
	}

    /**
     * 批建立 应用预置视图 [PSAPPPDTVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppPDTViews(List<PSAppPDTViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPPDTVIEW, "psapppdtviews", dtoList);
	}

    /**
     * 更新 应用预置视图 [PSAPPPDTVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppPDTView(PSAppPDTViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPDTVIEW, "psapppdtviews", PSAppPDTViewDTO.class, dto);
	}

    /**
     * 批更新 应用预置视图 [PSAPPPDTVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppPDTViews(List<PSAppPDTViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPDTVIEW, "psapppdtviews", dtoList);
	}

    /**
     * 获取 应用预置视图 [PSAPPPDTVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppPDTViewDTO getPSAppPDTView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPPDTVIEW, "psapppdtviews", PSAppPDTViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用预置视图 [PSAPPPDTVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppPDTView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPPDTVIEW, "psapppdtviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用预置视图 [PSAPPPDTVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppPDTViewDTO> searchPSAppPDTViews(PSAppPDTViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPPDTVIEW, "psapppdtviews", PSAppPDTViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用预置视图 [PSAPPPDTVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppPDTViewDTO> searchAllPSAppPDTViews(PSAppPDTViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPPDTVIEW, "psapppdtviews", PSAppPDTViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用面板视图 [PSAPPPANELVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppPanelView(PSAppPanelViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPPANELVIEW, "psapppanelviews", PSAppPanelViewDTO.class, dto);
	}

    /**
     * 批建立 应用面板视图 [PSAPPPANELVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppPanelViews(List<PSAppPanelViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPPANELVIEW, "psapppanelviews", dtoList);
	}

    /**
     * 更新 应用面板视图 [PSAPPPANELVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppPanelView(PSAppPanelViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPANELVIEW, "psapppanelviews", PSAppPanelViewDTO.class, dto);
	}

    /**
     * 批更新 应用面板视图 [PSAPPPANELVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppPanelViews(List<PSAppPanelViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPANELVIEW, "psapppanelviews", dtoList);
	}

    /**
     * 获取 应用面板视图 [PSAPPPANELVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppPanelViewDTO getPSAppPanelView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPPANELVIEW, "psapppanelviews", PSAppPanelViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用面板视图 [PSAPPPANELVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppPanelView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPPANELVIEW, "psapppanelviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用面板视图 [PSAPPPANELVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppPanelViewDTO> searchPSAppPanelViews(PSAppPanelViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPPANELVIEW, "psapppanelviews", PSAppPanelViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用面板视图 [PSAPPPANELVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppPanelViewDTO> searchAllPSAppPanelViews(PSAppPanelViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPPANELVIEW, "psapppanelviews", PSAppPanelViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用组件包 [PSAPPPKG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppPkg(PSAppPkgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPPKG, "psapppkgs", PSAppPkgDTO.class, dto);
	}

    /**
     * 批建立 应用组件包 [PSAPPPKG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppPkgs(List<PSAppPkgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPPKG, "psapppkgs", dtoList);
	}

    /**
     * 更新 应用组件包 [PSAPPPKG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppPkg(PSAppPkgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPKG, "psapppkgs", PSAppPkgDTO.class, dto);
	}

    /**
     * 批更新 应用组件包 [PSAPPPKG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppPkgs(List<PSAppPkgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPKG, "psapppkgs", dtoList);
	}

    /**
     * 获取 应用组件包 [PSAPPPKG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppPkgDTO getPSAppPkg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPPKG, "psapppkgs", PSAppPkgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用组件包 [PSAPPPKG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppPkg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPPKG, "psapppkgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用组件包 [PSAPPPKG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppPkgDTO> searchPSAppPkgs(PSAppPkgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPPKG, "psapppkgs", PSAppPkgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用组件包 [PSAPPPKG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppPkgDTO> searchAllPSAppPkgs(PSAppPkgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPPKG, "psapppkgs", PSAppPkgDTO.class, iSearchContext);
	}

    /**
     * 建立 应用看板视图 [PSAPPPORTALVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppPortalView(PSAppPortalViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPPORTALVIEW, "psappportalviews", PSAppPortalViewDTO.class, dto);
	}

    /**
     * 批建立 应用看板视图 [PSAPPPORTALVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppPortalViews(List<PSAppPortalViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPPORTALVIEW, "psappportalviews", dtoList);
	}

    /**
     * 更新 应用看板视图 [PSAPPPORTALVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppPortalView(PSAppPortalViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPORTALVIEW, "psappportalviews", PSAppPortalViewDTO.class, dto);
	}

    /**
     * 批更新 应用看板视图 [PSAPPPORTALVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppPortalViews(List<PSAppPortalViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPORTALVIEW, "psappportalviews", dtoList);
	}

    /**
     * 获取 应用看板视图 [PSAPPPORTALVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppPortalViewDTO getPSAppPortalView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPPORTALVIEW, "psappportalviews", PSAppPortalViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用看板视图 [PSAPPPORTALVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppPortalView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPPORTALVIEW, "psappportalviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用看板视图 [PSAPPPORTALVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppPortalViewDTO> searchPSAppPortalViews(PSAppPortalViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPPORTALVIEW, "psappportalviews", PSAppPortalViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用看板视图 [PSAPPPORTALVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppPortalViewDTO> searchAllPSAppPortalViews(PSAppPortalViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPPORTALVIEW, "psappportalviews", PSAppPortalViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用门户部件 [PSAPPPORTLET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppPortlet(PSAppPortletDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPPORTLET, "psappportlets", PSAppPortletDTO.class, dto);
	}

    /**
     * 批建立 应用门户部件 [PSAPPPORTLET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppPortlets(List<PSAppPortletDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPPORTLET, "psappportlets", dtoList);
	}

    /**
     * 更新 应用门户部件 [PSAPPPORTLET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppPortlet(PSAppPortletDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPORTLET, "psappportlets", PSAppPortletDTO.class, dto);
	}

    /**
     * 批更新 应用门户部件 [PSAPPPORTLET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppPortlets(List<PSAppPortletDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPPORTLET, "psappportlets", dtoList);
	}

    /**
     * 获取 应用门户部件 [PSAPPPORTLET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppPortletDTO getPSAppPortlet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPPORTLET, "psappportlets", PSAppPortletDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用门户部件 [PSAPPPORTLET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppPortlet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPPORTLET, "psappportlets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用门户部件 [PSAPPPORTLET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppPortletDTO> searchPSAppPortlets(PSAppPortletFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPPORTLET, "psappportlets", PSAppPortletDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用门户部件 [PSAPPPORTLET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppPortletDTO> searchAllPSAppPortlets(PSAppPortletFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPPORTLET, "psappportlets", PSAppPortletDTO.class, iSearchContext);
	}

    /**
     * 建立 应用资源 [PSAPPRESOURCE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppResource(PSAppResourceDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPRESOURCE, "psappresources", PSAppResourceDTO.class, dto);
	}

    /**
     * 批建立 应用资源 [PSAPPRESOURCE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppResources(List<PSAppResourceDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPRESOURCE, "psappresources", dtoList);
	}

    /**
     * 更新 应用资源 [PSAPPRESOURCE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppResource(PSAppResourceDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPRESOURCE, "psappresources", PSAppResourceDTO.class, dto);
	}

    /**
     * 批更新 应用资源 [PSAPPRESOURCE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppResources(List<PSAppResourceDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPRESOURCE, "psappresources", dtoList);
	}

    /**
     * 获取 应用资源 [PSAPPRESOURCE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppResourceDTO getPSAppResource(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPRESOURCE, "psappresources", PSAppResourceDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用资源 [PSAPPRESOURCE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppResource(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPRESOURCE, "psappresources", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用资源 [PSAPPRESOURCE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppResourceDTO> searchPSAppResources(PSAppResourceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPRESOURCE, "psappresources", PSAppResourceDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用资源 [PSAPPRESOURCE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppResourceDTO> searchAllPSAppResources(PSAppResourceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPRESOURCE, "psappresources", PSAppResourceDTO.class, iSearchContext);
	}

    /**
     * 建立 应用故事板 [PSAPPSTORYBOARD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppStoryBoard(PSAppStoryBoardDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPSTORYBOARD, "psappstoryboards", PSAppStoryBoardDTO.class, dto);
	}

    /**
     * 批建立 应用故事板 [PSAPPSTORYBOARD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppStoryBoards(List<PSAppStoryBoardDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPSTORYBOARD, "psappstoryboards", dtoList);
	}

    /**
     * 更新 应用故事板 [PSAPPSTORYBOARD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppStoryBoard(PSAppStoryBoardDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPSTORYBOARD, "psappstoryboards", PSAppStoryBoardDTO.class, dto);
	}

    /**
     * 批更新 应用故事板 [PSAPPSTORYBOARD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppStoryBoards(List<PSAppStoryBoardDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPSTORYBOARD, "psappstoryboards", dtoList);
	}

    /**
     * 获取 应用故事板 [PSAPPSTORYBOARD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppStoryBoardDTO getPSAppStoryBoard(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPSTORYBOARD, "psappstoryboards", PSAppStoryBoardDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用故事板 [PSAPPSTORYBOARD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppStoryBoard(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPSTORYBOARD, "psappstoryboards", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用故事板 [PSAPPSTORYBOARD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppStoryBoardDTO> searchPSAppStoryBoards(PSAppStoryBoardFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPSTORYBOARD, "psappstoryboards", PSAppStoryBoardDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用故事板 [PSAPPSTORYBOARD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppStoryBoardDTO> searchAllPSAppStoryBoards(PSAppStoryBoardFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPSTORYBOARD, "psappstoryboards", PSAppStoryBoardDTO.class, iSearchContext);
	}

    /**
     * 建立 应用标题栏 [PSAPPTITLEBAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppTitleBar(PSAppTitleBarDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPTITLEBAR, "psapptitlebars", PSAppTitleBarDTO.class, dto);
	}

    /**
     * 批建立 应用标题栏 [PSAPPTITLEBAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppTitleBars(List<PSAppTitleBarDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPTITLEBAR, "psapptitlebars", dtoList);
	}

    /**
     * 更新 应用标题栏 [PSAPPTITLEBAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppTitleBar(PSAppTitleBarDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPTITLEBAR, "psapptitlebars", PSAppTitleBarDTO.class, dto);
	}

    /**
     * 批更新 应用标题栏 [PSAPPTITLEBAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppTitleBars(List<PSAppTitleBarDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPTITLEBAR, "psapptitlebars", dtoList);
	}

    /**
     * 获取 应用标题栏 [PSAPPTITLEBAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppTitleBarDTO getPSAppTitleBar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPTITLEBAR, "psapptitlebars", PSAppTitleBarDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用标题栏 [PSAPPTITLEBAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppTitleBar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPTITLEBAR, "psapptitlebars", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用标题栏 [PSAPPTITLEBAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppTitleBarDTO> searchPSAppTitleBars(PSAppTitleBarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPTITLEBAR, "psapptitlebars", PSAppTitleBarDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用标题栏 [PSAPPTITLEBAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppTitleBarDTO> searchAllPSAppTitleBars(PSAppTitleBarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPTITLEBAR, "psapptitlebars", PSAppTitleBarDTO.class, iSearchContext);
	}

    /**
     * 建立 应用界面模式 [PSAPPUISTYLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppUIStyle(PSAppUIStyleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPUISTYLE, "psappuistyles", PSAppUIStyleDTO.class, dto);
	}

    /**
     * 批建立 应用界面模式 [PSAPPUISTYLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppUIStyles(List<PSAppUIStyleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPUISTYLE, "psappuistyles", dtoList);
	}

    /**
     * 更新 应用界面模式 [PSAPPUISTYLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppUIStyle(PSAppUIStyleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUISTYLE, "psappuistyles", PSAppUIStyleDTO.class, dto);
	}

    /**
     * 批更新 应用界面模式 [PSAPPUISTYLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppUIStyles(List<PSAppUIStyleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUISTYLE, "psappuistyles", dtoList);
	}

    /**
     * 获取 应用界面模式 [PSAPPUISTYLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppUIStyleDTO getPSAppUIStyle(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPUISTYLE, "psappuistyles", PSAppUIStyleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用界面模式 [PSAPPUISTYLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppUIStyle(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPUISTYLE, "psappuistyles", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用界面模式 [PSAPPUISTYLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppUIStyleDTO> searchPSAppUIStyles(PSAppUIStyleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPUISTYLE, "psappuistyles", PSAppUIStyleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用界面模式 [PSAPPUISTYLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppUIStyleDTO> searchAllPSAppUIStyles(PSAppUIStyleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPUISTYLE, "psappuistyles", PSAppUIStyleDTO.class, iSearchContext);
	}

    /**
     * 建立 应用界面主题 [PSAPPUITHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppUITheme(PSAppUIThemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPUITHEME, "psappuithemes", PSAppUIThemeDTO.class, dto);
	}

    /**
     * 批建立 应用界面主题 [PSAPPUITHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppUIThemes(List<PSAppUIThemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPUITHEME, "psappuithemes", dtoList);
	}

    /**
     * 更新 应用界面主题 [PSAPPUITHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppUITheme(PSAppUIThemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUITHEME, "psappuithemes", PSAppUIThemeDTO.class, dto);
	}

    /**
     * 批更新 应用界面主题 [PSAPPUITHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppUIThemes(List<PSAppUIThemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUITHEME, "psappuithemes", dtoList);
	}

    /**
     * 获取 应用界面主题 [PSAPPUITHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppUIThemeDTO getPSAppUITheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPUITHEME, "psappuithemes", PSAppUIThemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用界面主题 [PSAPPUITHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppUITheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPUITHEME, "psappuithemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用界面主题 [PSAPPUITHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppUIThemeDTO> searchPSAppUIThemes(PSAppUIThemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPUITHEME, "psappuithemes", PSAppUIThemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用界面主题 [PSAPPUITHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppUIThemeDTO> searchAllPSAppUIThemes(PSAppUIThemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPUITHEME, "psappuithemes", PSAppUIThemeDTO.class, iSearchContext);
	}

    /**
     * 建立 应用用户模式 [PSAPPUSERMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppUserMode(PSAppUserModeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPUSERMODE, "psappusermodes", PSAppUserModeDTO.class, dto);
	}

    /**
     * 批建立 应用用户模式 [PSAPPUSERMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppUserModes(List<PSAppUserModeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPUSERMODE, "psappusermodes", dtoList);
	}

    /**
     * 更新 应用用户模式 [PSAPPUSERMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppUserMode(PSAppUserModeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUSERMODE, "psappusermodes", PSAppUserModeDTO.class, dto);
	}

    /**
     * 批更新 应用用户模式 [PSAPPUSERMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppUserModes(List<PSAppUserModeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUSERMODE, "psappusermodes", dtoList);
	}

    /**
     * 获取 应用用户模式 [PSAPPUSERMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppUserModeDTO getPSAppUserMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPUSERMODE, "psappusermodes", PSAppUserModeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用用户模式 [PSAPPUSERMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppUserMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPUSERMODE, "psappusermodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用用户模式 [PSAPPUSERMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppUserModeDTO> searchPSAppUserModes(PSAppUserModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPUSERMODE, "psappusermodes", PSAppUserModeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用用户模式 [PSAPPUSERMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppUserModeDTO> searchAllPSAppUserModes(PSAppUserModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPUSERMODE, "psappusermodes", PSAppUserModeDTO.class, iSearchContext);
	}

    /**
     * 建立 应用功能配置 [PSAPPUTIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppUtil(PSAppUtilDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPUTIL, "psapputils", PSAppUtilDTO.class, dto);
	}

    /**
     * 批建立 应用功能配置 [PSAPPUTIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppUtils(List<PSAppUtilDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPUTIL, "psapputils", dtoList);
	}

    /**
     * 更新 应用功能配置 [PSAPPUTIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppUtil(PSAppUtilDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUTIL, "psapputils", PSAppUtilDTO.class, dto);
	}

    /**
     * 批更新 应用功能配置 [PSAPPUTIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppUtils(List<PSAppUtilDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUTIL, "psapputils", dtoList);
	}

    /**
     * 获取 应用功能配置 [PSAPPUTIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppUtilDTO getPSAppUtil(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPUTIL, "psapputils", PSAppUtilDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用功能配置 [PSAPPUTIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppUtil(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPUTIL, "psapputils", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用功能配置 [PSAPPUTIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppUtilDTO> searchPSAppUtils(PSAppUtilFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPUTIL, "psapputils", PSAppUtilDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用功能配置 [PSAPPUTIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppUtilDTO> searchAllPSAppUtils(PSAppUtilFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPUTIL, "psapputils", PSAppUtilDTO.class, iSearchContext);
	}

    /**
     * 建立 应用功能页面 [PSAPPUTILPAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppUtilPage(PSAppUtilPageDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPUTILPAGE, "psapputilpages", PSAppUtilPageDTO.class, dto);
	}

    /**
     * 批建立 应用功能页面 [PSAPPUTILPAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppUtilPages(List<PSAppUtilPageDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPUTILPAGE, "psapputilpages", dtoList);
	}

    /**
     * 更新 应用功能页面 [PSAPPUTILPAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppUtilPage(PSAppUtilPageDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUTILPAGE, "psapputilpages", PSAppUtilPageDTO.class, dto);
	}

    /**
     * 批更新 应用功能页面 [PSAPPUTILPAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppUtilPages(List<PSAppUtilPageDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUTILPAGE, "psapputilpages", dtoList);
	}

    /**
     * 获取 应用功能页面 [PSAPPUTILPAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppUtilPageDTO getPSAppUtilPage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPUTILPAGE, "psapputilpages", PSAppUtilPageDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用功能页面 [PSAPPUTILPAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppUtilPage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPUTILPAGE, "psapputilpages", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用功能页面 [PSAPPUTILPAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppUtilPageDTO> searchPSAppUtilPages(PSAppUtilPageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPUTILPAGE, "psapputilpages", PSAppUtilPageDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用功能页面 [PSAPPUTILPAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppUtilPageDTO> searchAllPSAppUtilPages(PSAppUtilPageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPUTILPAGE, "psapputilpages", PSAppUtilPageDTO.class, iSearchContext);
	}

    /**
     * 建立 应用功能视图 [PSAPPUTILVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppUtilView(PSAppUtilViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPUTILVIEW, "psapputilviews", PSAppUtilViewDTO.class, dto);
	}

    /**
     * 批建立 应用功能视图 [PSAPPUTILVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppUtilViews(List<PSAppUtilViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPUTILVIEW, "psapputilviews", dtoList);
	}

    /**
     * 更新 应用功能视图 [PSAPPUTILVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppUtilView(PSAppUtilViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUTILVIEW, "psapputilviews", PSAppUtilViewDTO.class, dto);
	}

    /**
     * 批更新 应用功能视图 [PSAPPUTILVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppUtilViews(List<PSAppUtilViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPUTILVIEW, "psapputilviews", dtoList);
	}

    /**
     * 获取 应用功能视图 [PSAPPUTILVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppUtilViewDTO getPSAppUtilView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPUTILVIEW, "psapputilviews", PSAppUtilViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用功能视图 [PSAPPUTILVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppUtilView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPUTILVIEW, "psapputilviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用功能视图 [PSAPPUTILVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppUtilViewDTO> searchPSAppUtilViews(PSAppUtilViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPUTILVIEW, "psapputilviews", PSAppUtilViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用功能视图 [PSAPPUTILVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppUtilViewDTO> searchAllPSAppUtilViews(PSAppUtilViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPUTILVIEW, "psapputilviews", PSAppUtilViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用视图 [PSAPPVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppView(PSAppViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPVIEW, "psappviews", PSAppViewDTO.class, dto);
	}

    /**
     * 批建立 应用视图 [PSAPPVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppViews(List<PSAppViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPVIEW, "psappviews", dtoList);
	}

    /**
     * 更新 应用视图 [PSAPPVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppView(PSAppViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPVIEW, "psappviews", PSAppViewDTO.class, dto);
	}

    /**
     * 批更新 应用视图 [PSAPPVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppViews(List<PSAppViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPVIEW, "psappviews", dtoList);
	}

    /**
     * 获取 应用视图 [PSAPPVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppViewDTO getPSAppView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPVIEW, "psappviews", PSAppViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用视图 [PSAPPVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPVIEW, "psappviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用视图 [PSAPPVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppViewDTO> searchPSAppViews(PSAppViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPVIEW, "psappviews", PSAppViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用视图 [PSAPPVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppViewDTO> searchAllPSAppViews(PSAppViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPVIEW, "psappviews", PSAppViewDTO.class, iSearchContext);
	}

    /**
     * 建立 应用工作流 [PSAPPWF]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppWF(PSAppWFDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPWF, "psappwfs", PSAppWFDTO.class, dto);
	}

    /**
     * 批建立 应用工作流 [PSAPPWF]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppWFs(List<PSAppWFDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPWF, "psappwfs", dtoList);
	}

    /**
     * 更新 应用工作流 [PSAPPWF]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppWF(PSAppWFDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPWF, "psappwfs", PSAppWFDTO.class, dto);
	}

    /**
     * 批更新 应用工作流 [PSAPPWF]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppWFs(List<PSAppWFDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPWF, "psappwfs", dtoList);
	}

    /**
     * 获取 应用工作流 [PSAPPWF]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppWFDTO getPSAppWF(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPWF, "psappwfs", PSAppWFDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用工作流 [PSAPPWF]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppWF(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPWF, "psappwfs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用工作流 [PSAPPWF]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppWFDTO> searchPSAppWFs(PSAppWFFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPWF, "psappwfs", PSAppWFDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用工作流 [PSAPPWF]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppWFDTO> searchAllPSAppWFs(PSAppWFFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPWF, "psappwfs", PSAppWFDTO.class, iSearchContext);
	}

    /**
     * 建立 应用工作流版本 [PSAPPWFVER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSAppWFVer(PSAppWFVerDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSAPPWFVER, "psappwfvers", PSAppWFVerDTO.class, dto);
	}

    /**
     * 批建立 应用工作流版本 [PSAPPWFVER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSAppWFVers(List<PSAppWFVerDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSAPPWFVER, "psappwfvers", dtoList);
	}

    /**
     * 更新 应用工作流版本 [PSAPPWFVER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSAppWFVer(PSAppWFVerDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSAPPWFVER, "psappwfvers", PSAppWFVerDTO.class, dto);
	}

    /**
     * 批更新 应用工作流版本 [PSAPPWFVER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSAppWFVers(List<PSAppWFVerDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSAPPWFVER, "psappwfvers", dtoList);
	}

    /**
     * 获取 应用工作流版本 [PSAPPWFVER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSAppWFVerDTO getPSAppWFVer(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSAPPWFVER, "psappwfvers", PSAppWFVerDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用工作流版本 [PSAPPWFVER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSAppWFVer(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSAPPWFVER, "psappwfvers", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用工作流版本 [PSAPPWFVER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSAppWFVerDTO> searchPSAppWFVers(PSAppWFVerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSAPPWFVER, "psappwfvers", PSAppWFVerDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用工作流版本 [PSAPPWFVER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSAppWFVerDTO> searchAllPSAppWFVers(PSAppWFVerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSAPPWFVER, "psappwfvers", PSAppWFVerDTO.class, iSearchContext);
	}

    /**
     * 建立 系统代码表项 [PSCODEITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSCodeItem(PSCodeItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSCODEITEM, "pscodeitems", PSCodeItemDTO.class, dto);
	}

    /**
     * 批建立 系统代码表项 [PSCODEITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSCodeItems(List<PSCodeItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSCODEITEM, "pscodeitems", dtoList);
	}

    /**
     * 更新 系统代码表项 [PSCODEITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSCodeItem(PSCodeItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSCODEITEM, "pscodeitems", PSCodeItemDTO.class, dto);
	}

    /**
     * 批更新 系统代码表项 [PSCODEITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSCodeItems(List<PSCodeItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSCODEITEM, "pscodeitems", dtoList);
	}

    /**
     * 获取 系统代码表项 [PSCODEITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSCodeItemDTO getPSCodeItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSCODEITEM, "pscodeitems", PSCodeItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统代码表项 [PSCODEITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSCodeItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSCODEITEM, "pscodeitems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统代码表项 [PSCODEITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSCodeItemDTO> searchPSCodeItems(PSCodeItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSCODEITEM, "pscodeitems", PSCodeItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统代码表项 [PSCODEITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSCodeItemDTO> searchAllPSCodeItems(PSCodeItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSCODEITEM, "pscodeitems", PSCodeItemDTO.class, iSearchContext);
	}

    /**
     * 建立 系统代码表 [PSCODELIST]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSCodeList(PSCodeListDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSCODELIST, "pscodelists", PSCodeListDTO.class, dto);
	}

    /**
     * 批建立 系统代码表 [PSCODELIST]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSCodeLists(List<PSCodeListDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSCODELIST, "pscodelists", dtoList);
	}

    /**
     * 更新 系统代码表 [PSCODELIST]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSCodeList(PSCodeListDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSCODELIST, "pscodelists", PSCodeListDTO.class, dto);
	}

    /**
     * 批更新 系统代码表 [PSCODELIST]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSCodeLists(List<PSCodeListDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSCODELIST, "pscodelists", dtoList);
	}

    /**
     * 获取 系统代码表 [PSCODELIST]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSCodeListDTO getPSCodeList(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSCODELIST, "pscodelists", PSCodeListDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统代码表 [PSCODELIST]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSCodeList(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSCODELIST, "pscodelists", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统代码表 [PSCODELIST]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSCodeListDTO> searchPSCodeLists(PSCodeListFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSCODELIST, "pscodelists", PSCodeListDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统代码表 [PSCODELIST]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSCodeListDTO> searchAllPSCodeLists(PSCodeListFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSCODELIST, "pscodelists", PSCodeListDTO.class, iSearchContext);
	}

    /**
     * 建立 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSCtrlLogicGroup(PSCtrlLogicGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", PSCtrlLogicGroupDTO.class, dto);
	}

    /**
     * 批建立 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSCtrlLogicGroups(List<PSCtrlLogicGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", dtoList);
	}

    /**
     * 更新 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSCtrlLogicGroup(PSCtrlLogicGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", PSCtrlLogicGroupDTO.class, dto);
	}

    /**
     * 批更新 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSCtrlLogicGroups(List<PSCtrlLogicGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", dtoList);
	}

    /**
     * 获取 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSCtrlLogicGroupDTO getPSCtrlLogicGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", PSCtrlLogicGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSCtrlLogicGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSCtrlLogicGroupDTO> searchPSCtrlLogicGroups(PSCtrlLogicGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", PSCtrlLogicGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 部件逻辑组 [PSCTRLLOGICGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSCtrlLogicGroupDTO> searchAllPSCtrlLogicGroups(PSCtrlLogicGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSCTRLLOGICGROUP, "psctrllogicgroups", PSCtrlLogicGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 部件消息 [PSCTRLMSG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSCtrlMsg(PSCtrlMsgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSCTRLMSG, "psctrlmsgs", PSCtrlMsgDTO.class, dto);
	}

    /**
     * 批建立 部件消息 [PSCTRLMSG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSCtrlMsgs(List<PSCtrlMsgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSCTRLMSG, "psctrlmsgs", dtoList);
	}

    /**
     * 更新 部件消息 [PSCTRLMSG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSCtrlMsg(PSCtrlMsgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSCTRLMSG, "psctrlmsgs", PSCtrlMsgDTO.class, dto);
	}

    /**
     * 批更新 部件消息 [PSCTRLMSG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSCtrlMsgs(List<PSCtrlMsgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSCTRLMSG, "psctrlmsgs", dtoList);
	}

    /**
     * 获取 部件消息 [PSCTRLMSG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSCtrlMsgDTO getPSCtrlMsg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSCTRLMSG, "psctrlmsgs", PSCtrlMsgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 部件消息 [PSCTRLMSG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSCtrlMsg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSCTRLMSG, "psctrlmsgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 部件消息 [PSCTRLMSG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSCtrlMsgDTO> searchPSCtrlMsgs(PSCtrlMsgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSCTRLMSG, "psctrlmsgs", PSCtrlMsgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 部件消息 [PSCTRLMSG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSCtrlMsgDTO> searchAllPSCtrlMsgs(PSCtrlMsgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSCTRLMSG, "psctrlmsgs", PSCtrlMsgDTO.class, iSearchContext);
	}

    /**
     * 建立 实体自填模式 [PSDEACMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEACMode(PSDEACModeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEACMODE, "psdeacmodes", PSDEACModeDTO.class, dto);
	}

    /**
     * 批建立 实体自填模式 [PSDEACMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEACModes(List<PSDEACModeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEACMODE, "psdeacmodes", dtoList);
	}

    /**
     * 更新 实体自填模式 [PSDEACMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEACMode(PSDEACModeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEACMODE, "psdeacmodes", PSDEACModeDTO.class, dto);
	}

    /**
     * 批更新 实体自填模式 [PSDEACMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEACModes(List<PSDEACModeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEACMODE, "psdeacmodes", dtoList);
	}

    /**
     * 获取 实体自填模式 [PSDEACMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEACModeDTO getPSDEACMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEACMODE, "psdeacmodes", PSDEACModeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体自填模式 [PSDEACMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEACMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEACMODE, "psdeacmodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体自填模式 [PSDEACMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEACModeDTO> searchPSDEACModes(PSDEACModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEACMODE, "psdeacmodes", PSDEACModeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体自填模式 [PSDEACMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEACModeDTO> searchAllPSDEACModes(PSDEACModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEACMODE, "psdeacmodes", PSDEACModeDTO.class, iSearchContext);
	}

    /**
     * 建立 实体行为 [PSDEACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEAction(PSDEActionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEACTION, "psdeactions", PSDEActionDTO.class, dto);
	}

    /**
     * 批建立 实体行为 [PSDEACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEActions(List<PSDEActionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEACTION, "psdeactions", dtoList);
	}

    /**
     * 更新 实体行为 [PSDEACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEAction(PSDEActionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTION, "psdeactions", PSDEActionDTO.class, dto);
	}

    /**
     * 批更新 实体行为 [PSDEACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEActions(List<PSDEActionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTION, "psdeactions", dtoList);
	}

    /**
     * 获取 实体行为 [PSDEACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEActionDTO getPSDEAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEACTION, "psdeactions", PSDEActionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体行为 [PSDEACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEACTION, "psdeactions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体行为 [PSDEACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEActionDTO> searchPSDEActions(PSDEActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEACTION, "psdeactions", PSDEActionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体行为 [PSDEACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEActionDTO> searchAllPSDEActions(PSDEActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEACTION, "psdeactions", PSDEActionDTO.class, iSearchContext);
	}

    /**
     * 建立 实体行为组 [PSDEACTIONGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEActionGroup(PSDEActionGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEACTIONGROUP, "psdeactiongroups", PSDEActionGroupDTO.class, dto);
	}

    /**
     * 批建立 实体行为组 [PSDEACTIONGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEActionGroups(List<PSDEActionGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEACTIONGROUP, "psdeactiongroups", dtoList);
	}

    /**
     * 更新 实体行为组 [PSDEACTIONGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEActionGroup(PSDEActionGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTIONGROUP, "psdeactiongroups", PSDEActionGroupDTO.class, dto);
	}

    /**
     * 批更新 实体行为组 [PSDEACTIONGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEActionGroups(List<PSDEActionGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTIONGROUP, "psdeactiongroups", dtoList);
	}

    /**
     * 获取 实体行为组 [PSDEACTIONGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEActionGroupDTO getPSDEActionGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEACTIONGROUP, "psdeactiongroups", PSDEActionGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体行为组 [PSDEACTIONGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEActionGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEACTIONGROUP, "psdeactiongroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体行为组 [PSDEACTIONGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEActionGroupDTO> searchPSDEActionGroups(PSDEActionGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEACTIONGROUP, "psdeactiongroups", PSDEActionGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体行为组 [PSDEACTIONGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEActionGroupDTO> searchAllPSDEActionGroups(PSDEActionGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEACTIONGROUP, "psdeactiongroups", PSDEActionGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEActionLogic(PSDEActionLogicDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", PSDEActionLogicDTO.class, dto);
	}

    /**
     * 批建立 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEActionLogics(List<PSDEActionLogicDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", dtoList);
	}

    /**
     * 更新 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEActionLogic(PSDEActionLogicDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", PSDEActionLogicDTO.class, dto);
	}

    /**
     * 批更新 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEActionLogics(List<PSDEActionLogicDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", dtoList);
	}

    /**
     * 获取 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEActionLogicDTO getPSDEActionLogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", PSDEActionLogicDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEActionLogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEActionLogicDTO> searchPSDEActionLogics(PSDEActionLogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", PSDEActionLogicDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体行为逻辑 [PSDEACTIONLOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEActionLogicDTO> searchAllPSDEActionLogics(PSDEActionLogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEACTIONLOGIC, "psdeactionlogics", PSDEActionLogicDTO.class, iSearchContext);
	}

    /**
     * 建立 实体行为模板 [PSDEACTIONTEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEActionTempl(PSDEActionTemplDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", PSDEActionTemplDTO.class, dto);
	}

    /**
     * 批建立 实体行为模板 [PSDEACTIONTEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEActionTempls(List<PSDEActionTemplDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", dtoList);
	}

    /**
     * 更新 实体行为模板 [PSDEACTIONTEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEActionTempl(PSDEActionTemplDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", PSDEActionTemplDTO.class, dto);
	}

    /**
     * 批更新 实体行为模板 [PSDEACTIONTEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEActionTempls(List<PSDEActionTemplDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", dtoList);
	}

    /**
     * 获取 实体行为模板 [PSDEACTIONTEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEActionTemplDTO getPSDEActionTempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", PSDEActionTemplDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体行为模板 [PSDEACTIONTEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEActionTempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体行为模板 [PSDEACTIONTEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEActionTemplDTO> searchPSDEActionTempls(PSDEActionTemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", PSDEActionTemplDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体行为模板 [PSDEACTIONTEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEActionTemplDTO> searchAllPSDEActionTempls(PSDEActionTemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEACTIONTEMPL, "psdeactiontempls", PSDEActionTemplDTO.class, iSearchContext);
	}

    /**
     * 建立 实体图表 [PSDECHART]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEChart(PSDEChartDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDECHART, "psdecharts", PSDEChartDTO.class, dto);
	}

    /**
     * 批建立 实体图表 [PSDECHART]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDECharts(List<PSDEChartDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDECHART, "psdecharts", dtoList);
	}

    /**
     * 更新 实体图表 [PSDECHART]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEChart(PSDEChartDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDECHART, "psdecharts", PSDEChartDTO.class, dto);
	}

    /**
     * 批更新 实体图表 [PSDECHART]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDECharts(List<PSDEChartDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDECHART, "psdecharts", dtoList);
	}

    /**
     * 获取 实体图表 [PSDECHART]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEChartDTO getPSDEChart(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDECHART, "psdecharts", PSDEChartDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体图表 [PSDECHART]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEChart(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDECHART, "psdecharts", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体图表 [PSDECHART]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEChartDTO> searchPSDECharts(PSDEChartFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDECHART, "psdecharts", PSDEChartDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体图表 [PSDECHART]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEChartDTO> searchAllPSDECharts(PSDEChartFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDECHART, "psdecharts", PSDEChartDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据库配置 [PSDEDBCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDBCfg(PSDEDBCfgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDBCFG, "psdedbcfgs", PSDEDBCfgDTO.class, dto);
	}

    /**
     * 批建立 实体数据库配置 [PSDEDBCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDBCfgs(List<PSDEDBCfgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDBCFG, "psdedbcfgs", dtoList);
	}

    /**
     * 更新 实体数据库配置 [PSDEDBCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDBCfg(PSDEDBCfgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDBCFG, "psdedbcfgs", PSDEDBCfgDTO.class, dto);
	}

    /**
     * 批更新 实体数据库配置 [PSDEDBCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDBCfgs(List<PSDEDBCfgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDBCFG, "psdedbcfgs", dtoList);
	}

    /**
     * 获取 实体数据库配置 [PSDEDBCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDBCfgDTO getPSDEDBCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDBCFG, "psdedbcfgs", PSDEDBCfgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据库配置 [PSDEDBCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDBCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDBCFG, "psdedbcfgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据库配置 [PSDEDBCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDBCfgDTO> searchPSDEDBCfgs(PSDEDBCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDBCFG, "psdedbcfgs", PSDEDBCfgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据库配置 [PSDEDBCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDBCfgDTO> searchAllPSDEDBCfgs(PSDEDBCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDBCFG, "psdedbcfgs", PSDEDBCfgDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据库索引 [PSDEDBINDEX]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDBIndex(PSDEDBIndexDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDBINDEX, "psdedbindices", PSDEDBIndexDTO.class, dto);
	}

    /**
     * 批建立 实体数据库索引 [PSDEDBINDEX]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDBIndices(List<PSDEDBIndexDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDBINDEX, "psdedbindices", dtoList);
	}

    /**
     * 更新 实体数据库索引 [PSDEDBINDEX]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDBIndex(PSDEDBIndexDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDBINDEX, "psdedbindices", PSDEDBIndexDTO.class, dto);
	}

    /**
     * 批更新 实体数据库索引 [PSDEDBINDEX]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDBIndices(List<PSDEDBIndexDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDBINDEX, "psdedbindices", dtoList);
	}

    /**
     * 获取 实体数据库索引 [PSDEDBINDEX]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDBIndexDTO getPSDEDBIndex(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDBINDEX, "psdedbindices", PSDEDBIndexDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据库索引 [PSDEDBINDEX]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDBIndex(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDBINDEX, "psdedbindices", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据库索引 [PSDEDBINDEX]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDBIndexDTO> searchPSDEDBIndices(PSDEDBIndexFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDBINDEX, "psdedbindices", PSDEDBIndexDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据库索引 [PSDEDBINDEX]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDBIndexDTO> searchAllPSDEDBIndices(PSDEDBIndexFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDBINDEX, "psdedbindices", PSDEDBIndexDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据查询代码 [PSDEDQCODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDQCode(PSDEDQCodeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDQCODE, "psdedqcodes", PSDEDQCodeDTO.class, dto);
	}

    /**
     * 批建立 实体数据查询代码 [PSDEDQCODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDQCodes(List<PSDEDQCodeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDQCODE, "psdedqcodes", dtoList);
	}

    /**
     * 更新 实体数据查询代码 [PSDEDQCODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDQCode(PSDEDQCodeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDQCODE, "psdedqcodes", PSDEDQCodeDTO.class, dto);
	}

    /**
     * 批更新 实体数据查询代码 [PSDEDQCODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDQCodes(List<PSDEDQCodeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDQCODE, "psdedqcodes", dtoList);
	}

    /**
     * 获取 实体数据查询代码 [PSDEDQCODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDQCodeDTO getPSDEDQCode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDQCODE, "psdedqcodes", PSDEDQCodeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据查询代码 [PSDEDQCODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDQCode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDQCODE, "psdedqcodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据查询代码 [PSDEDQCODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDQCodeDTO> searchPSDEDQCodes(PSDEDQCodeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDQCODE, "psdedqcodes", PSDEDQCodeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据查询代码 [PSDEDQCODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDQCodeDTO> searchAllPSDEDQCodes(PSDEDQCodeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDQCODE, "psdedqcodes", PSDEDQCodeDTO.class, iSearchContext);
	}

    /**
     * 建立 实体查询代码条件 [PSDEDQCODECOND]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDQCodeCond(PSDEDQCodeCondDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDQCODECOND, "psdedqcodeconds", PSDEDQCodeCondDTO.class, dto);
	}

    /**
     * 批建立 实体查询代码条件 [PSDEDQCODECOND]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDQCodeConds(List<PSDEDQCodeCondDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDQCODECOND, "psdedqcodeconds", dtoList);
	}

    /**
     * 更新 实体查询代码条件 [PSDEDQCODECOND]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDQCodeCond(PSDEDQCodeCondDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDQCODECOND, "psdedqcodeconds", PSDEDQCodeCondDTO.class, dto);
	}

    /**
     * 批更新 实体查询代码条件 [PSDEDQCODECOND]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDQCodeConds(List<PSDEDQCodeCondDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDQCODECOND, "psdedqcodeconds", dtoList);
	}

    /**
     * 获取 实体查询代码条件 [PSDEDQCODECOND]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDQCodeCondDTO getPSDEDQCodeCond(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDQCODECOND, "psdedqcodeconds", PSDEDQCodeCondDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体查询代码条件 [PSDEDQCODECOND]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDQCodeCond(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDQCODECOND, "psdedqcodeconds", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体查询代码条件 [PSDEDQCODECOND]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDQCodeCondDTO> searchPSDEDQCodeConds(PSDEDQCodeCondFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDQCODECOND, "psdedqcodeconds", PSDEDQCodeCondDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体查询代码条件 [PSDEDQCODECOND]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDQCodeCondDTO> searchAllPSDEDQCodeConds(PSDEDQCodeCondFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDQCODECOND, "psdedqcodeconds", PSDEDQCodeCondDTO.class, iSearchContext);
	}

    /**
     * 建立 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDQCodeExp(PSDEDQCodeExpDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", PSDEDQCodeExpDTO.class, dto);
	}

    /**
     * 批建立 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDQCodeExps(List<PSDEDQCodeExpDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", dtoList);
	}

    /**
     * 更新 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDQCodeExp(PSDEDQCodeExpDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", PSDEDQCodeExpDTO.class, dto);
	}

    /**
     * 批更新 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDQCodeExps(List<PSDEDQCodeExpDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", dtoList);
	}

    /**
     * 获取 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDQCodeExpDTO getPSDEDQCodeExp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", PSDEDQCodeExpDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDQCodeExp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDQCodeExpDTO> searchPSDEDQCodeExps(PSDEDQCodeExpFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", PSDEDQCodeExpDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体查询代码表达式 [PSDEDQCODEEXP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDQCodeExpDTO> searchAllPSDEDQCodeExps(PSDEDQCodeExpFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDQCODEEXP, "psdedqcodeexps", PSDEDQCodeExpDTO.class, iSearchContext);
	}

    /**
     * 建立 实体关系界面分组 [PSDEDRGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDRGroup(PSDEDRGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDRGROUP, "psdedrgroups", PSDEDRGroupDTO.class, dto);
	}

    /**
     * 批建立 实体关系界面分组 [PSDEDRGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDRGroups(List<PSDEDRGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDRGROUP, "psdedrgroups", dtoList);
	}

    /**
     * 更新 实体关系界面分组 [PSDEDRGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDRGroup(PSDEDRGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDRGROUP, "psdedrgroups", PSDEDRGroupDTO.class, dto);
	}

    /**
     * 批更新 实体关系界面分组 [PSDEDRGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDRGroups(List<PSDEDRGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDRGROUP, "psdedrgroups", dtoList);
	}

    /**
     * 获取 实体关系界面分组 [PSDEDRGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDRGroupDTO getPSDEDRGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDRGROUP, "psdedrgroups", PSDEDRGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体关系界面分组 [PSDEDRGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDRGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDRGROUP, "psdedrgroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体关系界面分组 [PSDEDRGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDRGroupDTO> searchPSDEDRGroups(PSDEDRGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDRGROUP, "psdedrgroups", PSDEDRGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体关系界面分组 [PSDEDRGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDRGroupDTO> searchAllPSDEDRGroups(PSDEDRGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDRGROUP, "psdedrgroups", PSDEDRGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体关系界面 [PSDEDRITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDRItem(PSDEDRItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDRITEM, "psdedritems", PSDEDRItemDTO.class, dto);
	}

    /**
     * 批建立 实体关系界面 [PSDEDRITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDRItems(List<PSDEDRItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDRITEM, "psdedritems", dtoList);
	}

    /**
     * 更新 实体关系界面 [PSDEDRITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDRItem(PSDEDRItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDRITEM, "psdedritems", PSDEDRItemDTO.class, dto);
	}

    /**
     * 批更新 实体关系界面 [PSDEDRITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDRItems(List<PSDEDRItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDRITEM, "psdedritems", dtoList);
	}

    /**
     * 获取 实体关系界面 [PSDEDRITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDRItemDTO getPSDEDRItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDRITEM, "psdedritems", PSDEDRItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体关系界面 [PSDEDRITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDRItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDRITEM, "psdedritems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体关系界面 [PSDEDRITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDRItemDTO> searchPSDEDRItems(PSDEDRItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDRITEM, "psdedritems", PSDEDRItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体关系界面 [PSDEDRITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDRItemDTO> searchAllPSDEDRItems(PSDEDRItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDRITEM, "psdedritems", PSDEDRItemDTO.class, iSearchContext);
	}

    /**
     * 建立 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDTSQueue(PSDEDTSQueueDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDTSQUEUE, "psdedtsqueues", PSDEDTSQueueDTO.class, dto);
	}

    /**
     * 批建立 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDTSQueues(List<PSDEDTSQueueDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDTSQUEUE, "psdedtsqueues", dtoList);
	}

    /**
     * 更新 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDTSQueue(PSDEDTSQueueDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDTSQUEUE, "psdedtsqueues", PSDEDTSQueueDTO.class, dto);
	}

    /**
     * 批更新 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDTSQueues(List<PSDEDTSQueueDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDTSQUEUE, "psdedtsqueues", dtoList);
	}

    /**
     * 获取 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDTSQueueDTO getPSDEDTSQueue(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDTSQUEUE, "psdedtsqueues", PSDEDTSQueueDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDTSQueue(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDTSQUEUE, "psdedtsqueues", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDTSQueueDTO> searchPSDEDTSQueues(PSDEDTSQueueFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDTSQUEUE, "psdedtsqueues", PSDEDTSQueueDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体异步处理队列 [PSDEDTSQUEUE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDTSQueueDTO> searchAllPSDEDTSQueues(PSDEDTSQueueFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDTSQUEUE, "psdedtsqueues", PSDEDTSQueueDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据导出 [PSDEDATAEXP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataExp(PSDEDataExpDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAEXP, "psdedataexps", PSDEDataExpDTO.class, dto);
	}

    /**
     * 批建立 实体数据导出 [PSDEDATAEXP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataExps(List<PSDEDataExpDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAEXP, "psdedataexps", dtoList);
	}

    /**
     * 更新 实体数据导出 [PSDEDATAEXP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataExp(PSDEDataExpDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAEXP, "psdedataexps", PSDEDataExpDTO.class, dto);
	}

    /**
     * 批更新 实体数据导出 [PSDEDATAEXP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataExps(List<PSDEDataExpDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAEXP, "psdedataexps", dtoList);
	}

    /**
     * 获取 实体数据导出 [PSDEDATAEXP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataExpDTO getPSDEDataExp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATAEXP, "psdedataexps", PSDEDataExpDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据导出 [PSDEDATAEXP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataExp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATAEXP, "psdedataexps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据导出 [PSDEDATAEXP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataExpDTO> searchPSDEDataExps(PSDEDataExpFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATAEXP, "psdedataexps", PSDEDataExpDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据导出 [PSDEDATAEXP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataExpDTO> searchAllPSDEDataExps(PSDEDataExpFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATAEXP, "psdedataexps", PSDEDataExpDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据导入 [PSDEDATAIMP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataImp(PSDEDataImpDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAIMP, "psdedataimps", PSDEDataImpDTO.class, dto);
	}

    /**
     * 批建立 实体数据导入 [PSDEDATAIMP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataImps(List<PSDEDataImpDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAIMP, "psdedataimps", dtoList);
	}

    /**
     * 更新 实体数据导入 [PSDEDATAIMP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataImp(PSDEDataImpDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAIMP, "psdedataimps", PSDEDataImpDTO.class, dto);
	}

    /**
     * 批更新 实体数据导入 [PSDEDATAIMP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataImps(List<PSDEDataImpDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAIMP, "psdedataimps", dtoList);
	}

    /**
     * 获取 实体数据导入 [PSDEDATAIMP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataImpDTO getPSDEDataImp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATAIMP, "psdedataimps", PSDEDataImpDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据导入 [PSDEDATAIMP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataImp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATAIMP, "psdedataimps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据导入 [PSDEDATAIMP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataImpDTO> searchPSDEDataImps(PSDEDataImpFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATAIMP, "psdedataimps", PSDEDataImpDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据导入 [PSDEDATAIMP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataImpDTO> searchAllPSDEDataImps(PSDEDataImpFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATAIMP, "psdedataimps", PSDEDataImpDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据查询 [PSDEDATAQUERY]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataQuery(PSDEDataQueryDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAQUERY, "psdedataqueries", PSDEDataQueryDTO.class, dto);
	}

    /**
     * 批建立 实体数据查询 [PSDEDATAQUERY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataQueries(List<PSDEDataQueryDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAQUERY, "psdedataqueries", dtoList);
	}

    /**
     * 更新 实体数据查询 [PSDEDATAQUERY]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataQuery(PSDEDataQueryDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAQUERY, "psdedataqueries", PSDEDataQueryDTO.class, dto);
	}

    /**
     * 批更新 实体数据查询 [PSDEDATAQUERY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataQueries(List<PSDEDataQueryDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAQUERY, "psdedataqueries", dtoList);
	}

    /**
     * 获取 实体数据查询 [PSDEDATAQUERY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataQueryDTO getPSDEDataQuery(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATAQUERY, "psdedataqueries", PSDEDataQueryDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据查询 [PSDEDATAQUERY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataQuery(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATAQUERY, "psdedataqueries", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据查询 [PSDEDATAQUERY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataQueryDTO> searchPSDEDataQueries(PSDEDataQueryFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATAQUERY, "psdedataqueries", PSDEDataQueryDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据查询 [PSDEDATAQUERY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataQueryDTO> searchAllPSDEDataQueries(PSDEDataQueryFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATAQUERY, "psdedataqueries", PSDEDataQueryDTO.class, iSearchContext);
	}

    /**
     * 建立 实体关系界面组 [PSDEDATARELATION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataRelation(PSDEDataRelationDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATARELATION, "psdedatarelations", PSDEDataRelationDTO.class, dto);
	}

    /**
     * 批建立 实体关系界面组 [PSDEDATARELATION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataRelations(List<PSDEDataRelationDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATARELATION, "psdedatarelations", dtoList);
	}

    /**
     * 更新 实体关系界面组 [PSDEDATARELATION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataRelation(PSDEDataRelationDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATARELATION, "psdedatarelations", PSDEDataRelationDTO.class, dto);
	}

    /**
     * 批更新 实体关系界面组 [PSDEDATARELATION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataRelations(List<PSDEDataRelationDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATARELATION, "psdedatarelations", dtoList);
	}

    /**
     * 获取 实体关系界面组 [PSDEDATARELATION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataRelationDTO getPSDEDataRelation(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATARELATION, "psdedatarelations", PSDEDataRelationDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体关系界面组 [PSDEDATARELATION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataRelation(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATARELATION, "psdedatarelations", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体关系界面组 [PSDEDATARELATION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataRelationDTO> searchPSDEDataRelations(PSDEDataRelationFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATARELATION, "psdedatarelations", PSDEDataRelationDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体关系界面组 [PSDEDATARELATION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataRelationDTO> searchAllPSDEDataRelations(PSDEDataRelationFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATARELATION, "psdedatarelations", PSDEDataRelationDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据集合 [PSDEDATASET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataSet(PSDEDataSetDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATASET, "psdedatasets", PSDEDataSetDTO.class, dto);
	}

    /**
     * 批建立 实体数据集合 [PSDEDATASET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataSets(List<PSDEDataSetDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATASET, "psdedatasets", dtoList);
	}

    /**
     * 更新 实体数据集合 [PSDEDATASET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataSet(PSDEDataSetDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATASET, "psdedatasets", PSDEDataSetDTO.class, dto);
	}

    /**
     * 批更新 实体数据集合 [PSDEDATASET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataSets(List<PSDEDataSetDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATASET, "psdedatasets", dtoList);
	}

    /**
     * 获取 实体数据集合 [PSDEDATASET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataSetDTO getPSDEDataSet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATASET, "psdedatasets", PSDEDataSetDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据集合 [PSDEDATASET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataSet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATASET, "psdedatasets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据集合 [PSDEDATASET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataSetDTO> searchPSDEDataSets(PSDEDataSetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATASET, "psdedatasets", PSDEDataSetDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据集合 [PSDEDATASET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataSetDTO> searchAllPSDEDataSets(PSDEDataSetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATASET, "psdedatasets", PSDEDataSetDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据同步 [PSDEDATASYNC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataSync(PSDEDataSyncDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATASYNC, "psdedatasyncs", PSDEDataSyncDTO.class, dto);
	}

    /**
     * 批建立 实体数据同步 [PSDEDATASYNC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataSyncs(List<PSDEDataSyncDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATASYNC, "psdedatasyncs", dtoList);
	}

    /**
     * 更新 实体数据同步 [PSDEDATASYNC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataSync(PSDEDataSyncDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATASYNC, "psdedatasyncs", PSDEDataSyncDTO.class, dto);
	}

    /**
     * 批更新 实体数据同步 [PSDEDATASYNC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataSyncs(List<PSDEDataSyncDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATASYNC, "psdedatasyncs", dtoList);
	}

    /**
     * 获取 实体数据同步 [PSDEDATASYNC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataSyncDTO getPSDEDataSync(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATASYNC, "psdedatasyncs", PSDEDataSyncDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据同步 [PSDEDATASYNC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataSync(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATASYNC, "psdedatasyncs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据同步 [PSDEDATASYNC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataSyncDTO> searchPSDEDataSyncs(PSDEDataSyncFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATASYNC, "psdedatasyncs", PSDEDataSyncDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据同步 [PSDEDATASYNC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataSyncDTO> searchAllPSDEDataSyncs(PSDEDataSyncFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATASYNC, "psdedatasyncs", PSDEDataSyncDTO.class, iSearchContext);
	}

    /**
     * 建立 实体卡片视图 [PSDEDATAVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDataView(PSDEDataViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAVIEW, "psdedataviews", PSDEDataViewDTO.class, dto);
	}

    /**
     * 批建立 实体卡片视图 [PSDEDATAVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDataViews(List<PSDEDataViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDATAVIEW, "psdedataviews", dtoList);
	}

    /**
     * 更新 实体卡片视图 [PSDEDATAVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDataView(PSDEDataViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAVIEW, "psdedataviews", PSDEDataViewDTO.class, dto);
	}

    /**
     * 批更新 实体卡片视图 [PSDEDATAVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDataViews(List<PSDEDataViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDATAVIEW, "psdedataviews", dtoList);
	}

    /**
     * 获取 实体卡片视图 [PSDEDATAVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDataViewDTO getPSDEDataView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDATAVIEW, "psdedataviews", PSDEDataViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体卡片视图 [PSDEDATAVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDataView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDATAVIEW, "psdedataviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体卡片视图 [PSDEDATAVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDataViewDTO> searchPSDEDataViews(PSDEDataViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDATAVIEW, "psdedataviews", PSDEDataViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体卡片视图 [PSDEDATAVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDataViewDTO> searchAllPSDEDataViews(PSDEDataViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDATAVIEW, "psdedataviews", PSDEDataViewDTO.class, iSearchContext);
	}

    /**
     * 建立 属性数据库列 [PSDEFDTCOL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFDTCol(PSDEFDTColDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFDTCOL, "psdefdtcols", PSDEFDTColDTO.class, dto);
	}

    /**
     * 批建立 属性数据库列 [PSDEFDTCOL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFDTCols(List<PSDEFDTColDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFDTCOL, "psdefdtcols", dtoList);
	}

    /**
     * 更新 属性数据库列 [PSDEFDTCOL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFDTCol(PSDEFDTColDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFDTCOL, "psdefdtcols", PSDEFDTColDTO.class, dto);
	}

    /**
     * 批更新 属性数据库列 [PSDEFDTCOL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFDTCols(List<PSDEFDTColDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFDTCOL, "psdefdtcols", dtoList);
	}

    /**
     * 获取 属性数据库列 [PSDEFDTCOL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFDTColDTO getPSDEFDTCol(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFDTCOL, "psdefdtcols", PSDEFDTColDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 属性数据库列 [PSDEFDTCOL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFDTCol(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFDTCOL, "psdefdtcols", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 属性数据库列 [PSDEFDTCOL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFDTColDTO> searchPSDEFDTCols(PSDEFDTColFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFDTCOL, "psdefdtcols", PSDEFDTColDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 属性数据库列 [PSDEFDTCOL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFDTColDTO> searchAllPSDEFDTCols(PSDEFDTColFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFDTCOL, "psdefdtcols", PSDEFDTColDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性组 [PSDEFGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFGroup(PSDEFGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFGROUP, "psdefgroups", PSDEFGroupDTO.class, dto);
	}

    /**
     * 批建立 实体属性组 [PSDEFGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFGroups(List<PSDEFGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFGROUP, "psdefgroups", dtoList);
	}

    /**
     * 更新 实体属性组 [PSDEFGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFGroup(PSDEFGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFGROUP, "psdefgroups", PSDEFGroupDTO.class, dto);
	}

    /**
     * 批更新 实体属性组 [PSDEFGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFGroups(List<PSDEFGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFGROUP, "psdefgroups", dtoList);
	}

    /**
     * 获取 实体属性组 [PSDEFGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFGroupDTO getPSDEFGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFGROUP, "psdefgroups", PSDEFGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性组 [PSDEFGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFGROUP, "psdefgroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性组 [PSDEFGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFGroupDTO> searchPSDEFGroups(PSDEFGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFGROUP, "psdefgroups", PSDEFGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性组 [PSDEFGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFGroupDTO> searchAllPSDEFGroups(PSDEFGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFGROUP, "psdefgroups", PSDEFGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFInputTip(PSDEFInputTipDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFINPUTTIP, "psdefinputtips", PSDEFInputTipDTO.class, dto);
	}

    /**
     * 批建立 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFInputTips(List<PSDEFInputTipDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFINPUTTIP, "psdefinputtips", dtoList);
	}

    /**
     * 更新 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFInputTip(PSDEFInputTipDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFINPUTTIP, "psdefinputtips", PSDEFInputTipDTO.class, dto);
	}

    /**
     * 批更新 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFInputTips(List<PSDEFInputTipDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFINPUTTIP, "psdefinputtips", dtoList);
	}

    /**
     * 获取 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFInputTipDTO getPSDEFInputTip(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFINPUTTIP, "psdefinputtips", PSDEFInputTipDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFInputTip(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFINPUTTIP, "psdefinputtips", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFInputTipDTO> searchPSDEFInputTips(PSDEFInputTipFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFINPUTTIP, "psdefinputtips", PSDEFInputTipDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性输入提示 [PSDEFINPUTTIP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFInputTipDTO> searchAllPSDEFInputTips(PSDEFInputTipFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFINPUTTIP, "psdefinputtips", PSDEFInputTipDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFInputTipSet(PSDEFInputTipSetDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", PSDEFInputTipSetDTO.class, dto);
	}

    /**
     * 批建立 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFInputTipSets(List<PSDEFInputTipSetDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", dtoList);
	}

    /**
     * 更新 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFInputTipSet(PSDEFInputTipSetDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", PSDEFInputTipSetDTO.class, dto);
	}

    /**
     * 批更新 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFInputTipSets(List<PSDEFInputTipSetDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", dtoList);
	}

    /**
     * 获取 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFInputTipSetDTO getPSDEFInputTipSet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", PSDEFInputTipSetDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFInputTipSet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFInputTipSetDTO> searchPSDEFInputTipSets(PSDEFInputTipSetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", PSDEFInputTipSetDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性输入提示集合 [PSDEFINPUTTIPSET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFInputTipSetDTO> searchAllPSDEFInputTipSets(PSDEFInputTipSetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFINPUTTIPSET, "psdefinputtipsets", PSDEFInputTipSetDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性搜索模式 [PSDEFSFITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFSFItem(PSDEFSFItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFSFITEM, "psdefsfitems", PSDEFSFItemDTO.class, dto);
	}

    /**
     * 批建立 实体属性搜索模式 [PSDEFSFITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFSFItems(List<PSDEFSFItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFSFITEM, "psdefsfitems", dtoList);
	}

    /**
     * 更新 实体属性搜索模式 [PSDEFSFITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFSFItem(PSDEFSFItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFSFITEM, "psdefsfitems", PSDEFSFItemDTO.class, dto);
	}

    /**
     * 批更新 实体属性搜索模式 [PSDEFSFITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFSFItems(List<PSDEFSFItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFSFITEM, "psdefsfitems", dtoList);
	}

    /**
     * 获取 实体属性搜索模式 [PSDEFSFITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFSFItemDTO getPSDEFSFItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFSFITEM, "psdefsfitems", PSDEFSFItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性搜索模式 [PSDEFSFITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFSFItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFSFITEM, "psdefsfitems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性搜索模式 [PSDEFSFITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFSFItemDTO> searchPSDEFSFItems(PSDEFSFItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFSFITEM, "psdefsfitems", PSDEFSFItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性搜索模式 [PSDEFSFITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFSFItemDTO> searchAllPSDEFSFItems(PSDEFSFItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFSFITEM, "psdefsfitems", PSDEFSFItemDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性界面配置 [PSDEFUIMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFUIMode(PSDEFUIModeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFUIMODE, "psdefuimodes", PSDEFUIModeDTO.class, dto);
	}

    /**
     * 批建立 实体属性界面配置 [PSDEFUIMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFUIModes(List<PSDEFUIModeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFUIMODE, "psdefuimodes", dtoList);
	}

    /**
     * 更新 实体属性界面配置 [PSDEFUIMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFUIMode(PSDEFUIModeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFUIMODE, "psdefuimodes", PSDEFUIModeDTO.class, dto);
	}

    /**
     * 批更新 实体属性界面配置 [PSDEFUIMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFUIModes(List<PSDEFUIModeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFUIMODE, "psdefuimodes", dtoList);
	}

    /**
     * 获取 实体属性界面配置 [PSDEFUIMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFUIModeDTO getPSDEFUIMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFUIMODE, "psdefuimodes", PSDEFUIModeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性界面配置 [PSDEFUIMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFUIMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFUIMODE, "psdefuimodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性界面配置 [PSDEFUIMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFUIModeDTO> searchPSDEFUIModes(PSDEFUIModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFUIMODE, "psdefuimodes", PSDEFUIModeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性界面配置 [PSDEFUIMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFUIModeDTO> searchAllPSDEFUIModes(PSDEFUIModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFUIMODE, "psdefuimodes", PSDEFUIModeDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性值规则 [PSDEFVALUERULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEFValueRule(PSDEFValueRuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFVALUERULE, "psdefvaluerules", PSDEFValueRuleDTO.class, dto);
	}

    /**
     * 批建立 实体属性值规则 [PSDEFVALUERULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEFValueRules(List<PSDEFValueRuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFVALUERULE, "psdefvaluerules", dtoList);
	}

    /**
     * 更新 实体属性值规则 [PSDEFVALUERULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEFValueRule(PSDEFValueRuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFVALUERULE, "psdefvaluerules", PSDEFValueRuleDTO.class, dto);
	}

    /**
     * 批更新 实体属性值规则 [PSDEFVALUERULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEFValueRules(List<PSDEFValueRuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFVALUERULE, "psdefvaluerules", dtoList);
	}

    /**
     * 获取 实体属性值规则 [PSDEFVALUERULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFValueRuleDTO getPSDEFValueRule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFVALUERULE, "psdefvaluerules", PSDEFValueRuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性值规则 [PSDEFVALUERULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEFValueRule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFVALUERULE, "psdefvaluerules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性值规则 [PSDEFVALUERULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFValueRuleDTO> searchPSDEFValueRules(PSDEFValueRuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFVALUERULE, "psdefvaluerules", PSDEFValueRuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性值规则 [PSDEFVALUERULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFValueRuleDTO> searchAllPSDEFValueRules(PSDEFValueRuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFVALUERULE, "psdefvaluerules", PSDEFValueRuleDTO.class, iSearchContext);
	}

    /**
     * 建立 实体表单 [PSDEFORM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEForm(PSDEFormDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEFORM, "psdeforms", PSDEFormDTO.class, dto);
	}

    /**
     * 批建立 实体表单 [PSDEFORM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEForms(List<PSDEFormDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEFORM, "psdeforms", dtoList);
	}

    /**
     * 更新 实体表单 [PSDEFORM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEForm(PSDEFormDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEFORM, "psdeforms", PSDEFormDTO.class, dto);
	}

    /**
     * 批更新 实体表单 [PSDEFORM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEForms(List<PSDEFormDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEFORM, "psdeforms", dtoList);
	}

    /**
     * 获取 实体表单 [PSDEFORM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEFormDTO getPSDEForm(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEFORM, "psdeforms", PSDEFormDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体表单 [PSDEFORM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEForm(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEFORM, "psdeforms", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体表单 [PSDEFORM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEFormDTO> searchPSDEForms(PSDEFormFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEFORM, "psdeforms", PSDEFormDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体表单 [PSDEFORM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEFormDTO> searchAllPSDEForms(PSDEFormFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEFORM, "psdeforms", PSDEFormDTO.class, iSearchContext);
	}

    /**
     * 建立 实体表格 [PSDEGRID]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEGrid(PSDEGridDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEGRID, "psdegrids", PSDEGridDTO.class, dto);
	}

    /**
     * 批建立 实体表格 [PSDEGRID]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEGrids(List<PSDEGridDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEGRID, "psdegrids", dtoList);
	}

    /**
     * 更新 实体表格 [PSDEGRID]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEGrid(PSDEGridDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEGRID, "psdegrids", PSDEGridDTO.class, dto);
	}

    /**
     * 批更新 实体表格 [PSDEGRID]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEGrids(List<PSDEGridDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEGRID, "psdegrids", dtoList);
	}

    /**
     * 获取 实体表格 [PSDEGRID]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEGridDTO getPSDEGrid(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEGRID, "psdegrids", PSDEGridDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体表格 [PSDEGRID]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEGrid(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEGRID, "psdegrids", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体表格 [PSDEGRID]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEGridDTO> searchPSDEGrids(PSDEGridFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEGRID, "psdegrids", PSDEGridDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体表格 [PSDEGRID]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEGridDTO> searchAllPSDEGrids(PSDEGridFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEGRID, "psdegrids", PSDEGridDTO.class, iSearchContext);
	}

    /**
     * 建立 实体组 [PSDEGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEGroup(PSDEGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEGROUP, "psdegroups", PSDEGroupDTO.class, dto);
	}

    /**
     * 批建立 实体组 [PSDEGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEGroups(List<PSDEGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEGROUP, "psdegroups", dtoList);
	}

    /**
     * 更新 实体组 [PSDEGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEGroup(PSDEGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEGROUP, "psdegroups", PSDEGroupDTO.class, dto);
	}

    /**
     * 批更新 实体组 [PSDEGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEGroups(List<PSDEGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEGROUP, "psdegroups", dtoList);
	}

    /**
     * 获取 实体组 [PSDEGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEGroupDTO getPSDEGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEGROUP, "psdegroups", PSDEGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体组 [PSDEGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEGROUP, "psdegroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体组 [PSDEGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEGroupDTO> searchPSDEGroups(PSDEGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEGROUP, "psdegroups", PSDEGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体组 [PSDEGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEGroupDTO> searchAllPSDEGroups(PSDEGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEGROUP, "psdegroups", PSDEGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体列表 [PSDELIST]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEList(PSDEListDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDELIST, "psdelists", PSDEListDTO.class, dto);
	}

    /**
     * 批建立 实体列表 [PSDELIST]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDELists(List<PSDEListDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDELIST, "psdelists", dtoList);
	}

    /**
     * 更新 实体列表 [PSDELIST]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEList(PSDEListDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDELIST, "psdelists", PSDEListDTO.class, dto);
	}

    /**
     * 批更新 实体列表 [PSDELIST]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDELists(List<PSDEListDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDELIST, "psdelists", dtoList);
	}

    /**
     * 获取 实体列表 [PSDELIST]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEListDTO getPSDEList(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDELIST, "psdelists", PSDEListDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体列表 [PSDELIST]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEList(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDELIST, "psdelists", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体列表 [PSDELIST]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEListDTO> searchPSDELists(PSDEListFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDELIST, "psdelists", PSDEListDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体列表 [PSDELIST]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEListDTO> searchAllPSDELists(PSDEListFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDELIST, "psdelists", PSDEListDTO.class, iSearchContext);
	}

    /**
     * 建立 实体处理逻辑 [PSDELOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDELogic(PSDELogicDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDELOGIC, "psdelogics", PSDELogicDTO.class, dto);
	}

    /**
     * 批建立 实体处理逻辑 [PSDELOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDELogics(List<PSDELogicDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDELOGIC, "psdelogics", dtoList);
	}

    /**
     * 更新 实体处理逻辑 [PSDELOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDELogic(PSDELogicDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDELOGIC, "psdelogics", PSDELogicDTO.class, dto);
	}

    /**
     * 批更新 实体处理逻辑 [PSDELOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDELogics(List<PSDELogicDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDELOGIC, "psdelogics", dtoList);
	}

    /**
     * 获取 实体处理逻辑 [PSDELOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDELogicDTO getPSDELogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDELOGIC, "psdelogics", PSDELogicDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体处理逻辑 [PSDELOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDELogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDELOGIC, "psdelogics", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体处理逻辑 [PSDELOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDELogicDTO> searchPSDELogics(PSDELogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDELOGIC, "psdelogics", PSDELogicDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体处理逻辑 [PSDELOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDELogicDTO> searchAllPSDELogics(PSDELogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDELOGIC, "psdelogics", PSDELogicDTO.class, iSearchContext);
	}

    /**
     * 建立 实体主状态 [PSDEMAINSTATE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEMainState(PSDEMainStateDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEMAINSTATE, "psdemainstates", PSDEMainStateDTO.class, dto);
	}

    /**
     * 批建立 实体主状态 [PSDEMAINSTATE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEMainStates(List<PSDEMainStateDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEMAINSTATE, "psdemainstates", dtoList);
	}

    /**
     * 更新 实体主状态 [PSDEMAINSTATE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEMainState(PSDEMainStateDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAINSTATE, "psdemainstates", PSDEMainStateDTO.class, dto);
	}

    /**
     * 批更新 实体主状态 [PSDEMAINSTATE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEMainStates(List<PSDEMainStateDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAINSTATE, "psdemainstates", dtoList);
	}

    /**
     * 获取 实体主状态 [PSDEMAINSTATE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEMainStateDTO getPSDEMainState(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEMAINSTATE, "psdemainstates", PSDEMainStateDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体主状态 [PSDEMAINSTATE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEMainState(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEMAINSTATE, "psdemainstates", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体主状态 [PSDEMAINSTATE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEMainStateDTO> searchPSDEMainStates(PSDEMainStateFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEMAINSTATE, "psdemainstates", PSDEMainStateDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体主状态 [PSDEMAINSTATE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEMainStateDTO> searchAllPSDEMainStates(PSDEMainStateFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEMAINSTATE, "psdemainstates", PSDEMainStateDTO.class, iSearchContext);
	}

    /**
     * 建立 实体映射 [PSDEMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEMap(PSDEMapDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEMAP, "psdemaps", PSDEMapDTO.class, dto);
	}

    /**
     * 批建立 实体映射 [PSDEMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEMaps(List<PSDEMapDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEMAP, "psdemaps", dtoList);
	}

    /**
     * 更新 实体映射 [PSDEMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEMap(PSDEMapDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAP, "psdemaps", PSDEMapDTO.class, dto);
	}

    /**
     * 批更新 实体映射 [PSDEMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEMaps(List<PSDEMapDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAP, "psdemaps", dtoList);
	}

    /**
     * 获取 实体映射 [PSDEMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEMapDTO getPSDEMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEMAP, "psdemaps", PSDEMapDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体映射 [PSDEMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEMAP, "psdemaps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体映射 [PSDEMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEMapDTO> searchPSDEMaps(PSDEMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEMAP, "psdemaps", PSDEMapDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体映射 [PSDEMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEMapDTO> searchAllPSDEMaps(PSDEMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEMAP, "psdemaps", PSDEMapDTO.class, iSearchContext);
	}

    /**
     * 建立 实体映射行为 [PSDEMAPACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEMapAction(PSDEMapActionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPACTION, "psdemapactions", PSDEMapActionDTO.class, dto);
	}

    /**
     * 批建立 实体映射行为 [PSDEMAPACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEMapActions(List<PSDEMapActionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPACTION, "psdemapactions", dtoList);
	}

    /**
     * 更新 实体映射行为 [PSDEMAPACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEMapAction(PSDEMapActionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPACTION, "psdemapactions", PSDEMapActionDTO.class, dto);
	}

    /**
     * 批更新 实体映射行为 [PSDEMAPACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEMapActions(List<PSDEMapActionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPACTION, "psdemapactions", dtoList);
	}

    /**
     * 获取 实体映射行为 [PSDEMAPACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEMapActionDTO getPSDEMapAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEMAPACTION, "psdemapactions", PSDEMapActionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体映射行为 [PSDEMAPACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEMapAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEMAPACTION, "psdemapactions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体映射行为 [PSDEMAPACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEMapActionDTO> searchPSDEMapActions(PSDEMapActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEMAPACTION, "psdemapactions", PSDEMapActionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体映射行为 [PSDEMAPACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEMapActionDTO> searchAllPSDEMapActions(PSDEMapActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEMAPACTION, "psdemapactions", PSDEMapActionDTO.class, iSearchContext);
	}

    /**
     * 建立 实体映射查询 [PSDEMAPDQ]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEMapDQ(PSDEMapDQDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPDQ, "psdemapdqs", PSDEMapDQDTO.class, dto);
	}

    /**
     * 批建立 实体映射查询 [PSDEMAPDQ]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEMapDQs(List<PSDEMapDQDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPDQ, "psdemapdqs", dtoList);
	}

    /**
     * 更新 实体映射查询 [PSDEMAPDQ]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEMapDQ(PSDEMapDQDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPDQ, "psdemapdqs", PSDEMapDQDTO.class, dto);
	}

    /**
     * 批更新 实体映射查询 [PSDEMAPDQ]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEMapDQs(List<PSDEMapDQDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPDQ, "psdemapdqs", dtoList);
	}

    /**
     * 获取 实体映射查询 [PSDEMAPDQ]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEMapDQDTO getPSDEMapDQ(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEMAPDQ, "psdemapdqs", PSDEMapDQDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体映射查询 [PSDEMAPDQ]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEMapDQ(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEMAPDQ, "psdemapdqs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体映射查询 [PSDEMAPDQ]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEMapDQDTO> searchPSDEMapDQs(PSDEMapDQFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEMAPDQ, "psdemapdqs", PSDEMapDQDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体映射查询 [PSDEMAPDQ]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEMapDQDTO> searchAllPSDEMapDQs(PSDEMapDQFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEMAPDQ, "psdemapdqs", PSDEMapDQDTO.class, iSearchContext);
	}

    /**
     * 建立 实体映射数据集合 [PSDEMAPDS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEMapDS(PSDEMapDSDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPDS, "psdemapds", PSDEMapDSDTO.class, dto);
	}

    /**
     * 批建立 实体映射数据集合 [PSDEMAPDS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEMapDs(List<PSDEMapDSDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPDS, "psdemapds", dtoList);
	}

    /**
     * 更新 实体映射数据集合 [PSDEMAPDS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEMapDS(PSDEMapDSDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPDS, "psdemapds", PSDEMapDSDTO.class, dto);
	}

    /**
     * 批更新 实体映射数据集合 [PSDEMAPDS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEMapDs(List<PSDEMapDSDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPDS, "psdemapds", dtoList);
	}

    /**
     * 获取 实体映射数据集合 [PSDEMAPDS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEMapDSDTO getPSDEMapDS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEMAPDS, "psdemapds", PSDEMapDSDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体映射数据集合 [PSDEMAPDS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEMapDS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEMAPDS, "psdemapds", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体映射数据集合 [PSDEMAPDS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEMapDSDTO> searchPSDEMapDs(PSDEMapDSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEMAPDS, "psdemapds", PSDEMapDSDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体映射数据集合 [PSDEMAPDS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEMapDSDTO> searchAllPSDEMapDs(PSDEMapDSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEMAPDS, "psdemapds", PSDEMapDSDTO.class, iSearchContext);
	}

    /**
     * 建立 实体映射属性 [PSDEMAPDETAIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEMapDetail(PSDEMapDetailDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPDETAIL, "psdemapdetails", PSDEMapDetailDTO.class, dto);
	}

    /**
     * 批建立 实体映射属性 [PSDEMAPDETAIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEMapDetails(List<PSDEMapDetailDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEMAPDETAIL, "psdemapdetails", dtoList);
	}

    /**
     * 更新 实体映射属性 [PSDEMAPDETAIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEMapDetail(PSDEMapDetailDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPDETAIL, "psdemapdetails", PSDEMapDetailDTO.class, dto);
	}

    /**
     * 批更新 实体映射属性 [PSDEMAPDETAIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEMapDetails(List<PSDEMapDetailDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEMAPDETAIL, "psdemapdetails", dtoList);
	}

    /**
     * 获取 实体映射属性 [PSDEMAPDETAIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEMapDetailDTO getPSDEMapDetail(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEMAPDETAIL, "psdemapdetails", PSDEMapDetailDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体映射属性 [PSDEMAPDETAIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEMapDetail(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEMAPDETAIL, "psdemapdetails", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体映射属性 [PSDEMAPDETAIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEMapDetailDTO> searchPSDEMapDetails(PSDEMapDetailFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEMAPDETAIL, "psdemapdetails", PSDEMapDetailDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体映射属性 [PSDEMAPDETAIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEMapDetailDTO> searchAllPSDEMapDetails(PSDEMapDetailFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEMAPDETAIL, "psdemapdetails", PSDEMapDetailDTO.class, iSearchContext);
	}

    /**
     * 建立 实体通知 [PSDENOTIFY]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDENotify(PSDENotifyDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDENOTIFY, "psdenotifies", PSDENotifyDTO.class, dto);
	}

    /**
     * 批建立 实体通知 [PSDENOTIFY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDENotifies(List<PSDENotifyDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDENOTIFY, "psdenotifies", dtoList);
	}

    /**
     * 更新 实体通知 [PSDENOTIFY]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDENotify(PSDENotifyDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDENOTIFY, "psdenotifies", PSDENotifyDTO.class, dto);
	}

    /**
     * 批更新 实体通知 [PSDENOTIFY]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDENotifies(List<PSDENotifyDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDENOTIFY, "psdenotifies", dtoList);
	}

    /**
     * 获取 实体通知 [PSDENOTIFY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDENotifyDTO getPSDENotify(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDENOTIFY, "psdenotifies", PSDENotifyDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体通知 [PSDENOTIFY]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDENotify(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDENOTIFY, "psdenotifies", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体通知 [PSDENOTIFY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDENotifyDTO> searchPSDENotifies(PSDENotifyFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDENOTIFY, "psdenotifies", PSDENotifyDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体通知 [PSDENOTIFY]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDENotifyDTO> searchAllPSDENotifies(PSDENotifyFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDENOTIFY, "psdenotifies", PSDENotifyDTO.class, iSearchContext);
	}

    /**
     * 建立 实体操作标识 [PSDEOPPRIV]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEOPPriv(PSDEOPPrivDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEOPPRIV, "psdeopprivs", PSDEOPPrivDTO.class, dto);
	}

    /**
     * 批建立 实体操作标识 [PSDEOPPRIV]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEOPPrivs(List<PSDEOPPrivDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEOPPRIV, "psdeopprivs", dtoList);
	}

    /**
     * 更新 实体操作标识 [PSDEOPPRIV]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEOPPriv(PSDEOPPrivDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEOPPRIV, "psdeopprivs", PSDEOPPrivDTO.class, dto);
	}

    /**
     * 批更新 实体操作标识 [PSDEOPPRIV]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEOPPrivs(List<PSDEOPPrivDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEOPPRIV, "psdeopprivs", dtoList);
	}

    /**
     * 获取 实体操作标识 [PSDEOPPRIV]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEOPPrivDTO getPSDEOPPriv(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEOPPRIV, "psdeopprivs", PSDEOPPrivDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体操作标识 [PSDEOPPRIV]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEOPPriv(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEOPPRIV, "psdeopprivs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体操作标识 [PSDEOPPRIV]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEOPPrivDTO> searchPSDEOPPrivs(PSDEOPPrivFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEOPPRIV, "psdeopprivs", PSDEOPPrivDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体操作标识 [PSDEOPPRIV]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEOPPrivDTO> searchAllPSDEOPPrivs(PSDEOPPrivFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEOPPRIV, "psdeopprivs", PSDEOPPrivDTO.class, iSearchContext);
	}

    /**
     * 建立 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEOPPrivRole(PSDEOPPrivRoleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", PSDEOPPrivRoleDTO.class, dto);
	}

    /**
     * 批建立 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEOPPrivRoles(List<PSDEOPPrivRoleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", dtoList);
	}

    /**
     * 更新 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEOPPrivRole(PSDEOPPrivRoleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", PSDEOPPrivRoleDTO.class, dto);
	}

    /**
     * 批更新 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEOPPrivRoles(List<PSDEOPPrivRoleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", dtoList);
	}

    /**
     * 获取 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEOPPrivRoleDTO getPSDEOPPrivRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", PSDEOPPrivRoleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEOPPrivRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEOPPrivRoleDTO> searchPSDEOPPrivRoles(PSDEOPPrivRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", PSDEOPPrivRoleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体操作标识角色 [PSDEOPPRIVROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEOPPrivRoleDTO> searchAllPSDEOPPrivRoles(PSDEOPPrivRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEOPPRIVROLE, "psdeopprivroles", PSDEOPPrivRoleDTO.class, iSearchContext);
	}

    /**
     * 建立 实体打印 [PSDEPRINT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEPrint(PSDEPrintDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEPRINT, "psdeprints", PSDEPrintDTO.class, dto);
	}

    /**
     * 批建立 实体打印 [PSDEPRINT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEPrints(List<PSDEPrintDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEPRINT, "psdeprints", dtoList);
	}

    /**
     * 更新 实体打印 [PSDEPRINT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEPrint(PSDEPrintDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEPRINT, "psdeprints", PSDEPrintDTO.class, dto);
	}

    /**
     * 批更新 实体打印 [PSDEPRINT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEPrints(List<PSDEPrintDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEPRINT, "psdeprints", dtoList);
	}

    /**
     * 获取 实体打印 [PSDEPRINT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEPrintDTO getPSDEPrint(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEPRINT, "psdeprints", PSDEPrintDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体打印 [PSDEPRINT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEPrint(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEPRINT, "psdeprints", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体打印 [PSDEPRINT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEPrintDTO> searchPSDEPrints(PSDEPrintFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEPRINT, "psdeprints", PSDEPrintDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体打印 [PSDEPRINT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEPrintDTO> searchAllPSDEPrints(PSDEPrintFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEPRINT, "psdeprints", PSDEPrintDTO.class, iSearchContext);
	}

    /**
     * 建立 实体关系属性映射 [PSDERDEFMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDERDEFMap(PSDERDEFMapDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDERDEFMAP, "psderdefmaps", PSDERDEFMapDTO.class, dto);
	}

    /**
     * 批建立 实体关系属性映射 [PSDERDEFMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDERDEFMaps(List<PSDERDEFMapDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDERDEFMAP, "psderdefmaps", dtoList);
	}

    /**
     * 更新 实体关系属性映射 [PSDERDEFMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDERDEFMap(PSDERDEFMapDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDERDEFMAP, "psderdefmaps", PSDERDEFMapDTO.class, dto);
	}

    /**
     * 批更新 实体关系属性映射 [PSDERDEFMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDERDEFMaps(List<PSDERDEFMapDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDERDEFMAP, "psderdefmaps", dtoList);
	}

    /**
     * 获取 实体关系属性映射 [PSDERDEFMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDERDEFMapDTO getPSDERDEFMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDERDEFMAP, "psderdefmaps", PSDERDEFMapDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体关系属性映射 [PSDERDEFMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDERDEFMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDERDEFMAP, "psderdefmaps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体关系属性映射 [PSDERDEFMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDERDEFMapDTO> searchPSDERDEFMaps(PSDERDEFMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDERDEFMAP, "psderdefmaps", PSDERDEFMapDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体关系属性映射 [PSDERDEFMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDERDEFMapDTO> searchAllPSDERDEFMaps(PSDERDEFMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDERDEFMAP, "psderdefmaps", PSDERDEFMapDTO.class, iSearchContext);
	}

    /**
     * 建立 实体关系组 [PSDERGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDERGroup(PSDERGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDERGROUP, "psdergroups", PSDERGroupDTO.class, dto);
	}

    /**
     * 批建立 实体关系组 [PSDERGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDERGroups(List<PSDERGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDERGROUP, "psdergroups", dtoList);
	}

    /**
     * 更新 实体关系组 [PSDERGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDERGroup(PSDERGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDERGROUP, "psdergroups", PSDERGroupDTO.class, dto);
	}

    /**
     * 批更新 实体关系组 [PSDERGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDERGroups(List<PSDERGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDERGROUP, "psdergroups", dtoList);
	}

    /**
     * 获取 实体关系组 [PSDERGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDERGroupDTO getPSDERGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDERGROUP, "psdergroups", PSDERGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体关系组 [PSDERGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDERGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDERGROUP, "psdergroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体关系组 [PSDERGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDERGroupDTO> searchPSDERGroups(PSDERGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDERGROUP, "psdergroups", PSDERGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体关系组 [PSDERGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDERGroupDTO> searchAllPSDERGroups(PSDERGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDERGROUP, "psdergroups", PSDERGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体报表 [PSDEREPORT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEReport(PSDEReportDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEREPORT, "psdereports", PSDEReportDTO.class, dto);
	}

    /**
     * 批建立 实体报表 [PSDEREPORT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEReports(List<PSDEReportDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEREPORT, "psdereports", dtoList);
	}

    /**
     * 更新 实体报表 [PSDEREPORT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEReport(PSDEReportDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEREPORT, "psdereports", PSDEReportDTO.class, dto);
	}

    /**
     * 批更新 实体报表 [PSDEREPORT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEReports(List<PSDEReportDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEREPORT, "psdereports", dtoList);
	}

    /**
     * 获取 实体报表 [PSDEREPORT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEReportDTO getPSDEReport(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEREPORT, "psdereports", PSDEReportDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体报表 [PSDEREPORT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEReport(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEREPORT, "psdereports", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体报表 [PSDEREPORT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEReportDTO> searchPSDEReports(PSDEReportFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEREPORT, "psdereports", PSDEReportDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体报表 [PSDEREPORT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEReportDTO> searchAllPSDEReports(PSDEReportFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEREPORT, "psdereports", PSDEReportDTO.class, iSearchContext);
	}

    /**
     * 建立 实体服务接口成员 [PSDESADETAIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDESADetail(PSDESADetailDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDESADETAIL, "psdesadetails", PSDESADetailDTO.class, dto);
	}

    /**
     * 批建立 实体服务接口成员 [PSDESADETAIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDESADetails(List<PSDESADetailDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDESADETAIL, "psdesadetails", dtoList);
	}

    /**
     * 更新 实体服务接口成员 [PSDESADETAIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDESADetail(PSDESADetailDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDESADETAIL, "psdesadetails", PSDESADetailDTO.class, dto);
	}

    /**
     * 批更新 实体服务接口成员 [PSDESADETAIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDESADetails(List<PSDESADetailDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDESADETAIL, "psdesadetails", dtoList);
	}

    /**
     * 获取 实体服务接口成员 [PSDESADETAIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDESADetailDTO getPSDESADetail(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDESADETAIL, "psdesadetails", PSDESADetailDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体服务接口成员 [PSDESADETAIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDESADetail(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDESADETAIL, "psdesadetails", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体服务接口成员 [PSDESADETAIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDESADetailDTO> searchPSDESADetails(PSDESADetailFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDESADETAIL, "psdesadetails", PSDESADetailDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体服务接口成员 [PSDESADETAIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDESADetailDTO> searchAllPSDESADetails(PSDESADetailFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDESADETAIL, "psdesadetails", PSDESADetailDTO.class, iSearchContext);
	}

    /**
     * 建立 实体服务接口关系 [PSDESARS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDESARS(PSDESARSDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDESARS, "psdesars", PSDESARSDTO.class, dto);
	}

    /**
     * 批建立 实体服务接口关系 [PSDESARS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDESARs(List<PSDESARSDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDESARS, "psdesars", dtoList);
	}

    /**
     * 更新 实体服务接口关系 [PSDESARS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDESARS(PSDESARSDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDESARS, "psdesars", PSDESARSDTO.class, dto);
	}

    /**
     * 批更新 实体服务接口关系 [PSDESARS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDESARs(List<PSDESARSDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDESARS, "psdesars", dtoList);
	}

    /**
     * 获取 实体服务接口关系 [PSDESARS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDESARSDTO getPSDESARS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDESARS, "psdesars", PSDESARSDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体服务接口关系 [PSDESARS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDESARS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDESARS, "psdesars", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体服务接口关系 [PSDESARS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDESARSDTO> searchPSDESARs(PSDESARSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDESARS, "psdesars", PSDESARSDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体服务接口关系 [PSDESARS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDESARSDTO> searchAllPSDESARs(PSDESARSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDESARS, "psdesars", PSDESARSDTO.class, iSearchContext);
	}

    /**
     * 建立 实体接口值规则 [PSDESAVR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDESAVR(PSDESAVRDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDESAVR, "psdesavrs", PSDESAVRDTO.class, dto);
	}

    /**
     * 批建立 实体接口值规则 [PSDESAVR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDESAVRs(List<PSDESAVRDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDESAVR, "psdesavrs", dtoList);
	}

    /**
     * 更新 实体接口值规则 [PSDESAVR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDESAVR(PSDESAVRDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDESAVR, "psdesavrs", PSDESAVRDTO.class, dto);
	}

    /**
     * 批更新 实体接口值规则 [PSDESAVR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDESAVRs(List<PSDESAVRDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDESAVR, "psdesavrs", dtoList);
	}

    /**
     * 获取 实体接口值规则 [PSDESAVR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDESAVRDTO getPSDESAVR(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDESAVR, "psdesavrs", PSDESAVRDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体接口值规则 [PSDESAVR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDESAVR(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDESAVR, "psdesavrs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体接口值规则 [PSDESAVR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDESAVRDTO> searchPSDESAVRs(PSDESAVRFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDESAVR, "psdesavrs", PSDESAVRDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体接口值规则 [PSDESAVR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDESAVRDTO> searchAllPSDESAVRs(PSDESAVRFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDESAVR, "psdesavrs", PSDESAVRDTO.class, iSearchContext);
	}

    /**
     * 建立 实体示例数据 [PSDESAMPLEDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDESampleData(PSDESampleDataDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDESAMPLEDATA, "psdesampledata", PSDESampleDataDTO.class, dto);
	}

    /**
     * 批建立 实体示例数据 [PSDESAMPLEDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDESampleData(List<PSDESampleDataDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDESAMPLEDATA, "psdesampledata", dtoList);
	}

    /**
     * 更新 实体示例数据 [PSDESAMPLEDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDESampleData(PSDESampleDataDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDESAMPLEDATA, "psdesampledata", PSDESampleDataDTO.class, dto);
	}

    /**
     * 批更新 实体示例数据 [PSDESAMPLEDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDESampleData(List<PSDESampleDataDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDESAMPLEDATA, "psdesampledata", dtoList);
	}

    /**
     * 获取 实体示例数据 [PSDESAMPLEDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDESampleDataDTO getPSDESampleData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDESAMPLEDATA, "psdesampledata", PSDESampleDataDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体示例数据 [PSDESAMPLEDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDESampleData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDESAMPLEDATA, "psdesampledata", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体示例数据 [PSDESAMPLEDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDESampleDataDTO> searchPSDESampleData(PSDESampleDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDESAMPLEDATA, "psdesampledata", PSDESampleDataDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体示例数据 [PSDESAMPLEDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDESampleDataDTO> searchAllPSDESampleData(PSDESampleDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDESAMPLEDATA, "psdesampledata", PSDESampleDataDTO.class, iSearchContext);
	}

    /**
     * 建立 实体服务接口 [PSDESERVICEAPI]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEServiceAPI(PSDEServiceAPIDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDESERVICEAPI, "psdeserviceapis", PSDEServiceAPIDTO.class, dto);
	}

    /**
     * 批建立 实体服务接口 [PSDESERVICEAPI]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEServiceAPIs(List<PSDEServiceAPIDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDESERVICEAPI, "psdeserviceapis", dtoList);
	}

    /**
     * 更新 实体服务接口 [PSDESERVICEAPI]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEServiceAPI(PSDEServiceAPIDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDESERVICEAPI, "psdeserviceapis", PSDEServiceAPIDTO.class, dto);
	}

    /**
     * 批更新 实体服务接口 [PSDESERVICEAPI]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEServiceAPIs(List<PSDEServiceAPIDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDESERVICEAPI, "psdeserviceapis", dtoList);
	}

    /**
     * 获取 实体服务接口 [PSDESERVICEAPI]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEServiceAPIDTO getPSDEServiceAPI(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDESERVICEAPI, "psdeserviceapis", PSDEServiceAPIDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体服务接口 [PSDESERVICEAPI]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEServiceAPI(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDESERVICEAPI, "psdeserviceapis", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体服务接口 [PSDESERVICEAPI]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEServiceAPIDTO> searchPSDEServiceAPIs(PSDEServiceAPIFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDESERVICEAPI, "psdeserviceapis", PSDEServiceAPIDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体服务接口 [PSDESERVICEAPI]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEServiceAPIDTO> searchAllPSDEServiceAPIs(PSDEServiceAPIFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDESERVICEAPI, "psdeserviceapis", PSDEServiceAPIDTO.class, iSearchContext);
	}

    /**
     * 建立 实体数据库表 [PSDEDBTABLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEDBTable(PSDEDBTableDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEDBTABLE, "psdetables", PSDEDBTableDTO.class, dto);
	}

    /**
     * 批建立 实体数据库表 [PSDEDBTABLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEDBTables(List<PSDEDBTableDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEDBTABLE, "psdetables", dtoList);
	}

    /**
     * 更新 实体数据库表 [PSDEDBTABLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEDBTable(PSDEDBTableDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEDBTABLE, "psdetables", PSDEDBTableDTO.class, dto);
	}

    /**
     * 批更新 实体数据库表 [PSDEDBTABLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEDBTables(List<PSDEDBTableDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEDBTABLE, "psdetables", dtoList);
	}

    /**
     * 获取 实体数据库表 [PSDEDBTABLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEDBTableDTO getPSDEDBTable(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEDBTABLE, "psdetables", PSDEDBTableDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体数据库表 [PSDEDBTABLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEDBTable(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEDBTABLE, "psdetables", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体数据库表 [PSDEDBTABLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEDBTableDTO> searchPSDEDBTables(PSDEDBTableFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEDBTABLE, "psdetables", PSDEDBTableDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体数据库表 [PSDEDBTABLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEDBTableDTO> searchAllPSDEDBTables(PSDEDBTableFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEDBTABLE, "psdetables", PSDEDBTableDTO.class, iSearchContext);
	}

    /**
     * 建立 实体工具栏 [PSDETOOLBAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEToolbar(PSDEToolbarDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDETOOLBAR, "psdetoolbars", PSDEToolbarDTO.class, dto);
	}

    /**
     * 批建立 实体工具栏 [PSDETOOLBAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEToolbars(List<PSDEToolbarDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDETOOLBAR, "psdetoolbars", dtoList);
	}

    /**
     * 更新 实体工具栏 [PSDETOOLBAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEToolbar(PSDEToolbarDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDETOOLBAR, "psdetoolbars", PSDEToolbarDTO.class, dto);
	}

    /**
     * 批更新 实体工具栏 [PSDETOOLBAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEToolbars(List<PSDEToolbarDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDETOOLBAR, "psdetoolbars", dtoList);
	}

    /**
     * 获取 实体工具栏 [PSDETOOLBAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEToolbarDTO getPSDEToolbar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDETOOLBAR, "psdetoolbars", PSDEToolbarDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体工具栏 [PSDETOOLBAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEToolbar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDETOOLBAR, "psdetoolbars", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体工具栏 [PSDETOOLBAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEToolbarDTO> searchPSDEToolbars(PSDEToolbarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDETOOLBAR, "psdetoolbars", PSDEToolbarDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体工具栏 [PSDETOOLBAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEToolbarDTO> searchAllPSDEToolbars(PSDEToolbarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDETOOLBAR, "psdetoolbars", PSDEToolbarDTO.class, iSearchContext);
	}

    /**
     * 建立 实体树视图 [PSDETREEVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDETreeView(PSDETreeViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDETREEVIEW, "psdetreeviews", PSDETreeViewDTO.class, dto);
	}

    /**
     * 批建立 实体树视图 [PSDETREEVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDETreeViews(List<PSDETreeViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDETREEVIEW, "psdetreeviews", dtoList);
	}

    /**
     * 更新 实体树视图 [PSDETREEVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDETreeView(PSDETreeViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDETREEVIEW, "psdetreeviews", PSDETreeViewDTO.class, dto);
	}

    /**
     * 批更新 实体树视图 [PSDETREEVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDETreeViews(List<PSDETreeViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDETREEVIEW, "psdetreeviews", dtoList);
	}

    /**
     * 获取 实体树视图 [PSDETREEVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDETreeViewDTO getPSDETreeView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDETREEVIEW, "psdetreeviews", PSDETreeViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体树视图 [PSDETREEVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDETreeView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDETREEVIEW, "psdetreeviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体树视图 [PSDETREEVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDETreeViewDTO> searchPSDETreeViews(PSDETreeViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDETREEVIEW, "psdetreeviews", PSDETreeViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体树视图 [PSDETREEVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDETreeViewDTO> searchAllPSDETreeViews(PSDETreeViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDETREEVIEW, "psdetreeviews", PSDETreeViewDTO.class, iSearchContext);
	}

    /**
     * 建立 实体界面行为组 [PSDEUAGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEUAGroup(PSDEUAGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEUAGROUP, "psdeuagroups", PSDEUAGroupDTO.class, dto);
	}

    /**
     * 批建立 实体界面行为组 [PSDEUAGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEUAGroups(List<PSDEUAGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEUAGROUP, "psdeuagroups", dtoList);
	}

    /**
     * 更新 实体界面行为组 [PSDEUAGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEUAGroup(PSDEUAGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEUAGROUP, "psdeuagroups", PSDEUAGroupDTO.class, dto);
	}

    /**
     * 批更新 实体界面行为组 [PSDEUAGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEUAGroups(List<PSDEUAGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEUAGROUP, "psdeuagroups", dtoList);
	}

    /**
     * 获取 实体界面行为组 [PSDEUAGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEUAGroupDTO getPSDEUAGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEUAGROUP, "psdeuagroups", PSDEUAGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体界面行为组 [PSDEUAGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEUAGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEUAGROUP, "psdeuagroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体界面行为组 [PSDEUAGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEUAGroupDTO> searchPSDEUAGroups(PSDEUAGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEUAGROUP, "psdeuagroups", PSDEUAGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体界面行为组 [PSDEUAGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEUAGroupDTO> searchAllPSDEUAGroups(PSDEUAGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEUAGROUP, "psdeuagroups", PSDEUAGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体界面行为 [PSDEUIACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEUIAction(PSDEUIActionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEUIACTION, "psdeuiactions", PSDEUIActionDTO.class, dto);
	}

    /**
     * 批建立 实体界面行为 [PSDEUIACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEUIActions(List<PSDEUIActionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEUIACTION, "psdeuiactions", dtoList);
	}

    /**
     * 更新 实体界面行为 [PSDEUIACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEUIAction(PSDEUIActionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEUIACTION, "psdeuiactions", PSDEUIActionDTO.class, dto);
	}

    /**
     * 批更新 实体界面行为 [PSDEUIACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEUIActions(List<PSDEUIActionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEUIACTION, "psdeuiactions", dtoList);
	}

    /**
     * 获取 实体界面行为 [PSDEUIACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEUIActionDTO getPSDEUIAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEUIACTION, "psdeuiactions", PSDEUIActionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体界面行为 [PSDEUIACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEUIAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEUIACTION, "psdeuiactions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体界面行为 [PSDEUIACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEUIActionDTO> searchPSDEUIActions(PSDEUIActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEUIACTION, "psdeuiactions", PSDEUIActionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体界面行为 [PSDEUIACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEUIActionDTO> searchAllPSDEUIActions(PSDEUIActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEUIACTION, "psdeuiactions", PSDEUIActionDTO.class, iSearchContext);
	}

    /**
     * 建立 实体操作角色 [PSDEUSERROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEUserRole(PSDEUserRoleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEUSERROLE, "psdeuserroles", PSDEUserRoleDTO.class, dto);
	}

    /**
     * 批建立 实体操作角色 [PSDEUSERROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEUserRoles(List<PSDEUserRoleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEUSERROLE, "psdeuserroles", dtoList);
	}

    /**
     * 更新 实体操作角色 [PSDEUSERROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEUserRole(PSDEUserRoleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEUSERROLE, "psdeuserroles", PSDEUserRoleDTO.class, dto);
	}

    /**
     * 批更新 实体操作角色 [PSDEUSERROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEUserRoles(List<PSDEUserRoleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEUSERROLE, "psdeuserroles", dtoList);
	}

    /**
     * 获取 实体操作角色 [PSDEUSERROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEUserRoleDTO getPSDEUserRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEUSERROLE, "psdeuserroles", PSDEUserRoleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体操作角色 [PSDEUSERROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEUserRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEUSERROLE, "psdeuserroles", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体操作角色 [PSDEUSERROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEUserRoleDTO> searchPSDEUserRoles(PSDEUserRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEUSERROLE, "psdeuserroles", PSDEUserRoleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体操作角色 [PSDEUSERROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEUserRoleDTO> searchAllPSDEUserRoles(PSDEUserRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEUSERROLE, "psdeuserroles", PSDEUserRoleDTO.class, iSearchContext);
	}

    /**
     * 建立 实体功能配置 [PSDEUTIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEUtil(PSDEUtilDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEUTIL, "psdeutildes", PSDEUtilDTO.class, dto);
	}

    /**
     * 批建立 实体功能配置 [PSDEUTIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEUtils(List<PSDEUtilDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEUTIL, "psdeutildes", dtoList);
	}

    /**
     * 更新 实体功能配置 [PSDEUTIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEUtil(PSDEUtilDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEUTIL, "psdeutildes", PSDEUtilDTO.class, dto);
	}

    /**
     * 批更新 实体功能配置 [PSDEUTIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEUtils(List<PSDEUtilDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEUTIL, "psdeutildes", dtoList);
	}

    /**
     * 获取 实体功能配置 [PSDEUTIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEUtilDTO getPSDEUtil(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEUTIL, "psdeutildes", PSDEUtilDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体功能配置 [PSDEUTIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEUtil(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEUTIL, "psdeutildes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体功能配置 [PSDEUTIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEUtilDTO> searchPSDEUtils(PSDEUtilFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEUTIL, "psdeutildes", PSDEUtilDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体功能配置 [PSDEUTIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEUtilDTO> searchAllPSDEUtils(PSDEUtilFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEUTIL, "psdeutildes", PSDEUtilDTO.class, iSearchContext);
	}

    /**
     * 建立 实体属性值规则组 [PSDEVRGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEVRGroup(PSDEVRGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEVRGROUP, "psdevrgroups", PSDEVRGroupDTO.class, dto);
	}

    /**
     * 批建立 实体属性值规则组 [PSDEVRGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEVRGroups(List<PSDEVRGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEVRGROUP, "psdevrgroups", dtoList);
	}

    /**
     * 更新 实体属性值规则组 [PSDEVRGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEVRGroup(PSDEVRGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEVRGROUP, "psdevrgroups", PSDEVRGroupDTO.class, dto);
	}

    /**
     * 批更新 实体属性值规则组 [PSDEVRGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEVRGroups(List<PSDEVRGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEVRGROUP, "psdevrgroups", dtoList);
	}

    /**
     * 获取 实体属性值规则组 [PSDEVRGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEVRGroupDTO getPSDEVRGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEVRGROUP, "psdevrgroups", PSDEVRGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体属性值规则组 [PSDEVRGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEVRGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEVRGROUP, "psdevrgroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体属性值规则组 [PSDEVRGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEVRGroupDTO> searchPSDEVRGroups(PSDEVRGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEVRGROUP, "psdevrgroups", PSDEVRGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体属性值规则组 [PSDEVRGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEVRGroupDTO> searchAllPSDEVRGroups(PSDEVRGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEVRGROUP, "psdevrgroups", PSDEVRGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 实体视图 [PSDEVIEWBASE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEViewBase(PSDEViewBaseDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEVIEWBASE, "psdeviewbases", PSDEViewBaseDTO.class, dto);
	}

    /**
     * 批建立 实体视图 [PSDEVIEWBASE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEViewBases(List<PSDEViewBaseDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEVIEWBASE, "psdeviewbases", dtoList);
	}

    /**
     * 更新 实体视图 [PSDEVIEWBASE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEViewBase(PSDEViewBaseDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEVIEWBASE, "psdeviewbases", PSDEViewBaseDTO.class, dto);
	}

    /**
     * 批更新 实体视图 [PSDEVIEWBASE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEViewBases(List<PSDEViewBaseDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEVIEWBASE, "psdeviewbases", dtoList);
	}

    /**
     * 获取 实体视图 [PSDEVIEWBASE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEViewBaseDTO getPSDEViewBase(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEVIEWBASE, "psdeviewbases", PSDEViewBaseDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体视图 [PSDEVIEWBASE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEViewBase(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEVIEWBASE, "psdeviewbases", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体视图 [PSDEVIEWBASE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEViewBaseDTO> searchPSDEViewBases(PSDEViewBaseFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEVIEWBASE, "psdeviewbases", PSDEViewBaseDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体视图 [PSDEVIEWBASE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEViewBaseDTO> searchAllPSDEViewBases(PSDEViewBaseFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEVIEWBASE, "psdeviewbases", PSDEViewBaseDTO.class, iSearchContext);
	}

    /**
     * 建立 实体向导 [PSDEWIZARD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEWizard(PSDEWizardDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEWIZARD, "psdewizards", PSDEWizardDTO.class, dto);
	}

    /**
     * 批建立 实体向导 [PSDEWIZARD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEWizards(List<PSDEWizardDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEWIZARD, "psdewizards", dtoList);
	}

    /**
     * 更新 实体向导 [PSDEWIZARD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEWizard(PSDEWizardDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEWIZARD, "psdewizards", PSDEWizardDTO.class, dto);
	}

    /**
     * 批更新 实体向导 [PSDEWIZARD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEWizards(List<PSDEWizardDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEWIZARD, "psdewizards", dtoList);
	}

    /**
     * 获取 实体向导 [PSDEWIZARD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEWizardDTO getPSDEWizard(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEWIZARD, "psdewizards", PSDEWizardDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体向导 [PSDEWIZARD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEWizard(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEWIZARD, "psdewizards", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体向导 [PSDEWIZARD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEWizardDTO> searchPSDEWizards(PSDEWizardFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEWIZARD, "psdewizards", PSDEWizardDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体向导 [PSDEWIZARD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEWizardDTO> searchAllPSDEWizards(PSDEWizardFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEWIZARD, "psdewizards", PSDEWizardDTO.class, iSearchContext);
	}

    /**
     * 建立 实体向导表单 [PSDEWIZARDFORM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSDEWizardForm(PSDEWizardFormDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSDEWIZARDFORM, "psdewizardforms", PSDEWizardFormDTO.class, dto);
	}

    /**
     * 批建立 实体向导表单 [PSDEWIZARDFORM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSDEWizardForms(List<PSDEWizardFormDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSDEWIZARDFORM, "psdewizardforms", dtoList);
	}

    /**
     * 更新 实体向导表单 [PSDEWIZARDFORM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSDEWizardForm(PSDEWizardFormDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSDEWIZARDFORM, "psdewizardforms", PSDEWizardFormDTO.class, dto);
	}

    /**
     * 批更新 实体向导表单 [PSDEWIZARDFORM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSDEWizardForms(List<PSDEWizardFormDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSDEWIZARDFORM, "psdewizardforms", dtoList);
	}

    /**
     * 获取 实体向导表单 [PSDEWIZARDFORM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSDEWizardFormDTO getPSDEWizardForm(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSDEWIZARDFORM, "psdewizardforms", PSDEWizardFormDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 实体向导表单 [PSDEWIZARDFORM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSDEWizardForm(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSDEWIZARDFORM, "psdewizardforms", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 实体向导表单 [PSDEWIZARDFORM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSDEWizardFormDTO> searchPSDEWizardForms(PSDEWizardFormFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSDEWIZARDFORM, "psdewizardforms", PSDEWizardFormDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 实体向导表单 [PSDEWIZARDFORM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSDEWizardFormDTO> searchAllPSDEWizardForms(PSDEWizardFormFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSDEWIZARDFORM, "psdewizardforms", PSDEWizardFormDTO.class, iSearchContext);
	}

    /**
     * 建立 平台语言 [PSLANGUAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSLanguage(PSLanguageDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSLANGUAGE, "pslanguages", PSLanguageDTO.class, dto);
	}

    /**
     * 批建立 平台语言 [PSLANGUAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSLanguages(List<PSLanguageDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSLANGUAGE, "pslanguages", dtoList);
	}

    /**
     * 更新 平台语言 [PSLANGUAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSLanguage(PSLanguageDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSLANGUAGE, "pslanguages", PSLanguageDTO.class, dto);
	}

    /**
     * 批更新 平台语言 [PSLANGUAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSLanguages(List<PSLanguageDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSLANGUAGE, "pslanguages", dtoList);
	}

    /**
     * 获取 平台语言 [PSLANGUAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSLanguageDTO getPSLanguage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSLANGUAGE, "pslanguages", PSLanguageDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 平台语言 [PSLANGUAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSLanguage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSLANGUAGE, "pslanguages", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 平台语言 [PSLANGUAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSLanguageDTO> searchPSLanguages(PSLanguageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSLANGUAGE, "pslanguages", PSLanguageDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 平台语言 [PSLANGUAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSLanguageDTO> searchAllPSLanguages(PSLanguageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSLANGUAGE, "pslanguages", PSLanguageDTO.class, iSearchContext);
	}

    /**
     * 建立 语言定义项 [PSLANGUAGEITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSLanguageItem(PSLanguageItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSLANGUAGEITEM, "pslanguageitems", PSLanguageItemDTO.class, dto);
	}

    /**
     * 批建立 语言定义项 [PSLANGUAGEITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSLanguageItems(List<PSLanguageItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSLANGUAGEITEM, "pslanguageitems", dtoList);
	}

    /**
     * 更新 语言定义项 [PSLANGUAGEITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSLanguageItem(PSLanguageItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSLANGUAGEITEM, "pslanguageitems", PSLanguageItemDTO.class, dto);
	}

    /**
     * 批更新 语言定义项 [PSLANGUAGEITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSLanguageItems(List<PSLanguageItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSLANGUAGEITEM, "pslanguageitems", dtoList);
	}

    /**
     * 获取 语言定义项 [PSLANGUAGEITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSLanguageItemDTO getPSLanguageItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSLANGUAGEITEM, "pslanguageitems", PSLanguageItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 语言定义项 [PSLANGUAGEITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSLanguageItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSLANGUAGEITEM, "pslanguageitems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 语言定义项 [PSLANGUAGEITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSLanguageItemDTO> searchPSLanguageItems(PSLanguageItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSLANGUAGEITEM, "pslanguageitems", PSLanguageItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 语言定义项 [PSLANGUAGEITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSLanguageItemDTO> searchAllPSLanguageItems(PSLanguageItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSLANGUAGEITEM, "pslanguageitems", PSLanguageItemDTO.class, iSearchContext);
	}

    /**
     * 建立 语言资源 [PSLANGUAGERES]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSLanguageRes(PSLanguageResDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSLANGUAGERES, "pslanguageres", PSLanguageResDTO.class, dto);
	}

    /**
     * 批建立 语言资源 [PSLANGUAGERES]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSLanguageRes(List<PSLanguageResDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSLANGUAGERES, "pslanguageres", dtoList);
	}

    /**
     * 更新 语言资源 [PSLANGUAGERES]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSLanguageRes(PSLanguageResDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSLANGUAGERES, "pslanguageres", PSLanguageResDTO.class, dto);
	}

    /**
     * 批更新 语言资源 [PSLANGUAGERES]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSLanguageRes(List<PSLanguageResDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSLANGUAGERES, "pslanguageres", dtoList);
	}

    /**
     * 获取 语言资源 [PSLANGUAGERES]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSLanguageResDTO getPSLanguageRes(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSLANGUAGERES, "pslanguageres", PSLanguageResDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 语言资源 [PSLANGUAGERES]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSLanguageRes(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSLANGUAGERES, "pslanguageres", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 语言资源 [PSLANGUAGERES]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSLanguageResDTO> searchPSLanguageRes(PSLanguageResFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSLANGUAGERES, "pslanguageres", PSLanguageResDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 语言资源 [PSLANGUAGERES]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSLanguageResDTO> searchAllPSLanguageRes(PSLanguageResFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSLANGUAGERES, "pslanguageres", PSLanguageResDTO.class, iSearchContext);
	}

    /**
     * 建立 移动应用打包 [PSMOBAPPPACK]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSMobAppPack(PSMobAppPackDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSMOBAPPPACK, "psmobapppacks", PSMobAppPackDTO.class, dto);
	}

    /**
     * 批建立 移动应用打包 [PSMOBAPPPACK]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSMobAppPacks(List<PSMobAppPackDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSMOBAPPPACK, "psmobapppacks", dtoList);
	}

    /**
     * 更新 移动应用打包 [PSMOBAPPPACK]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSMobAppPack(PSMobAppPackDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSMOBAPPPACK, "psmobapppacks", PSMobAppPackDTO.class, dto);
	}

    /**
     * 批更新 移动应用打包 [PSMOBAPPPACK]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSMobAppPacks(List<PSMobAppPackDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSMOBAPPPACK, "psmobapppacks", dtoList);
	}

    /**
     * 获取 移动应用打包 [PSMOBAPPPACK]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSMobAppPackDTO getPSMobAppPack(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSMOBAPPPACK, "psmobapppacks", PSMobAppPackDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 移动应用打包 [PSMOBAPPPACK]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSMobAppPack(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSMOBAPPPACK, "psmobapppacks", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 移动应用打包 [PSMOBAPPPACK]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSMobAppPackDTO> searchPSMobAppPacks(PSMobAppPackFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSMOBAPPPACK, "psmobapppacks", PSMobAppPackDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 移动应用打包 [PSMOBAPPPACK]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSMobAppPackDTO> searchAllPSMobAppPacks(PSMobAppPackFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSMOBAPPPACK, "psmobapppacks", PSMobAppPackDTO.class, iSearchContext);
	}

    /**
     * 建立 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSMobAppStartPage(PSMobAppStartPageDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", PSMobAppStartPageDTO.class, dto);
	}

    /**
     * 批建立 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSMobAppStartPages(List<PSMobAppStartPageDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", dtoList);
	}

    /**
     * 更新 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSMobAppStartPage(PSMobAppStartPageDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", PSMobAppStartPageDTO.class, dto);
	}

    /**
     * 批更新 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSMobAppStartPages(List<PSMobAppStartPageDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", dtoList);
	}

    /**
     * 获取 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSMobAppStartPageDTO getPSMobAppStartPage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", PSMobAppStartPageDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSMobAppStartPage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSMobAppStartPageDTO> searchPSMobAppStartPages(PSMobAppStartPageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", PSMobAppStartPageDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 移动应用资源 [PSMOBAPPSTARTPAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSMobAppStartPageDTO> searchAllPSMobAppStartPages(PSMobAppStartPageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSMOBAPPSTARTPAGE, "psmobappstartpages", PSMobAppStartPageDTO.class, iSearchContext);
	}

    /**
     * 建立 模型运行配置 [PSMODELRTCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSModelRTCfg(PSModelRTCfgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSMODELRTCFG, "psmodelrtcfgs", PSModelRTCfgDTO.class, dto);
	}

    /**
     * 批建立 模型运行配置 [PSMODELRTCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSModelRTCfgs(List<PSModelRTCfgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSMODELRTCFG, "psmodelrtcfgs", dtoList);
	}

    /**
     * 更新 模型运行配置 [PSMODELRTCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSModelRTCfg(PSModelRTCfgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSMODELRTCFG, "psmodelrtcfgs", PSModelRTCfgDTO.class, dto);
	}

    /**
     * 批更新 模型运行配置 [PSMODELRTCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSModelRTCfgs(List<PSModelRTCfgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSMODELRTCFG, "psmodelrtcfgs", dtoList);
	}

    /**
     * 获取 模型运行配置 [PSMODELRTCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSModelRTCfgDTO getPSModelRTCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSMODELRTCFG, "psmodelrtcfgs", PSModelRTCfgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 模型运行配置 [PSMODELRTCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSModelRTCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSMODELRTCFG, "psmodelrtcfgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 模型运行配置 [PSMODELRTCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSModelRTCfgDTO> searchPSModelRTCfgs(PSModelRTCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSMODELRTCFG, "psmodelrtcfgs", PSModelRTCfgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 模型运行配置 [PSMODELRTCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSModelRTCfgDTO> searchAllPSModelRTCfgs(PSModelRTCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSMODELRTCFG, "psmodelrtcfgs", PSModelRTCfgDTO.class, iSearchContext);
	}

    /**
     * 建立 外部接口实体 [PSSUBSYSSADE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSubSysSADE(PSSubSysSADEDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADE, "pssubsyssades", PSSubSysSADEDTO.class, dto);
	}

    /**
     * 批建立 外部接口实体 [PSSUBSYSSADE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSubSysSADEs(List<PSSubSysSADEDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADE, "pssubsyssades", dtoList);
	}

    /**
     * 更新 外部接口实体 [PSSUBSYSSADE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSubSysSADE(PSSubSysSADEDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADE, "pssubsyssades", PSSubSysSADEDTO.class, dto);
	}

    /**
     * 批更新 外部接口实体 [PSSUBSYSSADE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSubSysSADEs(List<PSSubSysSADEDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADE, "pssubsyssades", dtoList);
	}

    /**
     * 获取 外部接口实体 [PSSUBSYSSADE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSubSysSADEDTO getPSSubSysSADE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSUBSYSSADE, "pssubsyssades", PSSubSysSADEDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 外部接口实体 [PSSUBSYSSADE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSubSysSADE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSUBSYSSADE, "pssubsyssades", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 外部接口实体 [PSSUBSYSSADE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSubSysSADEDTO> searchPSSubSysSADEs(PSSubSysSADEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSUBSYSSADE, "pssubsyssades", PSSubSysSADEDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 外部接口实体 [PSSUBSYSSADE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSubSysSADEDTO> searchAllPSSubSysSADEs(PSSubSysSADEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSUBSYSSADE, "pssubsyssades", PSSubSysSADEDTO.class, iSearchContext);
	}

    /**
     * 建立 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSubSysSADEField(PSSubSysSADEFieldDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", PSSubSysSADEFieldDTO.class, dto);
	}

    /**
     * 批建立 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSubSysSADEFields(List<PSSubSysSADEFieldDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", dtoList);
	}

    /**
     * 更新 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSubSysSADEField(PSSubSysSADEFieldDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", PSSubSysSADEFieldDTO.class, dto);
	}

    /**
     * 批更新 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSubSysSADEFields(List<PSSubSysSADEFieldDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", dtoList);
	}

    /**
     * 获取 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSubSysSADEFieldDTO getPSSubSysSADEField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", PSSubSysSADEFieldDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSubSysSADEField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSubSysSADEFieldDTO> searchPSSubSysSADEFields(PSSubSysSADEFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", PSSubSysSADEFieldDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 外部接口实体属性 [PSSUBSYSSADEFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSubSysSADEFieldDTO> searchAllPSSubSysSADEFields(PSSubSysSADEFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSUBSYSSADEFIELD, "pssubsyssadefields", PSSubSysSADEFieldDTO.class, iSearchContext);
	}

    /**
     * 建立 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSubSysSADERS(PSSubSysSADERSDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADERS, "pssubsyssaders", PSSubSysSADERSDTO.class, dto);
	}

    /**
     * 批建立 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSubSysSADERs(List<PSSubSysSADERSDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADERS, "pssubsyssaders", dtoList);
	}

    /**
     * 更新 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSubSysSADERS(PSSubSysSADERSDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADERS, "pssubsyssaders", PSSubSysSADERSDTO.class, dto);
	}

    /**
     * 批更新 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSubSysSADERs(List<PSSubSysSADERSDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADERS, "pssubsyssaders", dtoList);
	}

    /**
     * 获取 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSubSysSADERSDTO getPSSubSysSADERS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSUBSYSSADERS, "pssubsyssaders", PSSubSysSADERSDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSubSysSADERS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSUBSYSSADERS, "pssubsyssaders", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSubSysSADERSDTO> searchPSSubSysSADERs(PSSubSysSADERSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSUBSYSSADERS, "pssubsyssaders", PSSubSysSADERSDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 外部接口实体关系 [PSSUBSYSSADERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSubSysSADERSDTO> searchAllPSSubSysSADERs(PSSubSysSADERSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSUBSYSSADERS, "pssubsyssaders", PSSubSysSADERSDTO.class, iSearchContext);
	}

    /**
     * 建立 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSubSysSADetail(PSSubSysSADetailDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", PSSubSysSADetailDTO.class, dto);
	}

    /**
     * 批建立 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSubSysSADetails(List<PSSubSysSADetailDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", dtoList);
	}

    /**
     * 更新 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSubSysSADetail(PSSubSysSADetailDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", PSSubSysSADetailDTO.class, dto);
	}

    /**
     * 批更新 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSubSysSADetails(List<PSSubSysSADetailDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", dtoList);
	}

    /**
     * 获取 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSubSysSADetailDTO getPSSubSysSADetail(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", PSSubSysSADetailDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSubSysSADetail(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSubSysSADetailDTO> searchPSSubSysSADetails(PSSubSysSADetailFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", PSSubSysSADetailDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 外部接口实体方法 [PSSUBSYSSADETAIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSubSysSADetailDTO> searchAllPSSubSysSADetails(PSSubSysSADetailFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSUBSYSSADETAIL, "pssubsyssadetails", PSSubSysSADetailDTO.class, iSearchContext);
	}

    /**
     * 建立 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSubSysServiceAPI(PSSubSysServiceAPIDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", PSSubSysServiceAPIDTO.class, dto);
	}

    /**
     * 批建立 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSubSysServiceAPIs(List<PSSubSysServiceAPIDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", dtoList);
	}

    /**
     * 更新 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSubSysServiceAPI(PSSubSysServiceAPIDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", PSSubSysServiceAPIDTO.class, dto);
	}

    /**
     * 批更新 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSubSysServiceAPIs(List<PSSubSysServiceAPIDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", dtoList);
	}

    /**
     * 获取 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSubSysServiceAPIDTO getPSSubSysServiceAPI(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", PSSubSysServiceAPIDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSubSysServiceAPI(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSubSysServiceAPIDTO> searchPSSubSysServiceAPIs(PSSubSysServiceAPIFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", PSSubSysServiceAPIDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 外部服务接口 [PSSUBSYSSERVICEAPI]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSubSysServiceAPIDTO> searchAllPSSubSysServiceAPIs(PSSubSysServiceAPIFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSUBSYSSERVICEAPI, "pssubsysserviceapis", PSSubSysServiceAPIDTO.class, iSearchContext);
	}

    /**
     * 建立 系统视图样式 [PSSUBVIEWTYPE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSubViewType(PSSubViewTypeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", PSSubViewTypeDTO.class, dto);
	}

    /**
     * 批建立 系统视图样式 [PSSUBVIEWTYPE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSubViewTypes(List<PSSubViewTypeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", dtoList);
	}

    /**
     * 更新 系统视图样式 [PSSUBVIEWTYPE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSubViewType(PSSubViewTypeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", PSSubViewTypeDTO.class, dto);
	}

    /**
     * 批更新 系统视图样式 [PSSUBVIEWTYPE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSubViewTypes(List<PSSubViewTypeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", dtoList);
	}

    /**
     * 获取 系统视图样式 [PSSUBVIEWTYPE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSubViewTypeDTO getPSSubViewType(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", PSSubViewTypeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统视图样式 [PSSUBVIEWTYPE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSubViewType(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统视图样式 [PSSUBVIEWTYPE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSubViewTypeDTO> searchPSSubViewTypes(PSSubViewTypeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", PSSubViewTypeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统视图样式 [PSSUBVIEWTYPE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSubViewTypeDTO> searchAllPSSubViewTypes(PSSubViewTypeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSUBVIEWTYPE, "pssubviewtypes", PSSubViewTypeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统操作者 [PSSYSACTOR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysActor(PSSysActorDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSACTOR, "pssysactors", PSSysActorDTO.class, dto);
	}

    /**
     * 批建立 系统操作者 [PSSYSACTOR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysActors(List<PSSysActorDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSACTOR, "pssysactors", dtoList);
	}

    /**
     * 更新 系统操作者 [PSSYSACTOR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysActor(PSSysActorDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSACTOR, "pssysactors", PSSysActorDTO.class, dto);
	}

    /**
     * 批更新 系统操作者 [PSSYSACTOR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysActors(List<PSSysActorDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSACTOR, "pssysactors", dtoList);
	}

    /**
     * 获取 系统操作者 [PSSYSACTOR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysActorDTO getPSSysActor(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSACTOR, "pssysactors", PSSysActorDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统操作者 [PSSYSACTOR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysActor(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSACTOR, "pssysactors", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统操作者 [PSSYSACTOR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysActorDTO> searchPSSysActors(PSSysActorFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSACTOR, "pssysactors", PSSysActorDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统操作者 [PSSYSACTOR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysActorDTO> searchAllPSSysActors(PSSysActorFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSACTOR, "pssysactors", PSSysActorDTO.class, iSearchContext);
	}

    /**
     * 建立 前端应用 [PSSYSAPP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysApp(PSSysAppDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSAPP, "pssysapps", PSSysAppDTO.class, dto);
	}

    /**
     * 批建立 前端应用 [PSSYSAPP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysApps(List<PSSysAppDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSAPP, "pssysapps", dtoList);
	}

    /**
     * 更新 前端应用 [PSSYSAPP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysApp(PSSysAppDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSAPP, "pssysapps", PSSysAppDTO.class, dto);
	}

    /**
     * 批更新 前端应用 [PSSYSAPP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysApps(List<PSSysAppDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSAPP, "pssysapps", dtoList);
	}

    /**
     * 获取 前端应用 [PSSYSAPP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysAppDTO getPSSysApp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSAPP, "pssysapps", PSSysAppDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 前端应用 [PSSYSAPP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysApp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSAPP, "pssysapps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 前端应用 [PSSYSAPP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysAppDTO> searchPSSysApps(PSSysAppFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSAPP, "pssysapps", PSSysAppDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 前端应用 [PSSYSAPP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysAppDTO> searchAllPSSysApps(PSSysAppFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSAPP, "pssysapps", PSSysAppDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据表列族 [PSSYSBDCOLSET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDColSet(PSSysBDColSetDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", PSSysBDColSetDTO.class, dto);
	}

    /**
     * 批建立 大数据表列族 [PSSYSBDCOLSET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDColSets(List<PSSysBDColSetDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", dtoList);
	}

    /**
     * 更新 大数据表列族 [PSSYSBDCOLSET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDColSet(PSSysBDColSetDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", PSSysBDColSetDTO.class, dto);
	}

    /**
     * 批更新 大数据表列族 [PSSYSBDCOLSET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDColSets(List<PSSysBDColSetDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", dtoList);
	}

    /**
     * 获取 大数据表列族 [PSSYSBDCOLSET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDColSetDTO getPSSysBDColSet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", PSSysBDColSetDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据表列族 [PSSYSBDCOLSET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDColSet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据表列族 [PSSYSBDCOLSET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDColSetDTO> searchPSSysBDColSets(PSSysBDColSetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", PSSysBDColSetDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据表列族 [PSSYSBDCOLSET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDColSetDTO> searchAllPSSysBDColSets(PSSysBDColSetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDCOLSET, "pssysbdcolsets", PSSysBDColSetDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据表列 [PSSYSBDCOLUMN]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDColumn(PSSysBDColumnDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", PSSysBDColumnDTO.class, dto);
	}

    /**
     * 批建立 大数据表列 [PSSYSBDCOLUMN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDColumns(List<PSSysBDColumnDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", dtoList);
	}

    /**
     * 更新 大数据表列 [PSSYSBDCOLUMN]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDColumn(PSSysBDColumnDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", PSSysBDColumnDTO.class, dto);
	}

    /**
     * 批更新 大数据表列 [PSSYSBDCOLUMN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDColumns(List<PSSysBDColumnDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", dtoList);
	}

    /**
     * 获取 大数据表列 [PSSYSBDCOLUMN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDColumnDTO getPSSysBDColumn(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", PSSysBDColumnDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据表列 [PSSYSBDCOLUMN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDColumn(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据表列 [PSSYSBDCOLUMN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDColumnDTO> searchPSSysBDColumns(PSSysBDColumnFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", PSSysBDColumnDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据表列 [PSSYSBDCOLUMN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDColumnDTO> searchAllPSSysBDColumns(PSSysBDColumnFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDCOLUMN, "pssysbdcolumns", PSSysBDColumnDTO.class, iSearchContext);
	}

    /**
     * 建立 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDInstCfg(PSSysBDInstCfgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", PSSysBDInstCfgDTO.class, dto);
	}

    /**
     * 批建立 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDInstCfgs(List<PSSysBDInstCfgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", dtoList);
	}

    /**
     * 更新 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDInstCfg(PSSysBDInstCfgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", PSSysBDInstCfgDTO.class, dto);
	}

    /**
     * 批更新 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDInstCfgs(List<PSSysBDInstCfgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", dtoList);
	}

    /**
     * 获取 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDInstCfgDTO getPSSysBDInstCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", PSSysBDInstCfgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDInstCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDInstCfgDTO> searchPSSysBDInstCfgs(PSSysBDInstCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", PSSysBDInstCfgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统大数据实例配置 [PSSYSBDINSTCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDInstCfgDTO> searchAllPSSysBDInstCfgs(PSSysBDInstCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDINSTCFG, "pssysbdinstcfgs", PSSysBDInstCfgDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据模块 [PSSYSBDMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDModule(PSSysBDModuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDMODULE, "pssysbdmodules", PSSysBDModuleDTO.class, dto);
	}

    /**
     * 批建立 大数据模块 [PSSYSBDMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDModules(List<PSSysBDModuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDMODULE, "pssysbdmodules", dtoList);
	}

    /**
     * 更新 大数据模块 [PSSYSBDMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDModule(PSSysBDModuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDMODULE, "pssysbdmodules", PSSysBDModuleDTO.class, dto);
	}

    /**
     * 批更新 大数据模块 [PSSYSBDMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDModules(List<PSSysBDModuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDMODULE, "pssysbdmodules", dtoList);
	}

    /**
     * 获取 大数据模块 [PSSYSBDMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDModuleDTO getPSSysBDModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDMODULE, "pssysbdmodules", PSSysBDModuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据模块 [PSSYSBDMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDMODULE, "pssysbdmodules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据模块 [PSSYSBDMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDModuleDTO> searchPSSysBDModules(PSSysBDModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDMODULE, "pssysbdmodules", PSSysBDModuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据模块 [PSSYSBDMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDModuleDTO> searchAllPSSysBDModules(PSSysBDModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDMODULE, "pssysbdmodules", PSSysBDModuleDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据分区 [PSSYSBDPART]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDPart(PSSysBDPartDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDPART, "pssysbdparts", PSSysBDPartDTO.class, dto);
	}

    /**
     * 批建立 大数据分区 [PSSYSBDPART]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDParts(List<PSSysBDPartDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDPART, "pssysbdparts", dtoList);
	}

    /**
     * 更新 大数据分区 [PSSYSBDPART]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDPart(PSSysBDPartDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDPART, "pssysbdparts", PSSysBDPartDTO.class, dto);
	}

    /**
     * 批更新 大数据分区 [PSSYSBDPART]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDParts(List<PSSysBDPartDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDPART, "pssysbdparts", dtoList);
	}

    /**
     * 获取 大数据分区 [PSSYSBDPART]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDPartDTO getPSSysBDPart(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDPART, "pssysbdparts", PSSysBDPartDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据分区 [PSSYSBDPART]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDPart(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDPART, "pssysbdparts", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据分区 [PSSYSBDPART]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDPartDTO> searchPSSysBDParts(PSSysBDPartFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDPART, "pssysbdparts", PSSysBDPartDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据分区 [PSSYSBDPART]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDPartDTO> searchAllPSSysBDParts(PSSysBDPartFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDPART, "pssysbdparts", PSSysBDPartDTO.class, iSearchContext);
	}

    /**
     * 建立 系统大数据体系 [PSSYSBDSCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDScheme(PSSysBDSchemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDSCHEME, "pssysbdschemes", PSSysBDSchemeDTO.class, dto);
	}

    /**
     * 批建立 系统大数据体系 [PSSYSBDSCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDSchemes(List<PSSysBDSchemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDSCHEME, "pssysbdschemes", dtoList);
	}

    /**
     * 更新 系统大数据体系 [PSSYSBDSCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDScheme(PSSysBDSchemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDSCHEME, "pssysbdschemes", PSSysBDSchemeDTO.class, dto);
	}

    /**
     * 批更新 系统大数据体系 [PSSYSBDSCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDSchemes(List<PSSysBDSchemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDSCHEME, "pssysbdschemes", dtoList);
	}

    /**
     * 获取 系统大数据体系 [PSSYSBDSCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDSchemeDTO getPSSysBDScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDSCHEME, "pssysbdschemes", PSSysBDSchemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统大数据体系 [PSSYSBDSCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDSCHEME, "pssysbdschemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统大数据体系 [PSSYSBDSCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDSchemeDTO> searchPSSysBDSchemes(PSSysBDSchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDSCHEME, "pssysbdschemes", PSSysBDSchemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统大数据体系 [PSSYSBDSCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDSchemeDTO> searchAllPSSysBDSchemes(PSSysBDSchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDSCHEME, "pssysbdschemes", PSSysBDSchemeDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据库表 [PSSYSBDTABLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDTable(PSSysBDTableDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLE, "pssysbdtables", PSSysBDTableDTO.class, dto);
	}

    /**
     * 批建立 大数据库表 [PSSYSBDTABLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDTables(List<PSSysBDTableDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLE, "pssysbdtables", dtoList);
	}

    /**
     * 更新 大数据库表 [PSSYSBDTABLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDTable(PSSysBDTableDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLE, "pssysbdtables", PSSysBDTableDTO.class, dto);
	}

    /**
     * 批更新 大数据库表 [PSSYSBDTABLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDTables(List<PSSysBDTableDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLE, "pssysbdtables", dtoList);
	}

    /**
     * 获取 大数据库表 [PSSYSBDTABLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDTableDTO getPSSysBDTable(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDTABLE, "pssysbdtables", PSSysBDTableDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据库表 [PSSYSBDTABLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDTable(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDTABLE, "pssysbdtables", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据库表 [PSSYSBDTABLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDTableDTO> searchPSSysBDTables(PSSysBDTableFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDTABLE, "pssysbdtables", PSSysBDTableDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据库表 [PSSYSBDTABLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDTableDTO> searchAllPSSysBDTables(PSSysBDTableFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDTABLE, "pssysbdtables", PSSysBDTableDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据表实体 [PSSYSBDTABLEDE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDTableDE(PSSysBDTableDEDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", PSSysBDTableDEDTO.class, dto);
	}

    /**
     * 批建立 大数据表实体 [PSSYSBDTABLEDE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDTableDEs(List<PSSysBDTableDEDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", dtoList);
	}

    /**
     * 更新 大数据表实体 [PSSYSBDTABLEDE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDTableDE(PSSysBDTableDEDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", PSSysBDTableDEDTO.class, dto);
	}

    /**
     * 批更新 大数据表实体 [PSSYSBDTABLEDE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDTableDEs(List<PSSysBDTableDEDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", dtoList);
	}

    /**
     * 获取 大数据表实体 [PSSYSBDTABLEDE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDTableDEDTO getPSSysBDTableDE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", PSSysBDTableDEDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据表实体 [PSSYSBDTABLEDE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDTableDE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据表实体 [PSSYSBDTABLEDE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDTableDEDTO> searchPSSysBDTableDEs(PSSysBDTableDEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", PSSysBDTableDEDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据表实体 [PSSYSBDTABLEDE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDTableDEDTO> searchAllPSSysBDTableDEs(PSSysBDTableDEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDTABLEDE, "pssysbdtabledes", PSSysBDTableDEDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDTableDER(PSSysBDTableDERDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", PSSysBDTableDERDTO.class, dto);
	}

    /**
     * 批建立 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDTableDERs(List<PSSysBDTableDERDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", dtoList);
	}

    /**
     * 更新 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDTableDER(PSSysBDTableDERDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", PSSysBDTableDERDTO.class, dto);
	}

    /**
     * 批更新 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDTableDERs(List<PSSysBDTableDERDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", dtoList);
	}

    /**
     * 获取 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDTableDERDTO getPSSysBDTableDER(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", PSSysBDTableDERDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDTableDER(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDTableDERDTO> searchPSSysBDTableDERs(PSSysBDTableDERFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", PSSysBDTableDERDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据表实体关系 [PSSYSBDTABLEDER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDTableDERDTO> searchAllPSSysBDTableDERs(PSSysBDTableDERFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDTABLEDER, "pssysbdtableders", PSSysBDTableDERDTO.class, iSearchContext);
	}

    /**
     * 建立 大数据表关系 [PSSYSBDTABLERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBDTableRS(PSSysBDTableRSDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLERS, "pssysbdtablers", PSSysBDTableRSDTO.class, dto);
	}

    /**
     * 批建立 大数据表关系 [PSSYSBDTABLERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBDTableRs(List<PSSysBDTableRSDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBDTABLERS, "pssysbdtablers", dtoList);
	}

    /**
     * 更新 大数据表关系 [PSSYSBDTABLERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBDTableRS(PSSysBDTableRSDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLERS, "pssysbdtablers", PSSysBDTableRSDTO.class, dto);
	}

    /**
     * 批更新 大数据表关系 [PSSYSBDTABLERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBDTableRs(List<PSSysBDTableRSDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBDTABLERS, "pssysbdtablers", dtoList);
	}

    /**
     * 获取 大数据表关系 [PSSYSBDTABLERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBDTableRSDTO getPSSysBDTableRS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBDTABLERS, "pssysbdtablers", PSSysBDTableRSDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 大数据表关系 [PSSYSBDTABLERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBDTableRS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBDTABLERS, "pssysbdtablers", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 大数据表关系 [PSSYSBDTABLERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBDTableRSDTO> searchPSSysBDTableRs(PSSysBDTableRSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBDTABLERS, "pssysbdtablers", PSSysBDTableRSDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 大数据表关系 [PSSYSBDTABLERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBDTableRSDTO> searchAllPSSysBDTableRs(PSSysBDTableRSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBDTABLERS, "pssysbdtablers", PSSysBDTableRSDTO.class, iSearchContext);
	}

    /**
     * 建立 智能报表立方体 [PSSYSBICUBE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBICube(PSSysBICubeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBICUBE, "pssysbicubes", PSSysBICubeDTO.class, dto);
	}

    /**
     * 批建立 智能报表立方体 [PSSYSBICUBE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBICubes(List<PSSysBICubeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBICUBE, "pssysbicubes", dtoList);
	}

    /**
     * 更新 智能报表立方体 [PSSYSBICUBE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBICube(PSSysBICubeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBICUBE, "pssysbicubes", PSSysBICubeDTO.class, dto);
	}

    /**
     * 批更新 智能报表立方体 [PSSYSBICUBE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBICubes(List<PSSysBICubeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBICUBE, "pssysbicubes", dtoList);
	}

    /**
     * 获取 智能报表立方体 [PSSYSBICUBE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBICubeDTO getPSSysBICube(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBICUBE, "pssysbicubes", PSSysBICubeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 智能报表立方体 [PSSYSBICUBE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBICube(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBICUBE, "pssysbicubes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 智能报表立方体 [PSSYSBICUBE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBICubeDTO> searchPSSysBICubes(PSSysBICubeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBICUBE, "pssysbicubes", PSSysBICubeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 智能报表立方体 [PSSYSBICUBE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBICubeDTO> searchAllPSSysBICubes(PSSysBICubeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBICUBE, "pssysbicubes", PSSysBICubeDTO.class, iSearchContext);
	}

    /**
     * 建立 智能报表体系 [PSSYSBISCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBIScheme(PSSysBISchemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBISCHEME, "pssysbischemes", PSSysBISchemeDTO.class, dto);
	}

    /**
     * 批建立 智能报表体系 [PSSYSBISCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBISchemes(List<PSSysBISchemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBISCHEME, "pssysbischemes", dtoList);
	}

    /**
     * 更新 智能报表体系 [PSSYSBISCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBIScheme(PSSysBISchemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBISCHEME, "pssysbischemes", PSSysBISchemeDTO.class, dto);
	}

    /**
     * 批更新 智能报表体系 [PSSYSBISCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBISchemes(List<PSSysBISchemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBISCHEME, "pssysbischemes", dtoList);
	}

    /**
     * 获取 智能报表体系 [PSSYSBISCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBISchemeDTO getPSSysBIScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBISCHEME, "pssysbischemes", PSSysBISchemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 智能报表体系 [PSSYSBISCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBIScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBISCHEME, "pssysbischemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 智能报表体系 [PSSYSBISCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBISchemeDTO> searchPSSysBISchemes(PSSysBISchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBISCHEME, "pssysbischemes", PSSysBISchemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 智能报表体系 [PSSYSBISCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBISchemeDTO> searchAllPSSysBISchemes(PSSysBISchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBISCHEME, "pssysbischemes", PSSysBISchemeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统后台任务 [PSSYSBACKSERVICE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysBackService(PSSysBackServiceDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSBACKSERVICE, "pssysbackservices", PSSysBackServiceDTO.class, dto);
	}

    /**
     * 批建立 系统后台任务 [PSSYSBACKSERVICE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysBackServices(List<PSSysBackServiceDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSBACKSERVICE, "pssysbackservices", dtoList);
	}

    /**
     * 更新 系统后台任务 [PSSYSBACKSERVICE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysBackService(PSSysBackServiceDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBACKSERVICE, "pssysbackservices", PSSysBackServiceDTO.class, dto);
	}

    /**
     * 批更新 系统后台任务 [PSSYSBACKSERVICE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysBackServices(List<PSSysBackServiceDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSBACKSERVICE, "pssysbackservices", dtoList);
	}

    /**
     * 获取 系统后台任务 [PSSYSBACKSERVICE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysBackServiceDTO getPSSysBackService(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSBACKSERVICE, "pssysbackservices", PSSysBackServiceDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统后台任务 [PSSYSBACKSERVICE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysBackService(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSBACKSERVICE, "pssysbackservices", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统后台任务 [PSSYSBACKSERVICE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysBackServiceDTO> searchPSSysBackServices(PSSysBackServiceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSBACKSERVICE, "pssysbackservices", PSSysBackServiceDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统后台任务 [PSSYSBACKSERVICE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysBackServiceDTO> searchAllPSSysBackServices(PSSysBackServiceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSBACKSERVICE, "pssysbackservices", PSSysBackServiceDTO.class, iSearchContext);
	}

    /**
     * 建立 系统日历部件 [PSSYSCALENDAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCalendar(PSSysCalendarDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCALENDAR, "pssyscalendars", PSSysCalendarDTO.class, dto);
	}

    /**
     * 批建立 系统日历部件 [PSSYSCALENDAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCalendars(List<PSSysCalendarDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCALENDAR, "pssyscalendars", dtoList);
	}

    /**
     * 更新 系统日历部件 [PSSYSCALENDAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCalendar(PSSysCalendarDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCALENDAR, "pssyscalendars", PSSysCalendarDTO.class, dto);
	}

    /**
     * 批更新 系统日历部件 [PSSYSCALENDAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCalendars(List<PSSysCalendarDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCALENDAR, "pssyscalendars", dtoList);
	}

    /**
     * 获取 系统日历部件 [PSSYSCALENDAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCalendarDTO getPSSysCalendar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCALENDAR, "pssyscalendars", PSSysCalendarDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统日历部件 [PSSYSCALENDAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCalendar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCALENDAR, "pssyscalendars", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统日历部件 [PSSYSCALENDAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCalendarDTO> searchPSSysCalendars(PSSysCalendarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCALENDAR, "pssyscalendars", PSSysCalendarDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统日历部件 [PSSYSCALENDAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCalendarDTO> searchAllPSSysCalendars(PSSysCalendarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCALENDAR, "pssyscalendars", PSSysCalendarDTO.class, iSearchContext);
	}

    /**
     * 建立 系统画布 [PSSYSCANVAS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCanvas(PSSysCanvasDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCANVAS, "pssyscanvas", PSSysCanvasDTO.class, dto);
	}

    /**
     * 批建立 系统画布 [PSSYSCANVAS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCanvas(List<PSSysCanvasDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCANVAS, "pssyscanvas", dtoList);
	}

    /**
     * 更新 系统画布 [PSSYSCANVAS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCanvas(PSSysCanvasDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCANVAS, "pssyscanvas", PSSysCanvasDTO.class, dto);
	}

    /**
     * 批更新 系统画布 [PSSYSCANVAS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCanvas(List<PSSysCanvasDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCANVAS, "pssyscanvas", dtoList);
	}

    /**
     * 获取 系统画布 [PSSYSCANVAS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCanvasDTO getPSSysCanvas(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCANVAS, "pssyscanvas", PSSysCanvasDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统画布 [PSSYSCANVAS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCanvas(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCANVAS, "pssyscanvas", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统画布 [PSSYSCANVAS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCanvasDTO> searchPSSysCanvas(PSSysCanvasFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCANVAS, "pssyscanvas", PSSysCanvasDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统画布 [PSSYSCANVAS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCanvasDTO> searchAllPSSysCanvas(PSSysCanvasFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCANVAS, "pssyscanvas", PSSysCanvasDTO.class, iSearchContext);
	}

    /**
     * 建立 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCanvasModel(PSSysCanvasModelDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", PSSysCanvasModelDTO.class, dto);
	}

    /**
     * 批建立 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCanvasModels(List<PSSysCanvasModelDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", dtoList);
	}

    /**
     * 更新 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCanvasModel(PSSysCanvasModelDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", PSSysCanvasModelDTO.class, dto);
	}

    /**
     * 批更新 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCanvasModels(List<PSSysCanvasModelDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", dtoList);
	}

    /**
     * 获取 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCanvasModelDTO getPSSysCanvasModel(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", PSSysCanvasModelDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCanvasModel(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCanvasModelDTO> searchPSSysCanvasModels(PSSysCanvasModelFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", PSSysCanvasModelDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统画布相关模型 [PSSYSCANVASMODEL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCanvasModelDTO> searchAllPSSysCanvasModels(PSSysCanvasModelFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCANVASMODEL, "pssyscanvasmodels", PSSysCanvasModelDTO.class, iSearchContext);
	}

    /**
     * 建立 系统图表主题 [PSSYSCHARTTHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysChartTheme(PSSysChartThemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", PSSysChartThemeDTO.class, dto);
	}

    /**
     * 批建立 系统图表主题 [PSSYSCHARTTHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysChartThemes(List<PSSysChartThemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", dtoList);
	}

    /**
     * 更新 系统图表主题 [PSSYSCHARTTHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysChartTheme(PSSysChartThemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", PSSysChartThemeDTO.class, dto);
	}

    /**
     * 批更新 系统图表主题 [PSSYSCHARTTHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysChartThemes(List<PSSysChartThemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", dtoList);
	}

    /**
     * 获取 系统图表主题 [PSSYSCHARTTHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysChartThemeDTO getPSSysChartTheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", PSSysChartThemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统图表主题 [PSSYSCHARTTHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysChartTheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统图表主题 [PSSYSCHARTTHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysChartThemeDTO> searchPSSysChartThemes(PSSysChartThemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", PSSysChartThemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统图表主题 [PSSYSCHARTTHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysChartThemeDTO> searchAllPSSysChartThemes(PSSysChartThemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCHARTTHEME, "pssyschartthemes", PSSysChartThemeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统代码块 [PSSYSCODESNIPPET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCodeSnippet(PSSysCodeSnippetDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", PSSysCodeSnippetDTO.class, dto);
	}

    /**
     * 批建立 系统代码块 [PSSYSCODESNIPPET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCodeSnippets(List<PSSysCodeSnippetDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", dtoList);
	}

    /**
     * 更新 系统代码块 [PSSYSCODESNIPPET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCodeSnippet(PSSysCodeSnippetDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", PSSysCodeSnippetDTO.class, dto);
	}

    /**
     * 批更新 系统代码块 [PSSYSCODESNIPPET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCodeSnippets(List<PSSysCodeSnippetDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", dtoList);
	}

    /**
     * 获取 系统代码块 [PSSYSCODESNIPPET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCodeSnippetDTO getPSSysCodeSnippet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", PSSysCodeSnippetDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统代码块 [PSSYSCODESNIPPET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCodeSnippet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统代码块 [PSSYSCODESNIPPET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCodeSnippetDTO> searchPSSysCodeSnippets(PSSysCodeSnippetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", PSSysCodeSnippetDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统代码块 [PSSYSCODESNIPPET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCodeSnippetDTO> searchAllPSSysCodeSnippets(PSSysCodeSnippetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCODESNIPPET, "pssyscodesnippets", PSSysCodeSnippetDTO.class, iSearchContext);
	}

    /**
     * 建立 系统内容 [PSSYSCONTENT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysContent(PSSysContentDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCONTENT, "pssyscontents", PSSysContentDTO.class, dto);
	}

    /**
     * 批建立 系统内容 [PSSYSCONTENT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysContents(List<PSSysContentDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCONTENT, "pssyscontents", dtoList);
	}

    /**
     * 更新 系统内容 [PSSYSCONTENT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysContent(PSSysContentDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCONTENT, "pssyscontents", PSSysContentDTO.class, dto);
	}

    /**
     * 批更新 系统内容 [PSSYSCONTENT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysContents(List<PSSysContentDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCONTENT, "pssyscontents", dtoList);
	}

    /**
     * 获取 系统内容 [PSSYSCONTENT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysContentDTO getPSSysContent(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCONTENT, "pssyscontents", PSSysContentDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统内容 [PSSYSCONTENT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysContent(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCONTENT, "pssyscontents", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统内容 [PSSYSCONTENT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysContentDTO> searchPSSysContents(PSSysContentFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCONTENT, "pssyscontents", PSSysContentDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统内容 [PSSYSCONTENT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysContentDTO> searchAllPSSysContents(PSSysContentFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCONTENT, "pssyscontents", PSSysContentDTO.class, iSearchContext);
	}

    /**
     * 建立 系统内容分类 [PSSYSCONTENTCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysContentCat(PSSysContentCatDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", PSSysContentCatDTO.class, dto);
	}

    /**
     * 批建立 系统内容分类 [PSSYSCONTENTCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysContentCats(List<PSSysContentCatDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", dtoList);
	}

    /**
     * 更新 系统内容分类 [PSSYSCONTENTCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysContentCat(PSSysContentCatDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", PSSysContentCatDTO.class, dto);
	}

    /**
     * 批更新 系统内容分类 [PSSYSCONTENTCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysContentCats(List<PSSysContentCatDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", dtoList);
	}

    /**
     * 获取 系统内容分类 [PSSYSCONTENTCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysContentCatDTO getPSSysContentCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", PSSysContentCatDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统内容分类 [PSSYSCONTENTCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysContentCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统内容分类 [PSSYSCONTENTCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysContentCatDTO> searchPSSysContentCats(PSSysContentCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", PSSysContentCatDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统内容分类 [PSSYSCONTENTCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysContentCatDTO> searchAllPSSysContentCats(PSSysContentCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCONTENTCAT, "pssyscontentcats", PSSysContentCatDTO.class, iSearchContext);
	}

    /**
     * 建立 系统计数器 [PSSYSCOUNTER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCounter(PSSysCounterDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCOUNTER, "pssyscounters", PSSysCounterDTO.class, dto);
	}

    /**
     * 批建立 系统计数器 [PSSYSCOUNTER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCounters(List<PSSysCounterDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCOUNTER, "pssyscounters", dtoList);
	}

    /**
     * 更新 系统计数器 [PSSYSCOUNTER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCounter(PSSysCounterDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCOUNTER, "pssyscounters", PSSysCounterDTO.class, dto);
	}

    /**
     * 批更新 系统计数器 [PSSYSCOUNTER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCounters(List<PSSysCounterDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCOUNTER, "pssyscounters", dtoList);
	}

    /**
     * 获取 系统计数器 [PSSYSCOUNTER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCounterDTO getPSSysCounter(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCOUNTER, "pssyscounters", PSSysCounterDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统计数器 [PSSYSCOUNTER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCounter(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCOUNTER, "pssyscounters", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统计数器 [PSSYSCOUNTER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCounterDTO> searchPSSysCounters(PSSysCounterFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCOUNTER, "pssyscounters", PSSysCounterDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统计数器 [PSSYSCOUNTER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCounterDTO> searchAllPSSysCounters(PSSysCounterFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCOUNTER, "pssyscounters", PSSysCounterDTO.class, iSearchContext);
	}

    /**
     * 建立 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCounterItem(PSSysCounterItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", PSSysCounterItemDTO.class, dto);
	}

    /**
     * 批建立 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCounterItems(List<PSSysCounterItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", dtoList);
	}

    /**
     * 更新 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCounterItem(PSSysCounterItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", PSSysCounterItemDTO.class, dto);
	}

    /**
     * 批更新 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCounterItems(List<PSSysCounterItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", dtoList);
	}

    /**
     * 获取 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCounterItemDTO getPSSysCounterItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", PSSysCounterItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCounterItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCounterItemDTO> searchPSSysCounterItems(PSSysCounterItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", PSSysCounterItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统计数器项 [PSSYSCOUNTERITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCounterItemDTO> searchAllPSSysCounterItems(PSSysCounterItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCOUNTERITEM, "pssyscounteritems", PSSysCounterItemDTO.class, iSearchContext);
	}

    /**
     * 建立 系统界面样式表 [PSSYSCSS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCss(PSSysCssDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCSS, "pssyscsses", PSSysCssDTO.class, dto);
	}

    /**
     * 批建立 系统界面样式表 [PSSYSCSS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCsses(List<PSSysCssDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCSS, "pssyscsses", dtoList);
	}

    /**
     * 更新 系统界面样式表 [PSSYSCSS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCss(PSSysCssDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCSS, "pssyscsses", PSSysCssDTO.class, dto);
	}

    /**
     * 批更新 系统界面样式表 [PSSYSCSS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCsses(List<PSSysCssDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCSS, "pssyscsses", dtoList);
	}

    /**
     * 获取 系统界面样式表 [PSSYSCSS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCssDTO getPSSysCss(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCSS, "pssyscsses", PSSysCssDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统界面样式表 [PSSYSCSS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCss(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCSS, "pssyscsses", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统界面样式表 [PSSYSCSS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCssDTO> searchPSSysCsses(PSSysCssFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCSS, "pssyscsses", PSSysCssDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统界面样式表 [PSSYSCSS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCssDTO> searchAllPSSysCsses(PSSysCssFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCSS, "pssyscsses", PSSysCssDTO.class, iSearchContext);
	}

    /**
     * 建立 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysCssCat(PSSysCssCatDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSCSSCAT, "pssyscsscats", PSSysCssCatDTO.class, dto);
	}

    /**
     * 批建立 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysCssCats(List<PSSysCssCatDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSCSSCAT, "pssyscsscats", dtoList);
	}

    /**
     * 更新 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysCssCat(PSSysCssCatDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCSSCAT, "pssyscsscats", PSSysCssCatDTO.class, dto);
	}

    /**
     * 批更新 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysCssCats(List<PSSysCssCatDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSCSSCAT, "pssyscsscats", dtoList);
	}

    /**
     * 获取 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysCssCatDTO getPSSysCssCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSCSSCAT, "pssyscsscats", PSSysCssCatDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysCssCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSCSSCAT, "pssyscsscats", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysCssCatDTO> searchPSSysCssCats(PSSysCssCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSCSSCAT, "pssyscsscats", PSSysCssCatDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统界面样式表分类 [PSSYSCSSCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysCssCatDTO> searchAllPSSysCssCats(PSSysCssCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSCSSCAT, "pssyscsscats", PSSysCssCatDTO.class, iSearchContext);
	}

    /**
     * 建立 数据库列 [PSSYSDBCOLUMN]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDBColumn(PSSysDBColumnDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", PSSysDBColumnDTO.class, dto);
	}

    /**
     * 批建立 数据库列 [PSSYSDBCOLUMN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDBColumns(List<PSSysDBColumnDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", dtoList);
	}

    /**
     * 更新 数据库列 [PSSYSDBCOLUMN]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDBColumn(PSSysDBColumnDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", PSSysDBColumnDTO.class, dto);
	}

    /**
     * 批更新 数据库列 [PSSYSDBCOLUMN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDBColumns(List<PSSysDBColumnDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", dtoList);
	}

    /**
     * 获取 数据库列 [PSSYSDBCOLUMN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDBColumnDTO getPSSysDBColumn(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", PSSysDBColumnDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 数据库列 [PSSYSDBCOLUMN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDBColumn(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 数据库列 [PSSYSDBCOLUMN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDBColumnDTO> searchPSSysDBColumns(PSSysDBColumnFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", PSSysDBColumnDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 数据库列 [PSSYSDBCOLUMN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDBColumnDTO> searchAllPSSysDBColumns(PSSysDBColumnFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDBCOLUMN, "pssysdbcolumns", PSSysDBColumnDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库存储过程 [PSSYSDBPROC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDBProc(PSSysDBProcDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBPROC, "pssysdbprocs", PSSysDBProcDTO.class, dto);
	}

    /**
     * 批建立 系统数据库存储过程 [PSSYSDBPROC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDBProcs(List<PSSysDBProcDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBPROC, "pssysdbprocs", dtoList);
	}

    /**
     * 更新 系统数据库存储过程 [PSSYSDBPROC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDBProc(PSSysDBProcDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBPROC, "pssysdbprocs", PSSysDBProcDTO.class, dto);
	}

    /**
     * 批更新 系统数据库存储过程 [PSSYSDBPROC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDBProcs(List<PSSysDBProcDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBPROC, "pssysdbprocs", dtoList);
	}

    /**
     * 获取 系统数据库存储过程 [PSSYSDBPROC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDBProcDTO getPSSysDBProc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDBPROC, "pssysdbprocs", PSSysDBProcDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库存储过程 [PSSYSDBPROC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDBProc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDBPROC, "pssysdbprocs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库存储过程 [PSSYSDBPROC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDBProcDTO> searchPSSysDBProcs(PSSysDBProcFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDBPROC, "pssysdbprocs", PSSysDBProcDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库存储过程 [PSSYSDBPROC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDBProcDTO> searchAllPSSysDBProcs(PSSysDBProcFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDBPROC, "pssysdbprocs", PSSysDBProcDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDBProcParam(PSSysDBProcParamDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", PSSysDBProcParamDTO.class, dto);
	}

    /**
     * 批建立 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDBProcParams(List<PSSysDBProcParamDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", dtoList);
	}

    /**
     * 更新 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDBProcParam(PSSysDBProcParamDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", PSSysDBProcParamDTO.class, dto);
	}

    /**
     * 批更新 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDBProcParams(List<PSSysDBProcParamDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", dtoList);
	}

    /**
     * 获取 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDBProcParamDTO getPSSysDBProcParam(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", PSSysDBProcParamDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDBProcParam(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDBProcParamDTO> searchPSSysDBProcParams(PSSysDBProcParamFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", PSSysDBProcParamDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库存储过程参数 [PSSYSDBPROCPARAM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDBProcParamDTO> searchAllPSSysDBProcParams(PSSysDBProcParamFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDBPROCPARAM, "pssysdbprocparams", PSSysDBProcParamDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库体系 [PSSYSDBSCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDBScheme(PSSysDBSchemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBSCHEME, "pssysdbschemes", PSSysDBSchemeDTO.class, dto);
	}

    /**
     * 批建立 系统数据库体系 [PSSYSDBSCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDBSchemes(List<PSSysDBSchemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBSCHEME, "pssysdbschemes", dtoList);
	}

    /**
     * 更新 系统数据库体系 [PSSYSDBSCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDBScheme(PSSysDBSchemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBSCHEME, "pssysdbschemes", PSSysDBSchemeDTO.class, dto);
	}

    /**
     * 批更新 系统数据库体系 [PSSYSDBSCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDBSchemes(List<PSSysDBSchemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBSCHEME, "pssysdbschemes", dtoList);
	}

    /**
     * 获取 系统数据库体系 [PSSYSDBSCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDBSchemeDTO getPSSysDBScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDBSCHEME, "pssysdbschemes", PSSysDBSchemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库体系 [PSSYSDBSCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDBScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDBSCHEME, "pssysdbschemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库体系 [PSSYSDBSCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDBSchemeDTO> searchPSSysDBSchemes(PSSysDBSchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDBSCHEME, "pssysdbschemes", PSSysDBSchemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库体系 [PSSYSDBSCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDBSchemeDTO> searchAllPSSysDBSchemes(PSSysDBSchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDBSCHEME, "pssysdbschemes", PSSysDBSchemeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库表 [PSSYSDBTABLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDBTable(PSSysDBTableDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBTABLE, "pssysdbtables", PSSysDBTableDTO.class, dto);
	}

    /**
     * 批建立 系统数据库表 [PSSYSDBTABLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDBTables(List<PSSysDBTableDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBTABLE, "pssysdbtables", dtoList);
	}

    /**
     * 更新 系统数据库表 [PSSYSDBTABLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDBTable(PSSysDBTableDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBTABLE, "pssysdbtables", PSSysDBTableDTO.class, dto);
	}

    /**
     * 批更新 系统数据库表 [PSSYSDBTABLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDBTables(List<PSSysDBTableDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBTABLE, "pssysdbtables", dtoList);
	}

    /**
     * 获取 系统数据库表 [PSSYSDBTABLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDBTableDTO getPSSysDBTable(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDBTABLE, "pssysdbtables", PSSysDBTableDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库表 [PSSYSDBTABLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDBTable(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDBTABLE, "pssysdbtables", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库表 [PSSYSDBTABLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDBTableDTO> searchPSSysDBTables(PSSysDBTableFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDBTABLE, "pssysdbtables", PSSysDBTableDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库表 [PSSYSDBTABLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDBTableDTO> searchAllPSSysDBTables(PSSysDBTableFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDBTABLE, "pssysdbtables", PSSysDBTableDTO.class, iSearchContext);
	}

    /**
     * 建立 系统值函数 [PSSYSDBVF]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDBVF(PSSysDBVFDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBVF, "pssysdbvfs", PSSysDBVFDTO.class, dto);
	}

    /**
     * 批建立 系统值函数 [PSSYSDBVF]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDBVFs(List<PSSysDBVFDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDBVF, "pssysdbvfs", dtoList);
	}

    /**
     * 更新 系统值函数 [PSSYSDBVF]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDBVF(PSSysDBVFDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBVF, "pssysdbvfs", PSSysDBVFDTO.class, dto);
	}

    /**
     * 批更新 系统值函数 [PSSYSDBVF]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDBVFs(List<PSSysDBVFDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDBVF, "pssysdbvfs", dtoList);
	}

    /**
     * 获取 系统值函数 [PSSYSDBVF]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDBVFDTO getPSSysDBVF(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDBVF, "pssysdbvfs", PSSysDBVFDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统值函数 [PSSYSDBVF]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDBVF(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDBVF, "pssysdbvfs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统值函数 [PSSYSDBVF]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDBVFDTO> searchPSSysDBVFs(PSSysDBVFFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDBVF, "pssysdbvfs", PSSysDBVFDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统值函数 [PSSYSDBVF]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDBVFDTO> searchAllPSSysDBVFs(PSSysDBVFFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDBVF, "pssysdbvfs", PSSysDBVFDTO.class, iSearchContext);
	}

    /**
     * 建立 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDEFType(PSSysDEFTypeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDEFTYPE, "pssysdeftypes", PSSysDEFTypeDTO.class, dto);
	}

    /**
     * 批建立 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDEFTypes(List<PSSysDEFTypeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDEFTYPE, "pssysdeftypes", dtoList);
	}

    /**
     * 更新 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDEFType(PSSysDEFTypeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDEFTYPE, "pssysdeftypes", PSSysDEFTypeDTO.class, dto);
	}

    /**
     * 批更新 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDEFTypes(List<PSSysDEFTypeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDEFTYPE, "pssysdeftypes", dtoList);
	}

    /**
     * 获取 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDEFTypeDTO getPSSysDEFType(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDEFTYPE, "pssysdeftypes", PSSysDEFTypeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDEFType(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDEFTYPE, "pssysdeftypes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDEFTypeDTO> searchPSSysDEFTypes(PSSysDEFTypeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDEFTYPE, "pssysdeftypes", PSSysDEFTypeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统属性类型逻辑 [PSSYSDEFTYPE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDEFTypeDTO> searchAllPSSysDEFTypes(PSSysDEFTypeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDEFTYPE, "pssysdeftypes", PSSysDEFTypeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDELogicNode(PSSysDELogicNodeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", PSSysDELogicNodeDTO.class, dto);
	}

    /**
     * 批建立 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDELogicNodes(List<PSSysDELogicNodeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", dtoList);
	}

    /**
     * 更新 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDELogicNode(PSSysDELogicNodeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", PSSysDELogicNodeDTO.class, dto);
	}

    /**
     * 批更新 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDELogicNodes(List<PSSysDELogicNodeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", dtoList);
	}

    /**
     * 获取 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDELogicNodeDTO getPSSysDELogicNode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", PSSysDELogicNodeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDELogicNode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDELogicNodeDTO> searchPSSysDELogicNodes(PSSysDELogicNodeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", PSSysDELogicNodeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统处理逻辑 [PSSYSDELOGICNODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDELogicNodeDTO> searchAllPSSysDELogicNodes(PSSysDELogicNodeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDELOGICNODE, "pssysdelogicnodes", PSSysDELogicNodeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库模型项 [PSSYSDMITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDMItem(PSSysDMItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDMITEM, "pssysdmitems", PSSysDMItemDTO.class, dto);
	}

    /**
     * 批建立 系统数据库模型项 [PSSYSDMITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDMItems(List<PSSysDMItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDMITEM, "pssysdmitems", dtoList);
	}

    /**
     * 更新 系统数据库模型项 [PSSYSDMITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDMItem(PSSysDMItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDMITEM, "pssysdmitems", PSSysDMItemDTO.class, dto);
	}

    /**
     * 批更新 系统数据库模型项 [PSSYSDMITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDMItems(List<PSSysDMItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDMITEM, "pssysdmitems", dtoList);
	}

    /**
     * 获取 系统数据库模型项 [PSSYSDMITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDMItemDTO getPSSysDMItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDMITEM, "pssysdmitems", PSSysDMItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库模型项 [PSSYSDMITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDMItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDMITEM, "pssysdmitems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库模型项 [PSSYSDMITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDMItemDTO> searchPSSysDMItems(PSSysDMItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDMITEM, "pssysdmitems", PSSysDMItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库模型项 [PSSYSDMITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDMItemDTO> searchAllPSSysDMItems(PSSysDMItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDMITEM, "pssysdmitems", PSSysDMItemDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库模型版本 [PSSYSDMVER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDMVer(PSSysDMVerDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDMVER, "pssysdmvers", PSSysDMVerDTO.class, dto);
	}

    /**
     * 批建立 系统数据库模型版本 [PSSYSDMVER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDMVers(List<PSSysDMVerDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDMVER, "pssysdmvers", dtoList);
	}

    /**
     * 更新 系统数据库模型版本 [PSSYSDMVER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDMVer(PSSysDMVerDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDMVER, "pssysdmvers", PSSysDMVerDTO.class, dto);
	}

    /**
     * 批更新 系统数据库模型版本 [PSSYSDMVER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDMVers(List<PSSysDMVerDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDMVER, "pssysdmvers", dtoList);
	}

    /**
     * 获取 系统数据库模型版本 [PSSYSDMVER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDMVerDTO getPSSysDMVer(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDMVER, "pssysdmvers", PSSysDMVerDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库模型版本 [PSSYSDMVER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDMVer(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDMVER, "pssysdmvers", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库模型版本 [PSSYSDMVER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDMVerDTO> searchPSSysDMVers(PSSysDMVerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDMVER, "pssysdmvers", PSSysDMVerDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库模型版本 [PSSYSDMVER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDMVerDTO> searchAllPSSysDMVers(PSSysDMVerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDMVER, "pssysdmvers", PSSysDMVerDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据看板 [PSSYSDASHBOARD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDashboard(PSSysDashboardDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDASHBOARD, "pssysdashboards", PSSysDashboardDTO.class, dto);
	}

    /**
     * 批建立 系统数据看板 [PSSYSDASHBOARD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDashboards(List<PSSysDashboardDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDASHBOARD, "pssysdashboards", dtoList);
	}

    /**
     * 更新 系统数据看板 [PSSYSDASHBOARD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDashboard(PSSysDashboardDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDASHBOARD, "pssysdashboards", PSSysDashboardDTO.class, dto);
	}

    /**
     * 批更新 系统数据看板 [PSSYSDASHBOARD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDashboards(List<PSSysDashboardDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDASHBOARD, "pssysdashboards", dtoList);
	}

    /**
     * 获取 系统数据看板 [PSSYSDASHBOARD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDashboardDTO getPSSysDashboard(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDASHBOARD, "pssysdashboards", PSSysDashboardDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据看板 [PSSYSDASHBOARD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDashboard(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDASHBOARD, "pssysdashboards", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据看板 [PSSYSDASHBOARD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDashboardDTO> searchPSSysDashboards(PSSysDashboardFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDASHBOARD, "pssysdashboards", PSSysDashboardDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据看板 [PSSYSDASHBOARD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDashboardDTO> searchAllPSSysDashboards(PSSysDashboardFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDASHBOARD, "pssysdashboards", PSSysDashboardDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDataSyncAgent(PSSysDataSyncAgentDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", PSSysDataSyncAgentDTO.class, dto);
	}

    /**
     * 批建立 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDataSyncAgents(List<PSSysDataSyncAgentDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", dtoList);
	}

    /**
     * 更新 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDataSyncAgent(PSSysDataSyncAgentDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", PSSysDataSyncAgentDTO.class, dto);
	}

    /**
     * 批更新 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDataSyncAgents(List<PSSysDataSyncAgentDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", dtoList);
	}

    /**
     * 获取 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDataSyncAgentDTO getPSSysDataSyncAgent(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", PSSysDataSyncAgentDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDataSyncAgent(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDataSyncAgentDTO> searchPSSysDataSyncAgents(PSSysDataSyncAgentFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", PSSysDataSyncAgentDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据同步代理 [PSSYSDATASYNCAGENT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDataSyncAgentDTO> searchAllPSSysDataSyncAgents(PSSysDataSyncAgentFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDATASYNCAGENT, "pssysdatasyncagents", PSSysDataSyncAgentDTO.class, iSearchContext);
	}

    /**
     * 建立 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDevBKTask(PSSysDevBKTaskDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", PSSysDevBKTaskDTO.class, dto);
	}

    /**
     * 批建立 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDevBKTasks(List<PSSysDevBKTaskDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", dtoList);
	}

    /**
     * 更新 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDevBKTask(PSSysDevBKTaskDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", PSSysDevBKTaskDTO.class, dto);
	}

    /**
     * 批更新 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDevBKTasks(List<PSSysDevBKTaskDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", dtoList);
	}

    /**
     * 获取 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDevBKTaskDTO getPSSysDevBKTask(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", PSSysDevBKTaskDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDevBKTask(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDevBKTaskDTO> searchPSSysDevBKTasks(PSSysDevBKTaskFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", PSSysDevBKTaskDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统开发后台任务 [PSSYSDEVBKTASK]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDevBKTaskDTO> searchAllPSSysDevBKTasks(PSSysDevBKTaskFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDEVBKTASK, "pssysdevbktasks", PSSysDevBKTaskDTO.class, iSearchContext);
	}

    /**
     * 建立 系统输入词条类别 [PSSYSDICTCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDictCat(PSSysDictCatDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDICTCAT, "pssysdictcats", PSSysDictCatDTO.class, dto);
	}

    /**
     * 批建立 系统输入词条类别 [PSSYSDICTCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDictCats(List<PSSysDictCatDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDICTCAT, "pssysdictcats", dtoList);
	}

    /**
     * 更新 系统输入词条类别 [PSSYSDICTCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDictCat(PSSysDictCatDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDICTCAT, "pssysdictcats", PSSysDictCatDTO.class, dto);
	}

    /**
     * 批更新 系统输入词条类别 [PSSYSDICTCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDictCats(List<PSSysDictCatDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDICTCAT, "pssysdictcats", dtoList);
	}

    /**
     * 获取 系统输入词条类别 [PSSYSDICTCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDictCatDTO getPSSysDictCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDICTCAT, "pssysdictcats", PSSysDictCatDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统输入词条类别 [PSSYSDICTCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDictCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDICTCAT, "pssysdictcats", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统输入词条类别 [PSSYSDICTCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDictCatDTO> searchPSSysDictCats(PSSysDictCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDICTCAT, "pssysdictcats", PSSysDictCatDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统输入词条类别 [PSSYSDICTCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDictCatDTO> searchAllPSSysDictCats(PSSysDictCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDICTCAT, "pssysdictcats", PSSysDictCatDTO.class, iSearchContext);
	}

    /**
     * 建立 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDynaModel(PSSysDynaModelDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", PSSysDynaModelDTO.class, dto);
	}

    /**
     * 批建立 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDynaModels(List<PSSysDynaModelDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", dtoList);
	}

    /**
     * 更新 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDynaModel(PSSysDynaModelDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", PSSysDynaModelDTO.class, dto);
	}

    /**
     * 批更新 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDynaModels(List<PSSysDynaModelDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", dtoList);
	}

    /**
     * 获取 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDynaModelDTO getPSSysDynaModel(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", PSSysDynaModelDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDynaModel(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDynaModelDTO> searchPSSysDynaModels(PSSysDynaModelFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", PSSysDynaModelDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统动态模型对象 [PSSYSDYNAMODEL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDynaModelDTO> searchAllPSSysDynaModels(PSSysDynaModelFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDYNAMODEL, "pssysdynamodels", PSSysDynaModelDTO.class, iSearchContext);
	}

    /**
     * 建立 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDynaModelAttr(PSSysDynaModelAttrDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", PSSysDynaModelAttrDTO.class, dto);
	}

    /**
     * 批建立 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDynaModelAttrs(List<PSSysDynaModelAttrDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", dtoList);
	}

    /**
     * 更新 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDynaModelAttr(PSSysDynaModelAttrDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", PSSysDynaModelAttrDTO.class, dto);
	}

    /**
     * 批更新 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDynaModelAttrs(List<PSSysDynaModelAttrDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", dtoList);
	}

    /**
     * 获取 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDynaModelAttrDTO getPSSysDynaModelAttr(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", PSSysDynaModelAttrDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDynaModelAttr(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDynaModelAttrDTO> searchPSSysDynaModelAttrs(PSSysDynaModelAttrFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", PSSysDynaModelAttrDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统动态模型属性 [PSSYSDYNAMODELATTR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDynaModelAttrDTO> searchAllPSSysDynaModelAttrs(PSSysDynaModelAttrFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDYNAMODELATTR, "pssysdynamodelattrs", PSSysDynaModelAttrDTO.class, iSearchContext);
	}

    /**
     * 建立 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysDynaModelCat(PSSysDynaModelCatDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", PSSysDynaModelCatDTO.class, dto);
	}

    /**
     * 批建立 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysDynaModelCats(List<PSSysDynaModelCatDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", dtoList);
	}

    /**
     * 更新 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysDynaModelCat(PSSysDynaModelCatDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", PSSysDynaModelCatDTO.class, dto);
	}

    /**
     * 批更新 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysDynaModelCats(List<PSSysDynaModelCatDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", dtoList);
	}

    /**
     * 获取 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysDynaModelCatDTO getPSSysDynaModelCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", PSSysDynaModelCatDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysDynaModelCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysDynaModelCatDTO> searchPSSysDynaModelCats(PSSysDynaModelCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", PSSysDynaModelCatDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统动态模型分类 [PSSYSDYNAMODELCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysDynaModelCatDTO> searchAllPSSysDynaModelCats(PSSysDynaModelCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSDYNAMODELCAT, "pssysdynamodelcats", PSSysDynaModelCatDTO.class, iSearchContext);
	}

    /**
     * 建立 应用集成体系 [PSSYSEAISCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysEAIScheme(PSSysEAISchemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSEAISCHEME, "pssyseaischemes", PSSysEAISchemeDTO.class, dto);
	}

    /**
     * 批建立 应用集成体系 [PSSYSEAISCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysEAISchemes(List<PSSysEAISchemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSEAISCHEME, "pssyseaischemes", dtoList);
	}

    /**
     * 更新 应用集成体系 [PSSYSEAISCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysEAIScheme(PSSysEAISchemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSEAISCHEME, "pssyseaischemes", PSSysEAISchemeDTO.class, dto);
	}

    /**
     * 批更新 应用集成体系 [PSSYSEAISCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysEAISchemes(List<PSSysEAISchemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSEAISCHEME, "pssyseaischemes", dtoList);
	}

    /**
     * 获取 应用集成体系 [PSSYSEAISCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysEAISchemeDTO getPSSysEAIScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSEAISCHEME, "pssyseaischemes", PSSysEAISchemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 应用集成体系 [PSSYSEAISCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysEAIScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSEAISCHEME, "pssyseaischemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 应用集成体系 [PSSYSEAISCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysEAISchemeDTO> searchPSSysEAISchemes(PSSysEAISchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSEAISCHEME, "pssyseaischemes", PSSysEAISchemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 应用集成体系 [PSSYSEAISCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysEAISchemeDTO> searchAllPSSysEAISchemes(PSSysEAISchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSEAISCHEME, "pssyseaischemes", PSSysEAISchemeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统ER图 [PSSYSERMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysERMap(PSSysERMapDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSERMAP, "pssysermaps", PSSysERMapDTO.class, dto);
	}

    /**
     * 批建立 系统ER图 [PSSYSERMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysERMaps(List<PSSysERMapDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSERMAP, "pssysermaps", dtoList);
	}

    /**
     * 更新 系统ER图 [PSSYSERMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysERMap(PSSysERMapDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSERMAP, "pssysermaps", PSSysERMapDTO.class, dto);
	}

    /**
     * 批更新 系统ER图 [PSSYSERMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysERMaps(List<PSSysERMapDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSERMAP, "pssysermaps", dtoList);
	}

    /**
     * 获取 系统ER图 [PSSYSERMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysERMapDTO getPSSysERMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSERMAP, "pssysermaps", PSSysERMapDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统ER图 [PSSYSERMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysERMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSERMAP, "pssysermaps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统ER图 [PSSYSERMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysERMapDTO> searchPSSysERMaps(PSSysERMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSERMAP, "pssysermaps", PSSysERMapDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统ER图 [PSSYSERMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysERMapDTO> searchAllPSSysERMaps(PSSysERMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSERMAP, "pssysermaps", PSSysERMapDTO.class, iSearchContext);
	}

    /**
     * 建立 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysEditorStyle(PSSysEditorStyleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", PSSysEditorStyleDTO.class, dto);
	}

    /**
     * 批建立 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysEditorStyles(List<PSSysEditorStyleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", dtoList);
	}

    /**
     * 更新 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysEditorStyle(PSSysEditorStyleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", PSSysEditorStyleDTO.class, dto);
	}

    /**
     * 批更新 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysEditorStyles(List<PSSysEditorStyleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", dtoList);
	}

    /**
     * 获取 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysEditorStyleDTO getPSSysEditorStyle(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", PSSysEditorStyleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysEditorStyle(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysEditorStyleDTO> searchPSSysEditorStyles(PSSysEditorStyleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", PSSysEditorStyleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统编辑器样式 [PSSYSEDITORSTYLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysEditorStyleDTO> searchAllPSSysEditorStyles(PSSysEditorStyleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSEDITORSTYLE, "pssyseditorstyles", PSSysEditorStyleDTO.class, iSearchContext);
	}

    /**
     * 建立 系统图片资源 [PSSYSIMAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysImage(PSSysImageDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSIMAGE, "pssysimages", PSSysImageDTO.class, dto);
	}

    /**
     * 批建立 系统图片资源 [PSSYSIMAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysImages(List<PSSysImageDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSIMAGE, "pssysimages", dtoList);
	}

    /**
     * 更新 系统图片资源 [PSSYSIMAGE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysImage(PSSysImageDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSIMAGE, "pssysimages", PSSysImageDTO.class, dto);
	}

    /**
     * 批更新 系统图片资源 [PSSYSIMAGE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysImages(List<PSSysImageDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSIMAGE, "pssysimages", dtoList);
	}

    /**
     * 获取 系统图片资源 [PSSYSIMAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysImageDTO getPSSysImage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSIMAGE, "pssysimages", PSSysImageDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统图片资源 [PSSYSIMAGE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysImage(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSIMAGE, "pssysimages", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统图片资源 [PSSYSIMAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysImageDTO> searchPSSysImages(PSSysImageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSIMAGE, "pssysimages", PSSysImageDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统图片资源 [PSSYSIMAGE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysImageDTO> searchAllPSSysImages(PSSysImageFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSIMAGE, "pssysimages", PSSysImageDTO.class, iSearchContext);
	}

    /**
     * 建立 系统地图部件 [PSSYSMAPVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysMapView(PSSysMapViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSMAPVIEW, "pssysmapviews", PSSysMapViewDTO.class, dto);
	}

    /**
     * 批建立 系统地图部件 [PSSYSMAPVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysMapViews(List<PSSysMapViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSMAPVIEW, "pssysmapviews", dtoList);
	}

    /**
     * 更新 系统地图部件 [PSSYSMAPVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysMapView(PSSysMapViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMAPVIEW, "pssysmapviews", PSSysMapViewDTO.class, dto);
	}

    /**
     * 批更新 系统地图部件 [PSSYSMAPVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysMapViews(List<PSSysMapViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMAPVIEW, "pssysmapviews", dtoList);
	}

    /**
     * 获取 系统地图部件 [PSSYSMAPVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysMapViewDTO getPSSysMapView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSMAPVIEW, "pssysmapviews", PSSysMapViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统地图部件 [PSSYSMAPVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysMapView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSMAPVIEW, "pssysmapviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统地图部件 [PSSYSMAPVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysMapViewDTO> searchPSSysMapViews(PSSysMapViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSMAPVIEW, "pssysmapviews", PSSysMapViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统地图部件 [PSSYSMAPVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysMapViewDTO> searchAllPSSysMapViews(PSSysMapViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSMAPVIEW, "pssysmapviews", PSSysMapViewDTO.class, iSearchContext);
	}

    /**
     * 建立 系统模型组 [PSSYSMODELGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysModelGroup(PSSysModelGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", PSSysModelGroupDTO.class, dto);
	}

    /**
     * 批建立 系统模型组 [PSSYSMODELGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysModelGroups(List<PSSysModelGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", dtoList);
	}

    /**
     * 更新 系统模型组 [PSSYSMODELGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysModelGroup(PSSysModelGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", PSSysModelGroupDTO.class, dto);
	}

    /**
     * 批更新 系统模型组 [PSSYSMODELGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysModelGroups(List<PSSysModelGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", dtoList);
	}

    /**
     * 获取 系统模型组 [PSSYSMODELGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysModelGroupDTO getPSSysModelGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", PSSysModelGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统模型组 [PSSYSMODELGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysModelGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统模型组 [PSSYSMODELGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysModelGroupDTO> searchPSSysModelGroups(PSSysModelGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", PSSysModelGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统模型组 [PSSYSMODELGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysModelGroupDTO> searchAllPSSysModelGroups(PSSysModelGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSMODELGROUP, "pssysmodelgroups", PSSysModelGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 系统消息队列 [PSSYSMSGQUEUE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysMsgQueue(PSSysMsgQueueDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", PSSysMsgQueueDTO.class, dto);
	}

    /**
     * 批建立 系统消息队列 [PSSYSMSGQUEUE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysMsgQueues(List<PSSysMsgQueueDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", dtoList);
	}

    /**
     * 更新 系统消息队列 [PSSYSMSGQUEUE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysMsgQueue(PSSysMsgQueueDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", PSSysMsgQueueDTO.class, dto);
	}

    /**
     * 批更新 系统消息队列 [PSSYSMSGQUEUE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysMsgQueues(List<PSSysMsgQueueDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", dtoList);
	}

    /**
     * 获取 系统消息队列 [PSSYSMSGQUEUE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysMsgQueueDTO getPSSysMsgQueue(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", PSSysMsgQueueDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统消息队列 [PSSYSMSGQUEUE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysMsgQueue(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统消息队列 [PSSYSMSGQUEUE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysMsgQueueDTO> searchPSSysMsgQueues(PSSysMsgQueueFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", PSSysMsgQueueDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统消息队列 [PSSYSMSGQUEUE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysMsgQueueDTO> searchAllPSSysMsgQueues(PSSysMsgQueueFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSMSGQUEUE, "pssysmsgqueues", PSSysMsgQueueDTO.class, iSearchContext);
	}

    /**
     * 建立 系统消息目标 [PSSYSMSGTARGET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysMsgTarget(PSSysMsgTargetDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", PSSysMsgTargetDTO.class, dto);
	}

    /**
     * 批建立 系统消息目标 [PSSYSMSGTARGET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysMsgTargets(List<PSSysMsgTargetDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", dtoList);
	}

    /**
     * 更新 系统消息目标 [PSSYSMSGTARGET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysMsgTarget(PSSysMsgTargetDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", PSSysMsgTargetDTO.class, dto);
	}

    /**
     * 批更新 系统消息目标 [PSSYSMSGTARGET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysMsgTargets(List<PSSysMsgTargetDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", dtoList);
	}

    /**
     * 获取 系统消息目标 [PSSYSMSGTARGET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysMsgTargetDTO getPSSysMsgTarget(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", PSSysMsgTargetDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统消息目标 [PSSYSMSGTARGET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysMsgTarget(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统消息目标 [PSSYSMSGTARGET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysMsgTargetDTO> searchPSSysMsgTargets(PSSysMsgTargetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", PSSysMsgTargetDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统消息目标 [PSSYSMSGTARGET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysMsgTargetDTO> searchAllPSSysMsgTargets(PSSysMsgTargetFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSMSGTARGET, "pssysmsgtargets", PSSysMsgTargetDTO.class, iSearchContext);
	}

    /**
     * 建立 系统消息模板 [PSSYSMSGTEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysMsgTempl(PSSysMsgTemplDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", PSSysMsgTemplDTO.class, dto);
	}

    /**
     * 批建立 系统消息模板 [PSSYSMSGTEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysMsgTempls(List<PSSysMsgTemplDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", dtoList);
	}

    /**
     * 更新 系统消息模板 [PSSYSMSGTEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysMsgTempl(PSSysMsgTemplDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", PSSysMsgTemplDTO.class, dto);
	}

    /**
     * 批更新 系统消息模板 [PSSYSMSGTEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysMsgTempls(List<PSSysMsgTemplDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", dtoList);
	}

    /**
     * 获取 系统消息模板 [PSSYSMSGTEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysMsgTemplDTO getPSSysMsgTempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", PSSysMsgTemplDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统消息模板 [PSSYSMSGTEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysMsgTempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统消息模板 [PSSYSMSGTEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysMsgTemplDTO> searchPSSysMsgTempls(PSSysMsgTemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", PSSysMsgTemplDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统消息模板 [PSSYSMSGTEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysMsgTemplDTO> searchAllPSSysMsgTempls(PSSysMsgTemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSMSGTEMPL, "pssysmsgtempls", PSSysMsgTemplDTO.class, iSearchContext);
	}

    /**
     * 建立 系统操作角色 [PSSYSUSERROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUserRole(PSSysUserRoleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERROLE, "pssysopprivs", PSSysUserRoleDTO.class, dto);
	}

    /**
     * 批建立 系统操作角色 [PSSYSUSERROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUserRoles(List<PSSysUserRoleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERROLE, "pssysopprivs", dtoList);
	}

    /**
     * 更新 系统操作角色 [PSSYSUSERROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUserRole(PSSysUserRoleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERROLE, "pssysopprivs", PSSysUserRoleDTO.class, dto);
	}

    /**
     * 批更新 系统操作角色 [PSSYSUSERROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUserRoles(List<PSSysUserRoleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERROLE, "pssysopprivs", dtoList);
	}

    /**
     * 获取 系统操作角色 [PSSYSUSERROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUserRoleDTO getPSSysUserRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSERROLE, "pssysopprivs", PSSysUserRoleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统操作角色 [PSSYSUSERROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUserRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSERROLE, "pssysopprivs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统操作角色 [PSSYSUSERROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUserRoleDTO> searchPSSysUserRoles(PSSysUserRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSERROLE, "pssysopprivs", PSSysUserRoleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统操作角色 [PSSYSUSERROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUserRoleDTO> searchAllPSSysUserRoles(PSSysUserRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSERROLE, "pssysopprivs", PSSysUserRoleDTO.class, iSearchContext);
	}

    /**
     * 建立 系统预置视图 [PSSYSPDTVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysPDTView(PSSysPDTViewDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSPDTVIEW, "pssyspdtviews", PSSysPDTViewDTO.class, dto);
	}

    /**
     * 批建立 系统预置视图 [PSSYSPDTVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysPDTViews(List<PSSysPDTViewDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSPDTVIEW, "pssyspdtviews", dtoList);
	}

    /**
     * 更新 系统预置视图 [PSSYSPDTVIEW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysPDTView(PSSysPDTViewDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPDTVIEW, "pssyspdtviews", PSSysPDTViewDTO.class, dto);
	}

    /**
     * 批更新 系统预置视图 [PSSYSPDTVIEW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysPDTViews(List<PSSysPDTViewDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPDTVIEW, "pssyspdtviews", dtoList);
	}

    /**
     * 获取 系统预置视图 [PSSYSPDTVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysPDTViewDTO getPSSysPDTView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSPDTVIEW, "pssyspdtviews", PSSysPDTViewDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统预置视图 [PSSYSPDTVIEW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysPDTView(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSPDTVIEW, "pssyspdtviews", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统预置视图 [PSSYSPDTVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysPDTViewDTO> searchPSSysPDTViews(PSSysPDTViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSPDTVIEW, "pssyspdtviews", PSSysPDTViewDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统预置视图 [PSSYSPDTVIEW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysPDTViewDTO> searchAllPSSysPDTViews(PSSysPDTViewFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSPDTVIEW, "pssyspdtviews", PSSysPDTViewDTO.class, iSearchContext);
	}

    /**
     * 建立 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysPFPITempl(PSSysPFPITemplDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", PSSysPFPITemplDTO.class, dto);
	}

    /**
     * 批建立 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysPFPITempls(List<PSSysPFPITemplDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", dtoList);
	}

    /**
     * 更新 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysPFPITempl(PSSysPFPITemplDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", PSSysPFPITemplDTO.class, dto);
	}

    /**
     * 批更新 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysPFPITempls(List<PSSysPFPITemplDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", dtoList);
	}

    /**
     * 获取 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysPFPITemplDTO getPSSysPFPITempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", PSSysPFPITemplDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysPFPITempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysPFPITemplDTO> searchPSSysPFPITempls(PSSysPFPITemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", PSSysPFPITemplDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 前端模板插件代码 [PSSYSPFPITEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysPFPITemplDTO> searchAllPSSysPFPITempls(PSSysPFPITemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSPFPITEMPL, "pssyspfpitempls", PSSysPFPITemplDTO.class, iSearchContext);
	}

    /**
     * 建立 前端模板插件 [PSSYSPFPLUGIN]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysPFPlugin(PSSysPFPluginDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", PSSysPFPluginDTO.class, dto);
	}

    /**
     * 批建立 前端模板插件 [PSSYSPFPLUGIN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysPFPlugins(List<PSSysPFPluginDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", dtoList);
	}

    /**
     * 更新 前端模板插件 [PSSYSPFPLUGIN]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysPFPlugin(PSSysPFPluginDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", PSSysPFPluginDTO.class, dto);
	}

    /**
     * 批更新 前端模板插件 [PSSYSPFPLUGIN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysPFPlugins(List<PSSysPFPluginDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", dtoList);
	}

    /**
     * 获取 前端模板插件 [PSSYSPFPLUGIN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysPFPluginDTO getPSSysPFPlugin(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", PSSysPFPluginDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 前端模板插件 [PSSYSPFPLUGIN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysPFPlugin(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 前端模板插件 [PSSYSPFPLUGIN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysPFPluginDTO> searchPSSysPFPlugins(PSSysPFPluginFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", PSSysPFPluginDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 前端模板插件 [PSSYSPFPLUGIN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysPFPluginDTO> searchAllPSSysPFPlugins(PSSysPFPluginFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSPFPLUGIN, "pssyspfplugins", PSSysPFPluginDTO.class, iSearchContext);
	}

    /**
     * 建立 系统门户部件 [PSSYSPORTLET]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysPortlet(PSSysPortletDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSPORTLET, "pssysportlets", PSSysPortletDTO.class, dto);
	}

    /**
     * 批建立 系统门户部件 [PSSYSPORTLET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysPortlets(List<PSSysPortletDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSPORTLET, "pssysportlets", dtoList);
	}

    /**
     * 更新 系统门户部件 [PSSYSPORTLET]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysPortlet(PSSysPortletDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPORTLET, "pssysportlets", PSSysPortletDTO.class, dto);
	}

    /**
     * 批更新 系统门户部件 [PSSYSPORTLET]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysPortlets(List<PSSysPortletDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPORTLET, "pssysportlets", dtoList);
	}

    /**
     * 获取 系统门户部件 [PSSYSPORTLET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysPortletDTO getPSSysPortlet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSPORTLET, "pssysportlets", PSSysPortletDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统门户部件 [PSSYSPORTLET]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysPortlet(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSPORTLET, "pssysportlets", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统门户部件 [PSSYSPORTLET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysPortletDTO> searchPSSysPortlets(PSSysPortletFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSPORTLET, "pssysportlets", PSSysPortletDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统门户部件 [PSSYSPORTLET]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysPortletDTO> searchAllPSSysPortlets(PSSysPortletFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSPORTLET, "pssysportlets", PSSysPortletDTO.class, iSearchContext);
	}

    /**
     * 建立 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysPortletCat(PSSysPortletCatDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSPORTLETCAT, "pssysportletcats", PSSysPortletCatDTO.class, dto);
	}

    /**
     * 批建立 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysPortletCats(List<PSSysPortletCatDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSPORTLETCAT, "pssysportletcats", dtoList);
	}

    /**
     * 更新 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysPortletCat(PSSysPortletCatDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPORTLETCAT, "pssysportletcats", PSSysPortletCatDTO.class, dto);
	}

    /**
     * 批更新 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysPortletCats(List<PSSysPortletCatDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSPORTLETCAT, "pssysportletcats", dtoList);
	}

    /**
     * 获取 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysPortletCatDTO getPSSysPortletCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSPORTLETCAT, "pssysportletcats", PSSysPortletCatDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysPortletCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSPORTLETCAT, "pssysportletcats", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysPortletCatDTO> searchPSSysPortletCats(PSSysPortletCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSPORTLETCAT, "pssysportletcats", PSSysPortletCatDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统门户部件分类 [PSSYSPORTLETCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysPortletCatDTO> searchAllPSSysPortletCats(PSSysPortletCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSPORTLETCAT, "pssysportletcats", PSSysPortletCatDTO.class, iSearchContext);
	}

    /**
     * 建立 系统引用 [PSSYSREF]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysRef(PSSysRefDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSREF, "pssysrefs", PSSysRefDTO.class, dto);
	}

    /**
     * 批建立 系统引用 [PSSYSREF]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysRefs(List<PSSysRefDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSREF, "pssysrefs", dtoList);
	}

    /**
     * 更新 系统引用 [PSSYSREF]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysRef(PSSysRefDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREF, "pssysrefs", PSSysRefDTO.class, dto);
	}

    /**
     * 批更新 系统引用 [PSSYSREF]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysRefs(List<PSSysRefDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREF, "pssysrefs", dtoList);
	}

    /**
     * 获取 系统引用 [PSSYSREF]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysRefDTO getPSSysRef(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSREF, "pssysrefs", PSSysRefDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统引用 [PSSYSREF]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysRef(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSREF, "pssysrefs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统引用 [PSSYSREF]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysRefDTO> searchPSSysRefs(PSSysRefFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSREF, "pssysrefs", PSSysRefDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统引用 [PSSYSREF]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysRefDTO> searchAllPSSysRefs(PSSysRefFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSREF, "pssysrefs", PSSysRefDTO.class, iSearchContext);
	}

    /**
     * 建立 系统需求项 [PSSYSREQITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysReqItem(PSSysReqItemDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQITEM, "pssysreqitems", PSSysReqItemDTO.class, dto);
	}

    /**
     * 批建立 系统需求项 [PSSYSREQITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysReqItems(List<PSSysReqItemDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQITEM, "pssysreqitems", dtoList);
	}

    /**
     * 更新 系统需求项 [PSSYSREQITEM]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysReqItem(PSSysReqItemDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQITEM, "pssysreqitems", PSSysReqItemDTO.class, dto);
	}

    /**
     * 批更新 系统需求项 [PSSYSREQITEM]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysReqItems(List<PSSysReqItemDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQITEM, "pssysreqitems", dtoList);
	}

    /**
     * 获取 系统需求项 [PSSYSREQITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysReqItemDTO getPSSysReqItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSREQITEM, "pssysreqitems", PSSysReqItemDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统需求项 [PSSYSREQITEM]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysReqItem(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSREQITEM, "pssysreqitems", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统需求项 [PSSYSREQITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysReqItemDTO> searchPSSysReqItems(PSSysReqItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSREQITEM, "pssysreqitems", PSSysReqItemDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统需求项 [PSSYSREQITEM]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysReqItemDTO> searchAllPSSysReqItems(PSSysReqItemFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSREQITEM, "pssysreqitems", PSSysReqItemDTO.class, iSearchContext);
	}

    /**
     * 建立 需求项讨论 [PSSYSREQITEMDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysReqItemData(PSSysReqItemDataDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", PSSysReqItemDataDTO.class, dto);
	}

    /**
     * 批建立 需求项讨论 [PSSYSREQITEMDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysReqItemData(List<PSSysReqItemDataDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", dtoList);
	}

    /**
     * 更新 需求项讨论 [PSSYSREQITEMDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysReqItemData(PSSysReqItemDataDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", PSSysReqItemDataDTO.class, dto);
	}

    /**
     * 批更新 需求项讨论 [PSSYSREQITEMDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysReqItemData(List<PSSysReqItemDataDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", dtoList);
	}

    /**
     * 获取 需求项讨论 [PSSYSREQITEMDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysReqItemDataDTO getPSSysReqItemData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", PSSysReqItemDataDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 需求项讨论 [PSSYSREQITEMDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysReqItemData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 需求项讨论 [PSSYSREQITEMDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysReqItemDataDTO> searchPSSysReqItemData(PSSysReqItemDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", PSSysReqItemDataDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 需求项讨论 [PSSYSREQITEMDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysReqItemDataDTO> searchAllPSSysReqItemData(PSSysReqItemDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSREQITEMDATA, "pssysreqitemdata", PSSysReqItemDataDTO.class, iSearchContext);
	}

    /**
     * 建立 需求项备份 [PSSYSREQITEMHIS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysReqItemHis(PSSysReqItemHisDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", PSSysReqItemHisDTO.class, dto);
	}

    /**
     * 批建立 需求项备份 [PSSYSREQITEMHIS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysReqItemHis(List<PSSysReqItemHisDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", dtoList);
	}

    /**
     * 更新 需求项备份 [PSSYSREQITEMHIS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysReqItemHis(PSSysReqItemHisDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", PSSysReqItemHisDTO.class, dto);
	}

    /**
     * 批更新 需求项备份 [PSSYSREQITEMHIS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysReqItemHis(List<PSSysReqItemHisDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", dtoList);
	}

    /**
     * 获取 需求项备份 [PSSYSREQITEMHIS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysReqItemHisDTO getPSSysReqItemHis(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", PSSysReqItemHisDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 需求项备份 [PSSYSREQITEMHIS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysReqItemHis(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 需求项备份 [PSSYSREQITEMHIS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysReqItemHisDTO> searchPSSysReqItemHis(PSSysReqItemHisFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", PSSysReqItemHisDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 需求项备份 [PSSYSREQITEMHIS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysReqItemHisDTO> searchAllPSSysReqItemHis(PSSysReqItemHisFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSREQITEMHIS, "pssysreqitemhis", PSSysReqItemHisDTO.class, iSearchContext);
	}

    /**
     * 建立 系统需求模块 [PSSYSREQMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysReqModule(PSSysReqModuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQMODULE, "pssysreqmodules", PSSysReqModuleDTO.class, dto);
	}

    /**
     * 批建立 系统需求模块 [PSSYSREQMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysReqModules(List<PSSysReqModuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSREQMODULE, "pssysreqmodules", dtoList);
	}

    /**
     * 更新 系统需求模块 [PSSYSREQMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysReqModule(PSSysReqModuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQMODULE, "pssysreqmodules", PSSysReqModuleDTO.class, dto);
	}

    /**
     * 批更新 系统需求模块 [PSSYSREQMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysReqModules(List<PSSysReqModuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSREQMODULE, "pssysreqmodules", dtoList);
	}

    /**
     * 获取 系统需求模块 [PSSYSREQMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysReqModuleDTO getPSSysReqModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSREQMODULE, "pssysreqmodules", PSSysReqModuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统需求模块 [PSSYSREQMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysReqModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSREQMODULE, "pssysreqmodules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统需求模块 [PSSYSREQMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysReqModuleDTO> searchPSSysReqModules(PSSysReqModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSREQMODULE, "pssysreqmodules", PSSysReqModuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统需求模块 [PSSYSREQMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysReqModuleDTO> searchAllPSSysReqModules(PSSysReqModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSREQMODULE, "pssysreqmodules", PSSysReqModuleDTO.class, iSearchContext);
	}

    /**
     * 建立 系统资源 [PSSYSRESOURCE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysResource(PSSysResourceDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSRESOURCE, "pssysresources", PSSysResourceDTO.class, dto);
	}

    /**
     * 批建立 系统资源 [PSSYSRESOURCE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysResources(List<PSSysResourceDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSRESOURCE, "pssysresources", dtoList);
	}

    /**
     * 更新 系统资源 [PSSYSRESOURCE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysResource(PSSysResourceDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSRESOURCE, "pssysresources", PSSysResourceDTO.class, dto);
	}

    /**
     * 批更新 系统资源 [PSSYSRESOURCE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysResources(List<PSSysResourceDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSRESOURCE, "pssysresources", dtoList);
	}

    /**
     * 获取 系统资源 [PSSYSRESOURCE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysResourceDTO getPSSysResource(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSRESOURCE, "pssysresources", PSSysResourceDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统资源 [PSSYSRESOURCE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysResource(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSRESOURCE, "pssysresources", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统资源 [PSSYSRESOURCE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysResourceDTO> searchPSSysResources(PSSysResourceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSRESOURCE, "pssysresources", PSSysResourceDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统资源 [PSSYSRESOURCE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysResourceDTO> searchAllPSSysResources(PSSysResourceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSRESOURCE, "pssysresources", PSSysResourceDTO.class, iSearchContext);
	}

    /**
     * 建立 系统运行会话 [PSSYSRUNSESSION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysRunSession(PSSysRunSessionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSRUNSESSION, "pssysrunsessions", PSSysRunSessionDTO.class, dto);
	}

    /**
     * 批建立 系统运行会话 [PSSYSRUNSESSION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysRunSessions(List<PSSysRunSessionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSRUNSESSION, "pssysrunsessions", dtoList);
	}

    /**
     * 更新 系统运行会话 [PSSYSRUNSESSION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysRunSession(PSSysRunSessionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSRUNSESSION, "pssysrunsessions", PSSysRunSessionDTO.class, dto);
	}

    /**
     * 批更新 系统运行会话 [PSSYSRUNSESSION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysRunSessions(List<PSSysRunSessionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSRUNSESSION, "pssysrunsessions", dtoList);
	}

    /**
     * 获取 系统运行会话 [PSSYSRUNSESSION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysRunSessionDTO getPSSysRunSession(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSRUNSESSION, "pssysrunsessions", PSSysRunSessionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统运行会话 [PSSYSRUNSESSION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysRunSession(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSRUNSESSION, "pssysrunsessions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统运行会话 [PSSYSRUNSESSION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysRunSessionDTO> searchPSSysRunSessions(PSSysRunSessionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSRUNSESSION, "pssysrunsessions", PSSysRunSessionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统运行会话 [PSSYSRUNSESSION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysRunSessionDTO> searchAllPSSysRunSessions(PSSysRunSessionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSRUNSESSION, "pssysrunsessions", PSSysRunSessionDTO.class, iSearchContext);
	}

    /**
     * 建立 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSAHandler(PSSysSAHandlerDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSAHANDLER, "pssyssahandlers", PSSysSAHandlerDTO.class, dto);
	}

    /**
     * 批建立 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSAHandlers(List<PSSysSAHandlerDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSAHANDLER, "pssyssahandlers", dtoList);
	}

    /**
     * 更新 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSAHandler(PSSysSAHandlerDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSAHANDLER, "pssyssahandlers", PSSysSAHandlerDTO.class, dto);
	}

    /**
     * 批更新 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSAHandlers(List<PSSysSAHandlerDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSAHANDLER, "pssyssahandlers", dtoList);
	}

    /**
     * 获取 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSAHandlerDTO getPSSysSAHandler(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSAHANDLER, "pssyssahandlers", PSSysSAHandlerDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSAHandler(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSAHANDLER, "pssyssahandlers", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSAHandlerDTO> searchPSSysSAHandlers(PSSysSAHandlerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSAHANDLER, "pssyssahandlers", PSSysSAHandlerDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统服务接口处理器 [PSSYSSAHANDLER]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSAHandlerDTO> searchAllPSSysSAHandlers(PSSysSAHandlerFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSAHANDLER, "pssyssahandlers", PSSysSAHandlerDTO.class, iSearchContext);
	}

    /**
     * 建立 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSFPITempl(PSSysSFPITemplDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", PSSysSFPITemplDTO.class, dto);
	}

    /**
     * 批建立 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSFPITempls(List<PSSysSFPITemplDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", dtoList);
	}

    /**
     * 更新 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSFPITempl(PSSysSFPITemplDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", PSSysSFPITemplDTO.class, dto);
	}

    /**
     * 批更新 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSFPITempls(List<PSSysSFPITemplDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", dtoList);
	}

    /**
     * 获取 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSFPITemplDTO getPSSysSFPITempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", PSSysSFPITemplDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSFPITempl(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSFPITemplDTO> searchPSSysSFPITempls(PSSysSFPITemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", PSSysSFPITemplDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 后台模板插件代码 [PSSYSSFPITEMPL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSFPITemplDTO> searchAllPSSysSFPITempls(PSSysSFPITemplFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSFPITEMPL, "pssyssfpitempls", PSSysSFPITemplDTO.class, iSearchContext);
	}

    /**
     * 建立 后台模板插件 [PSSYSSFPLUGIN]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSFPlugin(PSSysSFPluginDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", PSSysSFPluginDTO.class, dto);
	}

    /**
     * 批建立 后台模板插件 [PSSYSSFPLUGIN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSFPlugins(List<PSSysSFPluginDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", dtoList);
	}

    /**
     * 更新 后台模板插件 [PSSYSSFPLUGIN]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSFPlugin(PSSysSFPluginDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", PSSysSFPluginDTO.class, dto);
	}

    /**
     * 批更新 后台模板插件 [PSSYSSFPLUGIN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSFPlugins(List<PSSysSFPluginDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", dtoList);
	}

    /**
     * 获取 后台模板插件 [PSSYSSFPLUGIN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSFPluginDTO getPSSysSFPlugin(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", PSSysSFPluginDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 后台模板插件 [PSSYSSFPLUGIN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSFPlugin(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 后台模板插件 [PSSYSSFPLUGIN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSFPluginDTO> searchPSSysSFPlugins(PSSysSFPluginFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", PSSysSFPluginDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 后台模板插件 [PSSYSSFPLUGIN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSFPluginDTO> searchAllPSSysSFPlugins(PSSysSFPluginFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSFPLUGIN, "pssyssfplugins", PSSysSFPluginDTO.class, iSearchContext);
	}

    /**
     * 建立 后台体系 [PSSYSSFPUB]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSFPub(PSSysSFPubDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPUB, "pssyssfpubs", PSSysSFPubDTO.class, dto);
	}

    /**
     * 批建立 后台体系 [PSSYSSFPUB]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSFPubs(List<PSSysSFPubDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPUB, "pssyssfpubs", dtoList);
	}

    /**
     * 更新 后台体系 [PSSYSSFPUB]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSFPub(PSSysSFPubDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPUB, "pssyssfpubs", PSSysSFPubDTO.class, dto);
	}

    /**
     * 批更新 后台体系 [PSSYSSFPUB]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSFPubs(List<PSSysSFPubDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPUB, "pssyssfpubs", dtoList);
	}

    /**
     * 获取 后台体系 [PSSYSSFPUB]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSFPubDTO getPSSysSFPub(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSFPUB, "pssyssfpubs", PSSysSFPubDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 后台体系 [PSSYSSFPUB]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSFPub(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSFPUB, "pssyssfpubs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 后台体系 [PSSYSSFPUB]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSFPubDTO> searchPSSysSFPubs(PSSysSFPubFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSFPUB, "pssyssfpubs", PSSysSFPubDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 后台体系 [PSSYSSFPUB]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSFPubDTO> searchAllPSSysSFPubs(PSSysSFPubFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSFPUB, "pssyssfpubs", PSSysSFPubDTO.class, iSearchContext);
	}

    /**
     * 建立 后台体系组件 [PSSYSSFPUBPKG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSFPubPkg(PSSysSFPubPkgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", PSSysSFPubPkgDTO.class, dto);
	}

    /**
     * 批建立 后台体系组件 [PSSYSSFPUBPKG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSFPubPkgs(List<PSSysSFPubPkgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", dtoList);
	}

    /**
     * 更新 后台体系组件 [PSSYSSFPUBPKG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSFPubPkg(PSSysSFPubPkgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", PSSysSFPubPkgDTO.class, dto);
	}

    /**
     * 批更新 后台体系组件 [PSSYSSFPUBPKG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSFPubPkgs(List<PSSysSFPubPkgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", dtoList);
	}

    /**
     * 获取 后台体系组件 [PSSYSSFPUBPKG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSFPubPkgDTO getPSSysSFPubPkg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", PSSysSFPubPkgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 后台体系组件 [PSSYSSFPUBPKG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSFPubPkg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 后台体系组件 [PSSYSSFPUBPKG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSFPubPkgDTO> searchPSSysSFPubPkgs(PSSysSFPubPkgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", PSSysSFPubPkgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 后台体系组件 [PSSYSSFPUBPKG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSFPubPkgDTO> searchAllPSSysSFPubPkgs(PSSysSFPubPkgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSFPUBPKG, "pssyssfpubpkgs", PSSysSFPubPkgDTO.class, iSearchContext);
	}

    /**
     * 建立 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSampleValue(PSSysSampleValueDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", PSSysSampleValueDTO.class, dto);
	}

    /**
     * 批建立 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSampleValues(List<PSSysSampleValueDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", dtoList);
	}

    /**
     * 更新 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSampleValue(PSSysSampleValueDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", PSSysSampleValueDTO.class, dto);
	}

    /**
     * 批更新 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSampleValues(List<PSSysSampleValueDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", dtoList);
	}

    /**
     * 获取 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSampleValueDTO getPSSysSampleValue(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", PSSysSampleValueDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSampleValue(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSampleValueDTO> searchPSSysSampleValues(PSSysSampleValueFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", PSSysSampleValueDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统示例值 [PSSYSSAMPLEVALUE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSampleValueDTO> searchAllPSSysSampleValues(PSSysSampleValueFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSAMPLEVALUE, "pssyssamplevalues", PSSysSampleValueDTO.class, iSearchContext);
	}

    /**
     * 建立 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSearchBar(PSSysSearchBarDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", PSSysSearchBarDTO.class, dto);
	}

    /**
     * 批建立 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSearchBars(List<PSSysSearchBarDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", dtoList);
	}

    /**
     * 更新 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSearchBar(PSSysSearchBarDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", PSSysSearchBarDTO.class, dto);
	}

    /**
     * 批更新 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSearchBars(List<PSSysSearchBarDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", dtoList);
	}

    /**
     * 获取 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSearchBarDTO getPSSysSearchBar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", PSSysSearchBarDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSearchBar(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSearchBarDTO> searchPSSysSearchBars(PSSysSearchBarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", PSSysSearchBarDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统搜索栏 [PSSYSSEARCHBAR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSearchBarDTO> searchAllPSSysSearchBars(PSSysSearchBarFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEARCHBAR, "pssyssearchbars", PSSysSearchBarDTO.class, iSearchContext);
	}

    /**
     * 建立 全文检索实体 [PSSYSSEARCHDE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSearchDE(PSSysSearchDEDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHDE, "pssyssearchdes", PSSysSearchDEDTO.class, dto);
	}

    /**
     * 批建立 全文检索实体 [PSSYSSEARCHDE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSearchDEs(List<PSSysSearchDEDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHDE, "pssyssearchdes", dtoList);
	}

    /**
     * 更新 全文检索实体 [PSSYSSEARCHDE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSearchDE(PSSysSearchDEDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHDE, "pssyssearchdes", PSSysSearchDEDTO.class, dto);
	}

    /**
     * 批更新 全文检索实体 [PSSYSSEARCHDE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSearchDEs(List<PSSysSearchDEDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHDE, "pssyssearchdes", dtoList);
	}

    /**
     * 获取 全文检索实体 [PSSYSSEARCHDE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSearchDEDTO getPSSysSearchDE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEARCHDE, "pssyssearchdes", PSSysSearchDEDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 全文检索实体 [PSSYSSEARCHDE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSearchDE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEARCHDE, "pssyssearchdes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 全文检索实体 [PSSYSSEARCHDE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSearchDEDTO> searchPSSysSearchDEs(PSSysSearchDEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEARCHDE, "pssyssearchdes", PSSysSearchDEDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 全文检索实体 [PSSYSSEARCHDE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSearchDEDTO> searchAllPSSysSearchDEs(PSSysSearchDEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEARCHDE, "pssyssearchdes", PSSysSearchDEDTO.class, iSearchContext);
	}

    /**
     * 建立 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSearchDEField(PSSysSearchDEFieldDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", PSSysSearchDEFieldDTO.class, dto);
	}

    /**
     * 批建立 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSearchDEFields(List<PSSysSearchDEFieldDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", dtoList);
	}

    /**
     * 更新 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSearchDEField(PSSysSearchDEFieldDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", PSSysSearchDEFieldDTO.class, dto);
	}

    /**
     * 批更新 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSearchDEFields(List<PSSysSearchDEFieldDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", dtoList);
	}

    /**
     * 获取 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSearchDEFieldDTO getPSSysSearchDEField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", PSSysSearchDEFieldDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSearchDEField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSearchDEFieldDTO> searchPSSysSearchDEFields(PSSysSearchDEFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", PSSysSearchDEFieldDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 全文检索实体属性 [PSSYSSEARCHDEFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSearchDEFieldDTO> searchAllPSSysSearchDEFields(PSSysSearchDEFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEARCHDEFIELD, "pssyssearchdefields", PSSysSearchDEFieldDTO.class, iSearchContext);
	}

    /**
     * 建立 全文检索文档 [PSSYSSEARCHDOC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSearchDoc(PSSysSearchDocDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", PSSysSearchDocDTO.class, dto);
	}

    /**
     * 批建立 全文检索文档 [PSSYSSEARCHDOC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSearchDocs(List<PSSysSearchDocDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", dtoList);
	}

    /**
     * 更新 全文检索文档 [PSSYSSEARCHDOC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSearchDoc(PSSysSearchDocDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", PSSysSearchDocDTO.class, dto);
	}

    /**
     * 批更新 全文检索文档 [PSSYSSEARCHDOC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSearchDocs(List<PSSysSearchDocDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", dtoList);
	}

    /**
     * 获取 全文检索文档 [PSSYSSEARCHDOC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSearchDocDTO getPSSysSearchDoc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", PSSysSearchDocDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 全文检索文档 [PSSYSSEARCHDOC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSearchDoc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 全文检索文档 [PSSYSSEARCHDOC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSearchDocDTO> searchPSSysSearchDocs(PSSysSearchDocFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", PSSysSearchDocDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 全文检索文档 [PSSYSSEARCHDOC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSearchDocDTO> searchAllPSSysSearchDocs(PSSysSearchDocFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEARCHDOC, "pssyssearchdocs", PSSysSearchDocDTO.class, iSearchContext);
	}

    /**
     * 建立 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSearchField(PSSysSearchFieldDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", PSSysSearchFieldDTO.class, dto);
	}

    /**
     * 批建立 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSearchFields(List<PSSysSearchFieldDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", dtoList);
	}

    /**
     * 更新 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSearchField(PSSysSearchFieldDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", PSSysSearchFieldDTO.class, dto);
	}

    /**
     * 批更新 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSearchFields(List<PSSysSearchFieldDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", dtoList);
	}

    /**
     * 获取 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSearchFieldDTO getPSSysSearchField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", PSSysSearchFieldDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSearchField(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSearchFieldDTO> searchPSSysSearchFields(PSSysSearchFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", PSSysSearchFieldDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 全文检索属性 [PSSYSSEARCHFIELD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSearchFieldDTO> searchAllPSSysSearchFields(PSSysSearchFieldFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEARCHFIELD, "pssyssearchfields", PSSysSearchFieldDTO.class, iSearchContext);
	}

    /**
     * 建立 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSearchScheme(PSSysSearchSchemeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", PSSysSearchSchemeDTO.class, dto);
	}

    /**
     * 批建立 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSearchSchemes(List<PSSysSearchSchemeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", dtoList);
	}

    /**
     * 更新 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSearchScheme(PSSysSearchSchemeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", PSSysSearchSchemeDTO.class, dto);
	}

    /**
     * 批更新 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSearchSchemes(List<PSSysSearchSchemeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", dtoList);
	}

    /**
     * 获取 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSearchSchemeDTO getPSSysSearchScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", PSSysSearchSchemeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSearchScheme(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSearchSchemeDTO> searchPSSysSearchSchemes(PSSysSearchSchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", PSSysSearchSchemeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统全文检索体系 [PSSYSSEARCHSCHEME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSearchSchemeDTO> searchAllPSSysSearchSchemes(PSSysSearchSchemeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEARCHSCHEME, "pssyssearchschemes", PSSysSearchSchemeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统值序列 [PSSYSSEQUENCE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysSequence(PSSysSequenceDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEQUENCE, "pssyssequences", PSSysSequenceDTO.class, dto);
	}

    /**
     * 批建立 系统值序列 [PSSYSSEQUENCE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysSequences(List<PSSysSequenceDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSEQUENCE, "pssyssequences", dtoList);
	}

    /**
     * 更新 系统值序列 [PSSYSSEQUENCE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysSequence(PSSysSequenceDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEQUENCE, "pssyssequences", PSSysSequenceDTO.class, dto);
	}

    /**
     * 批更新 系统值序列 [PSSYSSEQUENCE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysSequences(List<PSSysSequenceDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSEQUENCE, "pssyssequences", dtoList);
	}

    /**
     * 获取 系统值序列 [PSSYSSEQUENCE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysSequenceDTO getPSSysSequence(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSEQUENCE, "pssyssequences", PSSysSequenceDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统值序列 [PSSYSSEQUENCE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysSequence(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSEQUENCE, "pssyssequences", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统值序列 [PSSYSSEQUENCE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysSequenceDTO> searchPSSysSequences(PSSysSequenceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSEQUENCE, "pssyssequences", PSSysSequenceDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统值序列 [PSSYSSEQUENCE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysSequenceDTO> searchAllPSSysSequences(PSSysSequenceFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSEQUENCE, "pssyssequences", PSSysSequenceDTO.class, iSearchContext);
	}

    /**
     * 建立 系统服务接口 [PSSYSSERVICEAPI]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysServiceAPI(PSSysServiceAPIDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", PSSysServiceAPIDTO.class, dto);
	}

    /**
     * 批建立 系统服务接口 [PSSYSSERVICEAPI]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysServiceAPIs(List<PSSysServiceAPIDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", dtoList);
	}

    /**
     * 更新 系统服务接口 [PSSYSSERVICEAPI]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysServiceAPI(PSSysServiceAPIDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", PSSysServiceAPIDTO.class, dto);
	}

    /**
     * 批更新 系统服务接口 [PSSYSSERVICEAPI]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysServiceAPIs(List<PSSysServiceAPIDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", dtoList);
	}

    /**
     * 获取 系统服务接口 [PSSYSSERVICEAPI]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysServiceAPIDTO getPSSysServiceAPI(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", PSSysServiceAPIDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统服务接口 [PSSYSSERVICEAPI]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysServiceAPI(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统服务接口 [PSSYSSERVICEAPI]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysServiceAPIDTO> searchPSSysServiceAPIs(PSSysServiceAPIFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", PSSysServiceAPIDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统服务接口 [PSSYSSERVICEAPI]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysServiceAPIDTO> searchAllPSSysServiceAPIs(PSSysServiceAPIFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSSERVICEAPI, "pssysserviceapis", PSSysServiceAPIDTO.class, iSearchContext);
	}

    /**
     * 建立 系统测试用例 [PSSYSTESTCASE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysTestCase(PSSysTestCaseDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTCASE, "pssystestcases", PSSysTestCaseDTO.class, dto);
	}

    /**
     * 批建立 系统测试用例 [PSSYSTESTCASE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysTestCases(List<PSSysTestCaseDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTCASE, "pssystestcases", dtoList);
	}

    /**
     * 更新 系统测试用例 [PSSYSTESTCASE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysTestCase(PSSysTestCaseDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTCASE, "pssystestcases", PSSysTestCaseDTO.class, dto);
	}

    /**
     * 批更新 系统测试用例 [PSSYSTESTCASE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysTestCases(List<PSSysTestCaseDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTCASE, "pssystestcases", dtoList);
	}

    /**
     * 获取 系统测试用例 [PSSYSTESTCASE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysTestCaseDTO getPSSysTestCase(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTESTCASE, "pssystestcases", PSSysTestCaseDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统测试用例 [PSSYSTESTCASE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysTestCase(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTESTCASE, "pssystestcases", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统测试用例 [PSSYSTESTCASE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysTestCaseDTO> searchPSSysTestCases(PSSysTestCaseFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTESTCASE, "pssystestcases", PSSysTestCaseDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统测试用例 [PSSYSTESTCASE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysTestCaseDTO> searchAllPSSysTestCases(PSSysTestCaseFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTESTCASE, "pssystestcases", PSSysTestCaseDTO.class, iSearchContext);
	}

    /**
     * 建立 系统测试数据 [PSSYSTESTDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysTestData(PSSysTestDataDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTDATA, "pssystestdata", PSSysTestDataDTO.class, dto);
	}

    /**
     * 批建立 系统测试数据 [PSSYSTESTDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysTestData(List<PSSysTestDataDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTDATA, "pssystestdata", dtoList);
	}

    /**
     * 更新 系统测试数据 [PSSYSTESTDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysTestData(PSSysTestDataDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTDATA, "pssystestdata", PSSysTestDataDTO.class, dto);
	}

    /**
     * 批更新 系统测试数据 [PSSYSTESTDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysTestData(List<PSSysTestDataDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTDATA, "pssystestdata", dtoList);
	}

    /**
     * 获取 系统测试数据 [PSSYSTESTDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysTestDataDTO getPSSysTestData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTESTDATA, "pssystestdata", PSSysTestDataDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统测试数据 [PSSYSTESTDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysTestData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTESTDATA, "pssystestdata", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统测试数据 [PSSYSTESTDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysTestDataDTO> searchPSSysTestData(PSSysTestDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTESTDATA, "pssystestdata", PSSysTestDataDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统测试数据 [PSSYSTESTDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysTestDataDTO> searchAllPSSysTestData(PSSysTestDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTESTDATA, "pssystestdata", PSSysTestDataDTO.class, iSearchContext);
	}

    /**
     * 建立 测试模块 [PSSYSTESTMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysTestModule(PSSysTestModuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTMODULE, "pssystestmodules", PSSysTestModuleDTO.class, dto);
	}

    /**
     * 批建立 测试模块 [PSSYSTESTMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysTestModules(List<PSSysTestModuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTMODULE, "pssystestmodules", dtoList);
	}

    /**
     * 更新 测试模块 [PSSYSTESTMODULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysTestModule(PSSysTestModuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTMODULE, "pssystestmodules", PSSysTestModuleDTO.class, dto);
	}

    /**
     * 批更新 测试模块 [PSSYSTESTMODULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysTestModules(List<PSSysTestModuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTMODULE, "pssystestmodules", dtoList);
	}

    /**
     * 获取 测试模块 [PSSYSTESTMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysTestModuleDTO getPSSysTestModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTESTMODULE, "pssystestmodules", PSSysTestModuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 测试模块 [PSSYSTESTMODULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysTestModule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTESTMODULE, "pssystestmodules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 测试模块 [PSSYSTESTMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysTestModuleDTO> searchPSSysTestModules(PSSysTestModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTESTMODULE, "pssystestmodules", PSSysTestModuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 测试模块 [PSSYSTESTMODULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysTestModuleDTO> searchAllPSSysTestModules(PSSysTestModuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTESTMODULE, "pssystestmodules", PSSysTestModuleDTO.class, iSearchContext);
	}

    /**
     * 建立 系统测试项目 [PSSYSTESTPRJ]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysTestPrj(PSSysTestPrjDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTPRJ, "pssystestprjs", PSSysTestPrjDTO.class, dto);
	}

    /**
     * 批建立 系统测试项目 [PSSYSTESTPRJ]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysTestPrjs(List<PSSysTestPrjDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTESTPRJ, "pssystestprjs", dtoList);
	}

    /**
     * 更新 系统测试项目 [PSSYSTESTPRJ]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysTestPrj(PSSysTestPrjDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTPRJ, "pssystestprjs", PSSysTestPrjDTO.class, dto);
	}

    /**
     * 批更新 系统测试项目 [PSSYSTESTPRJ]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysTestPrjs(List<PSSysTestPrjDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTESTPRJ, "pssystestprjs", dtoList);
	}

    /**
     * 获取 系统测试项目 [PSSYSTESTPRJ]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysTestPrjDTO getPSSysTestPrj(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTESTPRJ, "pssystestprjs", PSSysTestPrjDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统测试项目 [PSSYSTESTPRJ]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysTestPrj(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTESTPRJ, "pssystestprjs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统测试项目 [PSSYSTESTPRJ]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysTestPrjDTO> searchPSSysTestPrjs(PSSysTestPrjFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTESTPRJ, "pssystestprjs", PSSysTestPrjDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统测试项目 [PSSYSTESTPRJ]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysTestPrjDTO> searchAllPSSysTestPrjs(PSSysTestPrjFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTESTPRJ, "pssystestprjs", PSSysTestPrjDTO.class, iSearchContext);
	}

    /**
     * 建立 系统值转换 [PSSYSTRANSLATOR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysTranslator(PSSysTranslatorDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTRANSLATOR, "pssystranslators", PSSysTranslatorDTO.class, dto);
	}

    /**
     * 批建立 系统值转换 [PSSYSTRANSLATOR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysTranslators(List<PSSysTranslatorDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTRANSLATOR, "pssystranslators", dtoList);
	}

    /**
     * 更新 系统值转换 [PSSYSTRANSLATOR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysTranslator(PSSysTranslatorDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTRANSLATOR, "pssystranslators", PSSysTranslatorDTO.class, dto);
	}

    /**
     * 批更新 系统值转换 [PSSYSTRANSLATOR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysTranslators(List<PSSysTranslatorDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTRANSLATOR, "pssystranslators", dtoList);
	}

    /**
     * 获取 系统值转换 [PSSYSTRANSLATOR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysTranslatorDTO getPSSysTranslator(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTRANSLATOR, "pssystranslators", PSSysTranslatorDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统值转换 [PSSYSTRANSLATOR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysTranslator(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTRANSLATOR, "pssystranslators", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统值转换 [PSSYSTRANSLATOR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysTranslatorDTO> searchPSSysTranslators(PSSysTranslatorFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTRANSLATOR, "pssystranslators", PSSysTranslatorDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统值转换 [PSSYSTRANSLATOR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysTranslatorDTO> searchAllPSSysTranslators(PSSysTranslatorFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTRANSLATOR, "pssystranslators", PSSysTranslatorDTO.class, iSearchContext);
	}

    /**
     * 建立 系统用例图 [PSSYSUCMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUCMap(PSSysUCMapDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUCMAP, "pssysucmaps", PSSysUCMapDTO.class, dto);
	}

    /**
     * 批建立 系统用例图 [PSSYSUCMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUCMaps(List<PSSysUCMapDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUCMAP, "pssysucmaps", dtoList);
	}

    /**
     * 更新 系统用例图 [PSSYSUCMAP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUCMap(PSSysUCMapDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUCMAP, "pssysucmaps", PSSysUCMapDTO.class, dto);
	}

    /**
     * 批更新 系统用例图 [PSSYSUCMAP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUCMaps(List<PSSysUCMapDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUCMAP, "pssysucmaps", dtoList);
	}

    /**
     * 获取 系统用例图 [PSSYSUCMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUCMapDTO getPSSysUCMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUCMAP, "pssysucmaps", PSSysUCMapDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统用例图 [PSSYSUCMAP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUCMap(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUCMAP, "pssysucmaps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统用例图 [PSSYSUCMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUCMapDTO> searchPSSysUCMaps(PSSysUCMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUCMAP, "pssysucmaps", PSSysUCMapDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统用例图 [PSSYSUCMAP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUCMapDTO> searchAllPSSysUCMaps(PSSysUCMapFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUCMAP, "pssysucmaps", PSSysUCMapDTO.class, iSearchContext);
	}

    /**
     * 建立 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUCMapNode(PSSysUCMapNodeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", PSSysUCMapNodeDTO.class, dto);
	}

    /**
     * 批建立 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUCMapNodes(List<PSSysUCMapNodeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", dtoList);
	}

    /**
     * 更新 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUCMapNode(PSSysUCMapNodeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", PSSysUCMapNodeDTO.class, dto);
	}

    /**
     * 批更新 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUCMapNodes(List<PSSysUCMapNodeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", dtoList);
	}

    /**
     * 获取 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUCMapNodeDTO getPSSysUCMapNode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", PSSysUCMapNodeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUCMapNode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUCMapNodeDTO> searchPSSysUCMapNodes(PSSysUCMapNodeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", PSSysUCMapNodeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统用例图节点 [PSSYSUCMAPNODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUCMapNodeDTO> searchAllPSSysUCMapNodes(PSSysUCMapNodeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUCMAPNODE, "pssysucmapnodes", PSSysUCMapNodeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统统一资源 [PSSYSUNIRES]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUniRes(PSSysUniResDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUNIRES, "pssysunires", PSSysUniResDTO.class, dto);
	}

    /**
     * 批建立 系统统一资源 [PSSYSUNIRES]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUniRes(List<PSSysUniResDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUNIRES, "pssysunires", dtoList);
	}

    /**
     * 更新 系统统一资源 [PSSYSUNIRES]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUniRes(PSSysUniResDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUNIRES, "pssysunires", PSSysUniResDTO.class, dto);
	}

    /**
     * 批更新 系统统一资源 [PSSYSUNIRES]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUniRes(List<PSSysUniResDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUNIRES, "pssysunires", dtoList);
	}

    /**
     * 获取 系统统一资源 [PSSYSUNIRES]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUniResDTO getPSSysUniRes(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUNIRES, "pssysunires", PSSysUniResDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统统一资源 [PSSYSUNIRES]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUniRes(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUNIRES, "pssysunires", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统统一资源 [PSSYSUNIRES]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUniResDTO> searchPSSysUniRes(PSSysUniResFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUNIRES, "pssysunires", PSSysUniResDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统统一资源 [PSSYSUNIRES]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUniResDTO> searchAllPSSysUniRes(PSSysUniResFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUNIRES, "pssysunires", PSSysUniResDTO.class, iSearchContext);
	}

    /**
     * 建立 系统状态协同 [PSSYSUNISTATE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUniState(PSSysUniStateDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUNISTATE, "pssysunistates", PSSysUniStateDTO.class, dto);
	}

    /**
     * 批建立 系统状态协同 [PSSYSUNISTATE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUniStates(List<PSSysUniStateDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUNISTATE, "pssysunistates", dtoList);
	}

    /**
     * 更新 系统状态协同 [PSSYSUNISTATE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUniState(PSSysUniStateDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUNISTATE, "pssysunistates", PSSysUniStateDTO.class, dto);
	}

    /**
     * 批更新 系统状态协同 [PSSYSUNISTATE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUniStates(List<PSSysUniStateDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUNISTATE, "pssysunistates", dtoList);
	}

    /**
     * 获取 系统状态协同 [PSSYSUNISTATE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUniStateDTO getPSSysUniState(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUNISTATE, "pssysunistates", PSSysUniStateDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统状态协同 [PSSYSUNISTATE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUniState(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUNISTATE, "pssysunistates", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统状态协同 [PSSYSUNISTATE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUniStateDTO> searchPSSysUniStates(PSSysUniStateFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUNISTATE, "pssysunistates", PSSysUniStateDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统状态协同 [PSSYSUNISTATE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUniStateDTO> searchAllPSSysUniStates(PSSysUniStateFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUNISTATE, "pssysunistates", PSSysUniStateDTO.class, iSearchContext);
	}

    /**
     * 建立 系统单位 [PSSYSUNIT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUnit(PSSysUnitDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUNIT, "pssysunits", PSSysUnitDTO.class, dto);
	}

    /**
     * 批建立 系统单位 [PSSYSUNIT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUnits(List<PSSysUnitDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUNIT, "pssysunits", dtoList);
	}

    /**
     * 更新 系统单位 [PSSYSUNIT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUnit(PSSysUnitDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUNIT, "pssysunits", PSSysUnitDTO.class, dto);
	}

    /**
     * 批更新 系统单位 [PSSYSUNIT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUnits(List<PSSysUnitDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUNIT, "pssysunits", dtoList);
	}

    /**
     * 获取 系统单位 [PSSYSUNIT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUnitDTO getPSSysUnit(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUNIT, "pssysunits", PSSysUnitDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统单位 [PSSYSUNIT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUnit(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUNIT, "pssysunits", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统单位 [PSSYSUNIT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUnitDTO> searchPSSysUnits(PSSysUnitFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUNIT, "pssysunits", PSSysUnitDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统单位 [PSSYSUNIT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUnitDTO> searchAllPSSysUnits(PSSysUnitFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUNIT, "pssysunits", PSSysUnitDTO.class, iSearchContext);
	}

    /**
     * 建立 系统用例 [PSSYSUSECASE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUseCase(PSSysUseCaseDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSECASE, "pssysusercases", PSSysUseCaseDTO.class, dto);
	}

    /**
     * 批建立 系统用例 [PSSYSUSECASE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUseCases(List<PSSysUseCaseDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSECASE, "pssysusercases", dtoList);
	}

    /**
     * 更新 系统用例 [PSSYSUSECASE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUseCase(PSSysUseCaseDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSECASE, "pssysusercases", PSSysUseCaseDTO.class, dto);
	}

    /**
     * 批更新 系统用例 [PSSYSUSECASE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUseCases(List<PSSysUseCaseDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSECASE, "pssysusercases", dtoList);
	}

    /**
     * 获取 系统用例 [PSSYSUSECASE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUseCaseDTO getPSSysUseCase(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSECASE, "pssysusercases", PSSysUseCaseDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统用例 [PSSYSUSECASE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUseCase(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSECASE, "pssysusercases", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统用例 [PSSYSUSECASE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUseCaseDTO> searchPSSysUseCases(PSSysUseCaseFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSECASE, "pssysusercases", PSSysUseCaseDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统用例 [PSSYSUSECASE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUseCaseDTO> searchAllPSSysUseCases(PSSysUseCaseFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSECASE, "pssysusercases", PSSysUseCaseDTO.class, iSearchContext);
	}

    /**
     * 建立 系统用例关系 [PSSYSUSECASERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUseCaseRS(PSSysUseCaseRSDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSECASERS, "pssysusercasers", PSSysUseCaseRSDTO.class, dto);
	}

    /**
     * 批建立 系统用例关系 [PSSYSUSECASERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUseCaseRs(List<PSSysUseCaseRSDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSECASERS, "pssysusercasers", dtoList);
	}

    /**
     * 更新 系统用例关系 [PSSYSUSECASERS]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUseCaseRS(PSSysUseCaseRSDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSECASERS, "pssysusercasers", PSSysUseCaseRSDTO.class, dto);
	}

    /**
     * 批更新 系统用例关系 [PSSYSUSECASERS]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUseCaseRs(List<PSSysUseCaseRSDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSECASERS, "pssysusercasers", dtoList);
	}

    /**
     * 获取 系统用例关系 [PSSYSUSECASERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUseCaseRSDTO getPSSysUseCaseRS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSECASERS, "pssysusercasers", PSSysUseCaseRSDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统用例关系 [PSSYSUSECASERS]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUseCaseRS(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSECASERS, "pssysusercasers", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统用例关系 [PSSYSUSECASERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUseCaseRSDTO> searchPSSysUseCaseRs(PSSysUseCaseRSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSECASERS, "pssysusercasers", PSSysUseCaseRSDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统用例关系 [PSSYSUSECASERS]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUseCaseRSDTO> searchAllPSSysUseCaseRs(PSSysUseCaseRSFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSECASERS, "pssysusercasers", PSSysUseCaseRSDTO.class, iSearchContext);
	}

    /**
     * 建立 系统自定义数据范围 [PSSYSUSERDR]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUserDR(PSSysUserDRDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERDR, "pssysuserdrs", PSSysUserDRDTO.class, dto);
	}

    /**
     * 批建立 系统自定义数据范围 [PSSYSUSERDR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUserDRs(List<PSSysUserDRDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERDR, "pssysuserdrs", dtoList);
	}

    /**
     * 更新 系统自定义数据范围 [PSSYSUSERDR]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUserDR(PSSysUserDRDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERDR, "pssysuserdrs", PSSysUserDRDTO.class, dto);
	}

    /**
     * 批更新 系统自定义数据范围 [PSSYSUSERDR]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUserDRs(List<PSSysUserDRDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERDR, "pssysuserdrs", dtoList);
	}

    /**
     * 获取 系统自定义数据范围 [PSSYSUSERDR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUserDRDTO getPSSysUserDR(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSERDR, "pssysuserdrs", PSSysUserDRDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统自定义数据范围 [PSSYSUSERDR]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUserDR(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSERDR, "pssysuserdrs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统自定义数据范围 [PSSYSUSERDR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUserDRDTO> searchPSSysUserDRs(PSSysUserDRFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSERDR, "pssysuserdrs", PSSysUserDRDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统自定义数据范围 [PSSYSUSERDR]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUserDRDTO> searchAllPSSysUserDRs(PSSysUserDRFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSERDR, "pssysuserdrs", PSSysUserDRDTO.class, iSearchContext);
	}

    /**
     * 建立 系统用户模式 [PSSYSUSERMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUserMode(PSSysUserModeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERMODE, "pssysusermodes", PSSysUserModeDTO.class, dto);
	}

    /**
     * 批建立 系统用户模式 [PSSYSUSERMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUserModes(List<PSSysUserModeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERMODE, "pssysusermodes", dtoList);
	}

    /**
     * 更新 系统用户模式 [PSSYSUSERMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUserMode(PSSysUserModeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERMODE, "pssysusermodes", PSSysUserModeDTO.class, dto);
	}

    /**
     * 批更新 系统用户模式 [PSSYSUSERMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUserModes(List<PSSysUserModeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERMODE, "pssysusermodes", dtoList);
	}

    /**
     * 获取 系统用户模式 [PSSYSUSERMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUserModeDTO getPSSysUserMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSERMODE, "pssysusermodes", PSSysUserModeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统用户模式 [PSSYSUSERMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUserMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSERMODE, "pssysusermodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统用户模式 [PSSYSUSERMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUserModeDTO> searchPSSysUserModes(PSSysUserModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSERMODE, "pssysusermodes", PSSysUserModeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统用户模式 [PSSYSUSERMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUserModeDTO> searchAllPSSysUserModes(PSSysUserModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSERMODE, "pssysusermodes", PSSysUserModeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUserRoleData(PSSysUserRoleDataDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", PSSysUserRoleDataDTO.class, dto);
	}

    /**
     * 批建立 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUserRoleData(List<PSSysUserRoleDataDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", dtoList);
	}

    /**
     * 更新 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUserRoleData(PSSysUserRoleDataDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", PSSysUserRoleDataDTO.class, dto);
	}

    /**
     * 批更新 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUserRoleData(List<PSSysUserRoleDataDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", dtoList);
	}

    /**
     * 获取 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUserRoleDataDTO getPSSysUserRoleData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", PSSysUserRoleDataDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUserRoleData(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUserRoleDataDTO> searchPSSysUserRoleData(PSSysUserRoleDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", PSSysUserRoleDataDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统角色数据能力 [PSSYSUSERROLEDATA]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUserRoleDataDTO> searchAllPSSysUserRoleData(PSSysUserRoleDataFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSERROLEDATA, "pssysuserroledata", PSSysUserRoleDataDTO.class, iSearchContext);
	}

    /**
     * 建立 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUserRoleRes(PSSysUserRoleResDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERROLERES, "pssysuserroleres", PSSysUserRoleResDTO.class, dto);
	}

    /**
     * 批建立 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUserRoleRes(List<PSSysUserRoleResDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUSERROLERES, "pssysuserroleres", dtoList);
	}

    /**
     * 更新 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUserRoleRes(PSSysUserRoleResDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERROLERES, "pssysuserroleres", PSSysUserRoleResDTO.class, dto);
	}

    /**
     * 批更新 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUserRoleRes(List<PSSysUserRoleResDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUSERROLERES, "pssysuserroleres", dtoList);
	}

    /**
     * 获取 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUserRoleResDTO getPSSysUserRoleRes(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUSERROLERES, "pssysuserroleres", PSSysUserRoleResDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUserRoleRes(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUSERROLERES, "pssysuserroleres", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUserRoleResDTO> searchPSSysUserRoleRes(PSSysUserRoleResFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUSERROLERES, "pssysuserroleres", PSSysUserRoleResDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统用户角色资源 [PSSYSUSERROLERES]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUserRoleResDTO> searchAllPSSysUserRoleRes(PSSysUserRoleResFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUSERROLERES, "pssysuserroleres", PSSysUserRoleResDTO.class, iSearchContext);
	}

    /**
     * 建立 系统功能配置 [PSSYSUTIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysUtil(PSSysUtilDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSUTIL, "pssysutildes", PSSysUtilDTO.class, dto);
	}

    /**
     * 批建立 系统功能配置 [PSSYSUTIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysUtils(List<PSSysUtilDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSUTIL, "pssysutildes", dtoList);
	}

    /**
     * 更新 系统功能配置 [PSSYSUTIL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysUtil(PSSysUtilDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUTIL, "pssysutildes", PSSysUtilDTO.class, dto);
	}

    /**
     * 批更新 系统功能配置 [PSSYSUTIL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysUtils(List<PSSysUtilDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSUTIL, "pssysutildes", dtoList);
	}

    /**
     * 获取 系统功能配置 [PSSYSUTIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysUtilDTO getPSSysUtil(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSUTIL, "pssysutildes", PSSysUtilDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统功能配置 [PSSYSUTIL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysUtil(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSUTIL, "pssysutildes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统功能配置 [PSSYSUTIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysUtilDTO> searchPSSysUtils(PSSysUtilFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSUTIL, "pssysutildes", PSSysUtilDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统功能配置 [PSSYSUTIL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysUtilDTO> searchAllPSSysUtils(PSSysUtilFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSUTIL, "pssysutildes", PSSysUtilDTO.class, iSearchContext);
	}

    /**
     * 建立 系统值规则 [PSSYSVALUERULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysValueRule(PSSysValueRuleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSVALUERULE, "pssysvaluerules", PSSysValueRuleDTO.class, dto);
	}

    /**
     * 批建立 系统值规则 [PSSYSVALUERULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysValueRules(List<PSSysValueRuleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSVALUERULE, "pssysvaluerules", dtoList);
	}

    /**
     * 更新 系统值规则 [PSSYSVALUERULE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysValueRule(PSSysValueRuleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSVALUERULE, "pssysvaluerules", PSSysValueRuleDTO.class, dto);
	}

    /**
     * 批更新 系统值规则 [PSSYSVALUERULE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysValueRules(List<PSSysValueRuleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSVALUERULE, "pssysvaluerules", dtoList);
	}

    /**
     * 获取 系统值规则 [PSSYSVALUERULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysValueRuleDTO getPSSysValueRule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSVALUERULE, "pssysvaluerules", PSSysValueRuleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统值规则 [PSSYSVALUERULE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysValueRule(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSVALUERULE, "pssysvaluerules", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统值规则 [PSSYSVALUERULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysValueRuleDTO> searchPSSysValueRules(PSSysValueRuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSVALUERULE, "pssysvaluerules", PSSysValueRuleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统值规则 [PSSYSVALUERULE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysValueRuleDTO> searchAllPSSysValueRules(PSSysValueRuleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSVALUERULE, "pssysvaluerules", PSSysValueRuleDTO.class, iSearchContext);
	}

    /**
     * 建立 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysViewLogic(PSSysViewLogicDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", PSSysViewLogicDTO.class, dto);
	}

    /**
     * 批建立 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysViewLogics(List<PSSysViewLogicDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", dtoList);
	}

    /**
     * 更新 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysViewLogic(PSSysViewLogicDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", PSSysViewLogicDTO.class, dto);
	}

    /**
     * 批更新 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysViewLogics(List<PSSysViewLogicDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", dtoList);
	}

    /**
     * 获取 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysViewLogicDTO getPSSysViewLogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", PSSysViewLogicDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysViewLogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysViewLogicDTO> searchPSSysViewLogics(PSSysViewLogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", PSSysViewLogicDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统界面逻辑 [PSSYSVIEWLOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysViewLogicDTO> searchAllPSSysViewLogics(PSSysViewLogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSVIEWLOGIC, "pssysviewlogics", PSSysViewLogicDTO.class, iSearchContext);
	}

    /**
     * 建立 系统面板 [PSSYSVIEWPANEL]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysViewPanel(PSSysViewPanelDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", PSSysViewPanelDTO.class, dto);
	}

    /**
     * 批建立 系统面板 [PSSYSVIEWPANEL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysViewPanels(List<PSSysViewPanelDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", dtoList);
	}

    /**
     * 更新 系统面板 [PSSYSVIEWPANEL]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysViewPanel(PSSysViewPanelDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", PSSysViewPanelDTO.class, dto);
	}

    /**
     * 批更新 系统面板 [PSSYSVIEWPANEL]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysViewPanels(List<PSSysViewPanelDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", dtoList);
	}

    /**
     * 获取 系统面板 [PSSYSVIEWPANEL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysViewPanelDTO getPSSysViewPanel(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", PSSysViewPanelDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统面板 [PSSYSVIEWPANEL]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysViewPanel(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统面板 [PSSYSVIEWPANEL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysViewPanelDTO> searchPSSysViewPanels(PSSysViewPanelFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", PSSysViewPanelDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统面板 [PSSYSVIEWPANEL]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysViewPanelDTO> searchAllPSSysViewPanels(PSSysViewPanelFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSVIEWPANEL, "pssysviewpanels", PSSysViewPanelDTO.class, iSearchContext);
	}

    /**
     * 建立 系统工作流分类 [PSSYSWFCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysWFCat(PSSysWFCatDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSWFCAT, "pssyswfcats", PSSysWFCatDTO.class, dto);
	}

    /**
     * 批建立 系统工作流分类 [PSSYSWFCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysWFCats(List<PSSysWFCatDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSWFCAT, "pssyswfcats", dtoList);
	}

    /**
     * 更新 系统工作流分类 [PSSYSWFCAT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysWFCat(PSSysWFCatDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSWFCAT, "pssyswfcats", PSSysWFCatDTO.class, dto);
	}

    /**
     * 批更新 系统工作流分类 [PSSYSWFCAT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysWFCats(List<PSSysWFCatDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSWFCAT, "pssyswfcats", dtoList);
	}

    /**
     * 获取 系统工作流分类 [PSSYSWFCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysWFCatDTO getPSSysWFCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSWFCAT, "pssyswfcats", PSSysWFCatDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统工作流分类 [PSSYSWFCAT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysWFCat(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSWFCAT, "pssyswfcats", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统工作流分类 [PSSYSWFCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysWFCatDTO> searchPSSysWFCats(PSSysWFCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSWFCAT, "pssyswfcats", PSSysWFCatDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统工作流分类 [PSSYSWFCAT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysWFCatDTO> searchAllPSSysWFCats(PSSysWFCatFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSWFCAT, "pssyswfcats", PSSysWFCatDTO.class, iSearchContext);
	}

    /**
     * 建立 系统工作流模式 [PSSYSWFMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysWFMode(PSSysWFModeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSWFMODE, "pssyswfmodes", PSSysWFModeDTO.class, dto);
	}

    /**
     * 批建立 系统工作流模式 [PSSYSWFMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysWFModes(List<PSSysWFModeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSWFMODE, "pssyswfmodes", dtoList);
	}

    /**
     * 更新 系统工作流模式 [PSSYSWFMODE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysWFMode(PSSysWFModeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSWFMODE, "pssyswfmodes", PSSysWFModeDTO.class, dto);
	}

    /**
     * 批更新 系统工作流模式 [PSSYSWFMODE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysWFModes(List<PSSysWFModeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSWFMODE, "pssyswfmodes", dtoList);
	}

    /**
     * 获取 系统工作流模式 [PSSYSWFMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysWFModeDTO getPSSysWFMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSWFMODE, "pssyswfmodes", PSSysWFModeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统工作流模式 [PSSYSWFMODE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysWFMode(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSWFMODE, "pssyswfmodes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统工作流模式 [PSSYSWFMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysWFModeDTO> searchPSSysWFModes(PSSysWFModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSWFMODE, "pssyswfmodes", PSSysWFModeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统工作流模式 [PSSYSWFMODE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysWFModeDTO> searchAllPSSysWFModes(PSSysWFModeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSWFMODE, "pssyswfmodes", PSSysWFModeDTO.class, iSearchContext);
	}

    /**
     * 建立 系统工作流设置 [PSSYSWFSETTING]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSysWFSetting(PSSysWFSettingDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSWFSETTING, "pssyswfsettings", PSSysWFSettingDTO.class, dto);
	}

    /**
     * 批建立 系统工作流设置 [PSSYSWFSETTING]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSysWFSettings(List<PSSysWFSettingDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSWFSETTING, "pssyswfsettings", dtoList);
	}

    /**
     * 更新 系统工作流设置 [PSSYSWFSETTING]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSysWFSetting(PSSysWFSettingDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSWFSETTING, "pssyswfsettings", PSSysWFSettingDTO.class, dto);
	}

    /**
     * 批更新 系统工作流设置 [PSSYSWFSETTING]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSysWFSettings(List<PSSysWFSettingDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSWFSETTING, "pssyswfsettings", dtoList);
	}

    /**
     * 获取 系统工作流设置 [PSSYSWFSETTING]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSysWFSettingDTO getPSSysWFSetting(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSWFSETTING, "pssyswfsettings", PSSysWFSettingDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统工作流设置 [PSSYSWFSETTING]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSysWFSetting(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSWFSETTING, "pssyswfsettings", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统工作流设置 [PSSYSWFSETTING]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSysWFSettingDTO> searchPSSysWFSettings(PSSysWFSettingFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSWFSETTING, "pssyswfsettings", PSSysWFSettingDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统工作流设置 [PSSYSWFSETTING]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSysWFSettingDTO> searchAllPSSysWFSettings(PSSysWFSettingFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSWFSETTING, "pssyswfsettings", PSSysWFSettingDTO.class, iSearchContext);
	}

    /**
     * 建立 系统数据库 [PSSYSTEMDBCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSystemDBCfg(PSSystemDBCfgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", PSSystemDBCfgDTO.class, dto);
	}

    /**
     * 批建立 系统数据库 [PSSYSTEMDBCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSystemDBCfgs(List<PSSystemDBCfgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", dtoList);
	}

    /**
     * 更新 系统数据库 [PSSYSTEMDBCFG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSystemDBCfg(PSSystemDBCfgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", PSSystemDBCfgDTO.class, dto);
	}

    /**
     * 批更新 系统数据库 [PSSYSTEMDBCFG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSystemDBCfgs(List<PSSystemDBCfgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", dtoList);
	}

    /**
     * 获取 系统数据库 [PSSYSTEMDBCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSystemDBCfgDTO getPSSystemDBCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", PSSystemDBCfgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统数据库 [PSSYSTEMDBCFG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSystemDBCfg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统数据库 [PSSYSTEMDBCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSystemDBCfgDTO> searchPSSystemDBCfgs(PSSystemDBCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", PSSystemDBCfgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统数据库 [PSSYSTEMDBCFG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSystemDBCfgDTO> searchAllPSSystemDBCfgs(PSSystemDBCfgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTEMDBCFG, "pssystemdbcfgs", PSSystemDBCfgDTO.class, iSearchContext);
	}

    /**
     * 建立 系统运行 [PSSYSTEMRUN]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSSystemRun(PSSystemRunDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSSYSTEMRUN, "pssystemruns", PSSystemRunDTO.class, dto);
	}

    /**
     * 批建立 系统运行 [PSSYSTEMRUN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSSystemRuns(List<PSSystemRunDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSSYSTEMRUN, "pssystemruns", dtoList);
	}

    /**
     * 更新 系统运行 [PSSYSTEMRUN]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSSystemRun(PSSystemRunDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTEMRUN, "pssystemruns", PSSystemRunDTO.class, dto);
	}

    /**
     * 批更新 系统运行 [PSSYSTEMRUN]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSSystemRuns(List<PSSystemRunDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSSYSTEMRUN, "pssystemruns", dtoList);
	}

    /**
     * 获取 系统运行 [PSSYSTEMRUN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSSystemRunDTO getPSSystemRun(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSSYSTEMRUN, "pssystemruns", PSSystemRunDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统运行 [PSSYSTEMRUN]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSSystemRun(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSSYSTEMRUN, "pssystemruns", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统运行 [PSSYSTEMRUN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSSystemRunDTO> searchPSSystemRuns(PSSystemRunFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSSYSTEMRUN, "pssystemruns", PSSystemRunDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统运行 [PSSYSTEMRUN]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSSystemRunDTO> searchAllPSSystemRuns(PSSystemRunFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSSYSTEMRUN, "pssystemruns", PSSystemRunDTO.class, iSearchContext);
	}

    /**
     * 建立 阈值项 [PSTHRESHOLD]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSThreshold(PSThresholdDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSTHRESHOLD, "psthresholds", PSThresholdDTO.class, dto);
	}

    /**
     * 批建立 阈值项 [PSTHRESHOLD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSThresholds(List<PSThresholdDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSTHRESHOLD, "psthresholds", dtoList);
	}

    /**
     * 更新 阈值项 [PSTHRESHOLD]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSThreshold(PSThresholdDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSTHRESHOLD, "psthresholds", PSThresholdDTO.class, dto);
	}

    /**
     * 批更新 阈值项 [PSTHRESHOLD]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSThresholds(List<PSThresholdDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSTHRESHOLD, "psthresholds", dtoList);
	}

    /**
     * 获取 阈值项 [PSTHRESHOLD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSThresholdDTO getPSThreshold(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSTHRESHOLD, "psthresholds", PSThresholdDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 阈值项 [PSTHRESHOLD]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSThreshold(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSTHRESHOLD, "psthresholds", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 阈值项 [PSTHRESHOLD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSThresholdDTO> searchPSThresholds(PSThresholdFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSTHRESHOLD, "psthresholds", PSThresholdDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 阈值项 [PSTHRESHOLD]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSThresholdDTO> searchAllPSThresholds(PSThresholdFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSTHRESHOLD, "psthresholds", PSThresholdDTO.class, iSearchContext);
	}

    /**
     * 建立 阈值组 [PSTHRESHOLDGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSThresholdGroup(PSThresholdGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", PSThresholdGroupDTO.class, dto);
	}

    /**
     * 批建立 阈值组 [PSTHRESHOLDGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSThresholdGroups(List<PSThresholdGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", dtoList);
	}

    /**
     * 更新 阈值组 [PSTHRESHOLDGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSThresholdGroup(PSThresholdGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", PSThresholdGroupDTO.class, dto);
	}

    /**
     * 批更新 阈值组 [PSTHRESHOLDGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSThresholdGroups(List<PSThresholdGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", dtoList);
	}

    /**
     * 获取 阈值组 [PSTHRESHOLDGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSThresholdGroupDTO getPSThresholdGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", PSThresholdGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 阈值组 [PSTHRESHOLDGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSThresholdGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 阈值组 [PSTHRESHOLDGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSThresholdGroupDTO> searchPSThresholdGroups(PSThresholdGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", PSThresholdGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 阈值组 [PSTHRESHOLDGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSThresholdGroupDTO> searchAllPSThresholdGroups(PSThresholdGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSTHRESHOLDGROUP, "psthresholdgroups", PSThresholdGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 视图消息 [PSVIEWMSG]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSViewMsg(PSViewMsgDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSVIEWMSG, "psviewmsgs", PSViewMsgDTO.class, dto);
	}

    /**
     * 批建立 视图消息 [PSVIEWMSG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSViewMsgs(List<PSViewMsgDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSVIEWMSG, "psviewmsgs", dtoList);
	}

    /**
     * 更新 视图消息 [PSVIEWMSG]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSViewMsg(PSViewMsgDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSVIEWMSG, "psviewmsgs", PSViewMsgDTO.class, dto);
	}

    /**
     * 批更新 视图消息 [PSVIEWMSG]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSViewMsgs(List<PSViewMsgDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSVIEWMSG, "psviewmsgs", dtoList);
	}

    /**
     * 获取 视图消息 [PSVIEWMSG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSViewMsgDTO getPSViewMsg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSVIEWMSG, "psviewmsgs", PSViewMsgDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 视图消息 [PSVIEWMSG]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSViewMsg(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSVIEWMSG, "psviewmsgs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 视图消息 [PSVIEWMSG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSViewMsgDTO> searchPSViewMsgs(PSViewMsgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSVIEWMSG, "psviewmsgs", PSViewMsgDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 视图消息 [PSVIEWMSG]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSViewMsgDTO> searchAllPSViewMsgs(PSViewMsgFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSVIEWMSG, "psviewmsgs", PSViewMsgDTO.class, iSearchContext);
	}

    /**
     * 建立 视图消息组 [PSVIEWMSGGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSViewMsgGroup(PSViewMsgGroupDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", PSViewMsgGroupDTO.class, dto);
	}

    /**
     * 批建立 视图消息组 [PSVIEWMSGGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSViewMsgGroups(List<PSViewMsgGroupDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", dtoList);
	}

    /**
     * 更新 视图消息组 [PSVIEWMSGGROUP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSViewMsgGroup(PSViewMsgGroupDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", PSViewMsgGroupDTO.class, dto);
	}

    /**
     * 批更新 视图消息组 [PSVIEWMSGGROUP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSViewMsgGroups(List<PSViewMsgGroupDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", dtoList);
	}

    /**
     * 获取 视图消息组 [PSVIEWMSGGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSViewMsgGroupDTO getPSViewMsgGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", PSViewMsgGroupDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 视图消息组 [PSVIEWMSGGROUP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSViewMsgGroup(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 视图消息组 [PSVIEWMSGGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSViewMsgGroupDTO> searchPSViewMsgGroups(PSViewMsgGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", PSViewMsgGroupDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 视图消息组 [PSVIEWMSGGROUP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSViewMsgGroupDTO> searchAllPSViewMsgGroups(PSViewMsgGroupFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSVIEWMSGGROUP, "psviewmsggroups", PSViewMsgGroupDTO.class, iSearchContext);
	}

    /**
     * 建立 工作流实体 [PSWFDE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWFDE(PSWFDEDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWFDE, "pswfdes", PSWFDEDTO.class, dto);
	}

    /**
     * 批建立 工作流实体 [PSWFDE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWFDEs(List<PSWFDEDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWFDE, "pswfdes", dtoList);
	}

    /**
     * 更新 工作流实体 [PSWFDE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWFDE(PSWFDEDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWFDE, "pswfdes", PSWFDEDTO.class, dto);
	}

    /**
     * 批更新 工作流实体 [PSWFDE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWFDEs(List<PSWFDEDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWFDE, "pswfdes", dtoList);
	}

    /**
     * 获取 工作流实体 [PSWFDE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWFDEDTO getPSWFDE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWFDE, "pswfdes", PSWFDEDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 工作流实体 [PSWFDE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWFDE(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWFDE, "pswfdes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 工作流实体 [PSWFDE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWFDEDTO> searchPSWFDEs(PSWFDEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWFDE, "pswfdes", PSWFDEDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 工作流实体 [PSWFDE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWFDEDTO> searchAllPSWFDEs(PSWFDEFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWFDE, "pswfdes", PSWFDEDTO.class, iSearchContext);
	}

    /**
     * 建立 工作流角色 [PSWFROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWFRole(PSWFRoleDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWFROLE, "pswfroles", PSWFRoleDTO.class, dto);
	}

    /**
     * 批建立 工作流角色 [PSWFROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWFRoles(List<PSWFRoleDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWFROLE, "pswfroles", dtoList);
	}

    /**
     * 更新 工作流角色 [PSWFROLE]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWFRole(PSWFRoleDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWFROLE, "pswfroles", PSWFRoleDTO.class, dto);
	}

    /**
     * 批更新 工作流角色 [PSWFROLE]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWFRoles(List<PSWFRoleDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWFROLE, "pswfroles", dtoList);
	}

    /**
     * 获取 工作流角色 [PSWFROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWFRoleDTO getPSWFRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWFROLE, "pswfroles", PSWFRoleDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 工作流角色 [PSWFROLE]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWFRole(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWFROLE, "pswfroles", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 工作流角色 [PSWFROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWFRoleDTO> searchPSWFRoles(PSWFRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWFROLE, "pswfroles", PSWFRoleDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 工作流角色 [PSWFROLE]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWFRoleDTO> searchAllPSWFRoles(PSWFRoleFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWFROLE, "pswfroles", PSWFRoleDTO.class, iSearchContext);
	}

    /**
     * 建立 工作流功能操作 [PSWFUTILUIACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWFUtilUIAction(PSWFUtilUIActionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", PSWFUtilUIActionDTO.class, dto);
	}

    /**
     * 批建立 工作流功能操作 [PSWFUTILUIACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWFUtilUIActions(List<PSWFUtilUIActionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", dtoList);
	}

    /**
     * 更新 工作流功能操作 [PSWFUTILUIACTION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWFUtilUIAction(PSWFUtilUIActionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", PSWFUtilUIActionDTO.class, dto);
	}

    /**
     * 批更新 工作流功能操作 [PSWFUTILUIACTION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWFUtilUIActions(List<PSWFUtilUIActionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", dtoList);
	}

    /**
     * 获取 工作流功能操作 [PSWFUTILUIACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWFUtilUIActionDTO getPSWFUtilUIAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", PSWFUtilUIActionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 工作流功能操作 [PSWFUTILUIACTION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWFUtilUIAction(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 工作流功能操作 [PSWFUTILUIACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWFUtilUIActionDTO> searchPSWFUtilUIActions(PSWFUtilUIActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", PSWFUtilUIActionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 工作流功能操作 [PSWFUTILUIACTION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWFUtilUIActionDTO> searchAllPSWFUtilUIActions(PSWFUtilUIActionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWFUTILUIACTION, "pswfutiluiactions", PSWFUtilUIActionDTO.class, iSearchContext);
	}

    /**
     * 建立 工作流版本 [PSWFVERSION]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWFVersion(PSWFVersionDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWFVERSION, "pswfversions", PSWFVersionDTO.class, dto);
	}

    /**
     * 批建立 工作流版本 [PSWFVERSION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWFVersions(List<PSWFVersionDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWFVERSION, "pswfversions", dtoList);
	}

    /**
     * 更新 工作流版本 [PSWFVERSION]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWFVersion(PSWFVersionDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWFVERSION, "pswfversions", PSWFVersionDTO.class, dto);
	}

    /**
     * 批更新 工作流版本 [PSWFVERSION]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWFVersions(List<PSWFVersionDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWFVERSION, "pswfversions", dtoList);
	}

    /**
     * 获取 工作流版本 [PSWFVERSION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWFVersionDTO getPSWFVersion(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWFVERSION, "pswfversions", PSWFVersionDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 工作流版本 [PSWFVERSION]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWFVersion(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWFVERSION, "pswfversions", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 工作流版本 [PSWFVERSION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWFVersionDTO> searchPSWFVersions(PSWFVersionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWFVERSION, "pswfversions", PSWFVersionDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 工作流版本 [PSWFVERSION]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWFVersionDTO> searchAllPSWFVersions(PSWFVersionFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWFVERSION, "pswfversions", PSWFVersionDTO.class, iSearchContext);
	}

    /**
     * 建立 工作流工作时间 [PSWFWORKTIME]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWFWorkTime(PSWFWorkTimeDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWFWORKTIME, "pswfworktimes", PSWFWorkTimeDTO.class, dto);
	}

    /**
     * 批建立 工作流工作时间 [PSWFWORKTIME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWFWorkTimes(List<PSWFWorkTimeDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWFWORKTIME, "pswfworktimes", dtoList);
	}

    /**
     * 更新 工作流工作时间 [PSWFWORKTIME]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWFWorkTime(PSWFWorkTimeDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWFWORKTIME, "pswfworktimes", PSWFWorkTimeDTO.class, dto);
	}

    /**
     * 批更新 工作流工作时间 [PSWFWORKTIME]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWFWorkTimes(List<PSWFWorkTimeDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWFWORKTIME, "pswfworktimes", dtoList);
	}

    /**
     * 获取 工作流工作时间 [PSWFWORKTIME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWFWorkTimeDTO getPSWFWorkTime(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWFWORKTIME, "pswfworktimes", PSWFWorkTimeDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 工作流工作时间 [PSWFWORKTIME]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWFWorkTime(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWFWORKTIME, "pswfworktimes", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 工作流工作时间 [PSWFWORKTIME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWFWorkTimeDTO> searchPSWFWorkTimes(PSWFWorkTimeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWFWORKTIME, "pswfworktimes", PSWFWorkTimeDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 工作流工作时间 [PSWFWORKTIME]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWFWorkTimeDTO> searchAllPSWFWorkTimes(PSWFWorkTimeFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWFWORKTIME, "pswfworktimes", PSWFWorkTimeDTO.class, iSearchContext);
	}

    /**
     * 建立 微信公众号 [PSWXACCOUNT]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWXAccount(PSWXAccountDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWXACCOUNT, "pswxaccounts", PSWXAccountDTO.class, dto);
	}

    /**
     * 批建立 微信公众号 [PSWXACCOUNT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWXAccounts(List<PSWXAccountDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWXACCOUNT, "pswxaccounts", dtoList);
	}

    /**
     * 更新 微信公众号 [PSWXACCOUNT]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWXAccount(PSWXAccountDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWXACCOUNT, "pswxaccounts", PSWXAccountDTO.class, dto);
	}

    /**
     * 批更新 微信公众号 [PSWXACCOUNT]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWXAccounts(List<PSWXAccountDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWXACCOUNT, "pswxaccounts", dtoList);
	}

    /**
     * 获取 微信公众号 [PSWXACCOUNT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWXAccountDTO getPSWXAccount(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWXACCOUNT, "pswxaccounts", PSWXAccountDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 微信公众号 [PSWXACCOUNT]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWXAccount(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWXACCOUNT, "pswxaccounts", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 微信公众号 [PSWXACCOUNT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWXAccountDTO> searchPSWXAccounts(PSWXAccountFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWXACCOUNT, "pswxaccounts", PSWXAccountDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 微信公众号 [PSWXACCOUNT]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWXAccountDTO> searchAllPSWXAccounts(PSWXAccountFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWXACCOUNT, "pswxaccounts", PSWXAccountDTO.class, iSearchContext);
	}

    /**
     * 建立 微信企业应用 [PSWXENTAPP]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWXEntApp(PSWXEntAppDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWXENTAPP, "pswxentapps", PSWXEntAppDTO.class, dto);
	}

    /**
     * 批建立 微信企业应用 [PSWXENTAPP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWXEntApps(List<PSWXEntAppDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWXENTAPP, "pswxentapps", dtoList);
	}

    /**
     * 更新 微信企业应用 [PSWXENTAPP]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWXEntApp(PSWXEntAppDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWXENTAPP, "pswxentapps", PSWXEntAppDTO.class, dto);
	}

    /**
     * 批更新 微信企业应用 [PSWXENTAPP]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWXEntApps(List<PSWXEntAppDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWXENTAPP, "pswxentapps", dtoList);
	}

    /**
     * 获取 微信企业应用 [PSWXENTAPP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWXEntAppDTO getPSWXEntApp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWXENTAPP, "pswxentapps", PSWXEntAppDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 微信企业应用 [PSWXENTAPP]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWXEntApp(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWXENTAPP, "pswxentapps", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 微信企业应用 [PSWXENTAPP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWXEntAppDTO> searchPSWXEntApps(PSWXEntAppFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWXENTAPP, "pswxentapps", PSWXEntAppDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 微信企业应用 [PSWXENTAPP]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWXEntAppDTO> searchAllPSWXEntApps(PSWXEntAppFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWXENTAPP, "pswxentapps", PSWXEntAppDTO.class, iSearchContext);
	}

    /**
     * 建立 微信交互逻辑 [PSWXLOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWXLogic(PSWXLogicDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWXLOGIC, "pswxlogics", PSWXLogicDTO.class, dto);
	}

    /**
     * 批建立 微信交互逻辑 [PSWXLOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWXLogics(List<PSWXLogicDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWXLOGIC, "pswxlogics", dtoList);
	}

    /**
     * 更新 微信交互逻辑 [PSWXLOGIC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWXLogic(PSWXLogicDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWXLOGIC, "pswxlogics", PSWXLogicDTO.class, dto);
	}

    /**
     * 批更新 微信交互逻辑 [PSWXLOGIC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWXLogics(List<PSWXLogicDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWXLOGIC, "pswxlogics", dtoList);
	}

    /**
     * 获取 微信交互逻辑 [PSWXLOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWXLogicDTO getPSWXLogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWXLOGIC, "pswxlogics", PSWXLogicDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 微信交互逻辑 [PSWXLOGIC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWXLogic(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWXLOGIC, "pswxlogics", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 微信交互逻辑 [PSWXLOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWXLogicDTO> searchPSWXLogics(PSWXLogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWXLOGIC, "pswxlogics", PSWXLogicDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 微信交互逻辑 [PSWXLOGIC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWXLogicDTO> searchAllPSWXLogics(PSWXLogicFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWXLOGIC, "pswxlogics", PSWXLogicDTO.class, iSearchContext);
	}

    /**
     * 建立 微信菜单 [PSWXMENU]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWXMenu(PSWXMenuDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWXMENU, "pswxmenus", PSWXMenuDTO.class, dto);
	}

    /**
     * 批建立 微信菜单 [PSWXMENU]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWXMenus(List<PSWXMenuDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWXMENU, "pswxmenus", dtoList);
	}

    /**
     * 更新 微信菜单 [PSWXMENU]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWXMenu(PSWXMenuDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWXMENU, "pswxmenus", PSWXMenuDTO.class, dto);
	}

    /**
     * 批更新 微信菜单 [PSWXMENU]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWXMenus(List<PSWXMenuDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWXMENU, "pswxmenus", dtoList);
	}

    /**
     * 获取 微信菜单 [PSWXMENU]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWXMenuDTO getPSWXMenu(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWXMENU, "pswxmenus", PSWXMenuDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 微信菜单 [PSWXMENU]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWXMenu(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWXMENU, "pswxmenus", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 微信菜单 [PSWXMENU]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWXMenuDTO> searchPSWXMenus(PSWXMenuFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWXMENU, "pswxmenus", PSWXMenuDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 微信菜单 [PSWXMENU]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWXMenuDTO> searchAllPSWXMenus(PSWXMenuFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWXMENU, "pswxmenus", PSWXMenuDTO.class, iSearchContext);
	}

    /**
     * 建立 微信菜单功能 [PSWXMENUFUNC]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWXMenuFunc(PSWXMenuFuncDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWXMENUFUNC, "pswxmenufuncs", PSWXMenuFuncDTO.class, dto);
	}

    /**
     * 批建立 微信菜单功能 [PSWXMENUFUNC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWXMenuFuncs(List<PSWXMenuFuncDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWXMENUFUNC, "pswxmenufuncs", dtoList);
	}

    /**
     * 更新 微信菜单功能 [PSWXMENUFUNC]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWXMenuFunc(PSWXMenuFuncDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWXMENUFUNC, "pswxmenufuncs", PSWXMenuFuncDTO.class, dto);
	}

    /**
     * 批更新 微信菜单功能 [PSWXMENUFUNC]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWXMenuFuncs(List<PSWXMenuFuncDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWXMENUFUNC, "pswxmenufuncs", dtoList);
	}

    /**
     * 获取 微信菜单功能 [PSWXMENUFUNC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWXMenuFuncDTO getPSWXMenuFunc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWXMENUFUNC, "pswxmenufuncs", PSWXMenuFuncDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 微信菜单功能 [PSWXMENUFUNC]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWXMenuFunc(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWXMENUFUNC, "pswxmenufuncs", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 微信菜单功能 [PSWXMENUFUNC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWXMenuFuncDTO> searchPSWXMenuFuncs(PSWXMenuFuncFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWXMENUFUNC, "pswxmenufuncs", PSWXMenuFuncDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 微信菜单功能 [PSWXMENUFUNC]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWXMenuFuncDTO> searchAllPSWXMenuFuncs(PSWXMenuFuncFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWXMENUFUNC, "pswxmenufuncs", PSWXMenuFuncDTO.class, iSearchContext);
	}

    /**
     * 建立 系统工作流 [PSWORKFLOW]
	 * @param dto
	 * @throws Throwable
	 */
	public void createPSWorkflow(PSWorkflowDTO dto) throws Throwable{
		this.executeCreate(PSModels.PSWORKFLOW, "psworkflows", PSWorkflowDTO.class, dto);
	}

    /**
     * 批建立 系统工作流 [PSWORKFLOW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void createPSWorkflows(List<PSWorkflowDTO> dtoList) throws Throwable{
		this.executeCreate(PSModels.PSWORKFLOW, "psworkflows", dtoList);
	}

    /**
     * 更新 系统工作流 [PSWORKFLOW]
	 * @param dto
	 * @throws Throwable
	 */
	public void updatePSWorkflow(PSWorkflowDTO dto) throws Throwable{
		this.executeUpdate(PSModels.PSWORKFLOW, "psworkflows", PSWorkflowDTO.class, dto);
	}

    /**
     * 批更新 系统工作流 [PSWORKFLOW]
	 * @param dtoList
	 * @throws Throwable
	 */
	public void updatePSWorkflows(List<PSWorkflowDTO> dtoList) throws Throwable{
		this.executeUpdate(PSModels.PSWORKFLOW, "psworkflows", dtoList);
	}

    /**
     * 获取 系统工作流 [PSWORKFLOW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public PSWorkflowDTO getPSWorkflow(String strKey, boolean bTryMode) throws Throwable{
		return this.executeGet(PSModels.PSWORKFLOW, "psworkflows", PSWorkflowDTO.class, strKey, bTryMode);
	}

    /**
     * 删除 系统工作流 [PSWORKFLOW]
	 * @param strKey
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	public boolean removePSWorkflow(String strKey, boolean bTryMode) throws Throwable{
		return this.executeRemove(PSModels.PSWORKFLOW, "psworkflows", strKey, bTryMode);
	}

    /**
     * 搜索指定分页数据 系统工作流 [PSWORKFLOW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public Page<PSWorkflowDTO> searchPSWorkflows(PSWorkflowFilter iSearchContext) throws Throwable{
		return this.executeFetchDefault(PSModels.PSWORKFLOW, "psworkflows", PSWorkflowDTO.class, iSearchContext);
	}

    /**
     * 搜索全部数据 系统工作流 [PSWORKFLOW]
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	public List<PSWorkflowDTO> searchAllPSWorkflows(PSWorkflowFilter iSearchContext) throws Throwable{
		return this.executeFetchDefaultAll(PSModels.PSWORKFLOW, "psworkflows", PSWorkflowDTO.class, iSearchContext);
	}

}