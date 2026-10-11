package org.example;

import java.util.List;
import java.util.stream.Collectors;

import org.example.model.Accidente;

public class Solucion1 {
    public int accidentesDrogasAlcohol(List<Accidente> accidentes) {
        return accidentes.stream()
            .collect(Collectors.groupingBy(Accidente::getPodsitivoDrogas))
            .entrySet().stream()
            .filter(k -> k.getKey().equals("S"))
            .toList().get(0).getValue().size();
    }

    public void mostrarResultado(int cantidad) {
        System.out.println("Accidentes con drogas o alcohol involucrado: " + cantidad);
    }
}