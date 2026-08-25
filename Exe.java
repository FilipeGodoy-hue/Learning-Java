public class Exe {

    public static void main(String[] args){
        Carro carro1 = new Carro();

        carro1.modelo = "Ferrari";
        carro1.placa = "PCU-7818";
        carro1.valorDiaria = 90.50;

        Reserva reserva1 = new Reserva();

        reserva1.nomeCliente = "Filipe Godoy";
        reserva1.quantidadeDias = 7;

        reserva1.carroReservado = carro1;
        reserva1.exibirResumo(); // Aqui, para concluir a função/programa, você chama a função e aplica ela para o objeto.
    }

}
