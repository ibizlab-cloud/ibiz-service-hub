package cn.ibizlab.central.plugin.groovy.dataentity

import com.fasterxml.jackson.annotation.JsonIgnore

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime
import net.ibizsys.central.util.EntityDTO
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.central.util.SearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.action.IPSDEAction
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO
import net.ibizsys.runtime.IDynaInstRuntime
import net.ibizsys.runtime.util.IEntityBase

class SimpleDataEntityRuntime extends DataEntityRuntime{
	
	 public class TrademarkDTO extends EntityDTO{
        @JsonIgnore
        Date getApplyAcceptDate() {get('applyacceptdate')}
        @JsonIgnore
        void setApplyAcceptDate(Date val) {set('applyacceptdate', val)}
        @JsonIgnore
        Date getApplyAuthDate() {get('applyauthdate')}
        @JsonIgnore
        void setApplyAuthDate(Date val) {set('applyauthdate', val)}
        @JsonIgnore
        Date getApplyDate() {get('applydate')}
        @JsonIgnore
        void setApplyDate(Date val) {set('applydate', val)}
        @JsonIgnore
        Date getApplySubmitDate() {get('applysubmitdate')}
        @JsonIgnore
        void setApplySubmitDate(Date val) {set('applysubmitdate', val)}
        @JsonIgnore
        String getAttachment() {get('attachment')}
        @JsonIgnore
        void setAttachment(String val) {set('attachment', val)}
        @JsonIgnore
        Date getAuthDate() {get('authdate')}
        @JsonIgnore
        void setAuthDate(Date val) {set('authdate', val)}
        @JsonIgnore
        String getCategory() {get('category')}
        @JsonIgnore
        void setCategory(String val) {set('category', val)}
        @JsonIgnore
        Date getCreateDate() {get('createdate')}
        @JsonIgnore
        void setCreateDate(Date val) {set('createdate', val)}
        @JsonIgnore
        String getCreateMan() {get('createman')}
        @JsonIgnore
        void setCreateMan(String val) {set('createman', val)}
        @JsonIgnore
        String getCsbhfj() {get('csbhfj')}
        @JsonIgnore
        void setCsbhfj(String val) {set('csbhfj', val)}
        @JsonIgnore
        String getCurApplyStep() {get('curapplystep')}
        @JsonIgnore
        void setCurApplyStep(String val) {set('curapplystep', val)}
        @JsonIgnore
        Date getCxdsrsqbcgdate() {get('cxdsrsqbcgdate')}
        @JsonIgnore
        void setCxdsrsqbcgdate(Date val) {set('cxdsrsqbcgdate', val)}
        @JsonIgnore
        String getCxdsrsqbcgfj() {get('cxdsrsqbcgfj')}
        @JsonIgnore
        void setCxdsrsqbcgfj(String val) {set('cxdsrsqbcgfj', val)}
        @JsonIgnore
        Date getCxdsrsqcgdate() {get('cxdsrsqcgdate')}
        @JsonIgnore
        void setCxdsrsqcgdate(Date val) {set('cxdsrsqcgdate', val)}
        @JsonIgnore
        String getCxdsrsqcgfj() {get('cxdsrsqcgfj')}
        @JsonIgnore
        void setCxdsrsqcgfj(String val) {set('cxdsrsqcgfj', val)}
        @JsonIgnore
        Date getCxdsrsqdate() {get('cxdsrsqdate')}
        @JsonIgnore
        void setCxdsrsqdate(Date val) {set('cxdsrsqdate', val)}
        @JsonIgnore
        String getCxdsrsqfj() {get('cxdsrsqfj')}
        @JsonIgnore
        void setCxdsrsqfj(String val) {set('cxdsrsqfj', val)}
        @JsonIgnore
        String getDeptId() {get('deptid')}
        @JsonIgnore
        void setDeptId(String val) {set('deptid', val)}
        @JsonIgnore
        Date getExApplyAcceptDate() {get('exapplyacceptdate')}
        @JsonIgnore
        void setExApplyAcceptDate(Date val) {set('exapplyacceptdate', val)}
        @JsonIgnore
        Date getExApplyAuthDate() {get('exapplyauthdate')}
        @JsonIgnore
        void setExApplyAuthDate(Date val) {set('exapplyauthdate', val)}
        @JsonIgnore
        Date getExApplySubmitDate() {get('exapplysubmitdate')}
        @JsonIgnore
        void setExApplySubmitDate(Date val) {set('exapplysubmitdate', val)}
        @JsonIgnore
        String getFsbhfj() {get('fsbhfj')}
        @JsonIgnore
        void setFsbhfj(String val) {set('fsbhfj', val)}
        @JsonIgnore
        String getFsslfj() {get('fsslfj')}
        @JsonIgnore
        void setFsslfj(String val) {set('fsslfj', val)}
        @JsonIgnore
        String getFssqfj() {get('fssqfj')}
        @JsonIgnore
        void setFssqfj(String val) {set('fssqfj', val)}
        @JsonIgnore
        String getFstjfj() {get('fstjfj')}
        @JsonIgnore
        void setFstjfj(String val) {set('fstjfj', val)}
        @JsonIgnore
        String getMarkauthorizer() {get('markauthorizer')}
        @JsonIgnore
        void setMarkauthorizer(String val) {set('markauthorizer', val)}
        @JsonIgnore
        String getOrgId() {get('orgid')}
        @JsonIgnore
        void setOrgId(String val) {set('orgid', val)}
        @JsonIgnore
        Date getREJECTDATEEx() {get('rejectdateex')}
        @JsonIgnore
        void setREJECTDATEEx(Date val) {set('rejectdateex', val)}
        @JsonIgnore
        Date getRejectDate1() {get('rejectdate1')}
        @JsonIgnore
        void setRejectDate1(Date val) {set('rejectdate1', val)}
        @JsonIgnore
        String getSqslfj() {get('sqslfj')}
        @JsonIgnore
        void setSqslfj(String val) {set('sqslfj', val)}
        @JsonIgnore
        String getSqsqfj() {get('sqsqfj')}
        @JsonIgnore
        void setSqsqfj(String val) {set('sqsqfj', val)}
        @JsonIgnore
        String getSqtjfj() {get('sqtjfj')}
        @JsonIgnore
        void setSqtjfj(String val) {set('sqtjfj', val)}
        @JsonIgnore
        String getTmapplyid() {get('tmapplyid')}
        @JsonIgnore
        void setTmapplyid(String val) {set('tmapplyid', val)}
        @JsonIgnore
        String getTrademarkId() {get('ls_trademarkid')}
        @JsonIgnore
        void setTrademarkId(String val) {set('ls_trademarkid', val)}
        @JsonIgnore
        String getTrademarkName() {get('ls_trademarkname')}
        @JsonIgnore
        void setTrademarkName(String val) {set('ls_trademarkname', val)}
        @JsonIgnore
        Date getUpdateDate() {get('updatedate')}
        @JsonIgnore
        void setUpdateDate(Date val) {set('updatedate', val)}
        @JsonIgnore
        String getUpdateMan() {get('updateman')}
        @JsonIgnore
        void setUpdateMan(String val) {set('updateman', val)}
        @JsonIgnore
        Date getValidDate() {get('validdate')}
        @JsonIgnore
        void setValidDate(Date val) {set('validdate', val)}
    
    }
    class TrademarkFilterDTO extends SearchContextDTO{
      //Date N_AUTHDATE_GTANDEQ
      //Date N_AUTHDATE_LTANDEQ
      //String N_CATEGORY_EQ
      //String N_CURAPPLYSTEP_EQ
      //String N_LS_TRADEMARKID_EQ
      //String N_LS_TRADEMARKNAME_LIKE
      //String N_TMAPPLYID_EQ
      //Date N_VALIDDATE_GTANDEQ
      //Date N_VALIDDATE_LTANDEQ
    
    }
    class TrademarkSimpleDTO extends EntityDTO{
        @JsonIgnore
        Date getCreateDate() {get('createdate')}
        @JsonIgnore
        void setCreateDate(Date val) {set('createdate', val)}
        @JsonIgnore
        String getCreateMan() {get('createman')}
        @JsonIgnore
        void setCreateMan(String val) {set('createman', val)}
        @JsonIgnore
        String getDeptId() {get('deptid')}
        @JsonIgnore
        void setDeptId(String val) {set('deptid', val)}
        @JsonIgnore
        String getOrgId() {get('orgid')}
        @JsonIgnore
        void setOrgId(String val) {set('orgid', val)}
        @JsonIgnore
        String getTrademarkId() {get('ls_trademarkid')}
        @JsonIgnore
        void setTrademarkId(String val) {set('ls_trademarkid', val)}
        @JsonIgnore
        String getTrademarkName() {get('ls_trademarkname')}
        @JsonIgnore
        void setTrademarkName(String val) {set('ls_trademarkname', val)}
        @JsonIgnore
        Date getUpdateDate() {get('updatedate')}
        @JsonIgnore
        void setUpdateDate(Date val) {set('updatedate', val)}
        @JsonIgnore
        String getUpdateMan() {get('updateman')}
        @JsonIgnore
        void setUpdateMan(String val) {set('updateman', val)}
    
    }


