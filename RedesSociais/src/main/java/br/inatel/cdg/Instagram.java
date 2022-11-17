package br.inatel.cdg;

public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("Foto publicada no Instagram!");
    }
    @Override
    public void postarVideo(){
        System.out.println("Vídeo publicado no Instagram!");
    }
    @Override
    public void postarComentario(){
        System.out.println("Comentario feito no Instagram!");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Publicação curtida!");
    }
}
