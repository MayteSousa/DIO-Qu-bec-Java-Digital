/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiobanco;

/**
 *
 * @author Mayte
 */
public class DesafioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   	Cliente mayte = new Cliente();
	mayte.setNome("Mayte");
	
	Conta cc = new ContaCorrente(mayte);
	Conta poupanca = new ContaPoupanca(mayte);

	cc.depositar(1000);
	cc.transferir(1000, poupanca);
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
    }
    
}
