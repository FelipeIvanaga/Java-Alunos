/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class AlunoShow {
    private ControlarAluno control;
    
    public AlunoShow(){
        control = new ControlarAluno();
    }
    int raCont = 1;
    Scanner scan = new Scanner(System.in);
    
    public void excluir(){
        System.out.print("Digite o ra do aluno a ser excluido: ");
        int ra = scan.nextInt();
        control.excluir(ra);
    }
    
    public void carregarAluno(){
        
        
        System.out.println("Digite as informacoes do aluno.");
        System.out.println("Ra:" + raCont);
        
        System.out.print("Nome: ");
        String nome = scan.next();
        
        System.out.print("Cpf: ");
        int cpf = scan.nextInt();
        
        System.out.print("Email: ");
        String email = scan.next();
                
        System.out.print("Telefone: ");
        int telefone = scan.nextInt();
        
        System.out.print("Status: ");
        int status = scan.nextInt();
        
        System.out.print("Data de Nascimento: ");
        int dataNascimento = scan.nextInt();
        
        Aluno a = new Aluno(cpf,nome,raCont,email,telefone,status,dataNascimento);
        
        control.inserir(a);
        
        raCont ++;
    }
    
    public void listar(){
        System.out.println("Alunos cadastrados");
        System.out.println("");
        control.listar();
    }
    
    public void alterar(){
        System.out.print("Digite o ra do aluno a ser alterado: ");
        int ra = scan.nextInt();
        control.alterar(ra);
    }
    
    public void pesquisar(){
        System.out.print("Digite o cpf a ser pesquisado: ");
        int cpf = scan.nextInt();
        control.pesquisar(cpf);
    }
}
