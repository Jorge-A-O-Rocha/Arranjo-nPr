package controller;
import br.edu.fateczl.pilhaint.Pilha;

public class NPRController {

	public NPRController() {
		
	}
	
	Pilha p = new Pilha();
	
	public void insereValor(Pilha p, int valor) {
		p.push(valor);
	}
	
	public int npr(Pilha p, String op) throws Exception {
		
		int v1 = 0;
		int v2 = 0;
		int res = 0;
		
		try {
			switch (op) {
			
			case "+": {
				v1 = p.pop();
				v2 = p.pop();
				res = v1+v2;
				p.push(res);
				break;
			}
			
			case "*": {
				v1 = p.pop();
				v2 = p.pop();
				res = v1*v2;
				p.push(res);
				break;
			}
			
			case "-": {
				v1 = p.pop();
				v2 = p.pop();
				res = v2-v1;
				p.push(res);
				break;
			}
			
			case "/": {
				v1 = p.pop();
				v2 = p.pop();
				res = v2/v1;
				p.push(res);
				break;
			}
			default:
				throw new IllegalArgumentException("Operação não reconhecida: " + op);
			}
			
		} catch (Exception e) {
			System.out.println("Pilha com valores insuficientes");
		}
		
		return res;
	}

}
