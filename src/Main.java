import br.com.dio.desafio.dominio.*;
import java.lang.String;
import java.time.LocalDate;


public class Main  {
    static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição de JavaScript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("React");
        curso3.setDescricao("Descrição de React");
        curso3.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTituto("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println(devCamila.getNome());
        System.out.println("Conteudos inscritos de " + devCamila.getNome() + ":" + devCamila.getConteudosInscritos() + "\n");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteudos Concluidos de " + devCamila.getNome() +":" +  devCamila.getConteudosConcluidos() + "\n");
        System.out.println("Conteudos Inscritos de " + devCamila.getNome() +":" + devCamila.getConteudosInscritos() + "\n");
        System.out.println("XP: " +devCamila.calcularTotalXP() + "\n");
       // System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos() + "\n");

        System.out.println("================================+++================================\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println(devJoao.getNome());
        System.out.println("Conteudos inscritos de " + devJoao.getNome() +":" + devJoao.getConteudosInscritos() + "\n");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteudos inscritos de " + devJoao.getNome() +":"  + devJoao.getConteudosInscritos() + "\n");
        System.out.println("================+++=================\n");

        System.out.println("Conteudos Concluidos de " + devJoao.getNome() +":" + devJoao.getConteudosConcluidos() + "\n");
        System.out.println("XP: " +devJoao.calcularTotalXP() + "\n");

    }
}
