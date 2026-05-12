package com.senai.alame.arduino.models;

import jakarta.persistence.*;

@Entity
public class Alarme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float temperatura;
    private float umidade;

    private String corLed;

    private boolean buzzerLigado;

    private int frequenciaBuzzer;

    private String statusAlarme;

    public Alarme() {
    }

    public Long getId() {
        return id;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public String getCorLed() {
        return corLed;
    }

    public void setCorLed(String corLed) {
        this.corLed = corLed;
    }

    public boolean isBuzzerLigado() {
        return buzzerLigado;
    }

    public void setBuzzerLigado(boolean buzzerLigado) {
        this.buzzerLigado = buzzerLigado;
    }

    public int getFrequenciaBuzzer() {
        return frequenciaBuzzer;
    }

    public void setFrequenciaBuzzer(int frequenciaBuzzer) {
        this.frequenciaBuzzer = frequenciaBuzzer;
    }

    public String getStatusAlarme() {
        return statusAlarme;
    }

    public void setStatusAlarme(String statusAlarme) {
        this.statusAlarme = statusAlarme;
    }
}