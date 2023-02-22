# Springboot-Server

Servidor de Springboot para la practica tecnica del dia 21 de Febrero de 2023.


## Ejecutar Localmente

Clonar el proyecto

```bash
  git clone https://github.com/EdgarCapge/Springboot-Server.git
```

Moverse al directorio del proyecto

```bash
  cd Springboot-Server
```

Iniciar el servidor

#### Windows
```bash
  mvnw.cmd spring-boot:run
```
#### Linux / MacOS
```bash
  mvnw spring-boot:run
```


## API Reference

#### Enviar los datos al servicio y asi mismo, obtener la respuesta

```http
  POST localhost:9090/CIC
```

| Parametro | Tipo     | Descripcion                |
| :-------- | :------- | :------------------------- |
| `initialInvestment` | `numérico` | Inversión inicial |
| `annualContribution` | `numérico` | Contribución Anual |
| `annualIncrease` | `numérico` | Incremento anual (porcentual)|
| `investmentYears` | `numérico` | Años totales de inversión |
| `rateOfReturn` | `numérico` | Rendimiento de la inversión (porcentual) |




