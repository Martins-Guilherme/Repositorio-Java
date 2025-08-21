import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            // inputScanner(args);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Variáveis");
            System.out.println("2 - Tipos Primitivos");
            System.out.println("3 - Operadores");
            int escolha = scanner.nextInt();
    
            switch (escolha) {
              case 1:
                variaveis(args);
                break;
              case 2:
                primitivos(args);
                break;
              case 3:
                operadores(args);
                break;
              case 4:
                inputScanner(args);
                break;
              case 5:
                atribuicoes(args);
                break;
                default:
                System.out.println("Opção inválida.");
                main(args); // Chama o método main novamente para reiniciar o menu
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao executar o método inputScanner: " + e.getMessage());
        }
    }

    public static void primitivos(String[] args) throws Exception {
        byte numero = 100;
        short numeroCurto = 10000;
        int numeroNormal = 100000;
        long numeroGrande = 1000000000000L;
        float numeroDecimal = 4.5f;
        double numeroMuitoDecimal = 85.4;
        boolean verdadeiro = true;
        char cacter = 'A';
        String texto = "Olá, mundo!";
        System.out.println("Número byte: " + numero);
        System.out.println("Número short: " + numeroCurto);
        System.out.println("Número int: " + numeroNormal);
        System.out.println("Número long: " + numeroGrande);
        System.out.println("Número float: " + numeroDecimal);
        System.out.println("Número double: " + numeroMuitoDecimal);
        System.out.println("Booleano: " + verdadeiro);
        System.out.println("Caractere: " + cacter);
        System.out.println("Texto: " + texto);
    }

    public static void operadores(String[] args) throws Exception {
        int a = 10;
        int b = 20;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("Incremento: " + (++a));
        System.out.println("Decremento: " + (--b));
    }

    public static void variaveis(String[] args) throws Exception {
        int idade = 30;
        String nome = "João";
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
    }

    public static void inputScanner(String[] args) throws Exception {
        try (// System.out.println("Hello, World!");
                // System.out.println("Configurando d JDK na versão" + args[0]);
                // System.out.println("Programando em "+ args[1]);
        var scanner = new Scanner(System.in)) {
            System.out.println("Informe o seu nome: ");
            String name = scanner.next();
            System.out.println("Informe a sua idade: ");
            int age = scanner.nextInt();
            // System.out.print("Olá " + name + ", você tem " + age + " anos de idade.");
            // System.out.println("Olá " + name + ", você tem " + age + " anos de idade.");
            System.out.printf("Olá %s, você tem %d anos de idade. %n", name, age);
        }
    }

    public static void atribuicoes(String[] args) throws Exception {
        int a = 10;
        int b = 20;
        int c = 30;

        // Atribuições
        a += 5; // a = a + 5
        b -= 3; // b = b - 3
        c *= 2; // c = c * 2

        System.out.println("Valor de a após atribuição: " + a);
        System.out.println("Valor de b após atribuição: " + b);
        System.out.println("Valor de c após atribuição: " + c);
    }

    public static void operadoresAritmeticos(String[] args) throws Exception {
        int a = 10;
        int b = 20;

        // Operadores Aritméticos
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }
    
}