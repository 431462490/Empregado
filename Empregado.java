public class Empregado {
  private String primeironome;
  private String sobrenome;
  private double salariomensal;

//criar metodo construtor
  public Empregado(String primeironome, String sobrenome, double salariomensal) {
    this.primeironome = primeironome;
    this.sobrenome = sobrenome;
    this.salariomensal = salariomensal;
  }

  public String getprimeironome() {
    return (primeironome);
  }

  public void setprimeironome(String primeironome) {
    this.primeironome = pn;
  }

  public String getsobrenome() {
    return (sobrenome);
  }
  public void setsobrenome(String sobrenome) {
    this.sobrenome = sn;
  }
  public double getsalariomensal() {
    return (salariomensal);
  }
  public void setsalariomensal(double salarioMensal) {
    if(salariomensal > 0.0) {
      this.salariomensal = sm;
    }
      else {
        this.salariomensal = 0.0;
      }
     
  }

//calcular o salario anual de cada empregado.
  public double calcularsalarioanual() {
    return salariomensal * 12;
  }
    
    
  }
//dê a cada empregado um aumento de 10%.
  public double aumentarsalario() {
  return calcularsalarioanual() * 1.1;
  }
}
  
