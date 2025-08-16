<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<definitions xmlns="http://www.omg.org/spec/BPMN/20100524/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:flowable="http://flowable.org/bpmn" xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI" xmlns:omgdc="http://www.omg.org/spec/DD/20100524/DC" xmlns:omgdi="http://www.omg.org/spec/DD/20100524/DI" typeLanguage="http://www.w3.org/2001/XMLSchema" expressionLanguage="http://www.w3.org/1999/XPath" targetNamespace="http://www.flowable.org/processdef">
    <process id="${sys.getCodeName().toLowerCase()}-${item.codeName.toLowerCase()}" isClosed="false" isExecutable="true" name="${item.getName()}" processType="None">
        <extensionElements>

            <flowable:eventListener delegateExpression="\${processInstanceListener}"  />

<% if (item.getPSWFRoles().size() > 0) { %>\
            <flowable:field name="refgroups">
                <flowable:string><%item.getPSWFRoles().eachWithIndex{ wfrole,index ->%><%=(index>0)?",":""%>${wfrole.getCodeName()}|${wfrole.getName()}|${wfrole.getWFRoleType()}<% if(wfrole.getWFRoleType()=="DEDATASET"){%>/${wfrole.getPSDataEntity().getName().toLowerCase()}/${wfrole.getPSDEDataSet().getCodeName().toLowerCase()}/${wfrole.getWFUserIdPSDEF().getCodeName().toLowerCase()}<%}%><%}%></flowable:string>
            </flowable:field>
<% } %>\
<% if (item.getPSWorkflow() != null && item.getPSWorkflow().getPSWFDEs() != null && item.getPSWorkflow().getPSWFDEs().size() > 0) { %>\
            <flowable:field name="bookings">
                <flowable:string><%item.getPSWorkflow().getPSWFDEs().eachWithIndex{ wfde,index ->%><%=(index>0)?",":""%>${wfde.getPSDataEntity().getName().toLowerCase()}<%}%></flowable:string>
            </flowable:field>
<%item.getPSWorkflow().getPSWFDEs().eachWithIndex{ wfde,index ->%>\
<% if (wfde.getCloudApps().size() > 0) { %>\
            <flowable:field name="bookingapps_${wfde.getName().toLowerCase()}">
                <flowable:string><%wfde.getCloudApps().eachWithIndex{ app,index2 ->%><%=(index2>0)?",":""%>${app.getCodeName()}<%}%></flowable:string>
            </flowable:field>
<% } %>\
<% if (wfde.getCloudMobApps().size() > 0) { %>\
            <flowable:field name="bookingmobs_${wfde.getName().toLowerCase()}">
                <flowable:string><%wfde.getCloudMobApps().eachWithIndex{ app,index2 ->%><%=(index2>0)?",":""%>${app.getCodeName()}<%}%></flowable:string>
            </flowable:field>
<% } %>\
<% if (wfde.getWFStepPSDEField()) {%>\
            <flowable:field name="wfstepfield_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getWFStepPSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getWFInstPSDEField()) {%>\
            <flowable:field name="wfinstfield_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getWFInstPSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getUDStatePSDEField()) {%>\
            <flowable:field name="udstatefield_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getUDStatePSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getWFStatePSDEField()) {%>\
            <flowable:field name="wfstatefield_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getWFStatePSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getWFVerPSDEField()) {%>\
            <flowable:field name="wfverfield_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getWFVerPSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getPSDataEntity().getMajorPSDEField()) {%>\
            <flowable:field name="majortext_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getPSDataEntity().getMajorPSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getPSDataEntity().getOrgIdPSDEField()) {%>\
            <flowable:field name="orgfield_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${(wfde.getPSDataEntity().getOrgIdPSDEField().getCodeName().toLowerCase())}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getEntityWFState()) {%>\
            <flowable:field name="udstateingval_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${wfde.getEntityWFState()}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getEntityWFFinishState()) {%>\
            <flowable:field name="wffinishval_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${wfde.getEntityWFFinishState()}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getEntityWFCancelState()) {%>\
            <flowable:field name="wfcancelval_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${wfde.getEntityWFCancelState()}</flowable:string>
            </flowable:field>
<%}%>\
<% if (wfde.getEntityWFErrorState()) {%>\
            <flowable:field name="wferrorval_${wfde.getPSDataEntity().getName().toLowerCase()}">
                <flowable:string>${wfde.getEntityWFErrorState()}</flowable:string>
            </flowable:field>
<%}%>\
<%}%>\
<% } %>\
            <flowable:field name="isvalid">
                <flowable:string><%= item.isValid()?"1":"0"%></flowable:string>
            </flowable:field>
        </extensionElements>

