
Feature: Title of your feature
  I want to use this template for my feature file

  Background: Abrir o Site
   Given que eu acesse o google

  
  Scenario Outline: Title of your scenario outline
    When pesquisar <texto>

    Then google mostra <informacoes>

    Examples: 
      | texto              | informacoes         |
      | "E2E Treinamentos" |   "E2E Treinamentos"| 
      | "Banco Bradesco"   |    "Bradesco"       |
      |  "Banco itau"      |   "Itau"            |         
      | "Brasil"           |  "brasil"           |