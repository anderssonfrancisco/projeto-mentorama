import java.util.Scanner;

/**
 * Menu
 */
public class Menu {
    public static void main(String[] args) {


        Scanner menu = new Scanner (System.in);

        boolean sair = true;
        while(sair){
            System.out.println("|      Menu           |");
            System.out.println("|  Opções:            |");
            System.out.println("|       1. Opção 1    |");
            System.out.println("|       2. Opção 2    |");
            System.out.println("|       3.  Sair      |");


            System.out.println("Selecione uma opção: ");
            int opcao = menu.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção 1 selecionada");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    if(opcao==3)
                        sair = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }

        }


    }

}
}

        