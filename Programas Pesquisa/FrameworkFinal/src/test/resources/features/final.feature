#Author: vander.marchi@hotmail.com

@tag
Feature: Pesquisar textos

Eu como aluno quero aprender automacao para automatizar testes
@tag1
Scenario: Persquisar E2E Treinamentos
Given que eu esteja no site "https://www.google.com.br"
When perquisar "E2E Treinamentos"
Then sistema axibe informacoes da escola

 @tag2
Scenario: Persquisar Bradesco
Given que eu esteja no site "https://www.google.com.br"
When perquisar "Bradesco"
Then sistema axibe informacoes do Bradesco

 @tag3
Scenario: Persquisar itau
Given que eu esteja no site "https://www.google.com.br"
When perquisar "Itau"
Then sistema axibe informacoes do itau
