package view;

import javax.swing.JOptionPane;
import model.Questao;

public class AppQuestao {

    public static void main(String[] args) {
       Questao qt1 = new Questao(1, "O método utilizado para inicializar objetos"
               + " de uma classe quando estes são criados é denominado "
               + "construtor", true, null, 0, 0);
        
        System.out.println(qt1.getNumero() + "\n" + qt1.getPergunta());
        
        JOptionPane jp = new JOptionPane();
        
        
        boolean compResposta = Boolean.parseBoolean(jp.showInputDialog(qt1.getPergunta()));
        
        
        if (compResposta == qt1.getResposta()) {
            
            jp.showMessageDialog(jp,qt1.getResposta()+qt1.getComentario());
            System.out.println("Resposta certa!");
        } else {
            jp.showMessageDialog(jp,"Resposta errada!");
        }
        
        
        Questao qt2 = new Questao(2, "No enfoque de orientação a objetos,"
                + " um procedimento de chamada dentro de um objeto é um método"
                , false, "falsa! É uma operação.", 0, 0);
        
        Questao qt3 = new Questao(3, "Na orientação a objetos, o desenvolvimento"
                + " de sistemas baseia-se, de forma completa, nos conceitos de"
                + " classe, objeto e atributos.", false, "Questão falsa! Objeto,"
                + " estado e estímulo.", 0, 0);
    
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
        
        Questao qt5 = new Questao(5, "Um construtor, responsável pela alocação"
                + " de recursos necessários, é um método chamado para criação "
                + "de uma nova instância do objeto.", true, null, 0, 0);
    }
}
