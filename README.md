<p align="center">
<img src="https://github.com/alexsandrospecht/Cnpj4J/blob/master/images/logo.PNG" alt="Localtower"> </br>
Cliente para consultas de CNPJ no https://www.receitaws.com.br/
</p>

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://travis-ci.org/alexsandrospecht/Cnpj4J.svg?branch=master)](https://travis-ci.org/alexsandrospecht/Cnpj4J)
### Maven
``` xml
<dependency>
  <groupId>com.github.alexsandrospecht</groupId>
  <artifactId>Cnpj4J</artifactId>
  <version>0.9.5</version>
</dependency>
```

Verifique a última versão em: https://search.maven.org/search?q=cnpj4j

### Como utilizar?
```java

// Utilizando o retorno como String:
final String retorno = ConsultaCnpj.consultaData(SEU_CNPJ);
// ...


// Utilizando o wrapper:
final RetornoWrapper retorno = ConsultaCnpj.consultaCnpj(SEU_CNPJ);
retorno.getNome();
retorno.getAtividade_principal();
...

```


### [Demo](https://github.com/alexsandrospecht/Cnpj4J/blob/master/src/main/java/com/github/alexsandrospecht/Demo.java)
