package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.example.model.Accidente;

public class Solucion3 {
    public Stream<Map.Entry<String,List<Accidente>>> accidentesAgrupadosFecha(List<Accidente> accidentes) {
        return accidentes.stream()
            .collect(Collectors.groupingBy(Accidente::getFecha))
            .entrySet().stream();
    }

    public void mostrarResultado(Stream<Map.Entry<String,List<Accidente>>> entradas) {
        entradas.forEach(e -> System.out.println("Accidentes el "+ e.getKey() +": " + e.getValue().size()));
    }
}
