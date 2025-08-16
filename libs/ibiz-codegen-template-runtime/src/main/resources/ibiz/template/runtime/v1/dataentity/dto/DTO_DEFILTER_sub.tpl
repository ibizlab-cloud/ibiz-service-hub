class $item.name extends SearchContextDTO{
<% item.getPSDEMethodDTOFields().each {
out << '  ' << '//' << it.groovyType << ' ' << it.name << '\n'    
}%>
}
