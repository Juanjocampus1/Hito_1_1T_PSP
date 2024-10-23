package com.empresa.Actividad2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona los nombres de los alumnos como argumentos.");
            return;
        }

        BufferExamenes generador = new BufferExamenes();
        for (String alumno : args) {
            new ProductorExamenes(generador);
            new Examinador(alumno, generador);
        }
    }
}