package solid_05;

public class FrontEndDev implements iDev {

    @Override
    public void dev(){
        this.react();
    }

    public void react() {
        System.out.println("\nDesenvolvedor React");
    }
}
