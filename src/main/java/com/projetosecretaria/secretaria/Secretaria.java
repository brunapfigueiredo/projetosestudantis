/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetosecretaria.secretaria;

/**
 *
 * @author Admin
 */
public class Secretaria {

    public static void main(String[] args) {
        credencial aluno1 = new credencial("Pedro Henrique");
        credencial aluno2 = new credencial("Rafaela Pereira");
        credencial aluno3 = new credencial("Gabriella Gomes");
        
        System.out.println("Nome aluno1 = "+aluno1.nome);
        System.out.println("Nome aluno2 = "+aluno2.nome);
        System.out.println("Nome aluno3 = "+aluno3.nome);
        
        aluno1.modulo = "primeirods";
        aluno2.modulo = "segundods";
        aluno3.modulo = "terceirods";
        
        System.out.println("Módulo "+aluno1.nome+" = "+aluno1.modulo);
        System.out.println("Módulo "+aluno2.nome+" = "+aluno2.modulo);
        System.out.println("Módulo "+aluno3.nome+" = "+aluno3.modulo);
        
        aluno1.aproveitamento = "R";
        aluno2.aproveitamento = "MB";
        aluno3.aproveitamento = "B";
 
        System.out.println("Aproveitamento "+aluno1.nome+" = "+aluno1.aproveitamento);
        System.out.println("Aproveitamento "+aluno2.nome+" = "+aluno2.aproveitamento);
        System.out.println("Aproveitamento "+aluno3.nome+" = "+aluno3.aproveitamento);
        
        System.out.println("Local de matrícula "+aluno1.nome+" = "+aluno1.localdematricula);
        System.out.println("Local de matrícula "+aluno2.nome+" = "+aluno2.localdematricula);
        System.out.println("Local de matrícula "+aluno3.nome+" = "+aluno3.localdematricula);
        
        
        
        
    }
}
