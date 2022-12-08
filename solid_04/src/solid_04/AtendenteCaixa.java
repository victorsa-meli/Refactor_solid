package solid_04;

public class AtendenteCaixa extends Funcionario {


    public AtendenteCaixa(float salario, String cargo, String nome) {
        super(salario, cargo, nome);
    }
    @Override
    float calcularSalario() {
        return this.getSalario();
    }
}
