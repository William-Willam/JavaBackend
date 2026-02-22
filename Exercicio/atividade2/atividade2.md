# Atividade — Hierarquia de Usuários do Sistema

## 📌 Descrição

Este projeto tem como objetivo a criação de uma **hierarquia de classes em Java** para representar os diferentes **tipos de usuários de um sistema**, aplicando corretamente os conceitos de **Programação Orientada a Objetos (POO)**.

Os tipos de usuários definidos são:

- **Gerente**
- **Vendedor**
- **Atendente**

Cada tipo de usuário possui atributos e comportamentos específicos, além de funcionalidades comuns como login, logoff e alteração de dados.

---

## 🧩 Estrutura de Classes

### Classe Base (Usuário)

Todas as classes de usuário compartilham os seguintes atributos básicos:

- **Nome**
- **Email**
- **Senha**
- **Administrador** (boolean)

Essa classe deve ser utilizada como **classe base (superclasse)** para reaproveitamento de código.

---

## 👔 Classe Gerente

### Atributos
- Nome
- Email
- Senha
- Administrador → **sempre verdadeiro**

### Métodos
- Gerar relatório financeiro
- Consultar vendas
- Realizar login
- Realizar logoff
- Alterar dados
- Alterar senha

---

## 🛒 Classe Vendedor

### Atributos
- Nome
- Email
- Senha
- Quantidade de vendas
- Administrador → **sempre falso**

### Métodos
- Realizar venda  
  - Incrementa a quantidade de vendas
- Consultar vendas
- Realizar login
- Realizar logoff
- Alterar dados
- Alterar senha

---

## 🧾 Classe Atendente

### Atributos
- Nome
- Email
- Senha
- Valor em caixa
- Administrador → **sempre falso**

### Métodos
- Receber pagamentos  
  - Recebe um valor e incrementa o valor em caixa
- Fechar o caixa
- Realizar login
- Realizar logoff
- Alterar dados
- Alterar senha

---

## ⚙️ Regras de Negócio

- Apenas a classe **Gerente** pode ser administradora.
- O atributo **administrador** deve ser controlado internamente, não podendo ser alterado externamente.
- Métodos como login, logoff, alteração de dados e senha devem estar disponíveis para todos os usuários.
- Cada classe deve implementar apenas os comportamentos que fazem sentido para seu papel no sistema.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança
- Encapsulamento
- Polimorfismo
- Sobrescrita de métodos
- Regras de negócio aplicadas por tipo de usuário

---

## 🎯 Objetivo

Demonstrar a correta modelagem de usuários em um sistema, aplicando boas práticas de POO em Java, com foco em organização, reutilização de código e clareza na definição de responsabilidades.

---