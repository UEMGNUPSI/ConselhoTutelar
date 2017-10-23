
package MODEL;


public class AtendimentoM {
    
    private int Id;
    private String Data;
    private String RelatoResumido;
    private int Requerente_id;

    public AtendimentoM(int Id, String Data, String RelatoResumido, int Requerente_id) {
        this.Id = Id;
        this.Data = Data;
        this.RelatoResumido = RelatoResumido;
        this.Requerente_id = Requerente_id;
    }

    public AtendimentoM() {
    }
    
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getRelatoResumido() {
        return RelatoResumido;
    }

    public void setRelatoResumido(String RelatoResumido) {
        this.RelatoResumido = RelatoResumido;
    }

    public int getRequerente_id() {
        return Requerente_id;
    }

    public void setRequerente_id(int Requerente_id) {
        this.Requerente_id = Requerente_id;
    }
    
    
    
}
