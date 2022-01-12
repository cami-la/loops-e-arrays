<h1>
ESTRUTURAS DE REPETIÇÃO E ARRAYS COM JAVA
</h1>

<p>Resolução dos exercícios propostos: <strong>ESTRUTURAS DE REPETIÇÃO E ARRAYS NA LINGUAGEM JAVA</strong>.
Curso este que tive a honra de co-criar com a plataforma de cursos online <strong> <a href="https://web.digitalinnovation.one/home"> DIGITAL INNOVATION ONE  </a></strong> 🧡💛 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

<h2>
🛑 Pré-requistos
</h2>

- [x] Java JDK 11
- [x] IDE para desenvolvimento Java 
- [x] Conhecer a sintaxe Java

<h2> 📚 Ementa</h2>

Ao assistir este curso, Dev será capaz de entender na prática como trabalhar com as estruturas de repetição (while/do-while/for) e arrays. Se tratando de arrays, também vamos conhecer a estrutura foreach.

👀 <a href="https://docs.google.com/presentation/d/1G3MDuxTjdEGcDBguVoanbP9-xipy8v46/edit?usp=sharing&ouid=114707527529839266022&rtpof=true&sd=true" target="_blank"> Visão geral: Estruturas de Repetição e Arrays</a> <br>

➿ <a href="https://github.com/cami-la/loops-e-arrays/tree/master/src/br/com/dio/exercicios/loops"> Exercícios Loops</a><br>

⛓ <a href="https://github.com/cami-la/loops-e-arrays/tree/master/src/br/com/dio/exercicios/arrays"> Exercícios Arrays</a><br>

<h2> ➿ ESTRUTURAS DE REPETIÇÃO </h2>

🔸 O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes (*loop*).<br>
🔸 **Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições são satisfeitas.**<br>
🔸 Essas condições são representadas por expressões lógica.<br>
🔸 As estruturas de repetição podem ser classificadas em:

- [x] Repetição com teste no início (*while*)<br>
- [x] Repetição com teste no final  (*do-while*)<br>
- [x] Repetição contada (*for*)

🔸O comando *break* é utilizado para terminar de forma abrupta uma repetição.<br>
🔸Quando comando *continue* é executado, os comandos restantes da repetição são ignorados e programa volta a testar novamente a condição.<br>

<h3> 📊 FLUXOGRAMAS </h3>	
<img src="https://i.ibb.co/gjXpxbt/Screenshot-from-2021-08-25-09-44-42.png" alt="Screenshot-from-2021-08-25-09-44-42" border="0">
<h3> ➕/➖ OPERADORES DE INCREMENTO E DECREMENTO </h3>
<img src="https://i.ibb.co/GTb9JNb/Screenshot-from-2021-08-23-10-56-10.png" alt="Screenshot-from-2021-08-23-10-56-10" border="0">

<h3> 🧮 OPERAÇÕES ARITMÉTICAS </h3>
<img src="https://i.ibb.co/YQmbSsV/Screenshot-from-2021-08-23-10-56-24.png" alt="Screenshot-from-2021-08-23-10-56-24" border="0">

<h4>EXTRA:</h4>

<strong>FLUXO DE EXECUÇÃO ARBRITÁRIO: <em>goto</em></strong>

🔸O comando <em>goto</em> tem por finalidade desviar a execução do programa para qualquer outro ponto do programa, desconsiderando qualquer estrutura de repetição ou estrutura condicional.<br>
🔸Ao contrário de C/C++, Java não tem instrução <em>goto</em>, mas java oferece suporte a <em>label</em>.<br>
<br>
🔗 https://www.geeksforgeeks.org/g-fact-64/<br>
🔗 https://www.tutorialspoint.com/How-to-use-labels-in-Java-code<br>

------------
<h3 align="center"> 💭 EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO</h3>

<h3 align="center"><em>📝 WHILE</em></h3>


<strong>🔸Nome e Idade:</strong> Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)<br>

<strong>🔸Nota: </strong> Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.


<h3 align="center"><em>📝 DO-WHILE</em></h3>

<strong>🔸Maior e Média: </strong> Faça um programa que leia 5 números e informe o maior número e a média desses números.<br>

<strong>🔸Par e Ímpar: </strong> Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.<br>

<h3 align="center"><em>📝 FOR</em></h3>

<strong>🔸Tabuada: </strong> Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:<br>
<br>
Tabuada de 5:<br>
5 X 1 = 5<br>
5 X 2 = 10<br>
...<br>
5 X 10 = 50<br>

<strong>🔸Fatorial: </strong> Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.<br>
Ex.: 5!=5.4.3.2.1=120<br>

🔗 <a href="https://wiki.python.org.br/EstruturaDeRepeticao"> Lista de Exercícios Estruturas de Repetição</a> - <a href="https://github.com/cami-la/listaDeExerciciosPythonBrasil/tree/master/estruturaDeRepeticao"> Possíveis Soluções</a> 

------------

<h2>⛓️ ARRAYS </h2>

🔹 Array é um objeto utilizado para armazenar sequencialmente dados do mesmo tipo.<br>
🔹 Permanecem com o mesmo tamanho depois de criados.<br>

<img src="https://i.ibb.co/GVQVC4k/Screenshot-from-2021-08-25-09-11-48.png" alt="Screenshot-from-2021-08-25-09-11-48" border="0">

------------
<h3 align="center"> 💭 EXERCÍCIOS ARRAYS</h3>

<h3 align="center"><em>📝 ARRAYS UNIDIMENSIONAIS</em></h3>

<strong>🔹Ordem Inversa: </strong> Faça um Programa que leia um vetor de 5 números inteiros
e mostre-os na ordem inversa.<br>
<br>
<strong>🔹Consoantes: </strong> Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.<br>
<br>
<strong>🔹Números Aleatórios: </strong> Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final, mostre os números e seus sucessores.<br>

🔗 <a href= "https://wiki.python.org.br/ExerciciosListas"> Lista de Exercícios Arrays Unidimensionais </a> - <a href="https://github.com/cami-la/listaDeExerciciosPythonBrasil/tree/master/exerciciosListas">Possíveis soluções</a><br>

<h3 align="center"><em>📝 ARRAYS MULTIDIMENSIONAIS</em></h3>

<strong>🔹Array Multidimensional: </strong> Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).<br>
<br>
🔗 <a href= "https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20?from_action=save"> Lista de Exercícios Arrays Multidimensionais </a><br>

------------

<h2>🔎 Referências Bibliográficas</h2>

🔗 https://www.ic.unicamp.br/~wainer/cursos/2s2011/Cap06-RepeticaoControle-texto.pdf<br>
🔗 http://www2.ic.uff.br/~vanessa/material/prog1/Aula6.pdf<br>
🔗 http://www.facom.ufu.br/~backes/gsi002/Aula05-ComandosRepeticao.pdf<br>
🔗 https://blog.grancursosonline.com.br/java-operadores-de-incremento-e-decremento/<br>
🔗 http://www.facom.ufu.br/~bacala/POO/04%20-%20Arrays%20em%20Java.pdf<br>
🔗 http://www.inf.ufsc.br/~frank.siqueira/INE5404/7.Arrays.pdf<br>
	
	
<h2> 🤝 Contribuindo </h2>

Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues


------------

Disponibilizado com ♥ por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").

