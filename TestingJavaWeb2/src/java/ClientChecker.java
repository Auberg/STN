/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven Christian
 */
public class ClientChecker {
    private String merchantID;
    private String serverKey;
    private String clientKey;
    public boolean validate()  {
        //querry to db based on the merchant ID to get then match the serverKey and clientKey
        return true;
    }
}
