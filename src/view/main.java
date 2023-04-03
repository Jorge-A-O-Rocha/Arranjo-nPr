package view;
import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaint.Pilha;
import controller.NPRController;

class main {

	public static void main(String[] args) throws Exception {
		NPRController npr = new NPRController();
		
		Pilha p = new Pilha();
		String op = "";
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		npr.insereValor(p, x);
		
		
		op = JOptionPane.showInputDialog(null, "Informe a operação /  *  -  +");
		
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("O outro número número"));
		npr.insereValor(p, y);
		
		System.out.println(npr.npr(p, op));
	}

}
