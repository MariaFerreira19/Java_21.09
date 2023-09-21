package POO;
public class UsaProduto2 {
	public static void main(String[] args) {
		Produto A, B, C;
		A = new Produto();
		B = new Produto();
		C = new Produto();
		A.codigo = 1;
		System.out.println("Valor de código em A: " + A.codigo);
		//Como as variáveis de objetos são estaticas, por definição,
		//todos os objetos "enxergam" o mesmo valor
		System.out.println("Valor de código em B: " + B.codigo);
		B.codigo = 2;
		System.out.println("Valor de código em B: " + A.codigo);
		System.out.println("Valor de código em B: " + B.codigo);
		//Como as variáveis de objetos são estaticas, por definição,
		//todos os objetos "enxergam" o mesmo valor
		System.out.println("Valor de código em C: " + C.codigo);
	}

}
