El programa ingresara 30 y retirara dos veces 10. La corrección seria:
```java
public class Ejercicio {
	public static int saldo=0;
	public static void main(String[] args){
		//Esta variable no hace nada.
		//boolean ok = false;
		ingresar(30);
		if (retirar(10)) System.out.println("Saldo final: "+ saldo);
		else System.out.println("No se puede retirar tanto");
	}

	static void ingresar(int i) {
		saldo+=i;
	}

	static boolean retirar(int i) {
		if (i>saldo) return false;
		saldo-=i;
		return true;
	}
}
```