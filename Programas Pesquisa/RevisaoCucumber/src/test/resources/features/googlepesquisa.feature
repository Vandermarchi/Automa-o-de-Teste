# Autor: vander.marchi@hotmail.com
Feature: Pesquisa no Google
Eucomo usuario quero pesquisar o nome dos sites  para validar as informações.

Scenario: Pesquisar site da escola
Given que eu acesse o google

When pesquisar"E2E Treinamentos"

Then google mostra "E2E Treinamentos"

Scenario: Pesquisar site do Bradesco
Given que eu acesse o google

When pesquisar"Banco Bradesco"

Then google mostra "Bradesco"


Scenario: site do itau
Given que eu acesse o google

When pesquisar"Banco itau"

Then google mostra "Itau"

Scenario: Pesquisar site do banco
Given que eu acesse o google

When pesquisar"Banco inter"

Then google mostra " Inter"

Scenario: Pesquisar site do banco
Given que eu acesse o google

When pesquisar"Banco original"

Then google mostra "Original"

Scenario: Pesquisar site da loja
Given que eu acesse o google

When pesquisar"shoestock"

Then google mostra "Shoestock"