<% if (item.getPSWFProcesses() != null && item.getPSWFProcesses().size() > 0) {
  item.getPSWFProcesses().each{ process -> %>\
<% if (process.getWFProcessType()=='START'){ %>\
        <startEvent id="sid-${process.getDeployId()}" name="${process.getName()}">
<% if (process.getFormCodeName() || process.getMobFormCodeName()) {%>\
          <extensionElements>
            <flowable:form <%if (process.getFormCodeName()) {%>process-form="${process.getFormCodeName()}"<% } %><%if (process.getMobFormCodeName()) {%> process-mobform="${process.getMobFormCodeName()}" <% } %> wfversion="${item.getWFVersion()}"/>
          </extensionElements>
<% } %>\
        </startEvent>

<% } else if (process.getWFProcessType()=='END'){ %>\
        <endEvent id="sid-${process.getDeployId()}" name="${process.getName()}">
<% if (process.getExitStateValue() || process.getUserData() || process.getUserData2()) {%>\
            <extensionElements>
                <flowable:form<%if (process.getExitStateValue()){ %> exitstatevalue="${process.getExitStateValue()}"<% } %><%if (process.getUserData()){ %> userdata="${process.getUserData()}"<% } %><%if (process.getUserData2()){ %> userdata2="${process.getUserData2()}"<% } %> />
            </extensionElements>
<% } %>\
        </endEvent>

<% } else if (process.getWFProcessType()=='PARALLELGATEWAY'){ %>\
        <parallelGateway id="sid-${process.getDeployId()}"></parallelGateway>

<% } else if (process.getWFProcessType()=='INCLUSIVEGATEWAY'){ %>\
        <inclusiveGateway id="sid-${process.getDeployId()}"></inclusiveGateway>

<% } else if (process.getWFProcessType()=='EXCLUSIVEGATEWAY'){ %>\
        <exclusiveGateway id="sid-${process.getDeployId()}"></exclusiveGateway>

<% } else if (process.getWFProcessType()=='PROCESS'){ %>\
        <serviceTask id="sid-${process.getDeployId()}" name="${process.getName()}" flowable:expression="\${wfCoreService.execute(execution, activedata)}" >
<% if (process.getPSDataEntity()) {%>\
            <extensionElements>
                <flowable:field name="service-entity"><flowable:string>${process.getPSDataEntity().getName().toLowerCase()}</flowable:string></flowable:field>
                <flowable:field name="service-deaction"><flowable:string>${process.getPSDEAction().getCodeName().toLowerCase()}</flowable:string></flowable:field>
<% if (process.getPSWFProcessParams() != null && process.getPSWFProcessParams().size() > 0) {
  process.getPSWFProcessParams().each{ param ->
    if(param.getDstField() && param.getDstField())  {
      if(param.getSrcValueType() && param.getSrcValueType()) {%>\
<% if (param.getSrcValueType()=='CURTIME'){ %>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:expression><![CDATA[\${wfCoreService.getnow()}]]></flowable:expression></flowable:field>
<% } else if (param.getSrcValueType()=='OPERATOR'){ %>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:expression><![CDATA[\${curuser.userid}]]></flowable:expression></flowable:field>
<% } else if (param.getSrcValueType()=='OPERATORNAME'){ %>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:expression><![CDATA[\${curuser.personname}]]></flowable:expression></flowable:field>
<% } else if (param.getSrcValueType()=='CONTEXT'){ %>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:expression><![CDATA[\${activedata.${param.getSrcValue().toLowerCase()}}]]></flowable:expression></flowable:field>
<% } else if (param.getSrcValueType()=='SESSION'){ %>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:expression><![CDATA[\${curuser.sessionParams.${param.getSrcValue().toLowerCase()}}]]></flowable:expression></flowable:field>
<% } %>\
<% } else {  %>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:string>${param.getSrcValue()}</flowable:string></flowable:field>
<% }}}} %>\
            </extensionElements>
<% } %>\
<% if (!process.getPSDataEntity()) {%>\
            <extensionElements>
<% if (process.getPSWFProcessParams() != null && process.getPSWFProcessParams().size() > 0) {
  process.getPSWFProcessParams().each{ param ->
    if(param.getSrcValue() && param.getDstField() && param.getDstField())  {%>\
                <flowable:field name="params-${(param.getDstField().toLowerCase())}"><flowable:string>${param.getSrcValue()}</flowable:string></flowable:field>
<% }}} %>\
            </extensionElements>
<% } %>\
        </serviceTask>

<% } else { %>\
<% if (process.getWFProcessType()=='EMBED'){ %>\
        <subProcess id="sid-${process.getDeployId()}"<%if(!process.hasTimeOutLink() && process.getCloudDueDate()){%> flowable:dueDate="${process.getCloudDueDate()}"<%}%> flowable:category="\${businessKey}" flowable:candidateUsers="<%if(process.isMultiInstance()){%>\${candidateUsers}<% } else { %>${process.getCloudProcessUser()}<%=(process.getCloudProcessUser())? ",\${activedata.srfwfpredefinedusers}":"\${activedata.srfwfpredefinedusers}"%><%}%>" flowable:exclusive="true" name="${process.getName()}"  flowable:formKey="${process.getWFProcessType()}">
<% if (process.getPSWFProcessSubWFs() != null && process.getPSWFProcessSubWFs().size() > 0) {
  process.getPSWFProcessSubWFs().each{ subwf -> %>\
<%= ctx.outputWithParent(subwf.getPSWFVersion(),'/workflow/bpmn.temp.tpl',subwf) %>
<% }} %>
<% } else if (process.getWFProcessType()=='CALLORGACTIVITY'){ %>\
        <callActivity id="sid-${process.getDeployId()}" calledElement="\${wfCoreService.getDefinitionKey('${process.getTargetPSWF().getCodeName()}', execution)}" flowable:calledElementType="key" flowable:inheritVariables="true" name="${process.getName()}">
<% } else { %>\
        <userTask id="tid-${process.getWFStepValue()}-${process.getDeployId()}"<%if(!process.hasTimeOutLink() && process.getCloudDueDate()){%> flowable:dueDate="${process.getCloudDueDate()}"<%}%> flowable:category="\${businessKey}" flowable:candidateUsers="<%if(process.isMultiInstance()){%>\${candidateUsers}<% } else { %>${process.getCloudProcessUser()}<%=(process.getCloudProcessUser())? ",\${activedata.srfwfpredefinedusers}":"\${activedata.srfwfpredefinedusers}"%><%}%>" flowable:exclusive="true" name="${process.getName()}">
<% } %>\
            <documentation>\${majortext}</documentation>
<% if ((process instanceof net.ibizsys.model.wf.IPSWFInteractiveProcess)  && (
    (process.getPredefinedActions()!=null && process.getPredefinedActions().size > 0)
        || (process.getEditFields()!=null && process.getEditFields().size > 0)
        || process.getFormCodeName() || process.getMobFormCodeName()
        || process.getUtilFormCodeName() || process.getUtil2FormCodeName() || process.getUtil3FormCodeName()
        || process.getUtilFormName() || process.getUtilFormName() || process.getUtilFormName()
        || process.getMobUtilFormCodeName() || process.getMobUtil2FormCodeName() || process.getMobUtil3FormCodeName()
        || process.getMobUtilFormName() || process.getMobUtil2FormName() || process.getMobUtil3FormName()
        || process.isEditable() || process.getEditMode() || process.getMemoField() || process.isMultiInstance()
)){ %>\
            <extensionElements>
                <flowable:form
<%if(process.getPredefinedActions()!=null && process.getPredefinedActions().size > 0){%>\
                    procfunc="<%process.getPredefinedActions().eachWithIndex{ action,index -> %><%=(index>0?";":"")%>${action.toLowerCase()}<%}%>"
<% } %>\
<%if(process.getFormCodeName()){%>\
                    process-form="${process.getFormCodeName()}"
<% } %>\
<%if(process.getMobFormCodeName()){%>\
                    process-mobform="${process.getMobFormCodeName()}"
<% } %>\
<%if(process.getUtilFormCodeName()){%>\
                    process-utilform="${process.getUtilFormCodeName()}"
<% } %>\
<%if(process.getUtil2FormCodeName()){%>\
                    process-util2form="${process.getUtil2FormCodeName()}"
<% } %>\
<%if(process.getUtil3FormCodeName()){%>\
                    process-util3form="${process.getUtil3FormCodeName()}"
<% } %>\
<%if(process.getUtilFormName()){%>\
                    process-utilformname="${process.getUtilFormName()}"
<% } %>\
<%if(process.getUtil2FormName()){%>\
                    process-util2formname="${process.getUtil2FormName()}"
<% } %>\
<%if(process.getUtil3FormName()){%>\
                    process-util3formname="${process.getUtil3FormName()}"
<% } %>\
<%if(process.getMobUtilFormCodeName()){%>\
                    process-mobutilform="${process.getMobUtilFormCodeName()}"
<% } %>\
<%if(process.getMobUtil2FormCodeName()){%>\
                    process-mobutil2form="${process.getMobUtil2FormCodeName()}"
<% } %>\
<%if(process.getMobUtil3FormCodeName()){%>\
                    process-mobutil3form="${process.getMobUtil3FormCodeName()}"
<% } %>\
<%if(process.getMobUtilFormName()){%>\
                    process-mobutilformname="${process.getMobUtilFormName()}"
<% } %>\
<%if(process.getMobUtil2FormName()){%>\
                    process-mobutil2formname="${process.getMobUtil2FormName()}"
<% } %>\
<%if(process.getMobUtil3FormName()){%>\
                    process-mobutil3formname="${process.getMobUtil3FormName()}"
<% } %>\
<%if(process.isEditable()){%>\
                    process-isEditable="${process.isEditable()}"
<% } %>\
<%if(process.getEditMode()){%>\
                    process-editMode="${process.getEditMode()}"
<% } %>\
<%if(process.getEditFields()!=null && process.getEditFields().size > 0){%>\
                    editFields="<%process.getEditFields().eachWithIndex{ field,index -> %><%=(index>0?";":"")%>${field.toLowerCase()}<%}%>"
<% } %>\
<%if(process.getMemoField()){%>\
                    process-memofield="${process.getMemoField()}"
<% } %>\
<%if(process.isMultiInstance()){%>\
                    candidateUsersList="${process.getCloudProcessUser2()}<%=(process.getCloudProcessUser2())? "||#activedata.srfwfpredefinedusers":"#activedata.srfwfpredefinedusers"%>"
<% } %>\
                />
            </extensionElements>
<% } %>\
<% if ((process instanceof net.ibizsys.model.wf.IPSWFCallActivityProcess)  && ( process.isMultiInstance()
)){ %>\
            <extensionElements>
                <flowable:form
<%if(process.isMultiInstance()){%>\
                    candidateUsersList="${process.getCloudProcessUser2()}<%=(process.getCloudProcessUser2())? "||#activedata.srfwfpredefinedusers":"#activedata.srfwfpredefinedusers"%>"
<% } %>\
                />
            </extensionElements>
<% } %>\
<% if (process.isMultiInstance()){ %>\
            <multiInstanceLoopCharacteristics flowable:collection="candidateUsersList" flowable:elementVariable="candidateUsers" isSequential="${process.isSequential()}">
                <completionCondition><![CDATA[\${wfCoreService.accessCondition(execution)}]]></completionCondition>
            </multiInstanceLoopCharacteristics>
<% } %>\
<% if (process.getWFProcessType()=='EMBED'){ %>\
        </subProcess>
<% } else if (process.getWFProcessType()=='CALLORGACTIVITY'){ %>\
        </callActivity>
<% } else { %>\
        </userTask>

<% } %>\
<% if (process.hasTimeOutLink()){ %>\
        <boundaryEvent id="bid-${process.getWFStepValue()}-${process.getDeployId()}" name="timeout-${process.getName()}" attachedToRef="tid-${process.getWFStepValue()}-${process.getDeployId()}" cancelActivity="true">
            <timerEventDefinition>
                <timeDate>${process.getCloudDueDate()}</timeDate>
            </timerEventDefinition>
        </boundaryEvent>
<% } %>\
<% } %>\
<% }} %>\



