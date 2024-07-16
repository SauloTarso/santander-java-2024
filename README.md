# Santander Java - 2024
#### Projeto RESTFul API criada como desafio do BootCamp.

## Diagrama de Classes Utilizando o Mermaid

```mermaid
classDiagram
    class Usuario {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limit
    }

    class News {
        -String icon
        -String description
    }

    Usuario "1" -- "1" Account
    Usuario "1" -- "N" Feature
    Usuario "1" -- "1" Card
    Usuario "1" -- "N" News

```