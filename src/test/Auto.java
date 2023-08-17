package src.test;

import java.lang.reflect.Array;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos() {
        int cantidad_asientos = 0;

        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                ++cantidad_asientos;
            }
        }
        return cantidad_asientos;
    }
    public String verificarIntegridad() {
        int registroAuto = this.registro;
        int registroMotor = this.motor.registro;

        for (Asiento asiento : this.asientos) {
            if (asiento != null && asiento.registro != registroAuto) {
                return "Las piezas no son originales";
            }
        }

        if (registroMotor != registroAuto) {
            return "Las piezas no son originales";
        }

        return "Auto original";
    }
}
