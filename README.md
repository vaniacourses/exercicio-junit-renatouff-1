# Exercício JUnit - Calculadora e Carrinho

Testes automatizados desenvolvidos com **JUnit 5** para as classes `Calculadora` e `Carrinho`, conforme proposto em Exercício - JUnit .

## ✅ O que foi feito:

- Foram adicionados testes na classe `CalculadoraTest.java`, incluindo:
  - Subtração de dois números — `subtracao`
  - Multiplicação de dois números — `multiplicacao`
  - Somatória de 0 até n — `somatoria`
  - Verificação se o número é positivo — `ehPositivo`
  - Comparação entre dois números — `compara`

- Foi criada a classe `CarrinhoTest.java` para testar a classe `Carrinho`, com casos cobrindo:
  - Adição de produtos ao carrinho — `addItem`
  - Verificação da quantidade de itens — `getQtdeItems`
  - Cálculo do valor total — `getValorTotal`
  - Esvaziar o carrinho — `esvazia`
  - Remoção de produtos com sucesso — `removeItem`
  - Lançamento da exceção `ProdutoNaoEncontradoException` quando o produto não está no carrinho
  