package newpackage;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descri��o do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descri��o do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descri��o da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        
        dev1.progredir(curso1);
        dev1.progredir(mentoria);
        
        System.out.println("---");
        System.out.println("Conte�dos Conclu�dos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conte�dos Inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP Total de " + dev1.getNome() + ": " + dev1.calcularTotalXp());

        System.out.println("==========================================");

        Dev dev2 = new Dev();
        dev2.setNome("Jo�o");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        
        dev2.progredir(curso2);
        
        System.out.println("---");
        System.out.println("Conte�dos Conclu�dos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("Conte�dos Inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP Total de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
    }
}
