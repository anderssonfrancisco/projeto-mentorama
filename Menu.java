import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

    public static void main(String[] args) {
        
        System.out.println("|              Menu               |");
        System.out.println("|             Opção 1             |");
        System.out.println("|             Opção 2             |");
        System.out.println("|             Opção 3             |");
        System.out.println("|               Sair              |");
        Scanner menu = new Scanner(System.in);
        String opçao;

        System.out.println("Escolha uma opção:");
        opçao = menu.nextLine();

        switch (opçao) {
            case "1":
                 System.out.println("Voçe escolheu a opção 1");
                
                break;
                case "2":
                System.out.println("Voçe escolheu a opção 2");
               
               break;
               case "3":
               System.out.println("Voçe escolheu a opção 3");
              
              break;
              case "sair":
              System.out.println("Voçe escolheu sair");
             
             break; 
            default:
                System.out.println("Opção invalida");
                break;
        }


    }
}