Feature: Automação com background
Como o aluno Quero aprender utilizar background Para ser mais produtivo


Background: Abrir o Site
Given que eu acesse o google

Scenario: Pesquisar o E2E Treinamentos
When pesquisar"E2E Treinamentos"

Then google mostra "E2E Treinamentos"

Scenario: Pesquisar site do Bradesco

When pesquisar"Banco Bradesco"

Then google mostra "Bradesco"


Scenario: site do itau

When pesquisar"Banco itau"

Then google mostra "Itau"