package br.inatel.cdg;

import VotoInvalidoExcpetion.VotoInvalidoException;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo a = new Arquivo();
        Pessoa p = new Pessoa();

        boolean flag = true;


        while(flag){
            System.out.println("1 - Votar no Paulinho");
            System.out.println("2 - Votar no Rogerao");
            System.out.println("2 - Votar no Darth Vader");
            System.out.println("4 - Finalizar sessão");

            int menu = sc.nextInt();

            switch(menu){
                case 1:
                    sc.nextLine();
                    p.setCpf(sc.nextLine());
                    p.setVoto(sc.nextLine());
                    a.adicionarPaulinho(p);
                    break;

                case 2:
                    sc.nextLine();
                    p.setCpf(sc.nextLine());
                    p.setVoto(sc.nextLine());
                    a.adicionarRogerao(p);
                    break;
                case 3:
                    sc.nextLine();
                    p.setCpf(sc.nextLine());
                    p.setVoto(sc.nextLine());
                    a.adicionarDarth(p);
                    break;
                case 4:
                    a.lerPaulinho();
                    a.lerRogerao();
                    a.lerDarth();
                    flag = false;

            }
        }
    }
}

