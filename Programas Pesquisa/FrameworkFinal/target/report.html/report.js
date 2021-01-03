$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("final.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: vander.marchi@hotmail.com"
    }
  ],
  "line": 4,
  "name": "Pesquisar textos",
  "description": "\nEu como aluno quero aprender automacao para automatizar testes",
  "id": "pesquisar-textos",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 20,
  "name": "Persquisar itau",
  "description": "",
  "id": "pesquisar-textos;persquisar-itau",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "que eu esteja no site \"https://www.google.com.br\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "perquisar \"Itau\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "sistema axibe informacoes do itau",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com.br",
      "offset": 23
    }
  ],
  "location": "TestFinal.que_eu_esteja_no_site(String)"
});
formatter.result({
  "duration": 16136426649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Itau",
      "offset": 11
    }
  ],
  "location": "TestFinal.perquisar(String)"
});
formatter.result({
  "duration": 14313937162,
  "status": "passed"
});
formatter.match({
  "location": "TestFinal.sistema_axibe_informacoes_do_itau()"
});
formatter.result({
  "duration": 968974474,
  "status": "passed"
});
});