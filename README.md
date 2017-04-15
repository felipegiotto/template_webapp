# Template de Aplicação Web

Autor: felipegiotto@gmail.com

## Instruções

1. Clonar este repositório
2. Alterar o arquivo "pom.xml", com o novo nome da aplicação (campos groupId, artifactId, name, finalName e contextPath)
3. No arquivo "context.xml" do Tomcat, criar uma referência ao DataSource, indicando um nome no parâmetro "name":
```
<Resource name="jdbc/template_webapp"
      auth="Container"
      type="javax.sql.DataSource"
      driverClassName="org.sqlite.JDBC"
      url="jdbc:sqlite:/caminho/para/banco.sqlite3" />
```
4. No arquivo "web.xml", ajustar a tag "res-ref-name" apontando para o nome correto do DataSource
5. Na classe "ConnectionInitServlet", ajustar também o nome do DataSource na constante JDBC_NAME
