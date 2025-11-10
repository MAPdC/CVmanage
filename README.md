# CVmanage

```mermaid
flowchart TD

A[Frontend React] -->|HTTP Request| B[Controller]

B -->|Chama métodos| C[Service]

C -->|Lê/Guarda dados| D[Repository]

D -->|SQL Queries| E[(Base de Dados)]

C -->|Devolve objetos| B
B -->|Resposta JSON| A

