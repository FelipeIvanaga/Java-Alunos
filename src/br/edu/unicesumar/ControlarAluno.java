/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.Aluno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class ControlarAluno {
    
    Scanner scan = new Scanner(System.in);
    static int codigo=1;
    
    private ArrayList<Aluno> lista;
    
    public ControlarAluno(){
        lista = new ArrayList<Aluno>();
    }

    public void inserir(Aluno a){
        
        lista.add(a);
        System.out.println("----------------------");
 
    }
    
    public void listar(){
        if(lista != null && lista.size()>0){
            for(Aluno a : lista){
                System.out.println("Nome: " + a.getNome() + "   RA: " + a.getRa());
            }
        }else
            System.out.println("Lista Vazia");
        System.out.println("----------------------");
    }
    
    public void pesquisar(int cpf){
        Boolean teste = false;
        for(Aluno a : lista){
            if(a.getCpf() == cpf){
                System.out.println("RA: " + a.getRa());
                System.out.println("Nome: " + a.getNome());
                System.out.println("Email: " + a.getEmail());
                System.out.println("Telefone: " + a.getTelefone());
                System.out.println("Status: " + a.getStatus());
                System.out.println("Data de nascimento: " + a.getDataNascimento());
                teste = true;
            }
        }
        
        if(teste == false){
            System.out.println("Aluno não encontrado");
        }
        System.out.println("----------------------");
    }
    
    public void excluir(int ra){
        Boolean teste = false;
        Iterator<Aluno> it = lista.iterator();
        
        while(it.hasNext()){
            if(it.next().getRa() == ra){
                it.remove();
                teste = true;
            }
        }
        if(teste == true){
            System.out.println("Aluno excluido com sucesso");
        }else{
            System.out.println("Aluno não encontrado");
        }
        System.out.println("----------------------");

    }
    
    public void alterar(int ra){
        for(Aluno a : lista){
            if(a.getRa() == ra){
                String opcao = "n";
                
                System.out.println("Nome: " + a.getNome());
                System.out.print("Deseja alterar o nome (s ou n): ");
                opcao = scan.next();
                if(opcao.equals("s")){
                    System.out.print("Novo nome: ");
                    String nome = scan.next();
                    a.setNome(nome);
                }
                System.out.println("");
                
                System.out.println("CPF: " + a.getCpf());
                System.out.print("Deseja alterar o CPF (s ou n): ");
                opcao = scan.next();
                if(opcao.equals("s")){
                    System.out.print("Novo cpf: ");
                    int cpf = scan.nextInt();
                    a.setCpf(cpf);
                }
                System.out.println("");

                System.out.println("Email: " + a.getEmail());
                System.out.print("Deseja alterar o email (s ou n): ");
                opcao = scan.next();
                if(opcao.equals("s")){
                    System.out.print("Novo email: ");
                    String email = scan.next();
                    a.setEmail(email);
                }
                System.out.println("");

                System.out.println("Telefone: " + a.getTelefone());
                System.out.print("Deseja alterar o telefone (s ou n): ");
                opcao = scan.next();
                if(opcao.equals("s")){
                    System.out.print("Novo telefone: ");
                    int telefone = scan.nextInt();
                    a.setTelefone(telefone);
                }
                System.out.println("");

                System.out.println("Status: " + a.getStatus());
                System.out.print("Deseja alterar o status (s ou n): ");
                opcao = scan.next();
                if(opcao.equals("s")){
                    System.out.print("Novo status: ");
                    int status = scan.nextInt();
                    a.setStatus(status);
                }
                System.out.println("");

                System.out.println("Data de nascimento: " + a.getDataNascimento());
                System.out.print("Deseja alterar a Data de Nascimento (s ou n): ");
                opcao = scan.next();
                if(opcao.equals("s")){
                    System.out.print("Nova data de nascimento : ");
                    int dataNascimento = scan.nextInt();
                    a.setDataNascimento(dataNascimento);
                }
                System.out.println("Alteração finalizada");
                System.out.println("----------------------");
                
            }
        }
    }
    
    
}
