package com.centaurosbank.sastc.application;

import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class VerificadorCredito {

    public boolean vereficacionJudicial(SolicitudTarjeta solicitudTarjeta){

//        try {
//            Thread.sleep(120000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Random random = new Random();
        int randomNum = random.nextInt(100);
        return randomNum < 15;
    }

    public void vereficacionDataCredito(SolicitudTarjeta solicitudTarjeta){

//        try {
//            Thread.sleep(120000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Random random = new Random();
        int randomNum = random.nextInt(100);

        double scoreCrediticio;
        if (randomNum < 70) {
            scoreCrediticio = 75.5 + random.nextDouble() * (100 - 75.5);
        } else if (randomNum < 90) {
            scoreCrediticio = 55 + random.nextDouble() * (75 - 55);
        } else {
            scoreCrediticio = random.nextDouble() * 55;
        }

        solicitudTarjeta.setScoreCrediticio(scoreCrediticio);
    }

    public void vereficacionInterna(SolicitudTarjeta solicitudTarjeta) {

        double scoreCrediticio = solicitudTarjeta.getScoreCrediticio();

        double ingresosMensuales = solicitudTarjeta.getIngresosMensuales();


        if (scoreCrediticio < 55.0 || ingresosMensuales < 1500000) {
            // Si el score es menor a 55.0 o los ingresos mensuales son inferiores a 1500000
            solicitudTarjeta.setAprobado(false);
            solicitudTarjeta.setMontoAprobado(BigDecimal.ZERO);
        } else if ((ingresosMensuales >= 1501000 && ingresosMensuales <= 3000000) ||
                (ingresosMensuales >= 3100000 && ingresosMensuales <= 7000000) ||
                (ingresosMensuales > 7000000 && scoreCrediticio > 54.0)) {
            // Si los ingresos mensuales están en alguno de los rangos especificados y el score es mayor a 54.0
            solicitudTarjeta.setAprobado(true);
            solicitudTarjeta.setMontoAprobado(BigDecimal.valueOf(ingresosMensuales * 3));
        }
    }

}