    @Override
	protected IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        if('TrademarkDTO'.equalsIgnoreCase(iPSDEMethodDTO.getName())) return new TrademarkDTO()
        if('TrademarkFilterDTO'.equalsIgnoreCase(iPSDEMethodDTO.getName())) return new TrademarkFilterDTO()
        if('TrademarkSimpleDTO'.equalsIgnoreCase(iPSDEMethodDTO.getName())) return new TrademarkSimpleDTO()

		return super.createEntityDTO(iPSDEMethodDTO);
	}
	
	@Override
	protected ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
		// TODO Auto-generated method stub
		return super.createSearchContextDTO(iPSDEMethodDTO);
	}

    @Override
	protected Object executeActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, boolean bIgnoreDEService) throws Throwable {
		if(!bIgnoreDEService) {
            if('Create'.equalsIgnoreCase(strActionName)){
                create(args[0])
                return
            }
            if('Update'.equalsIgnoreCase(strActionName)){
                update(args[0])
                return
            }
            if('Remove'.equalsIgnoreCase(strActionName)){
                remove(args[0])
                return
            }
            if('Get'.equalsIgnoreCase(strActionName)){
                return get(args[0])
            }
            if('GetDraft'.equalsIgnoreCase(strActionName)){
                return getDraft(args[0])
            }
            if('CheckKey'.equalsIgnoreCase(strActionName)){
                return checkKey(args[0])
            }
            if('Save'.equalsIgnoreCase(strActionName)){
                save(args[0])
                return
            }
			
		}
		return super.executeActionReal(strActionName, iPSDEAction, args, bIgnoreDEService);
	}

    void create(TrademarkDTO arg) throws Throwable{
        def args = [arg] as Object[]
        executeAction('Create', null, args, true)
    }

    void update(TrademarkDTO arg) throws Throwable{
        def args = [arg] as Object[]
        executeAction('Update', null, args, true)
    }

    void remove(List arg) throws Throwable{
        def args = [arg] as Object[]
        executeAction('Remove', null, args, true)
    }

    TrademarkDTO get(def arg) throws Throwable{
        def args = [arg] as Object[]
        return executeAction('Get', null, args, true)
    }

    TrademarkDTO getDraft(TrademarkDTO arg) throws Throwable{
        def args = [arg] as Object[]
        return executeAction('GetDraft', null, args, true)
    }

    Integer checkKey(TrademarkDTO arg) throws Throwable{
        def args = [arg] as Object[]
        return executeAction('CheckKey', null, args, true)
    }

    void save(TrademarkDTO arg) throws Throwable{
        def args = [arg] as Object[]
        executeAction('Save', null, args, true)
    }
	
	
	@Override
	protected void checkEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub
		super.checkEntityBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}
	
	@Override
	protected void checkEntityAfterProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub
		super.checkEntityAfterProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

}
