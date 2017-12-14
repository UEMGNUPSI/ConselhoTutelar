
package MODEL;


public class FatosM {
    
    private int id;
    private int Atendimento_Id;
    private int Direitos_Id;

    public FatosM(int id, int Atendimento_Id, int Direitos_Id) {
        this.id = id;
        this.Atendimento_Id = Atendimento_Id;
        this.Direitos_Id = Direitos_Id;
    }

    public FatosM() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtendimento_Id() {
        return Atendimento_Id;
    }

    public void setAtendimento_Id(int Atendimento_Id) {
        this.Atendimento_Id = Atendimento_Id;
    }

    public int getDireitos_Id() {
        return Direitos_Id;
    }

    public void setDireitos_Id(int Direitos_Id) {
        this.Direitos_Id = Direitos_Id;
    }
    
    
   
    
    
}
