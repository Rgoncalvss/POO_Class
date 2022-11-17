package br.inatel.cdg;

public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("Foto publicada no Twitter!");
    }
    @Override
    public void postarVideo(){
        System.out.println("Vídeo publicado no Twitter!");
    }
    @Override
    public void postarComentario(){
        System.out.println("Comentario feito no Twitter!");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Publicação curtida!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Tweet compartilhado!");
    }
}
