# Autor : vander.marchi@hotmail.com

Feature: Aprendendo Automacao

Eu como aluno quero aprender automacao para automatizar testes

Scenario: Persquisar E2E Treinamentos
Given que eu esteja no site "https://www.google.com.br"
When perquisar "E2E Treinamentos"
Then sistema axibe informacoes da escola

Scenario: Persquisar Bradesco
Given que eu esteja no site "https://www.google.com.br"
When perquisar "Bradesco"
Then sistema axibe informacoes do Bradesco

Scenario: Persquisar itau
Given que eu esteja no site "https://www.google.com.br"
When perquisar "Itau"
Then sistema axibe informacoes do itau
