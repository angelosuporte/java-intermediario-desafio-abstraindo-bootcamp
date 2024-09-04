package dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso Java");
		curso1.setCargaHoraria(90);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso c#");
		curso2.setDescricao("descricao curso c#");
		curso2.setCargaHoraria(95);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descricao mentoria java");
		mentoria1.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devAluno1 = new Dev();
		devAluno1.setNome("Flores, Joao");
		devAluno1.inscreverBootcamp(bootcamp);
		System.out.println("Inscricao: ");
		System.out.println("Conteudos Inscritos Aluno1: " + devAluno1.getNome() + devAluno1.getConteudosInscritos());
		
		devAluno1.progredir();
		System.out.println("Em progresso: ");
		System.out.println("Conteudos Inscritos Aluno1: " + devAluno1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Aluno1: " + devAluno1.getConteudosConcluidos());
		System.out.println("XP: " + devAluno1.calcularTotalXp());
		System.out.println("-------");
		
		Dev devAluno2 = new Dev();
		devAluno2.setNome("Jardim, Jania");
		devAluno2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Aluno2: " + devAluno2.getNome() + devAluno2.getConteudosInscritos());
		
		devAluno2.progredir();
		System.out.println("Em progresso: ");
		System.out.println("Conteudos Inscritos Aluno1: " + devAluno2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Aluno1: " + devAluno2.getConteudosConcluidos());
		System.out.println("XP: " + devAluno2.calcularTotalXp());
	}

}
