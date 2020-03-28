# Impacta Aulas Input | Output Stream com ArrayList

## Requisitos

[Jdk 1.8 +](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

## Como baixar esse projeto

_Abra um terminal_

_Execute_

`git clone https://github.com/nataliarosa88/impacta-inputstream-list.git`

`cd impacta-inputstream-list`

## Como compilar esse projeto

`javac Entrada.java`

`javac Saida.java`

## Como executar o projeto

_Gravar os dados escritos no arquivo Entrada no arquivo banco-de-dados-texto.dat_

`java entrada`


_Mostrará a lista de dados gravados com Java 8_

`java saida`

## Como fazer um arquivo _Programa.Jar_ do projeto

```
touch Manifest.txt
nano Manifest.txt
Main-Class: Saida
jar cfm Programa.jar Manifest.txt *.class
java -jar Programa.jar
```

## Como fazer um arquivo _Programa.Bat_ do projeto

```
@ECHO OFF
ECHO Pressione enter para comecar.
javac Entrada.java
java Entrada
javac Saida.java
java Saida
ECHO Programa finalizado com sucesso!
PAUSE
```

#### Outros comandos úteis para subir código para o Git Hub

###### _fluxo normal_

`git add . && git commit -m "meu commit" && git push origin master`


###### _fluxo pós adicionar .gitignore com arquivos já no upstream_

`git rm -r --cached . && git add . && git commit --amend && git push origin master --force`

###### _fluxo para não criar um commit desnecessario_

`git add . && git commit --amend && git push origin master --force`

###### _fluxo quando receber erro_

git pull origin master --allow-unrelated-histories