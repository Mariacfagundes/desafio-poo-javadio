package desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso bem didático e passo a passo para quem está iniciando na linguagem Java");
        cursoJava.setCargaHoraria(6);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uma das maiores ferramentas do Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoriaTransicao = new Mentoria();
        mentoriaTransicao.setTitulo("Mentoria para transição de carreira");
        mentoriaTransicao.setDescricao("Aprenda todos os passos para fazer uma transição de carreira de forma simples");
        mentoriaTransicao.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria - Mercado Java");
        mentoriaMercadoJava.setDescricao("Saiba como ser contratado usando Java");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaDeveloper = new Bootcamp();
        bootcampJavaDeveloper.setNome("Bootcamp Java Developer");
        bootcampJavaDeveloper.setDescricao("Neste Bootcamp aprenda tudo sobre Java");
        bootcampJavaDeveloper.getConteudos().add(cursoJava);
        bootcampJavaDeveloper.getConteudos().add(cursoSpringBoot);
        bootcampJavaDeveloper.getConteudos().add(mentoriaTransicao);
        bootcampJavaDeveloper.getConteudos().add(mentoriaMercadoJava);

        System.out.println("---------------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcampJavaDeveloper);
        System.out.println("Conteúdos Inscritos Arthur: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Arthur: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Arthur: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devMel= new Dev();
        devMel.setNome("Mel");
        devMel.inscreverBootcamp(bootcampJavaDeveloper);
        System.out.println("Conteúdos Inscritos Mel: " + devMel.getConteudosInscritos());
        devMel.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Mel: " + devMel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mel: " + devMel.getConteudosConcluidos());
        System.out.println("XP: " + devMel.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devJhoana = new Dev();
        devJhoana.setNome("Jhoana");
        devJhoana.inscreverBootcamp(bootcampJavaDeveloper);
        System.out.println("Conteúdos Inscritos Jhoana: " + devJhoana.getConteudosInscritos());
        devJhoana.progredir();
        devJhoana.progredir();
        devJhoana.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Jhoana: " + devJhoana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jhoana: " + devJhoana.getConteudosConcluidos());
        System.out.println("XP: " + devJhoana.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }
}



