# Java Orientado a Objeto

### Objetivo

Neste repositório estão alguns algoritmos orientado a obejto que foram realizados como uma forma de praticar a linguagem Java e exercitar a orientação a objeto.

## Exercícios


A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto.

[Aplicação](Pensionato/src/application/Program.java) | [Entidade](Pensionato/src/entities/Aluguel.java)

---

Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.

[Aplicação](ListFuncionario/src/application/Program.java) | [Entidade](ListFuncionario/src/entities/Funcionario.java)

---

Fazer um programa para controle de estoque de produtos em Java, utilizando classes e métodos para manipulação dos dados. Crie uma classe Produto com atributos nome, preço e quantidade, implemente os médotos de adicionarProduto, RemoverProduto, ValorTotalEmEstoque. Cria a plasse Program que ira utilizar de todas os metodos dentro de Produto.

[Aplicação](produto/src/application/Program.java) |  [Entidade](produto/src/entities/Produto.java)

---

Fazer um programa para ler os valores da largura e altura de um retângulo, ele ainda deve mostrar na tela o valor de sua área, perímetro e diagonal. Seguir a mesma estrutura do exercício "triangulo".

[Aplicação](retangulo/src/application/Program.java) | [Entidade](retangulo/src/entities/Retangulo.java)

---

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário(nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.

[Aplicação](salario/src/application/Program.java) | [Entidade](salario/src/entities/Funcionario.java)

---

Fazer um programa para ler os valores da largura e altura de um retângulo, ele ainda deve mostrar na tela o valor de sua área, perímetro e diagonal. Seguir a mesma estrutura do exercício "triangulo".

[Aplicação](triangulo/src/application/Program.java) | [Entidade](triangulo/src/entities/Triangulo.java)