package org.example.model;


public class Accidente {

    private Integer cod_distrito, numero, cod_lesividad, coordenada_x_utm, coordenada_y_utm;
    private String num_expediente, fecha, hora, localizacion, distrito, rango_edad, sexo, lesividad, tipo_accidente, 
    tipo_persona, estado_meteorológico, tipo_vehiculo, positiva_alcohol, positiva_droga;


    public Accidente(
        String[] datos
    ) {
        this.num_expediente = datos[0];
        this.fecha = datos[1];
        this.hora = datos[2];
        this.localizacion = datos[3];
        this.numero = Integer.parseInt(datos[4]);
        this.cod_distrito = Integer.parseInt(datos[5]);
        this.distrito = datos[6];
        this.tipo_accidente = datos[7];
        this.estado_meteorológico = datos[8];
        this.tipo_vehiculo = datos[9];
        this.tipo_persona = datos[10];
        this.rango_edad = datos[11];
        this.sexo = datos[12];
        this.cod_lesividad = Integer.parseInt(datos[13]);
        this.lesividad = datos[14];
        this.coordenada_x_utm = Integer.parseInt(datos[15]);
        this.coordenada_y_utm = Integer.parseInt(datos[16]);
        this.positiva_alcohol = datos[17];
        this.positiva_droga = datos[18];
    }

    public String getNumExpediente() {
        return num_expediente;
    }
}
