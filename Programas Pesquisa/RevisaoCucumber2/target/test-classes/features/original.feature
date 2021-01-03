#Author: vander.marchi@hotmail.com

Feature: Pesquisa no Google
Eucomo usuario quero pesquisar o nome do banco para validar as informações.

Scenario: Pesquisar site do banco
Given que eu acesse o google

When pesquisar"Banco original"

Then google mostra "Original"
