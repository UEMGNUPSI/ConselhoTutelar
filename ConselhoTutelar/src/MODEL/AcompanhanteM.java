package MODEL;

public class AcompanhanteM {
    
    private int Id;
    private String Nome;
    private String Telefone;
    private String Celular;
    private String Endereco;
    private String Numero;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private AtendimentoM Atendimento_Id;

    public AcompanhanteM(int Id, String Nome, String Telefone, String Celular, String Endereco, String Numero, String Bairro, String Cidade, String Estado, AtendimentoM Atendimento_Id) {
        this.Id = Id;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Atendimento_Id = Atendimento_Id;
    }

    public AcompanhanteM() {
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

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public AtendimentoM getAtendimento_Id() {
        return Atendimento_Id;
    }

    public void setAtendimento_Id(AtendimentoM Atendimento_Id) {
        this.Atendimento_Id = Atendimento_Id;
    }

    
    
    
}
