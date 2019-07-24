package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgCap5Listas1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Bob");
		list.add("Anna");
		list.add("Carlos");
		list.add("James");
		list.add(2, "Eduardo");
		
		System.out.println("Tamanho Lista: "+list.size());
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		list.removeIf(x -> x.charAt(0) == 'A'); //Remove o item que a primeira letra seja A
		
		System.out.println("Tamanho Lista: "+list.size());
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		list.add("Alex");
		list.add("Jack");
		System.out.println("Index of Eduardo: "+list.indexOf("Eduardo"));
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("Primeiro elemento que inicie com J:" +name);
	}

}
