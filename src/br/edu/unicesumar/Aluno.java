/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;

/**
 *
 * @author felipe
 */
public class Aluno {
    private int cpf;
    private String nome;
    private int ra;
    private String email;
    private int telefone;
    private int status;
    private int dataNascimento;
    
    
    public Aluno(int cpf, String nome, int ra, String email, int telefone, int status, int dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.ra = ra;
        this.email = email;
        this.telefone = telefone;
        this.status = status;
        this.dataNascimento = dataNascimento;
    }
    
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getRa(){
        return ra;
    }
    public void setRa(int ra){
        this.ra = ra;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
    }
    
    public int getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}
