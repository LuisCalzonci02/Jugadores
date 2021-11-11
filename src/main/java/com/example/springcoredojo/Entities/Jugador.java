package com.example.springcoredojo.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("jugadores-config.properties")
public class Jugador {
    @Value("${luis.nombre}")
    private  String nombre;
    @Value("${luis.apellido}")
    private String apellido;
    @Value("${luis.deporte:Futbol}")
    private String deporte;
    @Value("${luis.edad}")
    private int edad;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", deporte='" + deporte + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
