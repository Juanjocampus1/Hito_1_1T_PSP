package com.empresa.Actividad2;

import java.time.LocalDateTime;

public class ProductorExamenes implements Runnable {
    private BufferExamenes buffer;
    private static int numeroExamen = 0;
    private Thread hilo;

    public ProductorExamenes(BufferExamenes buffer) {
        this.buffer = buffer;
        numeroExamen++;
        this.hilo = new Thread(this, "E" + numeroExamen);
        this.hilo.start();
    }

    @Override
    public void run() {
        int aa = LocalDateTime.now().getYear();
        String codigo = this.hilo.getName() + "-" + aa;
        buffer.fabricarNuevoExamen(codigo);
        System.out.println("Producido examen " + codigo);
    }
}