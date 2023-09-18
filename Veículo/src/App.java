import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Caminhao caminhao = new Caminhao();
        Moto moto = new Moto();

        int escolhaMenu;
        String menu = "\n\n****** MENU *******\n" +
                      "|1| Cadastrar Caminhão |2| Listar Caminhão\n|3| Cadastrar Moto |4| Listar Moto |5| Sair" ;

        do {
            System.out.println(menu);
            escolhaMenu = sc.nextInt();
            
            if (escolhaMenu == 1) {
                System.out.println("\n******** CADASTRAR CAMINHÂO ********\n");
                System.out.println("Digite o Nome: ");
                caminhao.setNome(sc.next());
                System.out.println("Digite o Ano: ");
                caminhao.setAno(sc.nextInt());
                System.out.println("Digite o Modelo: ");
                caminhao.setModelo(sc.next());
                System.out.println("Digite a Marca: ");
                caminhao.setMarca(sc.next());
                System.out.println("Digite a Quantidade de Eixos: ");
                caminhao.setQtdEixo(sc.nextInt());

            } else if (escolhaMenu == 2) {
                System.out.println(caminhao.toString());

            } else if (escolhaMenu == 3) {
                System.out.println("\n******** CADASTRAR MOTO ********\n");
                System.out.println("Digite o Nome: ");
                moto.setNome(sc.next());
                System.out.println("Digite o Ano: ");
                moto.setAno(sc.nextInt());
                System.out.println("Digite o Modelo: ");
                moto.setModelo(sc.next());
                System.out.println("Digite a Marca: ");
                moto.setMarca(sc.next());
                System.out.println("Digite as Cilindradas: ");
                moto.setCilindradas(sc.next());

            } else if (escolhaMenu == 4) {
                System.out.println(moto.toString());

            } else if (escolhaMenu == 5) {
                System.out.println("Volte Sempre! :)");
                sc.close();

            } else  {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while(escolhaMenu != 6);
    }
}
