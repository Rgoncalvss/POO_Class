package br.inatel.cdg;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("Foto publicada no Google Plus!");
    }
    @Override
    public void postarVideo(){
        System.out.println("Vídeo publicado no Twitter!");
    }
    @Override
    public void postarComentario(){
        System.out.println("Comentario feito no GooglePLus!");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Publicação curtida!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Ao vivo no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no GooglePlus");
    }
}
