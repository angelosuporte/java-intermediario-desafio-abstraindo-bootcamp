package Dominio;

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

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
