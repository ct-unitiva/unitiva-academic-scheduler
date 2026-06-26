# Visão Geral da Arquitetura

## 1. Objetivo do Sistema

O UNITIVA Academic Scheduler é uma plataforma institucional desenvolvida para digitalizar e organizar o processo de agendamento de defesas académicas da UNITIVA.

O sistema pretende substituir processos manuais por uma solução centralizada, segura e escalável, permitindo melhor controlo sobre utilizadores, cursos, salas, júris, agendamentos e recursos académicos.

---

## 2. Visão Arquitetural

A arquitetura do sistema segue uma abordagem modular, separando responsabilidades por domínio funcional.

A aplicação está organizada em camadas:

- Interface de utilizador
- API backend
- Camada de serviços
- Camada de persistência
- Base de dados

Fluxo geral:

```text
Frontend
   ↓
REST API
   ↓
Service Layer
   ↓
Repository Layer
   ↓
PostgreSQL
3. Estrutura Geral do Projeto
unitiva-academic-scheduler/
│
├── backend/
├── frontend/
├── docs/
├── database/
├── infrastructure/
├── scripts/
└── docker-compose.yml
4. Backend

O backend é desenvolvido com Spring Boot e é responsável por:

Autenticação
Autorização
Gestão de utilizadores
Gestão de papéis
Gestão de cursos
Gestão de salas
Gestão de defesas
Gestão de júris
Relatórios
Auditoria

A estrutura segue organização por módulos.

Exemplo:

user/
├── controller/
├── dto/
├── entity/
├── repository/
└── service/
5. Base de Dados

A base de dados utilizada é PostgreSQL.

As primeiras entidades implementadas são:

users
roles
user_roles

Estas entidades formam a base de autenticação e autorização do sistema.

6. Segurança

A segurança é baseada em Spring Security.

Componentes iniciais:

UserDetails
AuthenticationManager
AuthenticationProvider
PasswordEncoder
Role-based access control

O próximo passo da arquitetura de segurança será a implementação de JWT.

7. Módulos Planeados
Autenticação

Responsável por login, tokens e gestão de sessão.

Utilizadores

Responsável pela gestão de contas do sistema.

Papéis

Responsável por permissões e perfis de acesso.

Cursos

Responsável pela estrutura académica da universidade.

Salas

Responsável pela gestão de salas, laboratórios e recursos.

Defesas

Responsável pelos pedidos e agendamentos de defesas.

Júri

Responsável pela composição e validação dos membros do júri.

Relatórios

Responsável por estatísticas e exportação de dados.

Auditoria

Responsável pelo registo de ações importantes no sistema.

8. Princípios Arquiteturais

O sistema segue os seguintes princípios:

Separação de responsabilidades
Código modular
Segurança desde a base
Persistência centralizada
Escalabilidade
Manutenibilidade
Documentação contínua
Evolução incremental
9. Estado Atual

Atualmente o sistema possui:

Backend Spring Boot configurado
PostgreSQL integrado
Spring Security configurado
User e Role implementados
Login funcional
Estrutura modular inicial
Documentação base criada
10. Evolução Planeada

As próximas fases incluem:

JWT Authentication
Refresh Token
Gestão de utilizadores
Gestão de cursos
Gestão de salas
Gestão de defesas
Calendário académico
Relatórios
Dashboard administrativo