package cn.ibizlab.central.plugin.odoo.dataentity;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.annotation.DEAction;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.util.DataEntityRuntimeHolder;
import net.ibizsys.runtime.util.domain.DataAuditDetail;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class MailThreadDERuntime extends OdooAbstractDERuntime{

    public final static String TRACK_FINALIZE_METHOD = "track_finalize";
    public final static String MESSAGE_TRACK_METHOD = "message_track";
    public final static String MAIL_TRACK_METHOD = "mail_track";
    public final static String MESSAGE_POST_METHOD = "message_post";


    private IDataEntityRuntime maiMessageDERuntime = null;
    private IDataEntityRuntime trackingValueDERuntime = null;

    protected IDataEntityRuntime getMaiMessageDERuntime() {
        if(this.maiMessageDERuntime == null) {
            this.maiMessageDERuntime = this.getSystemRuntime().getDataEntityRuntime("MAIL_MESSAGE");
        }
        return this.maiMessageDERuntime;
    }

    protected IDataEntityRuntime getTrackingValueDERuntime() {
        if(this.trackingValueDERuntime == null) {
            this.trackingValueDERuntime = this.getSystemRuntime().getDataEntityRuntime("MAIL_TRACKING_VALUE");
        }
        return this.trackingValueDERuntime;
    }
    @DEAction("mail_message_post")
    protected IEntityDTO doMailMessagePost(IEntityDTO iEntityDTO) throws Throwable {
        //Groovy
        // 从参数对象获取model属性值
        String modelName = iEntityDTO.getString("model","");
        // 从参数对象获取资源属性值
        String resId = iEntityDTO.getString("res_id","");
        // 通过系统运行时获取实体运行时对象
        IDataEntityRuntime deRuntime = this.getSystemRuntime().getDataEntityRuntime(modelName);
        if(deRuntime == null){
            throw new Exception(String.format("消息实体异常"));
        }
        //构造实体对象
        IEntityDTO dstEntityDTO = deRuntime.createEntity();
        iEntityDTO.copyTo(dstEntityDTO,true);
        dstEntityDTO.set(deRuntime.getKeyPSDEField().getCodeName(),resId);
        // 判断消息实体发送权限,暂定read,实际上由各实体中自行定义消息发送权限标识
        String _mail_post_access = "read";
        String messagePostMethod = "message_post";
        if((Boolean)deRuntime.testDataAccessAction(dstEntityDTO,_mail_post_access)){
            Object[] args = new Object[]{dstEntityDTO};
            return (IEntityDTO)deRuntime.executeAction(messagePostMethod,null,args);
        }else{
            throw new net.ibizsys.runtime.dataentity.DataEntityRuntimeException(deRuntime, String.format("不具备操作能力"));
        }
    }

    @DEAction("track_prepare")
    protected void doTrackPrepare(IEntityDTO iEntityDTO) throws Throwable {
        if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
            return;
        }

        IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
        childDataDataEntityRuntime.getName();
        Object[] args = new Object[]{iEntityDTO};
        childDataDataEntityRuntime.executeAction(TRACK_FINALIZE_METHOD,null,args);
    }

    @DEAction("track_discard")
    protected void doTrackDiscard(IEntityDTO iEntityDTO) throws Throwable {
        if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
            return;
        }

        IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
        Object[] args = new Object[]{iEntityDTO};
        childDataDataEntityRuntime.executeAction(TRACK_FINALIZE_METHOD,null,args);
    }

    @DEAction("track_finalize")
    protected void doTrackFinalize(IEntityDTO iEntityDTO) throws Throwable {
        if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
            return;
        }

        IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
        Object[] args = new Object[]{iEntityDTO};
        childDataDataEntityRuntime.executeAction(MESSAGE_TRACK_METHOD,null,args);
    }

    @DEAction("message_track")
    protected IEntityDTO doMessageTrack(IEntityDTO iEntityDTO) throws Throwable {
        if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
            return null;
        }
        Map Tracking = new LinkedHashMap();
        IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
        Object[] args = new Object[]{iEntityDTO};
        String recordId = (String) childDataDataEntityRuntime.getKeyFieldValue(iEntityDTO);
        //构造消息对象并发送
        IEntityDTO message = getMaiMessageDERuntime().createEntity();
        //获取提示信息模板track_get_default_log_message(changes)
        message.put("body","");
        message.put("id",recordId);
        message.put("mail_tracking_values",childDataDataEntityRuntime.executeAction(MAIL_TRACK_METHOD,null,args));
        Object[] messages = new Object[]{message};
        return (IEntityDTO) childDataDataEntityRuntime.executeAction(MESSAGE_POST_METHOD,null,messages);
    }

    @DEAction("mail_track")
    protected List<IEntityDTO> doMailTrack(IEntityDTO iEntityDTO) throws Throwable {
        List TrackValueDtos = getTrackingValueDERuntime().createEntityList();
        List dataAuditDetails = (List) iEntityDTO.get("dataauditdetails");
        if(dataAuditDetails != null) {
            return TrackValueDtos;
        }
        for(Object detail : dataAuditDetails){
            DataAuditDetail dataAuditDetail = (DataAuditDetail)detail;
            IEntityDTO TrackValueDto = getTrackingValueDERuntime().createEntity();
            dataAuditDetail.getLogicName();
            TrackValueDto.put("display_name",dataAuditDetail.getLogicName());
            TrackValueDto.put("field_id",dataAuditDetail.getDataAuditDetailName());

            TrackValueDto.put("old_value_char",dataAuditDetail.getOldValue());
            TrackValueDto.put("new_value_char",dataAuditDetail.getNewValue());
            TrackValueDto.put("old_value_text",dataAuditDetail.getOldText());
            TrackValueDto.put("new_value_text",dataAuditDetail.getNewText());
            TrackValueDtos.add(TrackValueDto);
        }
        return TrackValueDtos;
    }

    /**
     * 发送消息
     * @param iEntityDTO
     * @return
     * @throws Throwable
     */
    @DEAction("message_post")
    protected IEntityDTO doMessagePost(IEntityDTO iEntityDTO) throws Throwable {
        if(DataEntityRuntimeHolder.peekChildDataEntityRuntime() == null) {
            return null;
        }

        IDataEntityRuntime childDataDataEntityRuntime = (IDataEntityRuntime)DataEntityRuntimeHolder.peekChildDataEntityRuntime();
        IEntityDTO message = this.getMaiMessageDERuntime().createEntity();
        iEntityDTO.copyTo(message,true);
        //重新设置model与res_id
        message.reset(this.getMaiMessageDERuntime().getKeyPSDEField().getName());
        IPSDEField parentTypePSDEField = this.getMaiMessageDERuntime().getPSDEFieldByPredefinedType(PSModelEnums.PredefinedFieldType.PARENTTYPE.value, this.getMaiMessageDERuntime().getDEType() != DETypes.DYNAATTACHED);
        IPSDEField parentIdPSDEField = this.getMaiMessageDERuntime().getPSDEFieldByPredefinedType(PSModelEnums.PredefinedFieldType.PARENTID.value, this.getMaiMessageDERuntime().getDEType() != DETypes.DYNAATTACHED);
        message.put(parentTypePSDEField.getName(),childDataDataEntityRuntime.getName());
        message.put(parentIdPSDEField.getName(),childDataDataEntityRuntime.getKeyFieldValue(iEntityDTO));
        this.getMaiMessageDERuntime().create(message);
        return message;
    }
}
