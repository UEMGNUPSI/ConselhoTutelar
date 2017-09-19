
package MODEL;


public class ConselheiroM {
    
    private int Id;
    private String Nome;
    private String Telefone;
    private String Celular;
    private String Login;
    private String Senha;

    public ConselheiroM() {
    }

    public ConselheiroM(int Id, String Nome, String Telefone, String Celular, String Login, String Senha) {
        this.Id = Id;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Login = Login;
        this.Senha = Senha;
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

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
