public class Reserva {

    String nomeCliente;
    Carro carroReservado;
    int quantidadeDias;

    void exibirResumo(){
        carroReservado.exibirDados();
        System.out.println("O valor total da reserva é igual a: " + quantidadeDias * carroReservado.valorDiaria); //Aqui, por valorDiaria estar dentro de outra classe, nós acessamos eles por meio dos objetos que relacionam essas classes, o objeto de composição!
    }

}
