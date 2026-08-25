public class Livro { //Primeiro passo, declarar a classe, ela precisa ter o mesmo nome que o arquivo!

    //2 passo: declaração dos atributos, que são valores intrínsecos do objeto! (São como variáveis)
    String titulo;
    String autor;
    double preco;

    //3 passo: declaração dos métodos:funções/ações realizadas pelo objeto ou sobre ele.

    void exibir_informações(){ //Perceba que se trata de uma função do tipo void, ou seja, ela não retorna nada! Ela somente declara o método.
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
    }




}
