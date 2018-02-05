
package MODEL;


public class FatosM {
    
    private int id;
    private AtendimentoM Atendimento_Id;
    private DireitosM Direitos_Id;

    public FatosM() {
    }

    public FatosM(int id, AtendimentoM Atendimento_Id, DireitosM Direitos_Id) {
        this.id = id;
        this.Atendimento_Id = Atendimento_Id;
        this.Direitos_Id = Direitos_Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AtendimentoM getAtendimento_Id() {
        return Atendimento_Id;
    }

    public void setAtendimento_Id(AtendimentoM Atendimento_Id) {
        this.Atendimento_Id = Atendimento_Id;
    }

    public DireitosM getDireitos_Id() {
        return Direitos_Id;
    }

    public void setDireitos_Id(DireitosM Direitos_Id) {
        this.Direitos_Id = Direitos_Id;
    }

    
}
