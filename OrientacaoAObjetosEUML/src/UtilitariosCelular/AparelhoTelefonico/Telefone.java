package UtilitariosCelular.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{
    public void Ligar(){
        System.out.println("Ligando");
    }

    public void Atender() {
        System.out.println("Atendendo");
    }

    public void IniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
