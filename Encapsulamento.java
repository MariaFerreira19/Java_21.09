package POO;
public class Encapsulamento {
	public static void main(String[] args) {
		// Há, algumas vezes, a necessidade de ocultar certos métodos e/ou variáveis numa classe,
		//O encapsulamento ou acessibilidade define o que é e está acessível na classe 
		//e a forma como os elementos componentes da classe podem ser vistos e reutilizados
		//São usados public, private, protected e package.
		Veiculo v1;
		v1 = new Veiculo();
		v1.nome = "Audi";
		System.out.println(v1.nome);
		v1.mostraVelocidade();
		for(int i = 1; i <= 5; i++) {
			v1.acelera();
		}
		v1.mostraVelocidade();
		//System.out.println(v1.velocidade);
		for(int i = 1; i <= 5; i++) {
			v1.frea();
		}
		v1.mostraVelocidade();
	}
}

class Veiculo
{
	String nome;
	private float velocidade;
	public void acelera() {
		if(velocidade <= 10) {
			velocidade += 10;
		}
	}
	void frea() {
		if(velocidade > 0) {
			velocidade--;
		}
	}
	void mostraVelocidade() {
		System.out.println(velocidade);
	}
}
