
package MODEL;


public class FatosM {
    
    private int Atendimento_Id;
    private int Direitos_Id;

    public FatosM(int Atendimento_Id, int Direitos_Id) {
        this.Atendimento_Id = Atendimento_Id;
        this.Direitos_Id = Direitos_Id;
    }

    public FatosM() {
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
