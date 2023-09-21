package POO;
public class Produto {
	int codigo;
	String nome;
	int quantidade;
	double preco;
	//Definição de métodos da classe Produto
	public void mostraPreco()
	{
		System.out.println(preco);
	}
	public void atualizaPreco(double porc) {
		preco = preco + preco * porc / 100;
	}
}
