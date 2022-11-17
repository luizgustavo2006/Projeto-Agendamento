package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicoDAO {
    
    private final static String URL = "C:\\Users\\22282203\\JAVA\\Medicos.txt";
    private final static String URL_TEMP = "C:\\Users\\22282203\\JAVA\\Medicos-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<Medico>();

    public static void gravar(Medico m) {
        medicos.add(m);

//        try {
//            BufferedWriter escritor = Files.newBufferedWriter(PATH,
//                    StandardOpenOption.APPEND,
//                    StandardOpenOption.WRITE);
//
//            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
//            escritor.newLine();
//            escritor.close();
//
//        } catch (IOException error) {
//            JOptionPane.showMessageDialog(null, "Ocorreu um erro !!");
//        }
//
    }
    
    public ArrayList<Medico> getMedico(){
        return medicos;
    }
    
    public static Medico getMedicos(Integer codigo){
        for(Medico m: medicos){
            if(m.getCodigo().equals(codigo)){
                return m;
            }
        }
        return null;
    }
    
    public static void criarListaMedics(){
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
        } catch (Exception e) {
        }
    }

}


