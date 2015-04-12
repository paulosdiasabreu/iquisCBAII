package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaDB {
    
    private static Connection conexao;
    
    public ConectaDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/iquis", "root", "SIN072856cop_1725");
            System.out.println("Conexão OK");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro: " + erro.getMessage(), "Conexão", 3);
        }
    }
    
    public Connection getConexao(){
            return conexao;
        }
    }

