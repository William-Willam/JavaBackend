# 🚀 Desafio – Identificação de Serviço AWS

## 📌 Contexto

Você foi contratado como **consultor júnior** em uma empresa de TI que está migrando seus sistemas para a nuvem utilizando **Java** e **AWS**.

Seu primeiro desafio é ajudar a equipe de suporte a identificar rapidamente qual serviço da AWS deve ser utilizado para cada tipo de solicitação recebida.

O objetivo é automatizar o atendimento inicial, tornando o processo mais ágil e eficiente.

---

## 🎯 Objetivo

Criar um programa que:

- Leia uma **string** representando a solicitação do cliente.
- Analise o conteúdo da solicitação.
- Retorne o nome do serviço AWS mais adequado, conforme as regras definidas.

---

## ☁️ Regras de Mapeamento

| Tipo de Demanda                          | Serviço AWS |
|------------------------------------------|-------------|
| Servidores virtuais                     | EC2         |
| Armazenamento de arquivos               | S3          |
| Banco de dados relacional               | RDS         |
| Execução de código sob demanda          | Lambda      |
| Caso não se encaixe em nenhuma categoria| Servico desconhecido |

---

## 📥 Entrada

Uma única **string** representando a solicitação do cliente.

---

## 📤 Saída

Uma única **string** indicando o serviço AWS correspondente:

- `EC2`
- `S3`
- `RDS`
- `Lambda`
- `Servico desconhecido`

---

## 🧪 Exemplos

| Entrada                                           | Saída                 |
|---------------------------------------------------|------------------------|
| Preciso de um servidor para rodar aplicacoes     | EC2                   |
| Quero armazenar imagens e videos                  | S3                    |
| Necessito de um banco de dados relacional         | RDS                   |
| Preciso executar funcoes sem servidor             | Lambda                |
| Solicito um servico de inteligencia artificial    | Servico desconhecido  |

---

## ⚙️ Restrições

- Utilizar apenas estruturas básicas de controle (`if`, `else`, `switch`).
- Não utilizar bibliotecas externas.
- Implementar a solução em **Java**.