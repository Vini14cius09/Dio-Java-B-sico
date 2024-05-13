package Celular;

import java.util.Scanner;

import UtilitariosCelular.AparelhoTelefonico.Telefone;
import UtilitariosCelular.NavegadorDeInternet.Internet;
import UtilitariosCelular.RoprodutorMusical.Ipod;

public class CelularIphone{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ipod ipod = new Ipod();
    Telefone telefone = new Telefone();
    Internet internet = new Internet();

    System.out.println("");

    scanner.close();
    }
}