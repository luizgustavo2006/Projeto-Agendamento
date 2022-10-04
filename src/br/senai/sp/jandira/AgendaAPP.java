package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaúde;

public class AgendaAPP {

    public static void main(String[] args) {

        // Criar 5 Especialidades
        Especialidade especialidade1 = new Especialidade();
        especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao(" O Cardiologista é aquele que cuida da saúde do coração.");

        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Otorrinolaringologia");
        especialidade2.setDescricao("O otorrinolaringologista é o médico especializado das doenças dos ouvidos, "
                + "nariz, garganta, laringe e pescoço.");

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Gastroenterologia");
        especialidade3.setDescricao("O gastroenterologista é o profissional médico que cuida de todas as doenças "
                + "relacionadas ao aparelho digestivo, que se estende desde a boca, passando por esôfago e órgãos "
                + "como o estômago e o intestino, chegando ao reto.");

        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Fisioterapia");
        especialidade4.setDescricao(" Fisioterapia atua no tratamento e prevenção de doenças e lesões, "
                + "decorrentes de fraturas ou má-formação ou vícios de postura.");

        Especialidade especialidade5 = new Especialidade();
        especialidade5.setNome("Clinica Geral");
        especialidade5.setDescricao("Trata de todas as doenças não-cirúrgicas, não ginecológicas e não obstétricas, "
                + "e apenas em adultos.");

//		System.out.println(especialidade1.getNome());
//		System.out.println(especialidade1.getDescriçao());
//		
//		System.out.println(especialidade2.getNome());
//		System.out.println(especialidade2.getDescriçao());
//		
//		System.out.println(especialidade3.getNome());
//		System.out.println(especialidade3.getDescriçao());
//		
//		System.out.println(especialidade4.getNome());
//		System.out.println(especialidade4.getDescriçao());
//		
//		System.out.println(especialidade5.getNome());
//		System.out.println(especialidade5.getDescriçao());
        // Criar 2 médicos, com as seguintes caracteristicas:
        // O médico1 é clinico geral e cardiologista;
        // O médico2 é Fisioterapeuta, Cardiologista e clinico geral
        Especialidade[] especialidades1 = {especialidade1, especialidade5};
        Medico medico1 = new Medico();
        medico1.setNome("Doutor Fran");
        medico1.setTelefone("(11)94002-8922");
        medico1.setCrm("8462-5");
        medico1.setEmail("doutorfran@tiktok.com");
        medico1.setEspecialidade(especialidades1);

        Especialidade[] especialidades2 = {especialidade1, especialidade4, especialidade5};
        Medico medico2 = new Medico();
        medico2.setNome("Doutor Neves");
        medico2.setTelefone("(11)94006-1086");
        medico2.setCrm("8462-3");
        medico2.setEmail("doutorneves@tiktok.com");
        medico2.setEspecialidade(especialidades2);

        // Exibir os Dados dos dois Médicos
        System.out.println("-----------LISTA DE MÉDICOS DA CLINICA------------");

        System.out.println("Nome do Médico: " + medico1.getNome());
        System.out.println("CRM do Médico: " + medico1.getCrm());

        int i = 0;

        while (i < medico1.getEspecialidade().length) {
            System.out.println("Especialidade: " + medico1.getEspecialidade()[i].getNome());

            i++;
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Nome do Médico: " + medico2.getNome());
        System.out.println("CRM do Médico: " + medico2.getCrm());

        i = 0;

        while (i < medico2.getEspecialidade().length) {
            System.out.println("Especialidade: " + medico2.getEspecialidade()[i].getNome());
            i++;
        }

        // Criar 2 Endereços
        Endereco local1 = new Endereco();
        local1.setEstado(Estados.SAO_PAULO);
        local1.setCidade("Barueri");
        local1.setBairro("Jardim Belval");
        local1.setLogradouro("Rua: Julio Prestes");
        local1.setNumero("240");
        local1.setCep("06420-230");

        Endereco local2 = new Endereco();
        local2.setEstado(Estados.SAO_PAULO);
        local2.setCidade("Barueri");
        local2.setBairro("Parque do Camargos");
        local2.setLogradouro("Rua: Gentulio Vargas");
        local2.setNumero("514");
        local2.setCep("02415-458");

        // Criar 2 Planos de Saúde 
        PlanoDeSaúde amil = new PlanoDeSaúde();
        amil.setOperadora("Amil Médicas");
        amil.setCategoria("Platinum");
        amil.setNumero(" 12718381032847163 ");
        amil.setValidade(LocalDate.of(2023, 07, 30));

        PlanoDeSaúde bradesco = new PlanoDeSaúde();
        bradesco.setOperadora("Bradesco Intermédicas");
        bradesco.setCategoria("Premium");
        bradesco.setNumero("1853726198178679427");
        bradesco.setValidade(LocalDate.of(2024, 05, 27));

        // Criar 2 Pacientes
        Paciente luiz = new Paciente();
        luiz.setNome("Luiz Gustavo Da Silva");
        luiz.setCpf("111-222-333-40");
        luiz.setRg("55-444-333-7");
        luiz.setTelefone("(11)91639-1839");
        luiz.setDataDeNascimento(LocalDate.of(2006, 02, 15));
        luiz.setEndereco(local1);
        luiz.setPlanoDeSaude(bradesco);

        Paciente carol = new Paciente();
        carol.setNome("Caroline");
        carol.setCpf("444-555-666-70");
        carol.setRg("88-999-111-2");
        carol.setTelefone("(11)91649-1939");
        carol.setDataDeNascimento(LocalDate.of(2002, 8, 24));
        carol.setEndereco(local2);
        carol.setPlanoDeSaude(amil);

        // Relatório
        System.out.println("----------LISTA DE PACIENTES----------");

        System.out.println("Nome:" + carol.getNome());
        System.out.println("Nascimento " + carol.getDataDeNascimento());
        System.out.println("Telefone: " + carol.getTelefone());
        System.out.println("Cidade: " + carol.getEndereco().getCidade());
        System.out.println("Estado: " + carol.getEndereco().getEstado());
        System.out.println("Categoria do Plano: " + carol.getPlanoDeSaude().getCategoria());
        System.out.println("Operadora do Plano: " + carol.getPlanoDeSaude().getOperadora());

        System.out.println("------------------------------------------------------------");

        System.out.println("Nome:" + luiz.getNome());
        System.out.println("Nascimento " + luiz.getDataDeNascimento());
        System.out.println("Telefone: " + luiz.getTelefone());
        System.out.println("Cidade: " + luiz.getEndereco().getCidade());
        System.out.println("Estado: " + luiz.getEndereco().getEstado());
        System.out.println("Categoria do Plano: " + luiz.getPlanoDeSaude().getCategoria());
        System.out.println("Operadora do Plano: " + luiz.getPlanoDeSaude().getOperadora());

        Agenda consulta1 = new Agenda();
        consulta1.setData(LocalDate.of(2022, 9, 27));
        consulta1.setHora(LocalTime.of(15, 45));
        consulta1.setMedico(medico2);
        consulta1.setEspecialidade(especialidade4);
        consulta1.setPaciente(luiz);

        System.out.println("--------------Agenda de Consulta-------------");
        System.out.println("Nome do Paciente: " + consulta1.getPaciente().getNome());
        System.out.println("Data da Consulta: " + consulta1.getData());
        System.out.println("Hora da Consulta: " + consulta1.getHora());
        System.out.println("Médico da Consulta: " + consulta1.getMedico().getNome());
        System.out.println("Especialidade da Consulta: " + consulta1.getEspecialidade().getNome());
        System.out.println("Especialidade da Consulta: " + consulta1.getPaciente().getPlanoDeSaude().getOperadora());
        System.out.println("Especialidade da Consulta: " + consulta1.getPaciente().getTelefone());

    }

}
