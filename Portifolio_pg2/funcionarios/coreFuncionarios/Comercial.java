package funcionarios.coreFuncionarios;

public class Comercial  extends Funcionario {
  private String clausula;
  
  public Comercial(
    int id, 
    String nome, 
    int idade, 
    String cpf, 
    float salario, 
    String clausula) 
  {
    super(id, nome, idade, cpf, salario);
    this.clausula = clausula;
  }

  public String getClausula() {
    return this.clausula;
  }
}
