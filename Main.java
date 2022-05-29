import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int capacidadeMaxima = 5;
        int numeroAndares = 3;
        Elevador elevador = new Elevador(capacidadeMaxima, numeroAndares);
        menu(elevador);
    }

    //bla bla bla

    public static void dormir(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void menu(Elevador elevador){
        int segundosParaDelay = 2;
        Scanner leitor = new Scanner(System.in);
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
            System.out.println("Escolha uma opção:              |");
            System.out.println("(1) Entrar pessoa no elevador   | --------------------------|");
            System.out.println("(2) Sair pessoa do elevador     | Andar atual -> " + elevador.getAndarAtual());
            System.out.println("(3) Subir 1 andar               | Número de usuários -> " + elevador.getNumeroUsuarios());
            System.out.println("(4) Descer 1 andar              | --------------------------|");
            System.out.println("(5) Sair                        |");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
            int escolha = leitor.nextInt();
            switch(escolha){
                case 1:
                    elevador.entrarUsuario();
                    break;
                case 2:
                    elevador.sairUsuario();
                    break;
                case 3:
                    elevador.subirAndar();
                    break;
                case 4:
                    elevador.descerAndar();
                    break;
                case 5:
                    leitor.close();
                    return;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
            dormir(segundosParaDelay);
        }
    }
}
