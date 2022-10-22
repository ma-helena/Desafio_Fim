import java.util.Scanner;
public class ConversaodeTemperaturas {

    private static final double FACTOR1 = (9d / 5.0);
    private static final double FACTOR2 = 32.0;

    private static final double FACTOR3 = 273.15;

    private static final double FACTOR4 = (5d / 9.0);


    private static double celsiusParaFahrenheit(double celsius) {
        return ((celsius * FACTOR1) + FACTOR2);
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return ((fahrenheit - FACTOR2) / FACTOR1);
    }

    private static double celsiusParaKelvin(double celsius) {
        return (celsius + FACTOR3);
    }

    private static double kelvinParaCelsius(double kelvin) {
        return (kelvin - FACTOR3);
    }

    private static double kelvinParaFahrenheit(double kelvin) {
        return ((FACTOR1 * (kelvin - FACTOR3)) + FACTOR2);
    }

    private static double fahrenheitParaKelvin(double fahrenheit) {
        return ((fahrenheit - FACTOR2) * FACTOR4 + FACTOR3);
    }

    public static double somaDasTemperaturas(double[] temperaturas) {
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        return soma;
    }


    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);
        System.out.println("Digite a conversão a ser feita: \n 1 - Celsius Para Kelvin;\n 2 - Fahrenheit para Celsius ;\n 3 -Celsius para Fahrenheit ;\n 4 - Fahrenheit para Kelvin;\n 5 - Kelvin para Celsius;\n 6 - Kelvin para Fahrenheit; ");
        int valor = conversao.nextInt();
        int quantidade;
        double[] temperaturas;
        System.out.print("Digite a quantidade de temperaturas: ");
        quantidade = conversao.nextInt();
        temperaturas = new double[quantidade];
        double converteTempe = 0;
        double[] novaTemperatura;
        novaTemperatura = new double[quantidade];
        double mediaAntiga;
        double mediaConvertida;
        try {
            switch (valor) {
                case 1 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTempe = celsiusParaKelvin(temperaturas[i]);
                        novaTemperatura[i] = converteTempe;
                        System.out.println("A temperatura de " + temperaturas[i] + "°C em Kelvin é : " + converteTempe + "K");
                    }
                    mediaAntiga = somaDasTemperaturas(temperaturas) / quantidade;
                    mediaConvertida = somaDasTemperaturas(novaTemperatura) / quantidade;
                    System.out.println("A média das temperaturas em Celsius é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaConvertida);
                }

                case 2 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTempe = fahrenheitParaCelsius(temperaturas[i]);
                        novaTemperatura[i] = converteTempe;
                        System.out.println("A temperatura de " + temperaturas[i] + "°F em Celsius é : " + converteTempe + "°C");
                    }
                    mediaAntiga = somaDasTemperaturas(temperaturas) / quantidade;
                    mediaConvertida = somaDasTemperaturas(novaTemperatura) / quantidade;
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Celsius é: " + mediaConvertida);
                }
                case 3 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        ;
                        temperaturas[i] = conversao.nextDouble();
                        converteTempe = celsiusParaFahrenheit(temperaturas[i]);
                        novaTemperatura[i] = converteTempe;
                        System.out.println("A temperatura de " + temperaturas[i] + "°C em Fahrenheit é : " + converteTempe + "°F");
                    }
                    mediaAntiga = somaDasTemperaturas(temperaturas) / quantidade;
                    mediaConvertida = somaDasTemperaturas(novaTemperatura) / quantidade;
                    System.out.println("A média das temperaturas em Celsius é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaConvertida);
                }
                case 4 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTempe = fahrenheitParaKelvin(temperaturas[i]);
                        novaTemperatura[i] = converteTempe;
                        System.out.println("A temperatura de " + temperaturas[i] + "°F em Kelvin é : " + converteTempe + "K");
                    }
                    mediaAntiga = somaDasTemperaturas(temperaturas) / quantidade;
                    mediaConvertida = somaDasTemperaturas(novaTemperatura) / quantidade;
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaConvertida);
                }
                case 5 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTempe = kelvinParaCelsius(temperaturas[i]);
                        novaTemperatura[i] = converteTempe;
                        System.out.println("A temperatura de " + temperaturas[i] + "K em Celsius é : " + converteTempe + "°C");
                    }
                    mediaAntiga = somaDasTemperaturas(temperaturas) / quantidade;
                    mediaConvertida = somaDasTemperaturas(novaTemperatura) / quantidade;
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Celsius é: " + mediaConvertida);
                }
                case 6 -> {
                    for (int i = 0; i < quantidade; i++) {

                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTempe = kelvinParaFahrenheit(temperaturas[i]);
                        novaTemperatura[i] = converteTempe;
                        System.out.println("A temperatura de " + temperaturas[i] + "K em Fahrenheit é : " + converteTempe + "°F");
                    }
                    mediaAntiga = somaDasTemperaturas(temperaturas) / quantidade;
                    mediaConvertida = somaDasTemperaturas(novaTemperatura) / quantidade;
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaConvertida);

                }
                default -> System.out.println("Opção inválida, tente novamente:");
            }

        } catch (Exception e) {
            System.out.println("Algo de errado não está certo! Tentar novamente!");
        } finally {
            System.out.println("Finalizando o programa...");
        }


    }
}

