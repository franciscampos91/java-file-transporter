# FileTransporter

FileTransporter é um aplicativo Java que permite a transferência de arquivos entre um cliente e um servidor utilizando sockets. O projeto inclui uma interface gráfica construída com Swing para facilitar a seleção e o envio de arquivos.

## Descrição

Este trabalho acadêmico foi em 2013 apresentado como exigência para composição de nota de Atividades Práticas Supervisionadas do curso de Ciência da Computação, da Universidade Paulista.

## Objetivos

### Objetivo Geral
Desenvolver uma ferramenta para comunicação em rede utilizando as primitivas de Berkeley.

### Objetivo Específico
Pesquisar e desenvolver formas de estabelecer uma conexão entre dois dispositivos com o propósito de transferir arquivos, sendo um o servidor (irá receber o arquivo) e o outro o cliente (enviar o arquivo).


- Seleção de diretório e arquivo para envio
- Envio de arquivos para um servidor especificado
- Exibição de status da transferência

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- `Cliente`: Classe que representa o cliente que envia arquivos para o servidor.
- `ClienteModelo`: Classe abstrata que define a estrutura básica de um cliente.
- `SelecionaDiretorio`: Interface gráfica para seleção de diretórios e arquivos.
- `Form`: Interface gráfica principal para configuração do IP e porta do servidor, e envio de arquivos.

### Cliente

A classe `Cliente` herda de `ClienteModelo` e implementa a lógica de envio de arquivos.

### ClienteModelo

A classe `ClienteModelo` define os atributos e métodos básicos de um cliente, como IP do servidor e porta, e um método abstrato `enviaArquivo` que deve ser implementado pelas subclasses.

### SelecionaDiretorio

A classe `SelecionaDiretorio` fornece uma interface gráfica para seleção de diretórios e arquivos usando `JFileChooser`.

### Form

A classe `Form` é a interface gráfica principal do aplicativo, onde o usuário pode configurar o IP e a porta do servidor, e iniciar a transferência de arquivos.

## Exemplo de Uso

### Executando o Cliente

1. Compile o projeto:
   ```sh
   javac -d bin -sourcepath src src/Classes/*.java

## Autor 
- Francis Campos - 2013
