package org.example;

import java.util.List;

import org.example.model.Accidente;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Solucion4Test {
    @Test public void accidentesAtropelloPersonasTest() {

        String linea1 = "2025S000056;01/01/2025;0:49:00;CALL. LOPEZ DE HOYOS / CALL. ROS DE OLANO;140;5;CHAMARTÍN;Colisión fronto-lateral;Despejado;Ciclomotor;Conductor;De 30 a 34 años;Hombre;7;Asistencia sanitaria sólo en el lugar del accidente;442966;4477385;N;";
        String linea2 = "2025S000076;01/01/2025;8:00:00;CALL. MISTERIOS, 8;8;15;CIUDAD LINEAL;Atropello a persona;Despejado;Turismo;Conductor;De 45 a 49 años;Hombre;14;Sin asistencia sanitaria;445740;4476666;S;";
        ProcesarCSV p = new ProcesarCSV();
        Accidente accidente1 = p.crearAccidente(linea1);
        Accidente accidente2 = p.crearAccidente(linea2);
        Solucion4 sol = new Solucion4();

        List<Accidente> accidentes = List.of(accidente1, accidente2);

        assertEquals(1, sol.accidentesAtropelloPersonas(accidentes));
    }
}
