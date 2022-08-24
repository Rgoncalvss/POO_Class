public class Cliente {

    String nome;
    long cpf;

    Computador[] computadores;
    float total = 0;
    float calculaTotalCompra(){
        for(int i = 0; i < this.computadores.length; i++){
            if(computadores[i] != null) {
                total += computadores[i].preco;
            }
        }
        return total;
    }
}
