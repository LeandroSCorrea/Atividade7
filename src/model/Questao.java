package model;

public class Questao {
    public int numero;
    public String pergunta;
    public boolean resposta;
    public String comentario;

    public Questao(int numero, String pergunta, boolean resposta, String comentario) {
        this.numero = numero;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.comentario = comentario;
    }

     
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public boolean getResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
        
}