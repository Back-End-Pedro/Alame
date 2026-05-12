package com.senai.alame.arduino.services

import com.senai.alame.arduino.models.Alarme;
import com.senai.alame.arduino.repositories.AlarmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeService {

    @Autowired
    private AlarmeRepository repository;

    public Alarme salvar(Alarme alarme) {

        float temperatura = alarme.getTemperatura();

        // Temperatura crítica
        if (temperatura > 35 || temperatura < 15) {

            alarme.setCorLed("VERMELHO");
            alarme.setBuzzerLigado(true);
            alarme.setFrequenciaBuzzer(2000);
            alarme.setStatusAlarme("CRITICO");

        }

        // Temperatura de atenção
        else if (temperatura > 30 || temperatura < 20) {

            alarme.setCorLed("AZUL");
            alarme.setBuzzerLigado(true);
            alarme.setFrequenciaBuzzer(1000);
            alarme.setStatusAlarme("ATENCAO");

        }

        // Temperatura normal
        else {

            alarme.setCorLed("VERDE");
            alarme.setBuzzerLigado(false);
            alarme.setFrequenciaBuzzer(0);
            alarme.setStatusAlarme("NORMAL");
        }

        return repository.save(alarme);
    }

    public List<Alarme> listar() {
        return repository.findAll();
    }
}