#Author: vander.marchi@hotmail.com

Feature: Pesquisar Soc
Eu como usuario quero pesquisar o nome do site soc para validar as informações.

 Scenario: Pesquisar site da Soc
    Given que eu acesse o site Soc
  
    When entrar no campo Pesquisa
    Then validar as informacoes

Scenario: Acessar a ada Solucoes e Recursos
    Given escolher a opcao Fap

    When preencher as informacoes
    
    Then validar as informacoes de estimativa da fap.
 
    
