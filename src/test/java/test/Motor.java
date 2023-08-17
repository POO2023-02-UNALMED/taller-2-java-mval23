package src.test;

public class Motor {
    public int numeroCilinrdos;
    public String tipo;
    public int registro;

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipoMotor) {
        switch (tipoMotor) {
            case 1: tipoMotor = "electrico"
                this.tipo = "electrico";
            case 2: tipoMotor = "gasolina"
                this.tipo = "gasolina";
        }
    }

}
