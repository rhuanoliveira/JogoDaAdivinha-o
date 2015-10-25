/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaadivinhação;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Rhuan
 */
public class JogoDaAdivinhação {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random ();
        
       int numeroAleatorio =0;
        String verificador;
        int resposta=0;
        int jogo=0;
               
        do{
        JOptionPane.showMessageDialog(null, "O jogo a seguir consiste em acertar um número escolhido pela "
                                            + "\n máquina dentre um certo intervalo que ficará à escolha do usuário!",
                                            "MENSAGEM", JOptionPane.PLAIN_MESSAGE);
        verificador = (String) JOptionPane.showInputDialog("Digite o intervalo máximo para o número escolhido");
            if (verificador == null) {
            /*
            * se clicar no botão Cancel, mostrar uma mensagem de Game Over
            * e sair do loop para finalizar o programa
            */
            JOptionPane.showMessageDialog(null,"Que pena!\nVocê desistiu do jogo! :( ");
            jogo = 0;
            }
            
            if (verificador !=null ){
                    resposta = Integer.parseInt(verificador);
                    numeroAleatorio = random.nextInt (resposta);
                    
        }
            Operações op = new Operações();
            op.NumeroAdivinhado(resposta,numeroAleatorio);
                    
        }
        while(jogo == 1);
        
        }
}
        
    

    
        
       
        

