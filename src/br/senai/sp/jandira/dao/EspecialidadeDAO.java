package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282203\\JAVA\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
   
    public static void gravar(Especialidade e){
        especialidades.add(e);
        
        // Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getEspecialidadeSeparaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro !!");
        }
    }
    
    public static ArrayList<Especialidade> getEspecialidade() {
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
    
    public static void excluir(Integer codigo){
        for(Especialidade e: especialidades){
            if(codigo == e.getCodigo()){
                especialidades.remove(e);
                break;
            }
        }
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada){
        for(Especialidade e: especialidades){
            if(especialidadeAtualizada.getCodigo() == e.getCodigo()){
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, especialidadeAtualizada);
            }
        }
    }
    
    //Criar Lista Inicial de especialidades
    public static void criarlistaDeEspecialidades(){
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                String[] vetor = linha.split(";");              
                Especialidade e = new Especialidade(vetor[1],vetor[2], Integer.valueOf(vetor[0])); 
                especialidades.add(e);
                linha = leitor.readLine();
            }
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro !!");
        }
        
        
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
