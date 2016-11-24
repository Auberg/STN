/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Steven Christian
 */
@WebServlet(urlPatterns = {"/ProcessServlet"})
public class ProcessServlet extends HttpServlet {

    private String serverKey = "VT-server-ua3_C9gLepofA0VMbErHYb3V";
    private String clientKey = "VT-client-sKjIINjeXBW3bFye";
    private String merchantID = "M098743";
    private String sandboxAddress = "https://app.sandbox.midtrans.com/snap/v1/transactions";

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
       
        //2. Merchant server makes an api request to the snap backend to get the SNAP_TOKEN
        //initialize settings.
        response.setHeader("Accept", "application/json");
        response.setContentType("application/json");
        response.setHeader("Authorization", Base64.getEncoder().encodeToString((serverKey + ":").getBytes()));

        //dummy data
        String orderID = "Testing Order-01";
        int grossAmount = 150000;

        //JSON object
        JSONObject jso = new JSONObject();
        JSONObject transactionDetails = new JSONObject();
        try {
            transactionDetails.put("order_id", orderID);
            transactionDetails.put("gross_amount", grossAmount);
            jso.put("transaction_details", transactionDetails);
        } catch (JSONException ex) {
            Logger.getLogger(APIRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // send the jso to the server.
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(jso.toString());
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
        //2. Merchant server makes an api request to the snap backend to get the SNAP_TOKEN
        //initialize settings.
        response.setHeader("Accept", "application/json");
        response.setContentType("application/json");
        response.setHeader("Authorization", Base64.getEncoder().encodeToString((serverKey + ":").getBytes()));

        //String orderID = request.getParameterValues("gross_amount")[0];
        //int grossAmount = Integer.parseInt(request.getParameterValues("gross_amount")[0]);
        //dummy data
        String orderID = "Testing Order-01";
        int grossAmount = 150000;

        //JSON object
        JSONObject jso = new JSONObject();
        JSONObject transactionDetails = new JSONObject();
        try {
            transactionDetails.put("order_id", orderID);
            transactionDetails.put("gross_amount", grossAmount);
            jso.put("transaction_details", transactionDetails);
        } catch (JSONException ex) {
            Logger.getLogger(APIRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // send the jso to the server.
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(jso.toString());
        }
        //3. Snap backend responds to the api call with the SNAP_TOKEN
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
