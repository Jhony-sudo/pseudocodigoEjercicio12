import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        float Altura;
        String Sexo;
        int Edad;
        float PromedioAlt = 0;
        float PromedioAltH = 0;
        float PromedioPar = 0;
        float Promedio = 0;
        float PromedioH = 0;
        float PromedioM = 0;
        do {
            System.out.println("Sexo Masculino M  Femenino F");
            Sexo = n.next();
            System.out.println("Ingrese la edad");
            Edad = n.nextInt();
            System.out.println("Ingrese la altura en cm");
            Altura = n.nextFloat();

            if ("F".equals(Sexo)) {
                PromedioAlt += Altura;
                PromedioPar++;
                Promedio += Edad;
                PromedioH++;

            }
            if ("M".equals(Sexo)) {
                PromedioAltH += Altura;
                PromedioPar++;
                Promedio += Edad;
                PromedioM++;
            }

        }

        while (Altura > 0);
        System.out.println("Promedio de altura de las mujeres " + PromedioAlt / PromedioH);
        System.out.println("Promedio de altura de los varones " + PromedioAltH / PromedioM);
        System.out.println("Promedio de edad de los participantes " + Promedio / PromedioPar);
    }
}
