package Q04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseListCollections {
	private List<Integer> numeros = new ArrayList<Integer>();
	public void addNum(int num) {
		numeros.add(num);
	}
	public List ordenaLista(){
		List<Integer> numSorted = numeros;
		numSorted.sort(Collections.reverseOrder());
		return numSorted;
	}
	public static void main(String[] args) {
		ReverseListCollections teste = new ReverseListCollections();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		teste.addNum(numero);
		Scanner teclado2 = new Scanner(System.in);
		System.out.print("Para parar digite n para continuar de um Enter: ");
		String continua = teclado2.nextLine();
		while(!continua.contentEquals("n")) {
			System.out.print("Digite um numero: ");
			numero = teclado.nextInt();
			teste.addNum(numero);
			System.out.print("Digite s para continuar e n para parar: ");
			continua = teclado2.nextLine();
		}
		System.out.println(teste.ordenaLista());
	}
}