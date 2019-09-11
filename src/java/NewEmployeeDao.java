/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maxerror678
 */
@WebServlet(urlPatterns = {"/NewEmployeeDao"})
public class NewEmployeeDao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewEmployeeDao</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewEmployeeDao at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
     Connection con=null;
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
        
    
        String EmpName=request.getParameter("EmpName");
        String Address=request.getParameter("Address");
        String MailId=request.getParameter("MailId");
        String Mobile=request.getParameter("Mobile");
        String DOB=request.getParameter("DOB");
        String Designation=request.getParameter("Designation");
        String DOJ=request.getParameter("DOJ");
          
     


try{  
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagment", "root", ""); 
String sql="insert into new_employee values('"+EmpName+"','"+Address+"','"+MailId+"','"+Mobile+"','"+DOB+"','"+Designation+"','"+DOJ+"')";
 PreparedStatement pst = con.prepareStatement(sql);

      pst.executeUpdate(); 
     out.println("registered successfully! ");
     
}catch (Exception ex) {
    out.println(ex);
    }
  finally {
      try {
          con.close();
        
      } catch (SQLException e) {
                      Logger.getLogger(NewEmployeeDao.class.getName()).log(Level.SEVERE, null, e);

      }
   
  }
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
