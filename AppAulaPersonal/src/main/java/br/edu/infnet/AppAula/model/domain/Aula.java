package br.edu.infnet.AppAula.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Aula {

	private Integer id;
	private LocalDateTime data;
	/// attb1
	/// attb2
	/// attb3

	private Professor professor;
	private Aluno aluno;
	private List<Atividade> atividades;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public Aula() {

		data = LocalDateTime.now();
	}

}
