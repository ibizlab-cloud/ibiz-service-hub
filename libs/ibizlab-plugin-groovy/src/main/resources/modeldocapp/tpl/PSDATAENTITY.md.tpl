<% def module = sys.getPSSystem().getPSSystemModule(path.moduleid, false)
   def dataentity = sys.getPSSystem().getPSDataEntity(path.dataentityid, false) %>
<a href='#'>:fas fa-home:</a>/psmodules/<a href="#/psmodules/$path.moduleid">$module.codeName</a>/psdataentities/<a href="#/psmodules/$path.moduleid/psdataentities/$path.dataentityid">$dataentity.name</a>
# $dataentity.name

## 基本
| 项              |值                |说明                     |
|-------------------|:---------------------|:------------------------|
|名称&nbsp;(name)|$dataentity.name|&nbsp;|
|代码标识&nbsp;(codeName)|$dataentity.codeName|&nbsp;|
|逻辑名称&nbsp;(logicName)|$dataentity.logicName|&nbsp;|
|实体类型&nbsp;(dEType)|主实体&nbsp;(1)|&nbsp;|

## 模型
| 项              |值                |说明                     |
|-------------------|:---------------------|:------------------------|
|主键属性&nbsp;(getKeyPSDEField)|$dataentity.keyPSDEField.name|&nbsp;|

### 属性集合
|名称|属性类型|数据类型|说明|
|-------------------|:-------------------|:-------------------|:-------------------|


```mermaid-example
stateDiagram-v2
    [*] --> First
    state First {
        [*] --> second
        second --> [*]
    }
```

```mermaid
stateDiagram-v2
    [*] --> First
    state First {
        [*] --> second
        second --> [*]
    }
```
