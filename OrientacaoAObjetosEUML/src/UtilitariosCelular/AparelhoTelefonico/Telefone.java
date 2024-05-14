package UtilitariosCelular.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{
    public void ligar(){
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
