package senac.java.Domain;

import java.util.Scanner;
public class Horarios {

    private String horarioEntrada;
    private String horarioSaida;


    private Horarios(String horarioEntrada, String horarioSaida) {
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }


    public static Horarios obterHorariosDoFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o horário de entrada (por exemplo, 09:00): ");
        String horarioEntrada = scanner.nextLine();

        System.out.print("Digite o horário de saída (por exemplo, 18:00): ");
        String horarioSaida = scanner.nextLine();


        return new Horarios(horarioEntrada, horarioSaida);
    }


    public void exibirHorarios() {
        System.out.println("Horário de Entrada: " + horarioEntrada);
        System.out.println("Horário de Saída: " + horarioSaida);
    }

}
