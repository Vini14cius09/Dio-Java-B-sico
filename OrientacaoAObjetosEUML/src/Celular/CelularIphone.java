package Celular;

import java.util.Scanner;

import UtilitariosCelular.AparelhoTelefonico.Telefone;
import UtilitariosCelular.NavegadorDeInternet.Internet;
import UtilitariosCelular.RoprodutorMusical.Ipod;

public class CelularIphone{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual Aplicativo você deseja utilizar? ipod, telefone ou internet.");
        String escolherAplicativo = scanner.nextLine();

        switch (escolherAplicativo) {
            case "ipod":
                System.out.println("O que você deseja fazer? Tocar, pausar ou selecionar a musica.");
                String escolherFuncaoIpod = scanner.nextLine();
                funcoesIpod(escolherFuncaoIpod);
                break;

            case "telefone":
                System.out.println("O que você deseja fazer? Ligar, atender ou iniciar correio de voz.");
                String escolherFuncaoTelefone = scanner.nextLine();
                funcoesTelefone(escolherFuncaoTelefone);
                break;

            case "internet":
                System.out.println("O que você deseja fazer? exibir pagina (exibir), adicionar nova aba (adicionar) ou atualizar pagina (atualizar).");
                String escolherFuncaoInternet = scanner.nextLine();
                funcoesInternet(escolherFuncaoInternet);
                break;

            default:
                System.out.println("Aplicata não existe em seu aparelho.");
                break;
        }

    scanner.close();
    }

    private static void funcoesIpod(String escolherFuncoes) {
        Ipod ipod = new Ipod();

        if (escolherFuncoes.equals("tocar")) {
            ipod.tocarMusica();
        } else if (escolherFuncoes.equals("pausar")) {
            ipod.pausarMusica();
        } else if (escolherFuncoes.equals("selecionar")) {
            ipod.selecionarMusica();
        } else {
            System.out.println("Essa função não existe.");
        }
    }

    private static void funcoesTelefone(String escolherFuncoes) {
        Telefone telefone = new Telefone();

        if (escolherFuncoes.equals("ligar")) {
            telefone.ligar();
        } else if (escolherFuncoes.equals("atender")) {
            telefone.atender();
        } else if (escolherFuncoes.equals("iniciar correio de voz")) {
            telefone.iniciarCorreioDeVoz();
        } else {
            System.out.println("Essa função não existe.");
        }
    }

    private static void funcoesInternet(String escolherFuncoes) {
        Internet internet = new Internet();

        if (escolherFuncoes.equals("exibir")) {
            internet.exibirPagina();
        } else if (escolherFuncoes.equals("adicionar")) {
            internet.adicionarNovaAba();
        } else if (escolherFuncoes.equals("atualizar")) {
            internet.atualizarPagina();
        } else {
            System.out.println("Essa função não existe.");
        }
    }
}