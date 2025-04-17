# Dio Cotações Moedas
Desafio de criação de um projeto utilizando padrões de projeto em Java.

Trata-se de um projeto Springboot;

## Branches
Esse projeto possui duas branches:
1. main - a principal.
2. singleton-facade - possui uma versão usando singleton e facade.

## Requísitos
1. Java 21;
2. Springboot 3.4.4;
3. Mavenç;

## Dependencias
1. Lombok;
2. Spring Web;
3. Spring Security;

## Padrões Utilizados
1. Strategy;

## Body
* Para as requisições POST:

```json
{
  "valor": 52.56
}
```

* **Esse Modelo também é usado para os retornos de nossas rotas.**

## Nossas Rotas

| Rota                     | Método   | Body    |
|--------------------------|----------|---------|
| /                        | **GET**  | **NÃO** |
| /api/usd-brl             | **GET**  | **NÃO** |
| /api/usd-brl/dollar-real | **POST** | **SIM** |
| /api/usd-brl/real-dollar | **POST** | **SIM** |
| /api/eur-brl             | **GET**  | **NÃO** |
| /api/eur-brl/euro-real   | **POST** | **SIM** |
| /api/eur-brl/real-euro   | **POST** | **SIM** |
| /api/gbp-brl             | **GET**  | **NÃO** |
| /api/gbp-brl/libra-real  | **POST** | **SIM** |
| /api/gbp-brl/real-libra  | **POST** | **SIM** |

---
*That's all Folks!*
