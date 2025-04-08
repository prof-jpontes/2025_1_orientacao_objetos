# ☕♨ Roteiro de aula: a linguagem de programação Java  

# 📅 Terça-feira, 8/4/2025 

---

## ⚙️ Configuração do ambiente de desenvolvimento

> *Faça o download do Java Development Kit (JDK)* — 🔗 [Download do JDK](https://www.oracle.com/java/technologies/downloads);

> *Descompacte o arquivo que contenha o diretório do JDK em um local de sua preferência (recomenda-se em C:\Program Files\Java*

> *Configure as variáveis de ambiente*

```plaintext
1. Clique com o botão direito em "Este Computador" e vá em "Propriedades".
2. Clique em "Configurações Avançadas do Sistema".
3. Clique em "Variáveis de Ambiente".
4. Em "Variáveis do Sistema", clique em "Novo".
5. Nome: JAVA_HOME | Valor: C:\Program Files\Java\jdk-XX
6. Clique em OK.
7. Em "Variáveis de Ambiente", abra a variável Path e acrescente o caminho "%JAVA_HOME\bin%".
8. Clique em OK.
```

> *Faça o download da IDE Eclipse* — 🔗 [Download do Eclipe](https://eclipseide.org);

> *Descompacte o Eclipse em um local de sua preferência*

> *Abra a ferramenta e configure a workspace*

#### Você tem um ambiente de desenvolvimento Java configurado 


---

## 👩🏻‍💻 Primeiro programa em Java

> *Crie um arquivo com a extensão .java com o nome HelloWord e coloque este conteúdo:*
```java
class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Minha primeira aplicação Java!");
    }
}
```

> *Experiemente mudar o conteúdo da mensagem. Também, troque println por print e por printf.* 

---

# Estrutura Sequencial

## ☕ 1. Intorudução à sintaxe Java

### 🎯 Objetivo: 
  Apresentar a estrutura básica de um programa Java e os conceitos fundamentais.

### Estrutura Básica
- Declaração de classes e métodos.
- Método `main` como ponto de entrada.
- I/O em Java.

### Variáveis e Tipos de Dados
- Declaração e inicialização de variáveis.
- Tipos primitivos: `int`, `double`, `char`, `boolean`.
- Tabela de tipos, tamanho do dado (em bits) e intervalo numérico.

| Tipo     | Tamanho (bits) | Valor Mínimo                  | Valor Máximo                   |
|----------|----------------|-------------------------------|--------------------------------|
| `byte`   | 8              | -128                          | 127                            |
| `short`  | 16             | -32.768                       | 32.767                         |
| `int`    | 32             | -2.147.483.648                | 2.147.483.647                  |
| `long`   | 64             | -9.223.372.036.854.775.808    | 9.223.372.036.854.775.807      |
| `float`  | 32             | ~1.4 x 10⁻⁴⁵                  | ~3.4 x 10³⁸                    |
| `double` | 64             | ~4.9 x 10⁻³²⁴                 | ~1.8 x 10³⁰⁸                   |
| `char`   | 16             | 0 (caractere Unicode)         | 65.535                         |
| `boolean`| 1 (não especificado) | `false`                   | `true`                         |



### Exemplo Prático
- Escrever um programa simples que declare variáveis de diferentes tipos.

### Exercícios
- Criar um programa que calcula e mostre o resultado das quatro operações básicas entre duas variáveis declaradas e inicializadas.



## Entrada e saída em Java

### 🎯 Objetivo:
Ensinar como interagir com o usuário, receber dados e exibir informações.

---

### Scanner Class  
- Importar e utilizar a classe `Scanner` para obter entrada do usuário.

### `System.out.println` e `System.out.print`  
- Mostrar como exibir informações no console.

---

### Exemplos Práticos  
- Criar um programa que solicita dois números ao usuário, realiza a soma e exibe o resultado.

---

### Exercícios  
- Escrever um programa que calcule e mostre o nome de uma pessoa e sua idade em 31 de dezembro de um determinado ano.  
  Para isso, leia o nome da pessoa, seu ano de nascimento e o ano para o qual deseje calcular a idade.

- Desenvolver um programa que pede a base e altura de um triângulo e calcula a área.

- Problema **Divisão do Tesouro (OBI)**:  
  [https://olimpiada.ic.unicamp.br/pratique/pj/2020/f1/tesouro/](https://olimpiada.ic.unicamp.br/pratique/pj/2020/f1/tesouro/).

---

## Operadores Aritméticos

### Objetivo  
Apresentar os operadores aritméticos básicos da linguagem Java e como utilizá-los em expressões matemáticas.

---

### Operadores Disponíveis

| Operador | Descrição        | Exemplo (Java)       | Resultado |
|----------|------------------|----------------------|-----------|
| `+`      | Adição            | `5 + 3`              | `8`       |
| `-`      | Subtração         | `5 - 3`              | `2`       |
| `*`      | Multiplicação     | `5 * 3`              | `15`      |
| `/`      | Divisão           | `6 / 3`              | `2`       |
| `%`      | Módulo (resto)    | `5 % 2`              | `1`       |

> ⚠️ A divisão entre inteiros retorna apenas a parte inteira do resultado.

---

### Exemplos Práticos

```java
int a = 10;
int b = 3;

System.out.println("Soma: " + (a + b));
System.out.println("Subtração: " + (a - b));
System.out.println("Multiplicação: " + (a * b));
System.out.println("Divisão: " + (a / b));
System.out.println("Resto da divisão: " + (a % b));
```

### Exercícios 

- Crie um programa que recebe dois números inteiros e mostra o resultado das 4 operações básicas entre eles: soma, subtração, multiplicação e divisão.

- Escreva um programa que solicita um número inteiro e mostra:

  - O dobro desse número.

  - A metade (utilizando divisão inteira).

  - O quadrado do número.

- Modifique o programa para que ele aceite números double e observe as diferenças nos resultados das divisões.

## Casting de Dados

--

## O que é Casting?
Casting ou conversão de tipo é o processo de transformar um tipo de dado em outro. Em Java, essa conversão pode ser:

> *Implícita (automática):* Quando não há perda de dados.

> *Explícita (manual):* Quando há possibilidade de perda de dados ou quando se converte de um tipo maior para um tipo menor.

#### Exemplos de Conversão Implícita
```java
int numeroInteiro = 10;
double numeroDecimal = numeroInteiro; // Conversão implícita de int para double
System.out.println(numeroDecimal); // Saída: 10.0
```
#### Conversão Explícita (Casting Manual)
```java
double valorDecimal = 9.7;
int valorInteiro = (int) valorDecimal; // Casting explícito
System.out.println(valorInteiro); // Saída: 9 (parte decimal é descartada)
```

> ⚠️ *Atenção:* Ao converter de double para int, a parte fracionária é perdida!


## 📝 Exercícios de Fixação

> Exercícios sobre estrutura sequencial: entrada, processamento e saída.

---

### Exercício 01

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

**Exemplos:**

Entrada:
```
10  
30
```

Saída:
```
SOMA = 40
```

---

### Exercício 02

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com **quatro casas decimais** conforme exemplos.

**Fórmula da área:**  
`area = π * raio²`  
**Considere:** `π = 3.14159`

**Exemplo:**

Entrada:
```
2.00
```

Saída:
```
A=12.5664
```

---

### Exercício 03

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:  
`DIFERENCA = (A * B - C * D)`

**Exemplo:**

Entrada:
```
5  
6  
7  
8
```

Saída:
```
DIFERENCA = -26
```

---

### Exercício 04

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com **duas casas decimais**.

**Exemplo:**

Entrada:
```
25  
100  
5.50
```

Saída:
```
NUMBER = 25  
SALARY = U$ 550.00
```

---

### Exercício 05

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

**Exemplo:**

Entrada:
```
12 1 5.30  
16 2 5.10
```

Saída:
```
VALOR A PAGAR: R$ 15.50
```

---

### Exercício 06

Fazer um programa que leia três valores com ponto flutuante de dupla precisão: `A`, `B` e `C`. Em seguida, calcule e mostre:

- a) a área do triângulo retângulo que tem A por base e C por altura.
- b) a área do círculo de raio C. (π = 3.14159)
- c) a área do trapézio que tem A e B por bases e C por altura.
- d) a área do quadrado que tem lado B.
- e) a área do retângulo que tem lados A e B.

**Exemplo:**

Entrada:
```
3.0 4.0 5.2
```

Saída:
```
TRIANGULO: 7.800  
CIRCULO: 84.949  
TRAPEZIO: 18.200  
QUADRADO: 16.000  
RETANGULO: 12.000
```
