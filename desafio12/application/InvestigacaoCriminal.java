package desafio.desafio12.application;

import desafio.desafio12.entities.Interrogatorio;

public class InvestigacaoCriminal {
    public static void main(String[] args) {
        Interrogatorio interrogatorio = new Interrogatorio();

        System.out.println("-----------INVESTIGAÇÃO-----------");
        System.out.println("Responda sim ou não");
        System.out.println();

        interrogatorio.fazerPerguntas();
        interrogatorio.classificacaoParticipacao();
    }
}
