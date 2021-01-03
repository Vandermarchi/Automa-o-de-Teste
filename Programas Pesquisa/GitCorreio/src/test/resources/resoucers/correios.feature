#Author: vander.marchi@hotmail.com


Feature: Automacao simples Correios

 Eu como aluno quero acessar o google para pesquisar o cep nos correios
 
 Scenario: Acessar o Site do Correio e pesquisar cep
 
 Given que eu acesse o Correio
 
 When pesguisar o cep
 
 Then o endereco e apresentado
