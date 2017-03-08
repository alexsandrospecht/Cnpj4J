# Cnpj4J

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Cliente para consultas de CNPJ no https://www.receitaws.com.br/


### Maven
```
<dependency>
  <groupId>com.github.alexsandrospecht</groupId>
  <artifactId>Cnpj4J</artifactId>
  <version>0.9.2</version>
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
