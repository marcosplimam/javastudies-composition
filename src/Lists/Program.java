package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("Kim");
        myList.add("Carolina ");
        myList.add("Marcella");
        myList.add("Ana");
        myList.add(2, "Megan Fox");

        // Saber o tamanho da lista
        System.out.println("Array size: " + myList.size());

        //Pra cada string x pertecente a minha lista myList, eu vou mandar imprimir na tela o valor de X.
        for (String x : myList) {
            System.out.println(x);
        }

        System.out.println("--------------------------------");
        myList.remove(1);
        //Remover todos elementos de x que tenham a letra 'M' em sua posição 0.
        myList.removeIf(x -> x.charAt(0) == 'M');

        for (String x : myList) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");
        System.out.println("Index of Kim: " + myList.indexOf("Kim")); // Para saber o index da string
        System.out.println("---------------------------------");
        List<String> result = myList.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // converte para stream, realiza a operação lambda, depois converte para lista novamente

    }
}
