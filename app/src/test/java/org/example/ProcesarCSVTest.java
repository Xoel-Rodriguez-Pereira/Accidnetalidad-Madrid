package org.example;

import org.example.model.Accidente;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProcesarCSVTest {
    @Test public void crearAccidenteTest() {

        String linea = "2025S000056;01/01/2025;0:49:00;CALL. LOPEZ DE HOYOS / CALL. ROS DE OLANO;140;5;CHAMARTÍN;Colisión fronto-lateral;Despejado;Ciclomotor;Conductor;De 30 a 34 años;Hombre;7;Asistencia sanitaria sólo en el lugar del accidente;442966;4477385;N;";
        ProcesarCSV p = new ProcesarCSV();
        Accidente accidente = p.crearAccidente(linea);

        assertEquals(accidente.getNumExpediente(), "2025S000056");
    }
}
