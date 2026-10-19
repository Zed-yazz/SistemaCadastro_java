# 💻 Sistema de Cadastro e Vendas - Prática de Lógica e POO em Java

Este projeto foi desenvolvido de forma 100% autônoma e autoral com o objetivo de **consolidar e validar meus conhecimentos práticos** na linguagem Java. Ele marca a minha transição da programação estruturada básica para o desenvolvimento de software profissional utilizando o paradigma de **Programação Orientada a Objetos (POO)**.

O sistema simula o fluxo comercial de uma loja de informática, permitindo o cadastro independente de clientes e configurações de computadores personalizados, calculando valores de upgrade e aplicando regras de negócio para descontos automatizados.

---

## 🛠️ Ferramentas de POO Utilizadas

Neste projeto, apliquei conceitos fundamentais de POO para dar vida e estrutura ao código:

*   **Classes e Objetos:** Criação dos moldes do mundo real (`Cliente` e `Computador`) e sua posterior instanciação em memória através da palavra-chave `new` dentro da classe principal `app`.
*   **Composição/Relacionamento entre Classes:** Implementação da conexão de objetos através da linha `produto.cliente = cliente;`. Isso permitiu que a classe de negócio do produto navegasse e acessasse propriedades específicas da classe de cadastro do usuário.
*   **Métodos com Retorno e Regras de Negócio:** Desenvolvimento de rotinas específicas para o comportamento do sistema, como o cálculo de preço dinâmico (`valorTotal()`) e verificação cadastral (`verificarEstudante()` e `verificarPlaca()`).
*   **Encapsulamento de Interação:** Os próprios métodos das classes de dados ficaram responsáveis por gerenciar a comunicação na tela com o usuário e coletar suas preferências, delegando funções e deixando a classe principal `app` responsável apenas pelo fluxo do menu.

---

## 🧠 Explicação da Lógica e Fluxo do Sistema

O software foi arquitetado para rodar no console de maneira interativa através de uma estrutura de repetição contínua baseada em três pilares principais:

### 1. Menu Interativo e Controle de Fluxo
Utilizando a combinação de um laço `do-while` com a estrutura condicional `switch-case`, o sistema cria um painel persistente que só é encerrado quando o usuário escolhe explicitamente a opção de saída. Cada bloco de operação é isolado por comandos `break;`, garantindo a integridade da navegação.

### 2. Cadastro Separado e Persistência em Memória
Diferente de sistemas básicos lineares, este projeto permite o cadastro de entidades de forma assíncrona. 
*   **No Menu 1:** O objeto `Cliente` é criado e preenchido. Suas preferências de estudante são validadas via comparação de strings ignorando letras maiúsculas ou minúsculas (`.equalsIgnoreCase("S")`).
*   **No Menu 2:** O objeto `Computador` é instanciado. O sistema pergunta as configurações de hardware, valida se a placa de vídeo é dedicada e colhe o preço base da máquina.
*   As caixas de memória persistem no topo do método `main`, impedindo a perda de dados durante a rotação do menu.

### 3. Integração de Objetos e Proteção contra Falhas (Menu 3)
Ao selecionar a consulta do pedido, o sistema executa duas etapas de lógica crítica:
*   **Garantia de Segurança:** Uma condicional `if (cliente == null || produto == null)` impede o sistema de tentar ler dados inexistentes, evitando o erro fatal `NullPointerException`.
*   **Atrelamento Lógico:** Caso as variáveis existam, o cliente é inserido na vaga interna do computador e o método `valorTotal()` calcula o preço baseado nos upgrades solicitados, lê se a propriedade lógica (`cliente.estudante`) está ativa e corta o valor final em 50% automaticamente, sem a necessidade de perguntar os mesmos dados novamente ao usuário.

---

## 🚀 O que este projeto representa na minha evolução?
Mais do que apenas um código que compila, a construção deste sistema validou minha capacidade de:
1.  **Resolver bugs de sintaxe e conciliação de buffers do teclado** (ajustes nas leituras de texto com `nextLine()` após a captura de números).
2.  **Modelar dados estruturados** fazendo classes conversarem entre si por meio de referências em memória.
3.  **Desenvolver lógica matemática aplicada**, convertendo regras comerciais em operadores lógicos eficientes.

O projeto cumpre com sucesso o papel de provar que o conhecimento foi **compreendido e absorvido**, superando a barreira da simples memorização de sintaxe.
