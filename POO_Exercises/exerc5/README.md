# Conta Bancária Simples em Java

## Descrição
Este é um programa simples em Java que simula uma conta bancária. Ele permite ao usuário criar uma conta informando o número da conta, o titular da conta e um depósito inicial, se desejado. Em seguida, o usuário pode realizar depósitos e saques na conta, e o saldo é atualizado automaticamente.

## Aprendizados
- Utilização de classes em Java para representar entidades (no caso, a classe `Client5` para representar a conta bancária).
- Uso de métodos para manipular os atributos da classe (`deposit` e `withdraw`).
- Utilização de objetos e instância de classes.
- Interagir com o usuário por meio de entrada de dados via console.
- Manipulação básica de strings em Java.

## Funcionalidades
- Criação de conta bancária com número, titular e depósito inicial.
- Possibilidade de depositar fundos na conta.
- Possibilidade de sacar fundos da conta.
- Atualização automática do saldo após depósito ou saque.

## Estrutura do Programa
O programa consiste em duas classes:
1. **`Exerc5` (Classe Principal):** Responsável por interagir com o usuário, solicitar dados de entrada e exibir informações da conta.
2. **`Client5` (Classe da Conta Bancária):** Define a estrutura de uma conta bancária, incluindo atributos (número, titular, saldo) e métodos para depositar, sacar e exibir informações da conta.

## Utilização
1. Execute o programa.
2. O programa solicitará que você insira o número da conta, o titular da conta e se deseja realizar um depósito inicial.
3. Depois de inserir os dados solicitados, o programa exibirá as informações da conta.
4. Você terá a opção de realizar um depósito ou saque, conforme solicitado pelo programa.
5. O saldo da conta será atualizado e as informações da conta serão exibidas novamente.

## Observações
- Certifique-se de fornecer entradas válidas quando solicitado.
- Os valores de depósito e saque são tratados como valores positivos. O programa já considera a dedução de uma taxa fixa de saque de $5.00.
- O saldo da conta não pode ser negativo. Se um saque for maior que o saldo disponível mais a taxa de saque, o saque não será permitido.

Este programa é uma implementação básica de uma conta bancária e pode ser expandido com mais funcionalidades, como transferências entre contas, histórico de transações, entre outros recursos bancários.
