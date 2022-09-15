package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaúde;

public class AgendaAPP {

	public static void main(String[] args) {

		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao(
				" Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração. "
						+ "O padrão de excelência do Hcor em cardiologia é reconhecido nacional e internacionalmente. "
						+ "Seus estudos se tornaram referenciais na medicina. ");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologista");
		especialidade2.setDescricao(
				"A otorrinolaringologia é uma especialidade médica com características clínicas e cirúrgicas. "
				+ "Seu campo de atuação envolve as doenças do ouvido, do nariz e seios paranasais, "
				+ "faringe, laringe, cabeça, pescoço, boca e esôfago.");

		JOptionPane.showMessageDialog(null, especialidade.getNome());
		JOptionPane.showInternalMessageDialog(null, especialidade2.getNome());

		JOptionPane.showMessageDialog(null, especialidade.getDescriçao());
		System.out.println(especialidade.getDescriçao());
		
		JOptionPane.showMessageDialog(null, especialidade2.getDescriçao());
		System.out.println(especialidade2.getDescriçao());
		
		PlanoDeSaúde bradesco = new PlanoDeSaúde();
		bradesco.setOperadora("Bradesco");
		bradesco.setCategoria("Platiun");
		bradesco.setNumero("40028922");
		
		JOptionPane.showMessageDialog(null, bradesco.getOperadora());
		JOptionPane.showMessageDialog(null, bradesco.getCategoria());
		JOptionPane.showMessageDialog(null, bradesco.getNumero());
		
		
	}

}
