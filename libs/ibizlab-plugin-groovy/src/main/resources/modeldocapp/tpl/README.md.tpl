# $sys.name

## 基本

### 系统模块集合
|名称|模块编号|代码标识|说明|
|-------------------|:-------------------|:-------------------|:-------------------|
<% def modules = sys.getPSSystem().getAllPSSystemModules()
   for(def module : modules) {
     def moduleid = utils.uniqueid(module.id)
%>\
|<a href="#/psmodules/$moduleid">$module.name</a>|&nbsp;|$module.codeName|&nbsp;|
<% }%>

