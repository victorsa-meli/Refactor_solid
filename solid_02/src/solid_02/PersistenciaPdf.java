package solid_02;



public class PersistenciaPdf implements PersistenciaDaFatura {

    public Fatura fatura;

    public PersistenciaPdf(Fatura fatura) {
        this.fatura = fatura;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public void salvar(Fatura fatura) {
        System.out.println("Salvar como PDF ...\n");
        this.fatura = fatura;
    }
}
