package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    
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

    public static void gravar(PlanoDeSaude ps){
        planos.add(ps);
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
        PlanoDeSaude ps1 = new PlanoDeSaude("Amil", "561428-87", "Platinum", LocalDate.of(2025, 5, 15));
        PlanoDeSaude ps2 = new PlanoDeSaude("Bradesco", "452326-47", "Bronze", LocalDate.of(2023, 8, 13));
        PlanoDeSaude ps3 = new PlanoDeSaude("NotreDame", "453920-97", "Black", LocalDate.of(2023, 9, 24));
        PlanoDeSaude ps4 = new PlanoDeSaude("Unimed", "426276-46", "Prata", LocalDate.of(2026, 2, 19));
        
        planos.add(ps1);
        planos.add(ps2);
        planos.add(ps3);
        planos.add(ps4);
        
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
