package solid_03;

import java.time.LocalDate;
import java.util.List;

class FolhaSalarial{

    private LocalDate data;

    public FolhaSalarial(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void imprimirFolhaSalarial(List<Funcionario> funcionarios){

        System.out.println("FOLHA SALARIAL\n");

        for(Funcionario funcionario : funcionarios){

            System.out.println("\n" + funcionario.getNome() + " ----- R$ " + funcionario.calculaSalario());

            /* // Erro no Método calcularSalarioGerente()
            if(funcionario.getCargo() == "Vendedor"){
                System.out.println("\n" + funcionario.getNome() + " ----- R$" + funcionario.calcularSalarioGerente());
            }

            // Erro no Método calcularSalarioVendedor()
            if(funcionario.getCargo() == "Gerente"){
                System.out.println("\n" + funcionario.getNome() + " ----- R$" + funcionario.calcularSalarioVendedor());
            }*/
        }
    }
}