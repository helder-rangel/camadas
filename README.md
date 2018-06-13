# camadas
projeto poo
Objetivo: Criar um Sistema de Vendas para Restaurante.
Regras de negócio:
Um restaurante vende os produtos de seu cardápio. Quando a mesa é ocupada pelos clientes, o garçom
efetua a abertura de uma conta para a mesa e à medida que os clientes fazem seus pedidos, o garçom os solicita no
sistema.
O restaurante possui 20 mesas identificadas por um identificador autoincrementado (1, 2, ...), onde cada
garçom serve 5 mesas (num intervalo sequencial) e cada mesa é atendida por apenas um único garçom. Uma mesa é
considerada ocupada se possuir uma conta aberta e considerada livre se não possuir conta aberta.
Um garçom pode criar, movimentar, cancelar, consultar e fechar uma conta para qualquer uma de suas
mesas. Ele também pode transferir os produtos de uma mesa para outra, cancelando automaticamente a conta de
origem. No final do dia o garçom poderá consultar o valor da gorjeta que ele receberá do restaurante
correspondente aos 10% de todas as contas fechadas que ele serviu naquele dia.
Uma conta é identificada no sistema por um número autoincrementado (1, 2, ...).
Uma conta só pode ser criada para uma determinada mesa e somente se a última conta criada para esta
mesa tiver sido fechada. Uma conta só pode ser fechada se ela estiver aberta. Quando uma conta é fechada ela
recebe a data de fechamento que é a data do computador.

<img src="http://helderrangel.com.br/imagens/diagramapoo.png">
* Classe de Fachada *
* public static ArrayList<Produto> listarProdutos(nome) - retorna todos os produtos do restaurante (no caso de Enter) ou
apenas os produtos que contém parte do nome fornecido *
* public static ArrayList<Garcom> listarGarcons() – retorna todos os garçons do restaurante *
* public static ArrayList<Mesa> listarMesas() – retorna todas as mesas do restaurante *
* public static ArrayList<Conta> listarContas() – retorna todas as contas do restaurant *
* public static void criarMesas(n) – cria todas as n mesas do restaurante *
* public static Produto cadastrarProduto(nome, preco) – cadastra o produto *
* public static Garcom cadastrarGarcom(apelido, senha, mesainicial, mesafinal) – cadastra o garçom *
* public static Conta criarConta(idmesa) – cria uma conta para a mesa *
* public static Conta consultarConta(idmesa) – retorna a conta da mesa *
* public static Produto solicitarProduto(idmesa, nomeproduto)– adiciona um produto na conta *
* public static void cancelarConta(idmesa)– excluir a conta da mesa e do restaurante *
* public static void transferirConta(idmesaorigem, idmesadestino) – transferir todos os produtos da conta de origem para a conta destino e cancelar a conta origem *
* public static void fecharConta(idmesa) – atualiza a data de fechamento da conta *
*  public static double calcularGorjeta(apelido) – calcular a gorjeta do garçom *
* Esses métodos devem lançar exceção quando necessário.*
  
  
  Aplicação (MENU):
1. Listar Produtos Dados: qualquer parte do nome (um nome vazio ou inexistente significa todas as
pessoas)
Resultados: listagem de todos os produtos do restaurante
2. Listar Garçons Resultados: listagem de todos os garçons do restaurante, contendo apelido, id das
mesas
3. Listar Mesas Resultados: listagem de todas as mesas do restaurante, contendo id da mesa e situação
(aberta ou fechada)
4. Listar Contas Resultados: listagem de todas as contas do restaurante, contendo numero, data
fechamento (se existir), total, lista de produtos, apelido e idmesa
5. Cadastrar Produto Dados: nome e preco
Resultados: confirmação de cadastro
6. Cadastrar Garçom Dados: apelido, idmesa inicial, idmesa final
Resultados: confirmação de cadastro
7. Criar Conta Dados: id da mesa
Resultados: confirmação de abertura
8. Consultar Conta Dados: id da mesa
Resultados: numero, data fechamento (se existir), total, lista de produtos, apelido e
idmesa
9. Solicitar Produto Dados: id da mesa e nome de produto
Resultados: confirmação
10. Cancelar Conta Dados: id da mesa
Resultados: confirmação
11. Transferir Conta Dados: id da mesa origem, id da mesa destino
Resultados: confirmação
12. Fechar Conta Dados: id da mesa
Resultados: confirmação
13. Calcular Gorjeta Dados: apelido do garçom
Resultados: valor da gorjeta no dia de hoje para contas fechadas
Considerações finais:
*  A aplicação deverá pré-cadastrar 8 produtos e 4 garçons
*  As datas devem ser visualizadas no formato dd/mm/aaaa
*  Utilize somente coleções do tipo ArrayList
