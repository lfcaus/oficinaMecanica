package br.pucpr.bsi.prog4.Controllers;

import br.pucpr.bsi.prog4.Models.Veiculo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VeiculoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Veiculo veiculo = new Veiculo();
        try
        {
            veiculo.setPlaca(request.getParameter("placa"));
            veiculo.setTipo(request.getParameter("tipo"));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

}
