import java.util.Scanner;

public class condicionais {
  public static void main(String[] args) throws Exception {
    var scanner = new Scanner(System.in);
    
    forCaseVoid();
    scanner.close();
  }

  public static void whileCond(Scanner scanner) throws Exception {
    System.out.println("Formas para apresentar o laço de repetição while || do - while: ");
    System.out.println("1 - Modo 'while' ");
    System.out.println("2 - Modo 'do-while' ");
    var forma = scanner.nextInt();
    var name = " ";
    
    if (forma == 1) {
      // while(!name.equalsIgnoreCase("exit")){
      //   System.out.println("Informe seu nome: ");
      //   name = scanner.next();
      //   System.out.println(name);
      // } 
      while(true){
        System.out.println("Infome seu nome: ");
        name = scanner.next();
        if(name.equalsIgnoreCase("exit")) break;
      }
    } 
    else
      if(forma == 2){
        do{

        }while(!name.equalsIgnoreCase("exit"));
    }
  }

  public static void forCaseVoid() throws Exception {
    Object[] args = {"ola", "vai", "com", "deux"};
    for( var arg : args){
      System.out.println(arg);
    }
  }

  public static void forCaseStatemmented(Scanner scanner) throws Exception{
    int a = scanner.nextInt();
    if (a == 1) {
        for(var i = 0; i <= 100; i++){
        if(i % 2 == 0){
          continue;
        }
        System.out.println(i);
      }      
    } else {
      System.out.println("Teste");
    }
    scanner.close();


  }

  public static void forCaseExplicit(Scanner args) throws Exception{
    for(;;){
      System.out.print("Digite um nome: ");
      var name = args.next();
      
      if(name.equalsIgnoreCase("exit")) {System.out.println("Saindo do programa..."); break;}
      System.out.println(name);
    }
  }

  public static void switchCase(Scanner args) throws Exception{
    System.out.print("Informe o dia da semana: ");
    var option = args.nextInt();
    switch (option){
      case 1, 7:
        System.out.print("Hoje é final de semana.");
        break;
      case 2:
        System.out.print("Segunda-feira");
        break;
      case 3:
        System.out.print("Terça-feira");
        break;
      case 4:
        System.out.print("Quarta-feira");
        break;
      case 5:
        System.out.print("Quinta-feira");
        break;
      case 6:
        System.out.print("Sexta-feira");
        break;
      default:
        System.out.print("Valor incorreto!");
    }
    System.out.printf("%nFim de execução!%n");
  } 

  public static void switchCaseExpression(Scanner args) throws Exception {
    // Convert switch statements to switch expressions
    System.out.println("Infome um horario do dia: ");
    System.out.println("1 - Manhã");
    System.out.println("2 - Tarde");
    System.out.println("3 - Noite");
    int timeDay = args.nextInt();
    switch(timeDay) {
      case 1 -> System.out.println("Hora do café.");
      case 2 -> System.out.println("Hora de almoçar.");
      case 3 -> System.out.println("Hora de jantar.");
      default -> System.out.println("informação invalida, encerrando aplicação...");
    }
  }


}
