package org.example.model;


public class Accidente {

    private String cod_distrito, numero, cod_lesividad, coordenada_x_utm, coordenada_y_utm, num_expediente, fecha, hora, 
    localizacion, distrito, rango_edad, sexo, lesividad, tipo_accidente, tipo_persona, estado_meteorológico, tipo_vehiculo, 
    positiva_alcohol_drogas;


    public Accidente(
        String[] datos
    ) {
        this.num_expediente = datos[0];
        this.fecha = datos[1];
        this.hora = datos[2];
        this.localizacion = datos[3];
        this.numero = datos[4];
        this.cod_distrito = datos[5];
        this.distrito = datos[6];
        this.tipo_accidente = datos[7];
        this.estado_meteorológico = datos[8];
        this.tipo_vehiculo = datos[9];
        this.tipo_persona = datos[10];
        this.rango_edad = datos[11];
        this.sexo = datos[12];
        this.cod_lesividad = datos[13];
        this.lesividad = datos[14];
        this.coordenada_x_utm = datos[15];
        this.coordenada_y_utm = datos[16];
        this.positiva_alcohol_drogas = datos[17];
    }

    public String getNumExpediente() {
        return num_expediente;
    }

    public String getPodsitivoDrogas() {
        return positiva_alcohol_drogas;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoAccidente() {
        return tipo_accidente;
    }
}
