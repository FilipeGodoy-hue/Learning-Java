public class Main {

    public static void main(String[] args) //Nós criamos o objeto aqui no Main(Executável), ou seja, o preenchimento dos atributos de cada objeto também é feita aqui, não é feita na classe, já que lá é meramente um arquivo de declaração!
    //Aqui no executável é preciso começar com essa função static void ...
    {
    Livro livro1 = new Livro(); //Criação do objeto

    livro1.autor = "Augusto Cury"; //Preenchimento dos atributos
    livro1.titulo = "Livro Cury";
    livro1.preco = 43.99;

    Pedido pedido1 = new Pedido();
    pedido1.nomeCliente = "Filipe";

    //COMPOSIÇÃO: Parte mais importante, onde acontece a junção de um objeto com o outro!

        pedido1.livroComprado = livro1; //Pelo fato de um pedido estar associado a um livro, ou seja, um pedido contém/engloba um livro, realizamos essa composição, nessa mesma ordem!
    }
}
