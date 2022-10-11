package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidades(Integer codigo) {
        for(Especialidade e: especialidades){
            if(codigo == e.getCodigo()){
                return e;
            }
        }
        
        return null;
    }

    public static void gravar(Especialidade e){
        especialidades.add(e);
    }
    
    public static void excluir(Integer codigo){
        for(Especialidade e: especialidades){
            if(codigo == e.getCodigo()){
                especialidades.remove(e);
                break;
            }
        }
    }
    
    public static void atualizar(Especialidade correta){
        for(Especialidade e: especialidades){
            if(correta.getCodigo() == e.getCodigo()){
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
            }
        }
    }
    
    //Criar Lista Inicial de especialidades
    public static void criarlistaDeEspecialidades(){
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do Coração");
        Especialidade e2 = new Especialidade("Fisioterapia", "Cuida pra não ficar com a coluna veia");
        Especialidade e3 = new Especialidade("Pediatra", "Cuida das Crianças");
        Especialidade e4 = new Especialidade("Otorrinolaringologista", "Cuida dos ouvidos");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }
    
    public static DefaultTableModel getEspecialidadesModel(){
        
        String[] titulos = {
            "CÓDIGO",
            "NOME DA ESPECIALIDADE",
            "DESCRIÇÃO",
        };
        
        String[][] dados = new String[especialidades.size()][3];
        
        int i = 0;
        for (Especialidade e: especialidades){
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescriçao();
            i++;
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }
}
