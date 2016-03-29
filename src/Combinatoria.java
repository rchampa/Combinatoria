
public class Combinatoria {
	
	public static void main(String[] args){
		
		//int n=3;//3 campos del formulario, con todos de ellos opcionales menos 1
		
		for(int n=3; n<=10; n++){
			posibilidadesFormulario(n);
		}
		
		
	}
	
	
	public static void posibilidadesFormulario(int n){
		int suma = 0;
		
		for(int i=1; i<=n; i++){
			int k;// será la posibilidad de coger k campos del formulario, que como mínimo será 1 de ellos
			k=i;
			suma += variacionSinOrden(n,k);
		}
		
		System.out.println("Para n="+n+" "+suma);
	}
	
	/**
	 * nCk = n!/[(n-k)!*k!]
	 * @param n
	 * @param k
	 * @return
	 */
	public static int variacionSinOrden(int n, int k){
		
		int nFact = factorial(n);
		int n_kFact = factorial(n-k);
		int kFact = factorial(k);
		
		int r = nFact/(n_kFact*kFact);
		
		return r;
	}
	
	
	public static int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
