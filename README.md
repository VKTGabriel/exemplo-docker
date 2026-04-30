
# Exemplo Docker

Um simples serviço web que retorna uma String quando solicitado.






```http
  GET /api
```

 Tipo Retono     | Valor                |
 :------- | :------------------------- |
 `string` | teste docker |




## Build
Criação da imagem a partir do projeto

```bash
  docker build --tag NOME-DA-TAG .
```

## Run
Criação e execução do container

```bash
  docker run --name NOME-CONTAINER -p 8080:8080 NOME-DA_TAG:latest
```
    