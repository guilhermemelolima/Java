# Algoritmos-Java

### Objetivo

Neste repositório estão alguns algoritmos simples em java que foram realizados como uma forma de praticar a linguagem e exercitar a lógica de programação.

## Exercícios

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

```
   y
Q2 | Q1
---+----x 
Q3 | Q4
```

Exemplo: [PlanoCartesiano.java](PlanoCartesiano.java)

---

Fazer um programa para ler um número inteiro e dizer se este número é par ou impar

Exemplo: [ParImpar.java](ParImpar.java)

---

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Múltiplos" ou "Nao sao Múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

Exemplo: [Multiplos.java](Multiplos.java)

---

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Exemplo: [Media3Notas.java](Media3Notas.java)

---
Fazer um programa para ler dois números inteiros M e K, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.


Exemplo: [Matriz.java](Matriz.java)

---

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar

|CÓDIGO|ESPECIFICAÇÃO|PREÇO|
|:---|:---:|:---:|
|01|CACHORRO QUENTE|R$ 4,00|
|02|X-SALADA       |R$ 4,50|
|03|X-BACON        |R$ 5,00|
|04|TORRADA SIMPLES|R$ 2,00|
|05|REFRIGERANTE   |R$ 1,50|

Exemplo: [Lanchonete.java](Lanchonete.java)

---

Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Exemplo: [LoopSenha.java](LoopSenha.java)

---

Um Posto de combustíveis deseja determinar qual de seus  produtos tem a preferência de seus clientes. Escreva um  algoritmo para ler o tipo de combustível abastecido (codificado  da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o  usuário informe um código inválido (fora da faixa de 1 a 4)  deve ser solicitado um novo código (até que seja válido).  O programa será encerrado quando o código informado for o  número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e  a quantidade de clientes que abasteceram cada tipo de combustível.

Exemplo: [PostoCombustivel.java](PostoCombustivel.java)

---

Leia um valor inteiro X (1 <= X <= 1000), em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Exemplo: [IntervaloImpar.java](IntervaloImpar.java)

---

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

Exemplo: [Intervalo.java](Intervalo.java)

---
 Em um país imaginário denominado Lisandro, todos os habitantes ficam felizes em pagar seus 
 impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados 
 são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Romulus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisandro. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.  
 
 |Renda | imposto de renda |
 |:--- | :---: | 
 |de R$ 0,00 até R$ 2000,00   |Isento|
 |de R$ 2000,01 até R$ 3000,00|08%   |
 |de R$ 3000,01 até R$ 4500,00|18%   |
 |acima de R$ 4500,00         |28%   |
         
 
 Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,  pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.  No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que  resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.  

Exemplo: [ImpostoDeRenda.java](ImpostoDeRenda.java)

---

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode  começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Exemplo: [HoraJogo.java](HoraJogo.java)

---

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.Lembrando que, por definição, fatorial de 0 é 1. 

Exemplo: [Fatorial.java](Fatorial.java)

---

Ler um número inteiro N e calcular todos os seus divisores. 

Exemplo: [Divisores.java](Divisores.java)

---

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.

Exemplo: [QuadradoCubo.java](QuadradoCubo.java)

---
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossível".

Exemplo: [Divisao.java](Divisao.java)

---

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D).

Exemplo: [DiferencaProd.java](DiferencaProd.java)

---

Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). 

Exemplo: [Cordenadas.java](Cordenadas.java)

---

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 

Exemplo: [SalarioFunc.java](SalarioFunc.java)

---

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com um mensagem explicativa, conforme exemplos.

Exemplo: [SomaDoisValores.java](SomaDoisValores.java)

---

Leia um valor inteiro N. Este valor será a 
quantidade de valores inteiros X que serão 
lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

Exemplo: [ValorIntervalo.java](ValoresIntervalo.java)

---

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Exemplo: [ValorPeca.java](ValorPeca.java)

---
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

---
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. 
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

---
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
