package Exercicios_Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        /*
        Dados os modelos dos carros e seu respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14,4 km/l
        modelo = uno - consumo = 15,6 km/l
        modelo = mobi - consumo = 16,1 km/l
        modelo = hb20 - consumo = 14,5 km/l
        modelo = kwid - consumo = 15,6 km/l
        */


        System.out.println("Crie um dicionario que relacione os modeloes e seus respectivos consumos ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substituia o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: "
                + carrosPopulares.containsKey("tucson"));

        System.out.println("Confira se o modelo tucson está no dicionário: "
                + carrosPopulares.containsKey("uno"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

       // System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double menorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMenorConsumo = "";

        for (Map.Entry<String, Double> entry: entries ) {
            if(entry.getValue().equals(menorConsumo))
                modeloMenorConsumo =entry.getKey();
            
        }
        System.out.println("Modelo mais economico: " +modeloMenorConsumo + " -- " + menorConsumo);



        System.out.println("Exiba o modelo menos economico e seu consumo: ");

        Double maiorConsumo = Collections.min(carrosPopulares.values());
        String ModeloMaiorConsumo = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(maiorConsumo))
                ModeloMaiorConsumo = entry.getKey();

        }
        System.out.println("Modelo menos economico: " +ModeloMaiorConsumo + " -- " + maiorConsumo);


        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator =  carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " +soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: "
                + (soma/carrosPopulares.size()));


        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 =  carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba  o dicionário ordenado pelo modelo:  ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o conjunto de carros:  ");
        carrosPopulares.clear();

        System.out.println("Confira se a lista está vazia:  " +
                carrosPopulares.isEmpty());



    }
}
