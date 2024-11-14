Gerenciamento de Pedidos
Este projeto é uma implementação simples de um sistema de gerenciamento de pedidos, focado em demonstrar testes automatizados para uma funcionalidade de cálculo de total de pedidos. Utilizamos JUnit e Mockito para testar a funcionalidade de cálculo de forma automatizada.

Índice
Descrição do Projeto
Funcionalidade Implementada
Ferramentas Utilizadas
Estrutura do Projeto
Configuração do Ambiente
Como Executar os Testes
Equipe
Contribuição
Descrição do Projeto
O projeto foi desenvolvido para uma atividade de teste automatizado com foco em funcionalidade. A funcionalidade escolhida foi o cálculo do total de um pedido com base na quantidade e no preço unitário de cada item do pedido.

O código permite simular a adição de um pedido e calcular automaticamente o valor total do pedido com base nas informações fornecidas.

Funcionalidade Implementada
A funcionalidade principal do projeto é:

Cálculo do Total de um Pedido:
O total é calculado multiplicando a quantidade de itens pelo preço unitário de cada item.
O valor é retornado e exibido, ou uma exceção é lançada caso o pedido não seja encontrado.
Ferramentas Utilizadas
Linguagem: Java 18
Framework de Testes: JUnit 5
Mocking: Mockito
IDE Recomendada: IntelliJ IDEA (compatível com outras IDEs)
Gerenciamento de Dependências: Maven
Estrutura do Projeto
A estrutura básica do projeto é a seguinte:

bash
Copy code
src
├── main
│   └── java
│       └── org.example.ordermanagement
│           ├── Order.java                # Classe de Pedido
│           ├── OrderRepository.java       # Interface de Repositório de Pedidos
│           └── OrderService.java          # Serviço para operações com pedidos
└── test
    └── java
        └── org.example.ordermanagement
            └── OrderServiceTest.java      # Classe de Teste Unitário
Configuração do Ambiente
Pré-requisitos:

Instale o Java 18 (ou versão compatível).
Instale o Apache Maven.
Instale uma IDE, como IntelliJ IDEA.
Clonando o Repositório:

Clone o repositório para sua máquina local usando:
bash
Copy code
git clone <URL_DO_REPOSITÓRIO>
Instalando Dependências:

Navegue até o diretório do projeto e execute:
bash
Copy code
mvn clean install
Como Executar os Testes
Abra o projeto na IDE.
Navegue até a classe de testes OrderServiceTest.
Clique com o botão direito e selecione Run 'OrderServiceTest' para executar os testes unitários.
Alternativamente, execute os testes via terminal:
bash
Copy code
mvn test
Os testes verificarão a precisão do cálculo do total de pedidos e o comportamento quando o pedido não é encontrado.

Equipe
Líder: José Neto Cordeiro de Carvalho
Integrantes: Pablo Nobre Gomes de Araújo, Theynan
Contribuição
Equipe: O projeto foi desenvolvido por uma equipe de 3 integrantes, sendo liderada por um membro com experiência em programação para orientar e colaborar com os demais.
Interações com IA: Todas as interações com a inteligência artificial foram registradas para fins de documentação e apresentação em sala.
Apresentação: O líder orientará na apresentação do código e dos testes automatizados, explicando o fluxo do projeto e as práticas de testes.
