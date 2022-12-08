package solid_05;

public class TestaProjeto {

        public TestaProjeto() {
        }

        public static void main(String[] args) {
            FrontEndDev frontDev = new FrontEndDev();
            BackEndDev backDev = new BackEndDev();
            ProjetoSoftware projetoSoftware = new ProjetoSoftware(frontDev, backDev);
            projetoSoftware.criarProjeto();
        }
    }


