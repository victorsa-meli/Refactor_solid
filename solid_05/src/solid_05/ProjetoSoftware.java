package solid_05;

import java.util.List;

public class ProjetoSoftware {

    public List<iDev> devs;

    public ProjetoSoftware(List<iDev> devs) {
        this.devs = devs;
    }

    public ProjetoSoftware(FrontEndDev frontDev, BackEndDev backDev) {
    }

    public void criarProjeto(){
        this.devs.forEach(iDev::dev);
    }
}
