
	public class Fatoriais {
		   public static void main(String[] args) {
		      int n, fatorial;

		      for (n = 1; n <= 10; n++) {
		         fatorial = 1;
		         for (int i = 1; i <= n; i++) {
		            fatorial *= i;
		         }
		         System.out.println("O fatorial de " + n + " é " + fatorial);
		      }
		   }
		}
	

