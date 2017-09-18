/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author NUPSI-07
 */
public class Requerente {
    
        private int Id;
        private String Nome;
        private String Telefone1;
        private String Telefone2;
        private String Celular;
        private String Endereço;
        private String Numero;
        private String Bairro;
        private String Cidade;
        private String Estado;
        private String EstadoCivil;
        private String Observação;

    public Requerente() {
    }

    public Requerente(int Id, String Nome, String Telefone1, String Telefone2, String Celular, String Endereço, String Numero, String Bairro, String Cidade, String Estado, String EstadoCivil, String Observação) {
        this.Id = Id;
        this.Nome = Nome;
        this.Telefone1 = Telefone1;
        this.Telefone2 = Telefone2;
        this.Celular = Celular;
        this.Endereço = Endereço;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.EstadoCivil = EstadoCivil;
        this.Observação = Observação;
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

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1 = Telefone1;
    }

    public String getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String Telefone2) {
        this.Telefone2 = Telefone2;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
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

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getObservação() {
        return Observação;
    }

    public void setObservação(String Observação) {
        this.Observação = Observação;
    }
}
