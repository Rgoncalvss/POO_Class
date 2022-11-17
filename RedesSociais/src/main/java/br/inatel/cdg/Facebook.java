package br.inatel.cdg;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    public Facebook(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("Foto publicada no Facebook!");
    }
    @Override
    public void postarVideo(){
        System.out.println("Vídeo publicado no Facebook!");
    }
    @Override
    public void postarComentario(){
        System.out.println("Comentario feito no Facebook!");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Publicação curtida!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Ao vivo no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Face!");
    }
}
