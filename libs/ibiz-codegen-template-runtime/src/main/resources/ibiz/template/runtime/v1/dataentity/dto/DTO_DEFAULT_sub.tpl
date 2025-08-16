class $item.name extends EntityDTO{
<% item.getPSDEMethodDTOFields().each {
    if(it.getPSDEField()!=null){
        out << '    ' << '//' << it.groovyType << ' get' << it.name.capitalize() << '() {get(\''<< it.getPSDEField().name.toLowerCase() <<'\')}\n' 
        out << '    ' << '//' << 'void' << ' set' << it.name.capitalize() << '('<< it.groovyType << ' val) {set(\''<< it.getPSDEField().name.toLowerCase() <<'\', val)}\n' 
    }
    else{
        out << '    ' << '//' << it.groovyType << ' get' << it.name.capitalize() << '() {get(\''<< it.name.toLowerCase() <<'\')}\n' 
        out << '    ' << '//' << 'void' << ' set' << it.name.capitalize() << '('<< it.groovyType << ' val) {set(\''<< it.name.toLowerCase() <<'\', val)}\n' 
    }
   
}%>
}
