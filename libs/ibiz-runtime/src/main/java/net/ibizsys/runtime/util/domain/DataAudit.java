package net.ibizsys.runtime.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 模型 DataAudit 存储对象
 */
public class DataAudit extends net.ibizsys.runtime.util.EntityBase {

        /**
        * 审计明细
        */
        //private String auditInfo;
        public final static String FIELD_AUDITINFO = "auditinfo";

        @JsonIgnore
        public String getAuditInfo(){
                Object objValue = this.get(FIELD_AUDITINFO);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_AUDITINFO)
        public void setAuditInfo(String auditInfo){
                this.set(FIELD_AUDITINFO, auditInfo);
        }

        @JsonIgnore
        public boolean isAuditInfoDirty(){
                return this.contains(FIELD_AUDITINFO);
        }

        /**
        * 行为类型
        */
        //private String auditType;
        public final static String FIELD_AUDITTYPE = "audittype";

        @JsonIgnore
        public String getAuditType(){
                Object objValue = this.get(FIELD_AUDITTYPE);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_AUDITTYPE)
        public void setAuditType(String auditType){
                this.set(FIELD_AUDITTYPE, auditType);
        }

        @JsonIgnore
        public boolean isAuditTypeDirty(){
                return this.contains(FIELD_AUDITTYPE);
        }

        /**
        * 操作时间
        */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
        //private Timestamp createDate;
        public final static String FIELD_CREATEDATE = "createdate";

        @JsonIgnore
        public Timestamp getCreateDate(){
                Object objValue = this.get(FIELD_CREATEDATE);
                if(objValue==null){
                        return null;
                }
                return (Timestamp)objValue;
        }

        @JsonProperty(FIELD_CREATEDATE)
        public void setCreateDate(Timestamp createDate){
                this.set(FIELD_CREATEDATE, createDate);
        }

        @JsonIgnore
        public boolean isCreateDateDirty(){
                return this.contains(FIELD_CREATEDATE);
        }

        /**
        * 建立人
        */
        //private String createMan;
        public final static String FIELD_CREATEMAN = "createman";

        @JsonIgnore
        public String getCreateMan(){
                Object objValue = this.get(FIELD_CREATEMAN);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_CREATEMAN)
        public void setCreateMan(String createMan){
                this.set(FIELD_CREATEMAN, createMan);
        }

        @JsonIgnore
        public boolean isCreateManDirty(){
                return this.contains(FIELD_CREATEMAN);
        }

        /**
        * 数据审计标识
        */
        //private String dataAuditId;
        public final static String FIELD_DATAAUDITID = "dataauditid";

        @JsonIgnore
        public String getDataAuditId(){
                Object objValue = this.get(FIELD_DATAAUDITID);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_DATAAUDITID)
        public void setDataAuditId(String dataAuditId){
                this.set(FIELD_DATAAUDITID, dataAuditId);
        }

        @JsonIgnore
        public boolean isDataAuditIdDirty(){
                return this.contains(FIELD_DATAAUDITID);
        }

        /**
        * 审计条目
        */
        //private String dataAuditName;
        public final static String FIELD_DATAAUDITNAME = "dataauditname";

        @JsonIgnore
        public String getDataAuditName(){
                Object objValue = this.get(FIELD_DATAAUDITNAME);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_DATAAUDITNAME)
        public void setDataAuditName(String dataAuditName){
                this.set(FIELD_DATAAUDITNAME, dataAuditName);
        }

        @JsonIgnore
        public boolean isDataAuditNameDirty(){
                return this.contains(FIELD_DATAAUDITNAME);
        }

        /**
        * 访问地址
        */
        //private String iPAddress;
        public final static String FIELD_IPADDRESS = "ipaddress";

        @JsonIgnore
        public String getIPAddress(){
                Object objValue = this.get(FIELD_IPADDRESS);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_IPADDRESS)
        public void setIPAddress(String iPAddress){
                this.set(FIELD_IPADDRESS, iPAddress);
        }

        @JsonIgnore
        public boolean isIPAddressDirty(){
                return this.contains(FIELD_IPADDRESS);
        }

        /**
        * 对象编号
        */
        //private String objectId;
        public final static String FIELD_OBJECTID = "objectid";

        @JsonIgnore
        public String getObjectId(){
                Object objValue = this.get(FIELD_OBJECTID);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_OBJECTID)
        public void setObjectId(String objectId){
                this.set(FIELD_OBJECTID, objectId);
        }

        @JsonIgnore
        public boolean isObjectIdDirty(){
                return this.contains(FIELD_OBJECTID);
        }

