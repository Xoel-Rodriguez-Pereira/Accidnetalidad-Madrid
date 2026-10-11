package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.example.model.Accidente;

public class Solucion2 {
    public Stream<Map.Entry<String,List<Accidente>>> accidentesAgrupadosSexo(List<Accidente> accidentes) {
        return accidentes.stream()
            .collect(Collectors.groupingBy(Accidente::getSexo))
            .entrySet().stream();
    }

    public void mostrarResultado(Stream<Map.Entry<String,List<Accidente>>> entradas) {
        entradas.forEach(e -> System.out.println("Accidentes con sexo "+ e.getKey() +" involucrado: " + e.getValue().size()));
    }
}