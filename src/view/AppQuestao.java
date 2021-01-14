package view;

import javax.swing.JOptionPane;
import model.Questao;

public class AppQuestao {

    public static void main(String[] args) {
        
        Questao qt1 = new Questao(1, "O método utilizado para inicializar objetos"
               + " de uma classe quando estes são criados é denominado "
               + "construtor", true, "", 0, 0);
            
        JOptionPane jp = new JOptionPane();
        
        //Inicializada com zero, porque jp.showConfirm.. retorna valor inteiro
        int compResposta;// = 0; 
        compResposta = jp.showConfirmDialog(jp,"Questão " +qt1.getNumero()+ " - " +qt1.getPergunta()+ "\n",
                "Caderno de questões", JOptionPane.YES_NO_OPTION);
                
        if (compResposta == 0) {
            jp.showMessageDialog(jp,"Resposta certa!" + qt1.getComentario());
        } else {
            jp.showMessageDialog(jp,"Resposta errada!\n" + qt1.getComentario());
        }
        
        
        Questao qt2 = new Questao(2, "No enfoque de orientação a objetos,"
                + " um procedimento de chamada dentro de um objeto é um método"
                , false, "É uma operação.", 0, 0);
        
        compResposta = jp.showConfirmDialog(jp,"Questão " +qt2.getNumero()+ " - " +qt2.getPergunta()+ "\n",
                "Caderno de questões", JOptionPane.YES_NO_OPTION);
                
        if (compResposta == 1) {
            jp.showMessageDialog(jp,"Resposta certa!\n" + qt2.getComentario());
        } else {
            jp.showMessageDialog(jp,"Resposta errada!" + qt2.getComentario());
        }
    
        Questao qt3 = new Questao(3, "Na orientação a objetos, o desenvolvimento"
                + " de sistemas baseia-se, de forma completa, nos conceitos de"
                + " classe, objeto e atributos.", false, "Questão falsa! Objeto,"
                + " estado e estímulo.", 0, 0);
        
        compResposta = jp.showConfirmDialog(jp,"Questão " +qt3.getNumero()+ " - " +qt3.getPergunta()+ "\n",
                "Caderno de questões", JOptionPane.YES_NO_OPTION);
                
        if (compResposta == 1) {
            jp.showMessageDialog(jp,"Resposta certa!\n" + qt3.getComentario());
        } else {
            jp.showMessageDialog(jp,"Resposta errada!" + qt3.getComentario());
        }
        
        Questao qt4 = new Questao(4, "Na orientação a objetos, em uma relação de"
                + " herança entre classes, a subclasse herda da superclasse"
                + " todas as variáveis de instância e os métodos, entretanto,"
                + " podem explicitamente sobrescrever alguns destes componentes.",
                true, "Questão certa! No relacionamento hierárquico de herança,"
                + " a subclasse herda de sua superclasse todas as variáveis e "
                + "métodos de instância que não possuam visibilidade private."
                + "A sobrescrição é uma característica de linguagens orientadas "
                + "a objeto que tem por objetivo especializar um comportamento "
                + "comum que fora definido na superclasse.", 0, 0);
        
        compResposta = jp.showConfirmDialog(jp,"Questão " +qt4.getNumero()+ " - " +qt4.getPergunta()+ "\n",
                "Caderno de questões", JOptionPane.YES_NO_OPTION);
                
        if (compResposta == 0) {
            jp.showMessageDialog(jp,"Resposta certa!" + qt4.getComentario());
        } else {
            jp.showMessageDialog(jp,"Resposta errada!\n" + qt4.getComentario());
        }
        
        Questao qt5 = new Questao(5, "Um construtor, responsável pela alocação"
                + " de recursos necessários, é um método chamado para criação "
                + "de uma nova instância do objeto.", true, null, 0, 0);
        compResposta = jp.showConfirmDialog(jp,"Questão " +qt5.getNumero()+ " - " +qt5.getPergunta()+ "\n",
                "Caderno de questões", JOptionPane.YES_NO_OPTION);
                
        if (compResposta == 0) {
            jp.showMessageDialog(jp,"Resposta certa!" + qt5.getComentario());
        } else {
            jp.showMessageDialog(jp,"Resposta errada!\n" + qt5.getComentario());
        }
    }
}
