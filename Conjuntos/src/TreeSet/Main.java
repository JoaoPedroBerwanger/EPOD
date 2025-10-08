package TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args){
		
		Set<Pessoa> pessoas = new TreeSet<Pessoa>();
		
		pessoas.add(new Pessoa("João", 26));
		pessoas.add(new Pessoa("Gabrieli", 26));
		pessoas.add(new Pessoa("Paulo", 40));
		pessoas.add(new Pessoa("Fernando", 21));
		
		System.out.println(pessoas);
		
		List<Pessoa> lista = new ArrayList<Pessoa>(pessoas);
		Collections.sort(lista, (p1, p2) -> p1.getIdade().compareTo(p2.getIdade()));
		
		System.out.println(lista);
		
		/*TreeSet<Integer> conjuntoA = new TreeSet<Integer>();
		
		conjuntoA.add(100);
		conjuntoA.add(2);
		conjuntoA.add(20);
		conjuntoA.add(30);
		conjuntoA.add(45);
		conjuntoA.add(40);
		
		System.out.println("A: " + conjuntoA);
		System.out.println(conjuntoA.first());
		System.out.println(conjuntoA.last());
		
		Set<Integer> conjuntoB = new TreeSet<Integer>();
		
		conjuntoB.add(20);
		conjuntoB.add(5);
		conjuntoB.add(60);
		conjuntoB.add(45);
		conjuntoB.add(45);
		
		System.out.println("B: " + conjuntoB);
		
		Set<Integer> conjuntoAdd = new TreeSet<Integer>(conjuntoA);
		Set<Integer> conjuntoRetain = new TreeSet<Integer>(conjuntoA);
		Set<Integer> conjuntoRemove = new TreeSet<Integer>(conjuntoA);
		
		conjuntoAdd.addAll(conjuntoB);
		conjuntoRetain.retainAll(conjuntoB);
		conjuntoRemove.removeAll(conjuntoB);
		
		System.out.println("Add: " + conjuntoAdd);
		System.out.println("Retain: " + conjuntoRetain);
		System.out.println("Remove: " + conjuntoRemove);*/
		
	}
}

