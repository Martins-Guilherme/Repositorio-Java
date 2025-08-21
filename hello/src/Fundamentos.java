import java.util.Scanner;
import java.io.IOException;

public class Fundamentos {

    public static void limparTela() throws IOException, InterruptedException {
        // Este comando funciona na maioria dos terminais (Linux, macOS, Windows com Git Bash, etc.)
        // e no novo Windows Terminal.
        // Para o CMD antigo do Windows, o comando é "cls".
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            // Comando ANSI para limpar a tela, funciona em terminais baseados em Unix.
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("===== MENU DE OPÇÕES =====");
        System.out.println("1 - Nome + ano de nascimento.");
        System.out.println("2 - Calculo do quadrado.");
        System.out.println("3 - Base x altura do retângulo.");
        System.out.println("4 - Diferença de idade de duas pessoas.");
        System.out.println("0 - Sair");
        System.out.println("==========================");
        System.out.println("Escolha uma opção: ");
        int choice = scanner .nextInt();

        System.out.print("Processando...");
        Thread.sleep(2000);
        limparTela();
        switch (choice) {
          case 0:
            System.out.println("Saindo da aplicação...");
            break;
          case 1:
            System.out.print("Informe seu nome: ");
            String name = scanner.next();
            System.out.print("Informe sua idade: ");
            int age = scanner.nextInt();
            System.out.printf("Olá %s, você tem %d anos.%n", name, age);
            break;
          case 2:
            System.out.print("Informe o tamanho do lado de um quadrado em Metros: ");
            float side = scanner.nextShort();
            System.out.printf("Fórmula: x = %.2f * %.2f === %.2f Metros.%n", side, side, (side*side));
            break;
          case 3:
            System.out.print("Informe a base do retângulo: ");
            float base = scanner.nextFloat();
            System.out.print("Informe a altura do retângulo: ");
            float height = scanner.nextFloat();
            System.out.printf("Fómula: a = %.2f * %.2f === %.2f %n", base, height, (base*height));
            break;
          case 4:
            System.out.print("Infome o nome da pessoa 1: ");
            String namePersonOne = scanner.next();
            System.out.print("Infome a idade da pessoa 1: ");
            int agePersonOne = scanner.nextInt();
            System.out.print("Infome o nome da pessoa 2: ");
            String namePersonTwo = scanner.next();
            System.out.print("Infome a idade da pessoa 2: ");
            int agePersonTwo = scanner.nextInt();
            
            if(agePersonOne > agePersonTwo) {
              System.out.printf("%s é mais velho que %s em %d anos.%n", namePersonOne, namePersonTwo, (agePersonOne - agePersonTwo));
            } else if(agePersonTwo > agePersonOne) {
              System.out.printf("%s é mais velho que %s em %d anos.%n", namePersonTwo, namePersonOne , (agePersonTwo - agePersonOne));
            } else {
              System.out.println("Ambos têm a mesma idade.");
            }
            break;
          default:
            System.out.println("Opção invalida!");
            Thread.sleep(2000);
            limparTela();
            main(args);
      }
      scanner.close();
    } catch (Exception e){
      System.out.println("Erro ao executar o método inputScanner: " + e.getMessage());
    }
    };
 }


