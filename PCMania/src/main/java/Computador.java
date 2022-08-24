public class Computador {

    String marca;
    float preco;

    HardwareBasico hardwareBasico = new HardwareBasico();
    SistemaOperacional sistemaOperacional = new SistemaOperacional();

    void mostraPCConfigs(){
        System.out.println("Itens Adquiridos: ");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Hardware Basico: " + hardwareBasico.processador);
        System.out.println("Memória Ram: " + hardwareBasico.memoria);
        System.out.println("Capacidade: " + hardwareBasico.capacidade);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome);
        System.out.println("Versão: " + sistemaOperacional.tipo + "bits");
        System.out.println(" ");
    }

}
