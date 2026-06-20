# DSMovie

Catálogo de filmes com sistema de avaliação por estrelas, desenvolvido durante o curso **Semana Spring React**, da escola [DevSuperior](https://github.com/devsuperior), ministrado pelo professor [Nélio Alves](https://github.com/nelioalves) (UFU).

## Sobre o projeto

O DSMovie permite que usuários avaliem filmes do catálogo com notas que são exibidas visualmente como estrelas (preenchidas, meio-preenchidas ou vazias), no estilo comum a apps de avaliação. Cada filme exibe a nota média calculada a partir de todas as avaliações recebidas.

### Modelo de domínio

- **User** (`tb_user`) — `user_id`, `email`
- **Movie** (`tb_movie`) — `movie_id`, `title`, `score` (nota média), `count` (total de avaliações), `image` (URL do pôster, hospedado em themoviedb.org)
- **Score** (`tb_score`) — `movie_id`, `user_id`, `value` (nota individual dada pelo usuário)

A nota média (`score`) e a contagem (`count`) em `tb_movie` são recalculadas a cada nova avaliação registrada em `tb_score`.

## Arquitetura

O backend segue a arquitetura em camadas padrão dos projetos da DevSuperior, com a adição de uma camada de segurança:

- **Repository** — acesso a dados via Spring Data JPA.
- **Service** — regras de negócio (cálculo de média e contagem de notas).
- **Controller** — endpoints REST, comunicação via DTO em JSON.
- **Config** — configuração de CORS (`@EnableWebSecurity`, sem autenticação de usuário implementada).

```
Frontend (React + TypeScript) → Controller (REST/JSON) → Service → Repository (JPA) → Banco de dados
                                        ↑
                                  Config (CORS)
```

## Tecnologias

**Backend**
- Java
- Spring Boot
- Spring Data JPA
- Maven
- H2 (banco em memória, ambiente de desenvolvimento)
- PostgreSQL (produção)

**Frontend**
- React
- TypeScript
- Bootstrap
- Axios
- React Router DOM

## Conceitos aplicados

- Arquitetura em camadas (Controller / Service / Repository)
- Padrão DTO
- Modelo de domínio relacional (User / Movie / Score)
- Configuração de CORS
- Cálculo de médias agregadas

## Como executar

### Backend
```bash
cd backend
./mvnw spring-boot:run
```

> O projeto usa o banco H2 em memória por padrão para desenvolvimento local — não é necessário configurar um banco externo para rodar localmente.

### Frontend
```bash
cd frontend
npm install
npm start
```

## Deploy

O backend foi publicado em produção via [Heroku](https://www.heroku.com/).

## Contexto

Este projeto foi desenvolvido durante minha jornada de transição de carreira da fisioterapia para o desenvolvimento de software, como parte da formação prática oferecida pela DevSuperior.
