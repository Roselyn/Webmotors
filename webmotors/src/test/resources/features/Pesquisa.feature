# language:pt

Funcionalidade: Campos de Busca
  Para pesquisar um carro
  Sendo um cliente
  Quero fazer buscas por marca, modelo e versão

Esquema do Cenário: Busca Sucesso

Dado que esteja na tela inicial da Webmotors
Quando eu inserir as informações <marca> e <modelo>
E clicar na opção exibida no drop down menu
E o resultado da busca for exibido
E selecionar a opção Concessionária
E selecionar a opção Loja
Então a listagem de estoque de uma determinada loja será exibida

Exemplos:

|marca   |modelo|
|"Honda "|"City"|
