class $item.name extends EntityDTO{
<% item.getPSDEMethodDTOFields().each {
   out << '  '<< '//' << it.groovyType << ' ' << it.name << '\n'    
}%>
}
