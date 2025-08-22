import java.util.Scanner;

public class Controller {

  public static void main(String[] args) throws Exception{
    Scanner read = new Scanner(System.in);
    // var result = tabuadaCounter(10);
    // var result = calcPersonIMC(read);
    var result = choiceMaxNumber(read);
    
    System.out.println(result);
  }
  
  public static int tabuadaCounter(int number) throws Exception{
    for(var i = 0; i <= number; i++ ){
      System.out.printf("%d x %d = %d%n", number, i, (number*i));
    }
    
    return 1;
  }

  public static String calcPersonIMC(Scanner read) throws Exception{
    System.out.println("Informe a sua altura: ");
    float height = read.nextFloat();
    System.out.println("Informe o seu peso: ");
    float weight = read.nextFloat();

    read.close();
    float personIMC = weight/(height*height);
    if (personIMC <= 18.5) {
      return "Abaixo do peso";
    } else 
    if (personIMC > 18.5 & personIMC <= 24.9) {
      return "Peso ideal!";
    } else 
    if (personIMC > 24.9 & personIMC <= 29.9) {
      return "Levemente acima do peso";
    } else 
    if (personIMC > 29.9 & personIMC <= 34.9) {
      return "Obesidade Grau I";
    } else
    if (personIMC > 34.9 & personIMC <= 39.9) {
      return "Obesidade Grau II (Severa)";
    } else
    if (personIMC > 39.9) {
      return "Obesidade III (Mórbida)";
    }
    return "Finalizado";
  }

  public static int choiceMaxNumber(Scanner read) throws Exception{
  // Math.max(numeroNormal, cacter); Verificar se o número é maior
    System.out.printf("%nInforme dois números, um número deve ser maior que o outro%n");
    System.out.println("Informe o primeiro numero: ");
    var optionOne = read.nextInt();
    System.out.println("Informe o segundo numero: ");
    var optionTwo = read.nextInt();

    var numMin = Math.min(optionOne, optionTwo);
    System.out.println(numMin);

    
    return 1;
  }
  
  
}
