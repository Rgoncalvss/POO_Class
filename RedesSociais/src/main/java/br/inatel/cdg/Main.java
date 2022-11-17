package br.inatel.cdg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int menu;
        int cFoto = 0;
        int cVideo = 0;
        int cComent = 0;
        int cPubli = 0;
        int cStream = 0;
        int cCompart = 0;
        boolean aux = true;

        RedeSocial.cFoto++;

        while(aux){

            System.out.println(" ");
            System.out.println("Qual rede social quer usar?");
            System.out.println("1 - Facebook (Postar Foto, Video e Streamar)");
            System.out.println("2 - Instagram (Postar Foto, Video e Curtir Publi)");
            System.out.println("3 - Twitter (Postar Foto, Comentario e Compartilhar Publi)");
            System.out.println("4 - GooglePlus (Postar Video, Comentario e Streamar)");
            System.out.println("0 - Sair das redes");
            menu = sc.nextInt();

            switch (menu){
                case 0:
                    System.out.println("Saindo das Redes Sociais");
                    aux = false;

                case 1:
                    RedeSocial face = new Facebook("123", 500);
                    Usuario use = new Usuario(face);
                    System.out.println(use.getNome() + " estas foram suas ações: ");

                    if(cFoto < 1) {
                        for (int i = 0; i < 5; i++) {
                            if (use.redesS[i] instanceof Facebook facebook) {
                                facebook.postarFoto();
                                System.out.println(Facebook.cFoto);
                            }
                        }
                        cFoto++;
                    }
                    else
                        System.out.println("Limite de fotos atingido!");
                    if(cVideo < 1) {
                        for (int i = 0; i < 5; i++) {
                            if (use.redesS[i] instanceof Facebook facebook) {
                                facebook.postarVideo();
                            }
                        }
                        cVideo++;
                    }
                    else
                        System.out.println("Limite de videos atingido!");
                    if(cStream < 1) {
                        for (int i = 0; i < 5; i++) {
                            if (use.redesS[i] instanceof Facebook facebook) {
                                facebook.fazStreaming();
                            }
                        }
                        cStream++;
                    }
                    else
                        System.out.println("Ja streamou em outra rede!");

                    break;

                case 2:
                    RedeSocial insta = new Instagram("456", 600);
                    Usuario use1 = new Usuario(insta);
                    System.out.println(use1.getNome() + " estas foram suas ações: ");

                    if(cFoto < 1){
                        for(int i = 0; i < 5; i++){
                            if(use1.redesS[i] instanceof Instagram instagram){
                                instagram.postarFoto();
                            }
                        }
                        cFoto++;
                    }
                    else
                        System.out.println("Limite de fotos atingido!");
                    if(cVideo < 1){
                       for(int i = 0; i < 5; i++){
                           if(use1.redesS[i] instanceof Instagram instagram){
                               instagram.postarVideo();
                           }
                       }
                       cVideo++;
                    }
                    else
                        System.out.println("Limite de videos atingido!");
                    if(cPubli < 1){
                        for(int i = 0; i < 5; i++){
                            if(use1.redesS[i] instanceof Instagram instagram){
                                instagram.curtirPublicacao();
                            }
                        }
                        cPubli++;
                    }
                    else
                        System.out.println("Limite de likes atingido!");
                    break;

                case 3:
                    RedeSocial tt = new Twitter("789", 1500);
                    Usuario use2 = new Usuario(tt);
                    System.out.println(use2.getNome() + " estas foram suas ações: ");

                    if(cFoto < 1){
                        for(int i = 0; i < 5; i++){
                            if(use2.redesS[i] instanceof Twitter twitter){
                                twitter.postarFoto();
                            }
                        }
                        cFoto++;
                    }
                    else
                        System.out.println("Limite de fotos atingido!");
                    if(cComent < 1){
                        for(int i = 0; i < 5; i++){
                            if(use2.redesS[i] instanceof Twitter twitter){
                                twitter.postarComentario();
                            }
                        }
                        cComent++;
                    }
                    else
                        System.out.println("Limite de comentarios atingido!");
                    if(cCompart < 1){
                        for(int i = 0; i < 5; i++){
                            if(use2.redesS[i] instanceof Twitter twitter){
                                twitter.compartilhar();
                            }
                        }
                        cCompart++;
                    }
                    else
                        System.out.println("Limite de compartilhamentos atingido!");
                    break;

                case 4:
                    RedeSocial gPlus =new GooglePlus("101112", 50);
                    Usuario use3 = new Usuario(gPlus);
                    System.out.println(use3.getNome() + " estas foram suas ações: ");

                    if(cVideo < 1){
                        for(int i = 0; i < 5; i++){
                            if(use3.redesS[i] instanceof GooglePlus google){
                                google.postarVideo();
                            }
                        }
                        cVideo++;
                    }
                    else
                        System.out.println("Limite de videos atingido!");
                    if(cComent < 1){
                        for(int i = 0; i < 5; i++){
                            if(use3.redesS[i] instanceof GooglePlus google){
                                google.postarComentario();
                            }
                        }
                        cComent++;
                    }
                    else
                        System.out.println("Limite de comentarios atingido!");
                    if(cStream < 1){
                        for(int i = 0; i < 5; i++){
                            if(use3.redesS[i] instanceof GooglePlus google){
                                google.curtirPublicacao();
                            }
                        }
                        cStream++;
                    }
                    else
                        System.out.println("Ja streamou em outra rede!");
                    break;

            }
        }
    }
}