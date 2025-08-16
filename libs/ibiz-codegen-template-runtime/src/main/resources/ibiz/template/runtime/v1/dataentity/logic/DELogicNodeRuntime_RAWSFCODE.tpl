<% if(item.getDstPSDELogicParam()){%>\
//默认参数：${item.getDstPSDELogicParam().name}}({item.getDstPSDELogicParam().codeName})
<%}%>\
//脚本代码：
${item.code.commentString}
//调用基类执行
super.onExecutePSDELogicNode(iDELogicSession, NODES['${item.codeName.toUpperCase()}'], false)