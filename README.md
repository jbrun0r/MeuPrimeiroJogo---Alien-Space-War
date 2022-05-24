# Alien Space War - _Java_

![DEMO](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/demo-video/alien.gif?raw=true)

Game for Windows desenvolvido 100% em **_Java_** com widget toolkit GUI: **_Swing_**. Consiste em coordenar a Nave Espacial destruindo com Mísseis os Aliens que surgirem e não deixa-los tocarem na Nave.

## Resumo:
Após densenvolver um GUI para minha aplicação de uso de Threads: ["Trem de Carga"](https://github.com/jbrun0r/Aplica-oJavaThreadsTrain-Projeto#readme "Visualizar Projeto"), percebi que poderia incoporar a lógica de deslocamento no eixo *X* e *Y* para a movimentação de personagens em qualquer jogo. Então decidi desenvolver este jogo incoporando a lógica necessária para as interações.



>#### Alma:

* Alma do Projeto/Jogo
* Código: [Alma.java](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/starsGAME/Alma.java "Visualizar Alma.java")

>#### Mente:

* Responsável por reter a lógica de **Interações**, **Movimentações de Icons**, **Entradas** de Movimentos(teclado) e **Processamento da Entrada**.
* Código: [Mente.java](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/starsGAME/Mente.java "Visualizar Mente.java")

>#### Musculo:

* Inicia **Aliens**, **Estrelas**, **Movimentos**, **Checa Colisões** entre _retãngulos_.
* Código: [Musculo.java](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/starsGAME/Musculo.java "Visualizar Musculo.java")

>#### Alien:
<img src="https://i.imgur.com/xz0DoF8.png" width="50px"/>

* Cada **Alien** é gerada em posições aleatórias no Eixo **X** e **Y** e é envolvido por um _retãngulo_ que que ao tocar em outro _retãngulo_ seja da **Nave** ou **Míssel** irá chamar uma ação.
* Código: [Inimigo.java](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/starsGAME/Inimigo.java "Visualizar Inimigo.java")

>#### Estrelas:
<img src="https://i.imgur.com/1iItnBs.png" width="50px"/>

* Cada **Estrela** é gerado em posições aleatórias no Eixo **X** e **Y** e é atribuído sua velocidade de deslocamento no Eixo **X** e **Y**.
* Código: [Stars.java](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/starsGAME/Stars.java "Visualizar Stars.java")

>#### Tiro:
<img src="https://i.imgur.com/xtqCqTW.png" width="50px"/>

* Cada **Míssel** é gerado após clicar na barra Espaço do teclado Pecorrendo o Eixo **X** e **Y** através de sua _Velocidade_ e é envolvido por um _retãngulo_ que que ao tocar no  _retãngulo_ que envolve o **Alien** irá chamar uma ação de destruí-lo.
* Código: [Tiro.java](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/starsGAME/Tiro.java "Visualizar Tiro.java")

>#### Nave:
<img src="https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/imagens/Nave.png?raw=true" width="100px"/>

* A **Nave** é envolvida por um _retãngulo_ que que ao tocar no  _retãngulo_ que envolve o **Alien** irá chamar uma ação de Game-Over.
* Imagem: [Nave.png](https://github.com/jbrun0r/MeuPrimeiroJogo---Alien-Space-War/blob/main/GameStars/src/imagens/Nave.png?raw=true "Visualizar Nave")




## Screenshot:

![fundo](https://i.imgur.com/gIwUQ7I.png)
As imagens e design foram inspirados em um contexto de "Alien Space War".
___

#### Requisitos mínimos:
Necessário instalar [Eclipse IDE](https://www.eclipse.org/downloads/) para desenvolvimento Java.
* **JRE:** 15.0.2
* **SO:** Windows 10/11 (64-bit Required)
* **Processador:** Dual Core
* **Memória:** 4GB de RAM
---
#### Download:

[.JAR](https://github.com/jbrun0r/Aplica-oJavaThreadsTrain-Projeto/blob/JAR/TrainThread.jar)\
[.zip](https://github.com/jbrun0r/Aplica-oJavaThreadsTrain-Projeto/blob/JAR/TrainThread.zip)

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge.svg)


