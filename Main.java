import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Empregado empregado1 = new Empregado("PrimeiroNome1", "Sobrenome1", 0.0);
    Empregado empregado2 = new Empregado("PrimeiroNome2", "Sobrenome2", 0.0);

//pegar imformações sobre os funcionários
    System.out.println("Digite o primeiro nome do primeiro empregado: ");
    empregado1.setprimeironome(input.nextLine());
    System.out.println("Digite o sobrenome do primeiro empregado: ");
    empregado1.setsobrenome(input.nextLine());
    System.out.println("Digite o salário mensal do primeiro empregado: ");
    empregado1.setsalariomensal(input.nextDouble());

    System.out.println("Digite o primeiro nome do segundo empregado: ");
    empregado2.setprimeironome(input.next());
    System.out.println("Digite o sobrenome do segundo empregado: ");
    empregado2.setsobrenome(input.next());
    System.out.println("Digite o salário mensal do segundo empregado: ");
    empregado2.setsalariomensal(input.nextDouble());

//mostrar o salário anual de cada empregado sem alterações
    System.out.println("O salário anual do primeiro empregado é: " + empregado1.calcularsalarioanual());
    System.out.println("O salário anual do segundo empregado é: " + empregado2.calcularsalarioanual());

  }
}
