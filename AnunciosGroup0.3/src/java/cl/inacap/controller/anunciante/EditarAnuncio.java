/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.controller.anunciante;

import cl.inacap.dao.anunciante.AnuncioDAO;
import cl.inacap.model.Anuncio;
import cl.inacap.model.ValorAnuncio;
import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zamorator <zamorator@gmail.com>
 */
@WebServlet(name = "EditarAnuncio", urlPatterns = {"/EditarAnuncio"})
public class EditarAnuncio extends HttpServlet {

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
        try {
            boolean isDesabilitar = Boolean.valueOf(request.getParameter("checkDeshabilitar"));
            System.out.println("isDesabilitar "+isDesabilitar);
            if (!isDesabilitar) {
                Anuncio anuncio = new Anuncio();
                anuncio.setCodigo_anuncio(Integer.parseInt(request.getParameter("InputCodigoAnuncio")));
                anuncio.setNombre_anuncio(request.getParameter("InputNombreAnuncio"));
                anuncio.setDescripcion_anuncio(request.getParameter("InputDescripcionAnuncio"));
                anuncio.setId_categoria(Integer.parseInt(request.getParameter("selectCategoria")));
                anuncio.setId_segmento_sexo(Integer.parseInt(request.getParameter("selectSegmentoSexo")));
                anuncio.setId_segmento_edad(Integer.parseInt(request.getParameter("selectSegmentoEdad")));
                anuncio.setCantidad_cupones(Integer.parseInt(request.getParameter("InputCantidadCupones")));
                anuncio.setPorcentaje_descuento(Integer.parseInt(request.getParameter("porcentajeDescueto")));

                ValorAnuncio valorAnuncio = new ValorAnuncio();
                valorAnuncio.setValor_real(Integer.parseInt(request.getParameter("InputValorReal")));
                valorAnuncio.setCodigo_anuncio(anuncio.getCodigo_anuncio());

                AnuncioDAO anuncioDao = new AnuncioDAO();
                anuncioDao.actualizarAnuncio(anuncio);
                anuncioDao.actualizarValorAnuncio(valorAnuncio);
                request.setAttribute("anuncio", anuncio);
            } else {
                Anuncio anuncio = new Anuncio();
                anuncio.setCodigo_anuncio(Integer.parseInt(request.getParameter("InputCodigoAnuncio")));
                AnuncioDAO anuncioDao = new AnuncioDAO();
                anuncioDao.eliminarAnuncio(anuncio);
            }

            response.sendRedirect("anunciante/mis_anuncios.jsp?message=" + URLEncoder.encode("Anuncio Actualizado Exitosamente", "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("anunciante/mis_anuncios.jsp?message=" + URLEncoder.encode("Error al intentar actualizar Anuncio", "UTF-8"));
        } finally {

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
