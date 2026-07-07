PROJETO: SPRINGBOOT-JPA (SISTEMA DE VENDAS)

DESCRIÇÃO: Este projeto consiste em uma aplicação backend desenvolvida com Spring Boot, com focona construção de uma API REST para gerenciamento de dados de um sistema de vendas. A aplicaçãosegue boas práticas de arquitetura em camadas e utiliza JPA para persistência de dados.

STACK:
Java 17+
Spring Boot
Spring Data JPA
Hibernate
Maven
Banco de dados relacional (H2)

ARQUITETURA:
O projeto segue o padrão de arquitetura em camadas:
Resource (Controller) Responsável pela exposição dos endpoints REST
Service Contém as regras de negócio e orquestração da aplicação
Repository Interface de acesso aos dados utilizando Spring Data JPA
Entity Representação das entidades persistidas no banco de dados
Exception Handling Tratamento centralizado de exceções

FUNCIONALIDADES:
CRUD completo de entidades
Persistência de dados com JPA/Hibernate
Tratamento de exceções customizadas
Estrutura RESTful
Separação de responsabilidades por camada
