
package br.pucpr.bsi.prog4.Dao;

import br.pucpr.bsi.prog4.Models.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class JdbcVeiculoDao implements VeiculoDao{

    private Connection con;
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    @Override
    public Veiculo inserir(Veiculo veiculo) {
        String sql = "INSERT INTO Veiculo(placa, tipo) VALUES (?,?)";
        PreparedStatement ps;
        try{
            con.prepareStatement(sql);
            ps.setString(1, veiculo.getPlaca());
            ps.setString(2, veiculo.getTipo());
            ps.executeUpdate();
            System.out.println("Inserido");
        }catch(Exception ex){
            throw new daoE
        }
   }
    
    
    
}
