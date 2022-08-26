public class Computador {

    String marca;
    float preco;

    HardwareBasico hardwareBasico = new HardwareBasico();
    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    MemoriaUSB memoriaUSB = new MemoriaUSB();

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardware Basico: " + hardwareBasico.processador);
        System.out.println("Memória Ram: " + hardwareBasico.memoria);
        if(hardwareBasico.capacidade >= 1000)
            System.out.println("Capacidade: " + hardwareBasico.capacidade/1000 + "Tb de HD");
        else
            System.out.println("Capacidade: " + hardwareBasico.capacidade + "Gb de HD");
        if(memoriaUSB.capacidade >= 1000)
            System.out.println("Acompanha " + memoriaUSB.nome + " de: " + memoriaUSB.capacidade/1000f + "Tb");
        else
            System.out.println("Acompanha " + memoriaUSB.nome + " de: " + memoriaUSB.capacidade + "Gb");
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome);
        System.out.println("Versão: " + sistemaOperacional.tipo + "bits");
        System.out.println(" ");
    }

}
