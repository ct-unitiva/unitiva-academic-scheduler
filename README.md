# UNITIVA Academic Scheduler

Plataforma institucional para gestão de agendamentos académicos da Universidade Técnica de Vanguarda (UNITIVA).

O sistema tem como objetivo digitalizar e modernizar o processo de agendamento de defesas de culminação de curso, reduzindo o uso de papel, evitando conflitos de horários e melhorando a gestão de salas, júris e recursos académicos.

## Estado do Projeto

Em desenvolvimento.

## Funcionalidades Iniciais

- Autenticação de utilizadores
- Gestão de utilizadores e papéis
- Login com Spring Security
- Seed automático de papéis do sistema
- Criação automática do administrador inicial
- Integração com PostgreSQL
- Estrutura modular do backend

## Stack Tecnológica

### Backend

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

### Infraestrutura

- Docker Compose
- PostgreSQL
- GitHub

## Estrutura do Projeto

```text
unitiva-academic-scheduler/
├── backend/
├── frontend/
├── docs/
├── database/
├── infrastructure/
├── scripts/
└── docker-compose.yml
Backend

O backend está localizado em:

backend/

Para executar:

cd backend
.\mvnw spring-boot:run

Por padrão, a aplicação está configurada para correr em:

http://localhost:8081
Autenticação Inicial

O sistema cria automaticamente um administrador inicial para desenvolvimento:

Email: admin@unitiva.ac.mz
Senha: Admin@12345

Esta credencial deve ser alterada antes de qualquer ambiente real ou de produção.

Endpoint de Login
POST /api/v1/auth/login

Exemplo de corpo:

{
  "email": "admin@unitiva.ac.mz",
  "password": "Admin@12345"
}
Documentação

A documentação técnica está organizada em:

docs/
├── architecture/
├── api/
├── development/
├── deployment/
└── decisions/
Roadmap Inicial
Implementar JWT
Implementar gestão de utilizadores
Implementar gestão de cursos
Implementar gestão de salas
Implementar pedidos de defesa
Implementar calendário académico
Implementar gestão de júri
Implementar relatórios
Implementar notificações
Licença

Projeto desenvolvido para utilização institucional da UNITIVA.