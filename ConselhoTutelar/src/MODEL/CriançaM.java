
package MODEL;


public class CriançaM {
    
    private int Id;
    private String Nome;
    private String DataNascimento;
    private String Endereco;
    private String Numero;
    private String Bairro;
    private String Telefone;
    private AtendimentoM Atendimento_Id;

    public CriançaM(int Id, String Nome, String DataNascimento, String Endereco, String Numero, String Bairro, String Telefone, AtendimentoM Atendimento_Id) {
        this.Id = Id;
        this.Nome = Nome;
        this.DataNascimento = DataNascimento;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Telefone = Telefone;
        this.Atendimento_Id = Atendimento_Id;
    }

    public CriançaM() {
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

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
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

    public AtendimentoM getAtendimento_Id() {
        return Atendimento_Id;
    }

    public void setAtendimento_Id(AtendimentoM Atendimento_Id) {
        this.Atendimento_Id = Atendimento_Id;
    }
    
    
    
    
}
