package test;

public class Motor {
    public int numeroCilinrdos;
    public String tipo;
    public int registro;

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipoMotor) {
        if (tipoMotor == "electrico") {
            this.tipo = "electrico";
        } else if (tipoMotor == "gasolina") {
            this.tipo = "gasolina";
        }
    }

}