<% if (item.getPSWFLinks() != null && item.getPSWFLinks().size() > 0) {
  item.getPSWFLinks().each{ link -> %>\
        <sequenceFlow id="<%=(link.getWFLinkType()!='ROUTE')?"lid-":"rid-"%>${link.getDeployId()}"  name="<%=(link.getLogicName())?link.getLogicName():""%>"
            sourceRef="<%if(link.getWFLinkType() == 'TIMEOUT'){%>bid-${link.getFromPSWFProcess().getWFStepValue()}-${link.getFromPSWFProcess().getDeployId()}<%}else if(link.getFromPSWFProcess().getWFProcessType()=='INTERACTIVE'){%>tid-${link.getFromPSWFProcess().getWFStepValue()}-${link.getFromPSWFProcess().getDeployId()}<%} else {%>sid-${link.getFromPSWFProcess().getDeployId()}<%}%>"
            targetRef="<%if(link.getWFLinkType() == 'TIMEOUT'){%>bid-${link.getToPSWFProcess().getWFStepValue()}-${link.getToPSWFProcess().getDeployId()}<%}else if(link.getToPSWFProcess().getWFProcessType()=='INTERACTIVE'){%>tid-${link.getToPSWFProcess().getWFStepValue()}-${link.getToPSWFProcess().getDeployId()}<%} else {%>sid-${link.getToPSWFProcess().getDeployId()}<%}%>">
<%if(link.getWFLinkType() != 'WFRETURN'){
        if(link.getWFLinkType() == 'ROUTE'){%>\
<%if(link.getCustomCond()){%>\
            <conditionExpression  xsi:type="tFormalExpression">${link.getCustomCond()}</conditionExpression>
<% } else if(link.getCloudCondInfo()){ %>\
            <conditionExpression  xsi:type="tFormalExpression"><![CDATA[<%out.print("\$")%>{${link.getCloudCondInfo()}}]]></conditionExpression>
<% } %>\
<% } else { %>\
            <conditionExpression  xsi:type="tFormalExpression"><![CDATA[<%out.print("\$")%>{sequenceFlowId=="<%=(link.getWFLinkType()!='ROUTE')?"lid-":"rid-"%>${link.getDeployId()}"}]]></conditionExpression>
<% }} %>\
<% if ( (link instanceof net.ibizsys.model.wf.IPSWFInteractiveLink) &&
 ( link.getFormCodeName() || link.getMobFormCodeName() || link.getViewCodeName() || link.getMobViewCodeName() || link.getNextCondition() || link.getCustomCond() )
){ %>\
            <extensionElements>
                <flowable:form
<%if(link.getFormCodeName()){%>\
                    sequenceFlowForm="${link.getFormCodeName()}"
<% } %>\
<%if(link.getMobFormCodeName()){%>\
                    sequenceFlowMobForm="${link.getMobFormCodeName()}"
<% } %>\
<%if(link.getViewCodeName()){%>\
                    sequenceFlowView="${link.getViewCodeName()}"
<% } %>\
<%if(link.getMobViewCodeName()){%>\
                    sequenceFlowMobView="${link.getMobViewCodeName()}"
<% } %>\
<%if(link.getNextCondition()){%>\
                    nextCondition="${link.getNextCondition()}"
<% } %>\
<%if(link.getCustomCond()){%>\
                    customCond="${link.getCustomCond()}"
<% } %>\
                />
            </extensionElements>
<% } %>\
        </sequenceFlow>

<% }} %>\

    </process>

    <bpmndi:BPMNDiagram id="BPMNDiagram_${sys.getCodeName().toLowerCase()}-${item.codeName.toLowerCase()}">
        <bpmndi:BPMNPlane id="BPMNPlane_${sys.getCodeName().toLowerCase()}-${item.codeName.toLowerCase()}" bpmnElement="${sys.getCodeName().toLowerCase()}-${item.codeName.toLowerCase()}">
