
public class TestaCaracteres {
	
	public static void main (String[] args) {
		char letra = 'a'; // se tentar colocar dois caracteres ou aspas duplas, não compila
		System.out.println(letra); // char é uma variável
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1); // não vai funcionar se colocar = valor + 1
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
		}

}
