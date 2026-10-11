package org.example;

import java.util.List;
import java.util.stream.Collectors;

import org.example.model.Accidente;

public class Solucion4 {
    public int accidentesAtropelloPersonas(List<Accidente> accidentes) {
        return accidentes.stream()
            .collect(Collectors.groupingBy(Accidente::getTipoAccidente))
            .entrySet().stream()
            .filter(k -> k.getKey().equals("Atropello a persona"))
            .toList().get(0).getValue().size();
    }

    public void mostrarResultado(int cantidad) {
        System.out.println("Accidentes con atropello a personas: " + cantidad);
    }
}
