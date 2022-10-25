package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    
    public static ArrayList<PlanoDeSaude> getPlano() {
        return planos;
    }
    
    public static PlanoDeSaude getPlanos(Integer codigo) {
        for(PlanoDeSaude p: planos){
            if(codigo == p.getCodigo()){
                return p;
            }
        }
        
        return null;
    }

    public static void gravar(PlanoDeSaude p){
        planos.add(p);
    }
    
    public static void excluir(Integer codigo){
        for(PlanoDeSaude p: planos){
            if(codigo == p.getCodigo()){
                planos.remove(p);
                break;
            }
        }
    }
    
    public static void atualizar(PlanoDeSaude planosAtualizada){
        for(PlanoDeSaude p: planos){
            if(planosAtualizada.getCodigo() == p.getCodigo()){
                int posicao = planos.indexOf(p);
                planos.set(posicao, planosAtualizada);
            }
        }
    }
 
    
    public static void criarListaDePlanos(){
        PlanoDeSaude p1 = new PlanoDeSaude("Amil", "561428-87", "Platinum", LocalDate.of(2025, 5, 15));
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco", "452326-47", "Bronze", LocalDate.of(2023, 8, 13));
        PlanoDeSaude p3 = new PlanoDeSaude("NotreDame", "453920-97", "Black", LocalDate.of(2023, 9, 24));
        PlanoDeSaude p4 = new PlanoDeSaude("Unimed", "426276-46", "Prata", LocalDate.of(2026, 2, 19));
        
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);
        
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
        for (PlanoDeSaude p: planos){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getNumero();
            dados[i][3] = p.getCategoria();
            
            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = p.getValidade().format(formatacao);
            
            
            i++;
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }

    
}
