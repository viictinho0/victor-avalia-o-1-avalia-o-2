import java.util.Scanner;

public class avaliacaodoisvictor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //solicita a temperatura em celsius
       System.out.print("Digite a temperatura em celsius(ºC):");
       double celsius = entrada.nextDouble();

       //converta para Fahrenheit e kelvin
        double fahrenheit=(celsius*9/5)+32;
        double kelvin=celsius+273.15;

        //Exibe os resultados
        System.out.println(" Temperatura em celsius" + celsius + "°c");
        System.out.println(" Temperatura em fahrenheit:" + fahrenheit + "°f");
        System.out.println(" Temperatura em kelvin:" + kelvin + "°k");






    }
}