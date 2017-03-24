<p align="center">
<img src="https://github.com/alexsandrospecht/Cnpj4J/blob/master/images/logo.PNG" alt="Localtower"> </br>
Cliente para consultas de CNPJ no https://www.receitaws.com.br/
</p>

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

### Maven
``` xml
<dependency>
  <groupId>com.github.alexsandrospecht</groupId>
  <artifactId>Cnpj4J</artifactId>
  <version>0.9.3</version>
</dependency>
```

### Como utilizar?
```java
// Retorno em String
ConsultaCnpj.consultaData(SEU_CNPJ);

// RetornoWrapper
RetornoWrapper wp = ConsultaCnpj.consultaCnpj(SEU_CNPJ);
...
```


### [Demo](https://github.com/alexsandrospecht/Cnpj4J/blob/master/src/main/java/com/github/alexsandrospecht/Demo.java)
