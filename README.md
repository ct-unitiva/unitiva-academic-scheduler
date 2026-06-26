# UNITIVA Academic Scheduler

> Plataforma institucional para gestão do processo de agendamento de defesas académicas da Universidade Técnica de Vanguarda — UNITIVA.

---

## Visão Geral

O **UNITIVA Academic Scheduler** é um sistema desenvolvido para digitalizar, organizar e automatizar o processo de agendamento de defesas académicas.

A plataforma tem como objetivo substituir processos manuais baseados em papel por uma solução moderna, segura e centralizada, permitindo melhor gestão de salas, júris, estudantes, docentes e recursos académicos.

---

## Objetivos

* Digitalizar o agendamento de defesas académicas.
* Reduzir o uso de documentos físicos.
* Evitar conflitos de horários.
* Melhorar a gestão de salas e recursos.
* Organizar a composição de júris.
* Centralizar informações académicas.
* Apoiar a transformação digital da UNITIVA.

---

## Estado do Projeto

**Em desenvolvimento**

### Funcionalidades já implementadas

* Estrutura inicial do repositório.
* Backend com Spring Boot.
* Integração com PostgreSQL.
* Spring Security configurado.
* Autenticação inicial.
* Gestão base de utilizadores.
* Gestão base de papéis.
* Seed automático de papéis.
* Criação automática do administrador inicial.
* Login funcional.

---

## Estrutura do Projeto

```text
unitiva-academic-scheduler/
│
├── backend/
├── frontend/
├── docs/
├── database/
├── infrastructure/
├── scripts/
├── docker-compose.yml
├── README.md
├── LICENSE
├── CONTRIBUTING.md
└── CHANGELOG.md
```

---

## Stack Tecnológica

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* Maven

### Base de Dados

* PostgreSQL

### Frontend

* React
* TypeScript

### Infraestrutura

* Docker
* Docker Compose
* GitHub

---

## Documentação

Toda a documentação técnica está organizada na pasta `docs/`.

### Arquitetura

* `docs/architecture/overview.md`
* `docs/architecture/backend-architecture.md`
* `docs/architecture/frontend-architecture.md`
* `docs/architecture/database-architecture.md`
* `docs/architecture/security-architecture.md`

### API

* `docs/api/auth-api.md`
* `docs/api/user-api.md`
* `docs/api/course-api.md`
* `docs/api/room-api.md`
* `docs/api/defense-api.md`

### Desenvolvimento

* `docs/development/setup-guide.md`
* `docs/development/coding-standards.md`
* `docs/development/branching-strategy.md`
* `docs/development/commit-convention.md`

### Deployment

* `docs/deployment/local.md`
* `docs/deployment/staging.md`
* `docs/deployment/production.md`

### Decisões Técnicas

* `docs/decisions/0001-backend-stack.md`
* `docs/decisions/0002-security.md`
* `docs/decisions/0003-project-structure.md`

### Roadmap

* `docs/roadmap/sprint-01.md`
* `docs/roadmap/sprint-02.md`
* `docs/roadmap/sprint-03.md`
* `docs/roadmap/backlog.md`

---

## Executar o Backend

```bash
cd backend
./mvnw spring-boot:run
```

No Windows PowerShell:

```powershell
cd backend
.\mvnw spring-boot:run
```

Servidor padrão:

```text
http://localhost:8081
```

---

## Credenciais de Desenvolvimento

```text
Email: admin@unitiva.ac.mz
Senha: Admin@12345
```

Estas credenciais são apenas para ambiente de desenvolvimento e devem ser alteradas antes de qualquer ambiente real.

---

## Endpoint de Login

```http
POST /api/v1/auth/login
```

Exemplo:

```json
{
  "email": "admin@unitiva.ac.mz",
  "password": "Admin@12345"
}
```

Resposta esperada:

```json
{
  "message": "Authentication successful",
  "email": "admin@unitiva.ac.mz"
}
```

---

## Roadmap Inicial

### Sprint 1 — Fundação

* Autenticação
* JWT
* Refresh Token
* Gestão de utilizadores
* Gestão de papéis

### Sprint 2 — Estrutura Académica

* Cursos
* Departamentos
* Salas
* Docentes
* Estudantes

### Sprint 3 — Agendamento

* Pedidos de defesa
* Júris
* Calendário académico
* Verificação de conflitos

### Sprint 4 — Administração

* Relatórios
* Notificações
* Dashboard
* Auditoria

---

## Contribuição

Consulte o ficheiro:

```text
CONTRIBUTING.md
```

---

## Licença

Consulte o ficheiro:

```text
LICENSE
```

---

## Nota Institucional

Este projeto está a ser desenvolvido para apoiar a modernização dos processos académicos da UNITIVA, com foco em eficiência, transparência e transformação digital.
