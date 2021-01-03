#Author: vander.marchi@hotmail.com

Feature: Pesquisa no Google
Eucomo usuario quero pesquisar o nome da loja para validar as informações.

Scenario: Pesquisar site da loja
Given que eu acesse o google

When pesquisar"loja shoestock "

Then google mostra "Shoestock"
