/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.Aluno;
import br.edu.unicesumar.ControlarAluno;
import br.edu.unicesumar.AlunoShow;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class AlunoApp {
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int posicao=0;
        String continuar="s";
        int opcao=0;
        AlunoShow show = new AlunoShow();
        
        while(continuar.equals("s")){
            
        
            System.out.println("Sistema de Gerenciamento de aluno:");
            System.out.println("1 - Opcoes");
            opcao = scan.nextInt();
            System.out.println("----------------------");
            switch(opcao){
                case 1:
                    System.out.println("2 - Adicionar aluno");
                    System.out.println("3 - Pesquisar aluno");
                    System.out.println("4 - Alterar aluno");
                    System.out.println("5 - Excluir aluno");
                    System.out.println("6 - Listar alunos");
                    System.out.println("7 - Sair");
                    System.out.println("----------------------");
                    break;
                case 2:
                    show.carregarAluno();
                    break;
                case 3:
                    show.pesquisar();
                    break;
                case 4:
                    show.alterar();
                    break;
                case 5:
                    show.excluir();
                    break;
                case 6:
                    show.listar();
                    break;
                case 7:
                    continuar="n";
                    break;    
                default:
                    System.out.println("Opcao invalida");
            }

        }
        
        
    }
}
