package POO;
public class UsaProduto {
	public static void main(String[] args) {
		//Declaração dos objetos A, B e C da classe Produto
		Produto A, B, C;
		//Instanciamos os objetos A, B e C como novas instâncias
		//da classe Produto
		A = new Produto();
		B = new Produto();
		C = new Produto();
		System.out.println(A.codigo + " " + A.nome + " ");
		System.out.println(A.quantidade + " " + A.preco);
		A.codigo = 10;
		A.nome = "Sabonete";
		A.quantidade = 5;
		A.preco = 5.45; 
		System.out.println(A.codigo + " " + A.nome + " ");
		System.out.println(A.quantidade + " " + A.preco);
		B.codigo = 11;
		B.nome = "Detergente";
		B.quantidade = 15;
		B.preco = 2.56;
		System.out.println(B.codigo + " " + B.nome + " ");
		System.out.println(B.quantidade + " " + B.preco);
		C.codigo = 12;
		C.nome = "Shampoo";
		C.quantidade = 13;
		C.preco = 32.54;
		System.out.println(C.codigo + " " + C.nome + " ");
		System.out.println(C.quantidade + " " + C.preco);
	}

}
