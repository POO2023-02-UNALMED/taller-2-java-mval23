package src.test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
        switch (color) {
            case "rojo" -> this.color = "rojo";
            case "verde" -> this.color = "verde";
            case "amarillo" -> this.color = "amarillo";
            case "negro" -> this.color = "negro";
            case "blanco" -> this.color = "blanco";
        }
    }

}
