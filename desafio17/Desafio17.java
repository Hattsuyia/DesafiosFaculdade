package desafio.desafio17;
//DESAFIO 17
//*[Proposta do Desafio]*
//
//Faça um Programa leia as horas e imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!", conforme o caso.
//Imprima também na tela também, a data atual no formato de exemplo, exemplo: 14 de janeiro de 2000`

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Desafio17 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int horaAtual = localDateTime.getHour();

        String saudacao;
        if (horaAtual > 6 && horaAtual < 12){
            saudacao = "Bom dia";
        } else if (horaAtual >= 12 && horaAtual <18){
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String dataFormatada = localDateTime.format(padraoData);

        System.out.println(saudacao);
        System.out.println("São: " + localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Data atual: "+ dataFormatada);
    }
}
