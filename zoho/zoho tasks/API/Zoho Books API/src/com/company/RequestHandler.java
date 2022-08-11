package com.company;

 import com.mashape.unirest.http.HttpResponse;
 import com.mashape.unirest.http.Unirest;
 import com.mashape.unirest.http.exceptions.UnirestException;
 import org.xml.sax.ErrorHandler;

 import java.io.File;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestHandler {
    private static final String CLIENT_ID = "1000.FGWLWN1FP9Q4jgjggKC2T";
    private static final String CLIENT_SECRET = "d9cb5trr7cdcb5aa90567bd8b738";
    private static String accessToken = "";
    private static String refreshToken = "1000.5743f8fca0a9f1e17e7d6aea34c5341";
    private static String organizationId = "60y655ttt0";

    private RequestHandler() {
    } // private constructor to prevent instantiation

    public static void initializeToken() {
        accessToken = generateAccessToken();
        FileHandler.writeFile("src/com/company/accessToken.txt", accessToken);
    }

    public static String getAccessToken() {
        return accessToken;
    }

    public static String getRefreshToken() {
        return refreshToken;
    }

    public static void setAccessToken(String accessToken) {
        RequestHandler.accessToken = accessToken;
    }

    public static void setRefreshToken(String refreshToken) {
        RequestHandler.refreshToken = refreshToken;
    }

    public static String getClientId() {
        return CLIENT_ID;
    }

    public static String getClientSecret() {
        return CLIENT_SECRET;
    }


     public static String generateAccessToken() {
         try {
             Unirest.setTimeouts(0, 0);
             return(Unirest.post("https://accounts.zoho.in/oauth/v2/token?refresh_token=" + refreshToken + "&client_id=" + CLIENT_ID + "&client_secret=" + CLIENT_SECRET + "&redirect_uri=http://www.zoho.in/books&grant_type=refresh_token")
                     .asJson().getBody().getObject().getString("access_token"));
         }catch (UnirestException e) {
             ErrorHandle.handleError(e, "Error in generateGrantToken()");
         }
         return "";
     }





}
