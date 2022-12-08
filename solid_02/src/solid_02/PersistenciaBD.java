package solid_02;

public class PersistenciaBD implements PersistenciaDaFatura {

    public Fatura fatura;

    public PersistenciaBD(Fatura fatura) {
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
        System.out.println("Salvar a fatura no banco de dados...\n");
        this.fatura.imprimirFatura();

    }
}
