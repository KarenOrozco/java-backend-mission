package semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        show();
    }

    // Método con nivel de acceso PUBLIC, tipo ESTÁTICO, valor de retorno VACIO y nombre del método SHOW
    public static void show(){
        // Declaración
        Bicicleta biciMountain = new Bicicleta();
        Bicicleta biciPista = new Bicicleta("Blanco");

        // Inicialización
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);

        String msg = "Soy una bici de montaña con estas características: ";
        msg += "\nColor " + biciMountain.getColor();
        msg += "\nVelocidad " + biciMountain.getVelocidad();
        msg += "\nPines " + biciMountain.getPins();
        msg += "\nRodada " + biciMountain.getRodada();

        System.out.print(msg);
    }

}
