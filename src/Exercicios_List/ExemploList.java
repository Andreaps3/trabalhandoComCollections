package Exercicios_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Dad uma lista com 7 notas de um aluno [7, 8, 9.3, 5, 7, 0, .,6]
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //o método indexOf localiza o objeto
                                                                                    //passando que neste caso foi o 5
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d); //adicionando um número no array. Priemira passa número depois a posição
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0 );
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está nalista: " + notas.contains(5d));
        //o metodo conatins retorna um booleano confirmando ou negando se existe o elemento mencionada(5d)

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas ) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //localizando menor elemento

        System.out.println("Exiba a menor nota: " + Collections.max(notas));//localizando o maior elemento

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        System.out.println("Exiba a soma dos valores: "+ soma);

        System.out.println("Exiba a média das notas: " +(soma/ notas.size())); //size() faz a contagem de elementos

        System.out.println("Remova a nota 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista!");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: "+ notas.isEmpty());


    }
}
