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
public class DireitosM {
    
    private int Id;
    private String Numero;
    private String Descricao;
    private String Comentario;

    public DireitosM() {
    }

    public DireitosM(int Id, String Numero, String Descricao, String Comentario) {
        this.Id = Id;
        this.Numero = Numero;
        this.Descricao = Descricao;
        this.Comentario = Comentario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

   
    
}
