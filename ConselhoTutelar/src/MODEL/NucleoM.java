
package MODEL;

public class NucleoM {
    
    private int Id;
    private String Nome;
    private String Parentesco;
    private String Endereco;
    private String Numero;
    private String Bairro;
    private String Telefone;
    private String Celular;
    private String Responsabilidade;
    private AtendimentoM  Atendimento_Id;

    public NucleoM(int Id, String Nome, String Parentesco, String Endereco, String Numero, String Bairro, String Telefone, String Celular, String Responsabilidade, AtendimentoM Atendimento_Id) {
        this.Id = Id;
        this.Nome = Nome;
        this.Parentesco = Parentesco;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Responsabilidade = Responsabilidade;
        this.Atendimento_Id = Atendimento_Id;
    }

    public NucleoM() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getParentesco() {
        return Parentesco;
    }

    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getResponsabilidade() {
        return Responsabilidade;
    }

    public void setResponsabilidade(String Responsabilidade) {
        this.Responsabilidade = Responsabilidade;
    }

    public AtendimentoM getAtendimento_Id() {
        return Atendimento_Id;
    }

    public void setAtendimento_Id(AtendimentoM Atendimento_Id) {
        this.Atendimento_Id = Atendimento_Id;
    }
    
    
    
    
}
