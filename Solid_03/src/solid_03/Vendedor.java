package solid_03;



 abstract class Vendedor extends Funcionario{

    private float comissao;

    public Vendedor(float salario, String cargo, String nome, float comissao) {
        super(salario, cargo, nome);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    //METODO CALCULAR SALARIO

    public float calcularSalario(){
        return this.getSalario() + comissao;
    }

}
