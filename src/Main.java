//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 35.4;
        double temperaturaFarenheit = (temperaturaEmCelsius * 1.8) + 32;

        /*System.out.println("A temperatura em Farenheit é: " + temperaturaFarenheit);*/

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Farenheit", temperaturaEmCelsius, temperaturaFarenheit);
        System.out.println(mensagem);

        /*converter para int*/
        int temperaturaEmFarenheit = (int) temperaturaFarenheit;
        System.out.println("\n");
        System.out.println("A temperatura em Farenheit inteira é: " + temperaturaEmFarenheit);


    }
}