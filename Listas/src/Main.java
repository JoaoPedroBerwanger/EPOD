import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void exibirLista(List<String> frutas) {

		System.out.println(frutas);
	}
	
	public static void main(String[] args) {

		List<String> frutas1 = new ArrayList<String>();
		
		frutas1.add("Banana");
		frutas1.add("Laranja");
		frutas1.add("Melancia");
		frutas1.add("Tangerina");
		frutas1.add("Morango");
		frutas1.add("Melancia");

		
		if(frutas1.contains("Melancia"))
			System.out.println(frutas1.indexOf("Melancia"));
			exibirLista(frutas1);
		

	}

}
