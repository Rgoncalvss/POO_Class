import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.computadores = new Computador[10];

        System.out.println("Insira o nome do Cliente: ");
        cliente.nome = sc.nextLine();
        System.out.println("Insira o CPF do Cliente: ");
        cliente.cpf = sc.nextLong();



        int menu;
        boolean aux = true;
        int i = 0;

        while(aux){

            System.out.println("0 - Sair");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("O que deseja fazer?");

            menu = sc.nextInt();
            sc.nextLine();

            System.out.println(" ");
            switch (menu)
            {
                case 0:
                    System.out.println("O cliente " + cliente.nome + " adquiriu: ");
                    System.out.println(" ");
                    for(Computador pc : cliente.computadores){
                        if(pc != null)
                            pc.mostraPCConfigs();
                    }
                    System.out.println("Total da compra: R$" + cliente.calculaTotalCompra());
                    aux = false;
                    System.out.println("Agradecemos pela compra!");

                    break;

                case 1:

                    Computador pc1 = new Computador();
                    pc1.marca = "Positivo";
                    pc1.preco = 1300f;
                    pc1.hardwareBasico.processador = "Pentium Core i3 (1200Mhz)";
                    pc1.hardwareBasico.memoria = "4Gb";
                    pc1.hardwareBasico.capacidade = 500f;
                    pc1.sistemaOperacional.nome = "Linux Ubuntu";
                    pc1.sistemaOperacional.tipo = 32;
                    pc1.memoriaUSB.nome = "Pen-drive";
                    pc1.memoriaUSB.capacidade = 16;
                    cliente.computadores[i] = pc1;
                    i++;
                    System.out.println("Computador da Positivo no carrinho!");
                    break;

                case 2:
                    Computador pc2 = new Computador();
                    pc2.marca = "Acer";
                    pc2.preco = 1800f;
                    pc2.hardwareBasico.processador = "Pentium Core i5 (2260 Mhz)";
                    pc2.hardwareBasico.memoria = "8Gb";
                    pc2.hardwareBasico.capacidade = 1000f;
                    pc2.sistemaOperacional.nome = "Windows 8";
                    pc2.sistemaOperacional.tipo = 64;
                    pc2.memoriaUSB.nome = "Pen-drive";
                    pc2.memoriaUSB.capacidade = 32;
                    cliente.computadores[i] = pc2;
                    i++;
                    System.out.println("Computador da Acer no carrinho!");
                    break;

                case 3:
                    Computador pc3 = new Computador();
                    pc3.marca = "Vaio";
                    pc3.preco = 2800f;
                    pc3.hardwareBasico.processador = "Pentium Core i7(3500 Mhz)";
                    pc3.hardwareBasico.memoria = "16Gb";
                    pc3.hardwareBasico.capacidade = 2000f;
                    pc3.sistemaOperacional.nome = "Windows 10";
                    pc3.sistemaOperacional.tipo = 64;
                    pc3.memoriaUSB.nome = "HD Externo";
                    pc3.memoriaUSB.capacidade = 1000;
                    cliente.computadores[i] = pc3;
                    i++;
                    System.out.println("Computador da Acer no carrinho!");
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.\n");

            }


        }
    }

}