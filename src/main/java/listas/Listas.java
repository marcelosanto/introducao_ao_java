package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public  static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Marcelo");
        list.add("Alice");
        list.add("Mamae");
        list.add("Papai");
        list.add(2, "Biel");

        //Tamanho da lista
        System.out.println(list.size());

        //Remover usando a posição ou o dado da string
        //list.remove(3);

        for (String dado: list) {
            System.out.println(dado);
        }
        System.out.println("------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        for (String dado: list) {
            System.out.println(dado);
        }
        System.out.println("------------");

        System.out.println("Index of Alice: " + list.indexOf("Alice"));
        System.out.println("Index of Maquerle: " + list.indexOf("Maquerle"));
        System.out.println("------------");

        //Filtrar nomes
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String dado: result) {
            System.out.println(dado);
        }
        System.out.println("------------");

        //Pegar o primeiro nome com derterminada letra
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);
    }
}
