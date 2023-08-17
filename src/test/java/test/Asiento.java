package src.test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
        switch (color) {
            case 1:
                color = "rojo";
                this.color = "rojo";
                break;
            case 2:
                color = "verde";
                this.color = "verde";
                break;
            case 3:
                color = "amarillo";
                this.color = "amarillo";
                break;
            case 4:
                color = "negro";
                this.color = "negro";
                break;
            case 5:
                color = "blanco";
                this.color = "blanco";
                break;
            default:
                break;
        }
    }

}

