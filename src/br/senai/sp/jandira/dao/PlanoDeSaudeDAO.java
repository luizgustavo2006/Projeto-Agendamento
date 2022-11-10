package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282203\\JAVA\\Planos.txt";
    private final static Path PATH = Paths.get(URL);
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude ps){
        planos.add(ps);
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(ps.getPlanoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro !!");
        }
        
    }
    
    public static ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }
    
    public static PlanoDeSaude getPlano(Integer codigo) {
        for(PlanoDeSaude ps: planos){
            if(codigo == ps.getCodigo()){
                return ps;
            }
        }
        
        return null;
    }
    
    public static void excluir(Integer codigo){
        for(PlanoDeSaude ps: planos){
            if(codigo == ps.getCodigo()){
                planos.remove(ps);
                break;
            }
        }
    }
    
    public static void atualizar(PlanoDeSaude planosAtualizada){
        for(PlanoDeSaude ps: planos){
            if(planosAtualizada.getCodigo() == ps.getCodigo()){
                int posicao = planos.indexOf(ps);
                planos.set(posicao, planosAtualizada);
            }
        }
    }
 
    
    public static void criarListaDePlanos(){
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                String[] vetor = linha.split(";");          
                PlanoDeSaude ps = new PlanoDeSaude(vetor[1],vetor[2],vetor[3],LocalDate.parse(vetor[4]),Integer.valueOf(vetor[0]));
                planos.add(ps);
                linha = leitor.readLine();
            }
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro !!");
        }
        
    }
    
    public static DefaultTableModel getPlanosModel(){
        
        String[] titulos = {
            "CODIGO",
            "OPERADORA",
            "NUMERO",
            "CATEGORIA",
            "VALIDADE",
        };
        
        String[][] dados = new String[planos.size()][5];
        
        int i = 0;
        for (PlanoDeSaude ps: planos){
            dados[i][0] = ps.getCodigo().toString();
            dados[i][1] = ps.getOperadora();
            dados[i][2] = ps.getNumero();
            dados[i][3] = ps.getCategoria();
            
            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = ps.getValidade().format(formatacao);
            
            
            i++;
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }

    
}
