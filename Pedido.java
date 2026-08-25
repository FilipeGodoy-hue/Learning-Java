public class Pedido {

    String nomeCliente; //Declaração do atributo
    Livro livroComprado; // Aqui, como a classe pedido engloba a classe livro, precisamos declarar ela (como se fosse uma variável), falando o tipo dela(no caso de uma classe, o próprio nome) e o nome atribuído.

    void exibirResumo(){

        System.out.println("Nome do cliente: "+ nomeCliente);
        livroComprado.exibir_informações();

    }

}
