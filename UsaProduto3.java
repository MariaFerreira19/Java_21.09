package POO;
public class UsaProduto3 {
public static void main(String[] args) {
	Produto  A,B,C; 
	A = new Produto();
	B = new Produto();
	C = new Produto();
	A.codigo = 10;
	A.nome = "Sabonete";
	A.quantidade = 5;
	A.preco = 6.76;
	System.out.println(A.codigo + " " + A.nome + " ");
	System.out.println(A.quantidade + " " + A.preco);
	A.mostraPreco();
	//Aumento de 12%
	A.atualizaPreco(12);
	A.mostraPreco();
	B.codigo = 11;
	B.nome = "Shampoo";
	B.quantidade = 16;
	B.preco = 27.45;
	System.out.println(B.codigo + " " + B.nome + " ");
	System.out.println(B.quantidade + " " + B.preco);
	B.mostraPreco();
	//Desconto de 16.5%
	B.atualizaPreco(-16.5);
	B.mostraPreco();
	}

}
