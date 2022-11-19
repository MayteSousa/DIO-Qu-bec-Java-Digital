/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiobanco;

/**
 *
 * @author Mayte
 */
public interface IConta{ 
        
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);
    
    void imprimirExtrato();
    
}