package com.centaurosbank.sastc.infrastructure;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneradorIdUnico {

    private static final AtomicInteger contador = new AtomicInteger(1101);

    public static int generarIdUnico() {
        return contador.incrementAndGet();
    }
}
