
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.apache.http.HttpHeaders.USER_AGENT;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Steven Christian
 */
public class APIRequest {

    private String serverKey = "VT-server-ua3_C9gLepofA0VMbErHYb3V";
    private String clientKey = "VT-client-sKjIINjeXBW3bFye";
    private String merchantID = "M098743";
    private String sandboxAddress = "https://app.sandbox.midtrans.com/snap/v1/transactions";

    public static void main(String[] args) {
        String orderID = "Testing Order-01";
        int grossAmount = 150000;
        JSONObject jso = new JSONObject();
        JSONObject transactionDetails = new JSONObject();
        try {
            transactionDetails.put("order_id", orderID);
            transactionDetails.put("gross_amount", grossAmount);
            jso.put("transaction_details", transactionDetails);
            System.out.println(jso.toString());
            System.out.println(jso.getJSONObject("transaction_details").get("order_id"));
        } catch (JSONException ex) {
            Logger.getLogger(APIRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //2. Merchant server makes an api request to the snap backend to get the SNAP_TOKEN
        //initialize settings.
        response.setHeader("Accept", "application/json");
        response.setContentType("application/json");
        response.setHeader("Authorization", Base64.getEncoder().encodeToString((serverKey + ":").getBytes()));

        String orderID = request.getParameterValues("gross_amount")[0];
        int grossAmount = Integer.parseInt(request.getParameterValues("gross_amount")[0]);
        //dummy data
        orderID = "Testing Order-01";
        grossAmount = 150000;
        
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
        response.getWriter().write(jso.toString());
        //3. Snap backend responds to the api call with the SNAP_TOKEN
    }

}
