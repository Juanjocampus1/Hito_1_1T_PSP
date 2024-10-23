package com.empresa.Actividad2;

import java.io.IOException;

public class Lanzador {
    public static void main(String[] args) {

        String classpath = "E:\\deberes\2º DE DAM\\PSP\\Hito_1_juanjose_acebedo_psp\\target\\classes\\com\\empresa\\Actividad2";
        String mainClass = "Main";

        try {
            ProcessBuilder pb1 = new ProcessBuilder("java", "-cp", classpath, mainClass, "Pepe", "Juan", "Luis");
            pb1.redirectOutput(ProcessBuilder.Redirect.to(new java.io.File("examen1.txt")));
            Process p1 = pb1.start();

            ProcessBuilder pb2 = new ProcessBuilder("java", "-cp", classpath, mainClass, "Rosa", "Miguel", "Pedro");
            pb2.redirectOutput(ProcessBuilder.Redirect.to(new java.io.File("examen2.txt")));
            Process p2 = pb2.start();

            p1.waitFor();
            p2.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}