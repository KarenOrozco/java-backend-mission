package semana1;

// Clase pura
public class Bicicleta {

    // Hay un constructor vacío por defecto (para inicializar)

    Bicicleta(){}

    public Bicicleta(String color){
        this.color = color;
    }

    // Características - campos - propiedades del objeto
    public int pins, rodada;
    public double velocidad;
    public String color;

    // Getters
    public int getPins(){  return pins;  }
    public int getRodada(){  return rodada;  }
    public double getVelocidad(){  return velocidad;  }
    public String getColor(){  return color;  }

    // Setters
    public boolean setRodada(int rodada){
        if(rodada > 0) {
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }

    //
    public String pintState(){
        return "pins " + pins + "\n" +
                "rodada" + rodada + "\n" +
                "velocidad" + velocidad + "\n" +
                "color" + color;
    }

}
