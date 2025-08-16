<% def module = sys.getPSSystem().getPSSystemModule(path.moduleid, false) %>
<a href='#'>:fas fa-home:</a>/psmodules/<a href="#/psmodules/$path.moduleid">$module.codeName</a>
# $module.name

## 基本
| 项              |值                |说明                     |
|-------------------|:---------------------|:------------------------|
|名称&nbsp;(name)|$module.name|&nbsp;|
|代码标识&nbsp;(codeName)|$module.codeName|&nbsp;|

## 用户扩展
| 项              |值                |说明                     |
|-------------------|:---------------------|:------------------------|
## 其它
| 项              |值                |说明                     |
|-------------------|:---------------------|:------------------------|
|动态实例模式&nbsp;(dynaInstMode)|不启用&nbsp;(0)|&nbsp;|
|自动产生模型&nbsp;(autoModel)|false|&nbsp;|
|默认模块&nbsp;(defaultModule)|false|&nbsp;|
|支持动态模型&nbsp;(enableDynaModel)|false|&nbsp;|
|子系统以云服务方式提供&nbsp;(subSysAsCloud)|false|&nbsp;|
|子系统模块&nbsp;(subSysModule)|false|&nbsp;|
### 代码表集合
*(未定义)*
### 实体集合
|名称|代码标识|实体类型|说明|
|-------------------|:-------------------|:-------------------|:-------------------|
<%
   def dataentitylist = sys.getPSSystem().getAllPSDataEntities()
   for(def de : dataentitylist ) {
       if(!de.getPSSystemModule().id.equals(module.id)){
          continue;
       }
       def deid = utils.uniqueid(de.id)
%>\
|<a href="#/psmodules/$path.moduleid/psdataentities/$deid">$de.logicName&nbsp;($de.name)</a>|$de.codeName|附属实体&nbsp;(2)|&nbsp;|
<% } %>
### 工作流集合
*(未定义)*