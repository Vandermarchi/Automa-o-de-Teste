#Author: vander.marchi@hotmail.com

Feature: Abertura de conta
Eu como usuario quero pesquisar o nome do banco para validar as informações.


Scenario: Pesquisar site do banco
Given que eu acesse o google

When pesquisar"Banco inter"

Then google mostra " Inter"

Scenario: Pesquisar site do banco
Given que eu acesse o banco Inter

When realizo o cadastro 
And digite "nome"
And digite "email"
And digite "phone"
And digite "cpf"
When google mostra ""test test"
And google mostra ""test@teste.com""
And  google mostra "(12)991331545"
And google mostra "294.017.260-94"



