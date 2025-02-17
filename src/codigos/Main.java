package codigos;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo(" Curso Java ");
		curso1.setDescricao(" descrção curso java ");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso JavaScript ");
		curso2.setDescricao(" descrção curso js ");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo(" Mentoria Java ");
		mentoria.setDescricao(" Descvrição Mentoria Java ");
		mentoria.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome(" Bootcamp Java Developer ");
		bootcamp.setDescricao(" Descrção Bootcamp Java Developer ");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		
		Dev devCamila = new Dev();
		devCamila.setNome(" Camila ");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println(" Conteúdos incritos Camila " + devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		devCamila.progredir();
		System.out.println(" - ");
		System.out.println(" Conteúdos incritos Camila " + devCamila.getConteudosInscritos());
		System.out.println(" Conteúdos Concluidos Camila " + devCamila.getConteudosConcluidos());
		System.out.println(" XP: " + devCamila.calcularXp());
		
		
		System.out.println(" --------------------------------------------------------------------------- ");
		
		Dev devJoao = new Dev();
		devJoao.setNome(" João ");
		devJoao.inscreverBootcamp(bootcamp);
		
		System.out.println(" Conteúdos incritos João " + devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		
		System.out.println(" - ");
		System.out.println(" Conteúdos incritos João " + devJoao.getConteudosInscritos());
		System.out.println(" Conteúdos Concluidos João " + devCamila.getConteudosConcluidos());
		System.out.println(" XP: " + devJoao.calcularXp());
		
		
	}

}