<% if (item.getPSWFProcesses() != null && item.getPSWFProcesses().size() > 0) {
  item.getPSWFProcesses().each{ process -> %>\
            <bpmndi:BPMNShape id="BPMNShape-${process.getDeployId()}" bpmnElement="<%= (process.getWFProcessType()=='INTERACTIVE') ? "tid-" + process.getWFStepValue():"sid"%>-${process.getDeployId()}">
                <omgdi:Bounds x="${process.getLeftPos()}" y="${process.getTopPos()}" width="${process.getWidth()}" height="${process.getHeight()}" />
            </bpmndi:BPMNShape>
<% }} %>\
<% if (item.getPSWFLinks() != null && item.getPSWFLinks().size() > 0) {
  item.getPSWFLinks().each{ link -> %>\
            <bpmndi:BPMNEdge id="BPMNEdge-<%= (link.getWFLinkType()!='ROUTE') ?  "lid":"rid"%>-${link.getDeployId()}" bpmnElement="<%= (link.getWFLinkType()!='ROUTE') ?  "lid":"rid"%>-${link.getDeployId()}">
                <omgdi:waypoint x="0" y="0" />
                <omgdi:waypoint x="0" y="0" />
            </bpmndi:BPMNEdge>
<% }} %>\
        </bpmndi:BPMNPlane>
    </bpmndi:BPMNDiagram>
</definitions>