        /**
        * 对象类型
        */
        //private String objectType;
        public final static String FIELD_OBJECTTYPE = "objecttype";

        @JsonIgnore
        public String getObjectType(){
                Object objValue = this.get(FIELD_OBJECTTYPE);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_OBJECTTYPE)
        public void setObjectType(String objectType){
                this.set(FIELD_OBJECTTYPE, objectType);
        }

        @JsonIgnore
        public boolean isObjectTypeDirty(){
                return this.contains(FIELD_OBJECTTYPE);
        }

        /**
        * 操作人
        */
        //private String opPersonId;
        public final static String FIELD_OPPERSONID = "oppersonid";

        @JsonIgnore
        public String getOpPersonId(){
                Object objValue = this.get(FIELD_OPPERSONID);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_OPPERSONID)
        public void setOpPersonId(String opPersonId){
                this.set(FIELD_OPPERSONID, opPersonId);
        }

        @JsonIgnore
        public boolean isOpPersonIdDirty(){
                return this.contains(FIELD_OPPERSONID);
        }

        /**
        * 操作人
        */
        //private String opPersonName;
        public final static String FIELD_OPPERSONNAME = "oppersonname";

        @JsonIgnore
        public String getOpPersonName(){
                Object objValue = this.get(FIELD_OPPERSONNAME);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_OPPERSONNAME)
        public void setOpPersonName(String opPersonName){
                this.set(FIELD_OPPERSONNAME, opPersonName);
        }

        @JsonIgnore
        public boolean isOpPersonNameDirty(){
                return this.contains(FIELD_OPPERSONNAME);
        }

        /**
        * 访问标识
        */
        //private String sessionId;
        public final static String FIELD_SESSIONID = "sessionid";

        @JsonIgnore
        public String getSessionId(){
                Object objValue = this.get(FIELD_SESSIONID);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_SESSIONID)
        public void setSessionId(String sessionId){
                this.set(FIELD_SESSIONID, sessionId);
        }

        @JsonIgnore
        public boolean isSessionIdDirty(){
                return this.contains(FIELD_SESSIONID);
        }

        /**
        * 更新时间
        */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
        //private Timestamp updateDate;
        public final static String FIELD_UPDATEDATE = "updatedate";

        @JsonIgnore
        public Timestamp getUpdateDate(){
                Object objValue = this.get(FIELD_UPDATEDATE);
                if(objValue==null){
                        return null;
                }
                return (Timestamp)objValue;
        }

        @JsonProperty(FIELD_UPDATEDATE)
        public void setUpdateDate(Timestamp updateDate){
                this.set(FIELD_UPDATEDATE, updateDate);
        }

        @JsonIgnore
        public boolean isUpdateDateDirty(){
                return this.contains(FIELD_UPDATEDATE);
        }

        /**
        * 更新人
        */
        //private String updateMan;
        public final static String FIELD_UPDATEMAN = "updateman";

        @JsonIgnore
        public String getUpdateMan(){
                Object objValue = this.get(FIELD_UPDATEMAN);
                if(objValue==null){
                        return null;
                }
                return (String)objValue;
        }

        @JsonProperty(FIELD_UPDATEMAN)
        public void setUpdateMan(String updateMan){
                this.set(FIELD_UPDATEMAN, updateMan);
        }

        @JsonIgnore
        public boolean isUpdateManDirty(){
                return this.contains(FIELD_UPDATEMAN);
        }

        @JsonIgnore
        public String getSrfkey(){
                return this.getDataAuditId();
        }

        public void setSrfkey(String strValue){
                this.setDataAuditId(strValue);
        }

        /**
        *  数据审计明细集合
        */
        private java.util.List<net.ibizsys.runtime.util.domain.DataAuditDetail> dataauditdetails;

        public java.util.List<net.ibizsys.runtime.util.domain.DataAuditDetail> getDataauditdetails(){
                return this.dataauditdetails;
        }

        public void setDataauditdetails(java.util.List<net.ibizsys.runtime.util.domain.DataAuditDetail> dataauditdetails){
                this.dataauditdetails = dataauditdetails;
        }

        @JsonIgnore
        public java.util.List<net.ibizsys.runtime.util.domain.DataAuditDetail> getDataauditdetailsIf(){
                if(this.dataauditdetails == null){
                      this.dataauditdetails = new java.util.ArrayList<net.ibizsys.runtime.util.domain.DataAuditDetail>();          
                }
                return this.dataauditdetails;
        }
}
