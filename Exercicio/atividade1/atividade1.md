# Atividade 1 — Sistema de Ingressos de Cinema 🎬

## Descrição do Problema

Crie uma **hierarquia de classes em Java** para representar os tipos de ingressos que podem ser comercializados em um cinema.

Todo ingresso deve possuir as seguintes informações básicas:

- **Valor do ingresso**
- **Nome do filme**
- **Tipo de áudio**, indicando se o filme é **dublado** ou **legendado**

A partir da classe base `Ingresso`, devem ser criados dois tipos específicos:

- **Meia Entrada**
- **Ingresso Família**

---

## Regras de Negócio

Cada tipo de ingresso deve implementar um método que calcule e retorne o **valor real do ingresso**, com base nas seguintes regras:

### 🎟️ Ingresso Comum
- O valor real corresponde ao valor informado no momento da criação do ingresso.

### 🎫 Meia Entrada
- O valor real deve ser **50% do valor do ingresso**.

### 👨‍👩‍👧‍👦 Ingresso Família
- O valor real deve ser o **valor do ingresso multiplicado pelo número de pessoas**.
- Caso o número de pessoas seja **maior que 3**, deve ser aplicado um **desconto de 5%** sobre o valor total.

---

## Requisitos Técnicos

- Utilizar **Programação Orientada a Objetos (POO)**.
- Aplicar corretamente os conceitos de:
  - Herança
  - Classe abstrata
  - Polimorfismo
- Cada tipo de ingresso deve possuir sua própria implementação do método de cálculo do valor real.

---

## Objetivo

Demonstrar a correta modelagem de classes e a aplicação de regras de negócio utilizando **Java**, seguindo boas práticas de organização e legibilidade de código.