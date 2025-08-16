def sql = '''
    ${item.sql}   
'''
def sqlparams = []
<% item.getPSDELogicNodeParams().each{
    if(!'SQLPARAM'.equalsIgnoreCase(it.getParamAction())) return;
%>\
<% if (it.paramValueComment){%>\
${ti.paramValueComment.commentString}
<%}%>\
sqlparams.add(${it.paramValueExpression})
<% }%>
<% if(item.getPSSysDBScheme()){%>\
def db = sys.dbschema('${item.getPSSysDBScheme().uniquetag(item.getPSSysDBScheme().getPSSysModelGroup())}')
<%}else{%>\
def db = getDataEntityRuntime().getSysDBSchemeRuntime()
<%}%>\
<% if(item.isFillDstLogicParam()){%>\
List list = db.executeSelectSQL(sql, sqlparams)
if(list!=null && list.size()>0) {
    def dstEntity = iDELogicSession.getParam('${item.getDstPSDELogicParamMust().getCodeName()}')
<% if(!item.isIgnoreResetDstLogicParam()){%>\
    //重置目标对象
    dstEntity.resetAll()
<%}%>\
    def iEntityDTO = getDataEntityRuntime().createEntity()
    iEntityDTO.reload(list.get(0), false)
    iEntityDTO.copyTo(dstEntity)
}
<%}else{%>\
db.executeSQL(sql, sqlparams)
<%}%>