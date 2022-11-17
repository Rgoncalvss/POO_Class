package br.inatel.cdg;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public static int cFoto = 0;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public RedeSocial(String senha, int numAmigos){
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println("Publicação curtida!");
    }
}
