package solid_exercicio1;

public class ImpressaoDeFatura {

    private Fatura fatura;

    public ImpressaoDeFatura(Fatura fatura){
        this.fatura = fatura;
    }


    public void imprimir() {
        System.out.println( fatura.getQuantidade() + "x " + fatura.getLivro().getNome() + " " + fatura.getLivro().getPreco() + "$");
        System.out.println("Porcentagem de desconto: " + fatura.getPorcDesconto());
        System.out.println("Procentagem de imposto: " + fatura.getPorcImposto());
        System.out.println("Total: " + fatura.getTotal());
    }
}
