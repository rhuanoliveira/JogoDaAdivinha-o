/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaadivinhação;

import javax.swing.JOptionPane;

/**
 *
 * @author Rhuan
 */
public class Operações {
    
    public void NumeroAdivinhado(int resposta,int numeroAleatorio){
        int chute;
        
        int tentativas = 1;
        Object[] opcoes = { "SIM ", "NÃO" };
        Object jogarnovamente =null;
        
         while (jogarnovamente == null || jogarnovamente.equals("não")){
        do{
         chute = Integer.parseInt(JOptionPane.showInputDialog ("Digite algum número entre 0 e "+resposta));
         
         if(chute < 0 || chute > resposta ){
            JOptionPane.showMessageDialog (null, "Digite um número entre 0 e "+resposta
                                           ,"MENSAGEM", JOptionPane.PLAIN_MESSAGE);
            
            JOptionPane.showMessageDialog(null, "Essa foi a sua  "+tentativas+"ª tentativa"
                                          ,"MENSAGEM", JOptionPane.PLAIN_MESSAGE);
            tentativas ++;
        }
         
         else if(chute == numeroAleatorio){
             JOptionPane.showMessageDialog(null,"Parabéns, você acertou!! :D "
                                            ,"MENSAGEM", JOptionPane.PLAIN_MESSAGE);
         }
         else if(chute != numeroAleatorio){
             
             JOptionPane.showMessageDialog(null,"Que pena, o número não é esse!"
                                           + " Essa foi a sua  "+tentativas+"ª tentativa" 
                                           ,"MENSAGEM", JOptionPane.PLAIN_MESSAGE);
             tentativas ++;
                                            
         }
         
        }
         while(tentativas <= 5);
        
        if (tentativas > 5) {
        JOptionPane.showMessageDialog (null, "Seu número de  tentativas acabou :( \n "
                                       + "O número pensado era "+numeroAleatorio+" !"
                                       ,"Mensagem", JOptionPane.PLAIN_MESSAGE);
        
    } 
        jogarnovamente = JOptionPane.showInputDialog(null,
                            "Deseja finalizar o programa?",
                            "Finalização",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcoes,
                            "não");
         }
        }
       }
        
        
    
    

