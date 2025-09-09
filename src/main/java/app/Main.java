package app;  // Lembrando que o nome da classe deve ser exatamente igual o do arquivo e com letra incial maiúscula

import.java.time.LocalDate;
import.java.time.Month;

public class Main {
    public static void main(String[] args) {
        Tarefa[] tarefas = new Tarefa[5];
        Compromisso[] compromissos = new Compromisso[5];

        tarefas[0] = new Tarefa(0, "Teste", false);
        tarefas[4] = new Tarefa(4, "Novo Teste", false);
        
        compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");


        System.out.println(tarefas[0].getDescricao());

        System.out.println("Funciona!");

        PessoaFisica pf= new PessoaFisica(
            "Marco",
            "Rua Sem Nome, 0",
            LocalData.of(1980, Month.March, 29),
            "123456777");

        System.out.println(pf.exibirInformacoes());

            PessoaJuridica pj = new PessoaJuridica(
                "Fatec",
                "Av. Shunji Nishimura", 
                "Fatec Pompéia",
                "123434/0001-25");
            
        System.out.println(pj.exibirInformacoes());
    }
}