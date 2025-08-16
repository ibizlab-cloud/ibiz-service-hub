package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.util.List;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.CarbonCopyServiceImpl;
import net.ibizsys.central.util.SearchContextDTO;

@Priority(100)
@Service
public class CarbonCopyServiceImplEx extends CarbonCopyServiceImpl {

	// @Override
	// public boolean create(SysCarbonCopy et) {
	// Object userId = et.get("scusers");
	// if(StringUtils.isEmpty(userId)){
	// throw new BadRequestException("未指定抄送操作用户");
	// }
	// String strUserIds = userId.toString();
	// if(strUserIds.indexOf(";") != -1){
	// String srfkeys = "";
	// String[] ids = strUserIds.trim().split(";");
	// for(int i=0; i<ids.length; i++){
	// SysCarbonCopy item = new SysCarbonCopy();
	// et.copyTo(item,false);
	// item.setUserid(ids[i]);
	// super.create(item);
	// if(!StringUtils.isEmpty(srfkeys)){
	// srfkeys+=";";
	// }
	// srfkeys+=item.getTodoid();
	// }
	// et.set("srfkeys", srfkeys);
	// return true;
	// }
	// else{
	// et.setUserid(strUserIds);
	// et.set("srfkeys", strUserIds);
	// }
	// return super.create(et);
	// }
	//
	// /**
	// * [MarkRead:设置已读] 行为扩展
	// * @param et
	// * @return
	// */
	// @Override
	// @Transactional
	// public SysCarbonCopy markRead(SysCarbonCopy et) {
	// String userId = et.getUserid();
	// if(StringUtils.isEmpty(userId)){
	// throw new BadRequestException("未指定操作用户");
	// }
	//
	// String carbonCopyId = et.getTodoid();
	// if(!StringUtils.isEmpty(carbonCopyId)){
	// et = this.getById(carbonCopyId);
	// if(et != null && userId.equalsIgnoreCase(et.getUserid())){
	// et.setIsread(1);
	// this.update(et);
	// }else{
	// throw new BadRequestException("无效的抄送标识");
	// }
	// }else{
	// boolean hasData = false;
	// List<SysCarbonCopy> list = this.wfTaskCarbonCopys(et);
	// for(SysCarbonCopy item : list){
	// if(userId.equalsIgnoreCase(item.getUserid())){
	// item.setIsread(1);
	// //挂起当前抄送数据
	// this.update(item);
	// et = item;
	// hasData = true;
	// break;
	// }
	// }
	// if(!hasData){
	// throw new BadRequestException("无效的流程任务标识");
	// }
	// }
	// return et;
	// }
	//
	// /**
	// * 查询工作流任务抄送清单
	// * @param et
	// * @return
	// */
	// protected List<SysCarbonCopy> wfTaskCarbonCopys(SysCarbonCopy et) {
	// String taskId = et.getParam01();
	// if(StringUtils.isEmpty(taskId)){
	// throw new BadRequestException("未指定流程任务标识");
	// }
	// SysCarbonCopySearchContext context = new SysCarbonCopySearchContext();
	// context.setN_param01_eq(taskId);
	// context.setN_isread_eq(0);
	// List<SysCarbonCopy> list = this.selectDefault(context);
	// if(list == null || list.size() == 0){
	// throw new BadRequestException("无效的流程任务标识");
	// }
	// return list;
	// }
	//

	@Override
	public void create(CarbonCopyDTO et) throws Throwable {
		
		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			userId = (String)et.get("scusers");
		}
		if (ObjectUtils.isEmpty(userId)) {
			throw new Exception("未指定抄送操作用户");
		}
		
		String srfkeys = "";
		String[] ids = userId.trim().split(";");
		for (int i = 0; i < ids.length; i++) {
			CarbonCopyDTO item = new CarbonCopyDTO();
			et.copyTo(item);
			item.setUserId(ids[i]);
			super.create(item);
			if (!ObjectUtils.isEmpty(srfkeys)) {
				srfkeys += ";";
			}
			srfkeys += item.getTodoId();
		}
		et.set("srfkeys", srfkeys);
		
	}

	@Override
	protected CarbonCopyDTO onMarkRead(CarbonCopyDTO et) throws Throwable {
		String userId = et.getUserId();
		if (!StringUtils.hasLength(userId)) {
			throw new Exception("未指定操作用户");
		}
		String carbonCopyId = et.getTodoId();
		if (!ObjectUtils.isEmpty(carbonCopyId)) {
			CarbonCopyDTO dto = this.get(carbonCopyId);
			if (userId.equalsIgnoreCase(dto.getUserId())) {
				et.setIsRead(1);
				this.update(et);
			} else {
				throw new Exception("无效的抄送标识");
			}
		} else {
			boolean hasData = false;
			List<CarbonCopyDTO> list = this.getWFTaskCarbonCopies(et);
			for (CarbonCopyDTO item : list) {
				if (userId.equalsIgnoreCase(item.getUserId())) {
					item.setIsRead(1);
					// 挂起当前抄送数据
					this.update(item);
					et = item;
					hasData = true;
					break;
				}
			}
			if (!hasData) {
				throw new Exception("无效的流程任务标识");
			}
		}
		return et;
	}

	/**
	 * 查询工作流任务抄送清单
	 * 
	 * @param et
	 * @return
	 */
	protected List<CarbonCopyDTO> getWFTaskCarbonCopies(CarbonCopyDTO et) throws Throwable {
		String taskId = et.getParam01();
		if (!StringUtils.hasLength(taskId)) {
			throw new Exception("未指定流程任务标识");
		}

		// SysCarbonCopySearchContext context = new
		// SysCarbonCopySearchContext();
		// context.setN_param01_eq(taskId);
		// context.setN_isread_eq(0);
		// List<SysCarbonCopy> list = this.selectDefault(context);

		List<CarbonCopyDTO> list = this.selectDefault(new SearchContextDTO().all().eq(FIELD_PARAM01, taskId).eq(FIELD_ISREAD, 0));

		if (ObjectUtils.isEmpty(list)) {
			throw new Exception("无效的流程任务标识");
		}
		return list;
	}
}
