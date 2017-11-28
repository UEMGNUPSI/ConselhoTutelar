
package MODEL;


public class AtendimentoM {
    
    private int Id;
    private String Data;
    private String RelatoResumido;
    private RequerenteM Requerente_id;
    private ConselheiroM Conselheiro1_id;
    private ConselheiroM Conselheiro2_id;

    public AtendimentoM(int Id, String Data, String RelatoResumido, RequerenteM Requerente_id, ConselheiroM Conselheiro1_id, ConselheiroM Conselheiro2_id) {
        this.Id = Id;
        this.Data = Data;
        this.RelatoResumido = RelatoResumido;
        this.Requerente_id = Requerente_id;
        this.Conselheiro1_id = Conselheiro1_id;
        this.Conselheiro2_id = Conselheiro2_id;
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

    public RequerenteM getRequerente_id() {
        return Requerente_id;
    }

    public void setRequerente_id(RequerenteM Requerente_id) {
        this.Requerente_id = Requerente_id;
    }

    public ConselheiroM getConselheiro1_id() {
        return Conselheiro1_id;
    }

    public void setConselheiro1_id(ConselheiroM Conselheiro1_id) {
        this.Conselheiro1_id = Conselheiro1_id;
    }

    public ConselheiroM getConselheiro2_id() {
        return Conselheiro2_id;
    }

    public void setConselheiro2_id(ConselheiroM Conselheiro2_id) {
        this.Conselheiro2_id = Conselheiro2_id;
    }
    
    
   
  
    
    
}
