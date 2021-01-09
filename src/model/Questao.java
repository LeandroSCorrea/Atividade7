package model;

public class Questao {
    public int numero;
    public String pergunta;
    public boolean resposta;
    public String comentario;
    public int quantidadeDeAcertos;
    public int quantidadeDeErros;

    public Questao(int numero, String pergunta, boolean resposta, String comentario, int quantidadeDeAcertos, int quantidadeDeErros) {
        this.numero = numero;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.comentario = comentario;
        this.quantidadeDeAcertos = quantidadeDeAcertos;
        this.quantidadeDeErros = quantidadeDeErros;
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

    public int getQuantidadeDeAcertos() {
        return quantidadeDeAcertos;
    }

    public void setQuantidadeDeAcertos(int quantidadeDeAcertos) {
//        if (quantidadeDeAcertos == ) {
//            
//            this.quantidadeDeAcertos += quantidadeDeAcertos;
//        }
        this.quantidadeDeAcertos = quantidadeDeAcertos;
    }

    public int getQuantidadeDeErros() {
        return quantidadeDeErros;
    }

    public void setQuantidadeDeErros(int quantidadeDeErros) {
        this.quantidadeDeErros = quantidadeDeErros;
    }

//    @Override
//    public String toString() {
//        return "Questao{" + "numero=" + numero + ", pergunta=" + pergunta +
//               ", resposta=" + resposta + ", comentario=" + comentario +
//               ", quantidadeDeAcertos=" + quantidadeDeAcertos +
//               ", quantidadeDeErros=" + quantidadeDeErros + '}';
//    }
    
}
