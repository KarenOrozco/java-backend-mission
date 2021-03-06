package semana1.viernes;

/*
Overload: sobrecarga
Override: redefine
Overwrite: sobreescribe
 */
public class Bike {
    private int velocidad;
    private String color, marca;

    public Bike(){}
    // sobrecarga - overload
    public Bike(String color){
        this.color = color;
    }
    public Bike(String color, int velocidad){
        this.color = color;
        this.velocidad = velocidad;
    }
    public Bike(String color, String marca, int velocidad){
        this.color = color;
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public int getVelocidad(){  return velocidad;  }
    public String getColor(){ return color; }
    public String getMarca(){ return marca;  }

}
