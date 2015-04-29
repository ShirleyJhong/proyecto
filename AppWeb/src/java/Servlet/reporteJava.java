/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import AccesoDatos.Conexion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;

/**
 *
 * @author sjhon_000
 */
public class reporteJava extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void metGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        String url=request.getServletPath();
        if(url.equals("/rptArea.html")){
            Conexion conn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "javaintermedio", "postgres", "123456"); 
            try{conn.Conectar();
            //Reporte
            
            
            //Encabezado y nombre del Reporte
            //response.setHeader("Content-Disposition","attachment;filename='reporteArea.pdf';");
            response.setHeader("Content-Disposition","attachment;filename='reporteArea.docx';");
            //response.setContentType("application/pdf");
            response.setContentType("application/docx");
            
            //Salida con el nombre de nuestro reporte
            ServletOutputStream salida=response.getOutputStream();
            
            //Obtener la ruta del diseño del reporte, para luego compilarlo
            JasperReport reporte=JasperCompileManager.compileReport("C:\\Users\\sjhon_000\\OneDrive\\Estudios\\JAVA_INTERMEDIO\\Mis_Proyectos\\APLICACION WEB\\AppWeb\\web\\WEB-INF\\reporteJava.jrxml");

            //Obtiene la ruta y la condicion de la base dedatos
            JasperPrint imprimir= JasperFillManager.fillReport(reporte,null, conn.getCnx());
            
            //exportar el reporte
            //JRExporter exportar=new JRPdfExporter();
            JRExporter exportar=new JRDocxExporter();
            exportar.setParameter(JRExporterParameter.JASPER_PRINT,imprimir);
            exportar.setParameter(JRExporterParameter.OUTPUT_STREAM,salida);
            exportar.exportReport();
            }catch(Exception e){
                    e.printStackTrace();
                    throw e;
                    }
        }
    }
    
protected void metPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        try {
            metGet(request, response);
        } catch (Exception ex) {
            Logger.getLogger(reporteJava.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        metPost(request, response);
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
