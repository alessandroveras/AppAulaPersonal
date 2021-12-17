package br.edu.infnet.AppAula.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.AppAula.model.domain.Aerobico;
import br.edu.infnet.AppAula.model.domain.Alongamento;
import br.edu.infnet.AppAula.model.domain.Atividade;
import br.edu.infnet.AppAula.model.domain.Aula;
import br.edu.infnet.AppAula.model.domain.Musculacao;
import br.edu.infnet.AppAula.model.domain.Professor;

public class AulaTest {

	public static void main(String[] args) {

		Musculacao musculacao = new Musculacao();
		// attrb1
		// attrb2
		// attrb3

		Aerobico aerobico = new Aerobico();
		// attrb1
		// attrb2
		// attrb3

		Alongamento alongamento = new Alongamento();
		// attrb1
		// attrb2
		// attrb3

		List<Atividade> atividades = new ArrayList<Atividade>();
		atividades.add(musculacao);
		atividades.add(aerobico);
		atividades.add(alongamento);

		Professor professor = new Professor();
		// TODO preencher os atributos do professor;

		Aula aula = new Aula();
		// TODO preencher os atributos da aula;
		aula.setId(1);
		aula.setProfessor(professor);
		aula.setAtividades(atividades);

	}

}
