# Aula7 - ADO - MVC 
Introduzir conceito de separação em camadas com uso de MVC adaptado

### Tarefa 1 - CRUD em MVC - Produto
1.1 Adicione um novo formulário (_JFrame_) chamado “ProdutoView”

1.2 De maneira similar à tela de cadastro de clientes, adicione os controles para cadastrar dados de um produto na tela “ProdutoView”
* ***ID*** - _JLabel_ - usado para alteração/exclusão - Obs: Ocultar no construtor (setVisible(false))
* ***Nome*** - _JTextField_  
* ***Descrição*** - _JTextField_
* ***Valor*** - _JTextField_
* Botões ***_Salvar_*** e ***_Cancelar_*** - _JButton_
* Botões ***_Novo_***, ***_Editar_*** e ***_Excluir_*** - _JButton_
  * Ao clicar em Novo, habilite os campos Nome, Descrição e Valor
  * Ao clicar em Salvar, adicione os itens na tabela e ao ArrayList e desabilite os campos Nome, Descrição e Valor
  * Ao clicar em Editar, certifique-se de uma linha da tabela esteja selecionada e copie os dados da linha para o formulário.
  * Ao clicar em Excluir, certifique-se de uma linha da tabela esteja selecionada e exclua a linha da tabela e do ArrayList
  * Ao clicar em Cancelar, limpe os dados do formulário e desabilite os campos de texto.
  
* Inclua uma ***tabela*** para exibir os itens adicionados - _JTable_

1.3 Adicione as seguintes propriedades à classe Produto <br />
* ***qtdProdutosCriados*** - _static_ _int_  
  * Incremente o qtdProdutosCriados toda vez que construir um objeto. Utilize o contrutor da classe para essa tarefa.
  * copia o valor da variável qtdProdutosCriados para a propriedade do objeto (não estática) idProduto
* ***idProduto***   - _int_
* ***nomeProduto*** - _String_  
* ***dscProduto***  - _String_  
* ***vlrUnitario*** - _double_
* Implemente os métodos acessores (_getters_ e _setters_) e os construtores da classe produto

1.4 Adicione a classe ProdutoController ao projeto. Adicione à classe ProdutoController os métodos necessários para salvar (incluir), atualizar, excluir e retornar uma lista de produtos (ArrayList<Produto>)

1.5 Adicione a classe ProdutoDAO ao projeto. Adicione à classe ProdutoDAO, os métodos necessários para salvar, atualizar, excluir e retornar uma lista de produtos da base de dados simulada (_SimulaDB_)

1.6 Implemente os métodos Salvar, 


