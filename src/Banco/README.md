# Sistema de Banco em Java

## Descrição

Este projeto implementa um sistema básico de gerenciamento de contas bancárias em Java. Ele permite criar contas, realizar depósitos, saques e transferências entre contas. O sistema também inclui a funcionalidade de impressão de extratos para as contas.

## Estrutura do Projeto

O projeto é composto por várias classes que representam os diferentes componentes do sistema bancário:

- **Conta**: Classe abstrata que representa uma conta bancária genérica. Contém métodos comuns a todas as contas, como `sacar`, `depositar`, `transferir` e `imprimirExtrato`.
- **ContaCorrente**: Classe que herda de `Conta` e pode ter funcionalidades específicas para contas correntes.
- **Cliente**: Classe que representa um cliente do banco, contendo informações como nome e CPF.
- **IConta**: Interface que define os métodos que devem ser implementados por qualquer tipo de conta.
- **Banco**: Classe que pode gerenciar várias contas e clientes.

## Funcionalidades

- **Criação de Contas**: Permite a criação de novas contas com um cliente associado.
- **Depósitos**: Adiciona um valor especificado ao saldo da conta.
- **Saques**: Deduz um valor especificado do saldo da conta.
- **Transferências**: Transfere um valor especificado de uma conta de origem para uma conta de destino.
- **Impressão de Extratos**: Exibe o extrato da conta, mostrando informações como titular, CPF, agência, número e saldo.

## Requisitos

- **Java 8+**: O projeto é implementado em Java e requer a versão 8 ou superior.

## Instruções de Uso

### Compilação

Para compilar o projeto, navegue até o diretório do projeto e execute:

```sh
javac -d bin src/*.java