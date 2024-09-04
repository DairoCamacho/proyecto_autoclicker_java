package com.example;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Intervalo entre clics en milisegundos (ajustable)
        int intervalo = 1000;
        // Cantidad de clics (ajustable)
        int cantidadClics = 10;

        try {
            Robot robot = new Robot();

            Point posicion = MouseInfo.getPointerInfo().getLocation();

            for (int i = 0; i < cantidadClics; i++) {
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                System.out.println("Clic número: " + (i + 1));
                TimeUnit.MILLISECONDS.sleep(intervalo);
            }

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}