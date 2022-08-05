package src;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RequestHandler {
    private RequestHandler() {
        // to prevent instantiation
    }

    public static String getResponse(String requestURL, String parameter){
        try {
            URL url = new URL(requestURL + parameter);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            Scanner in = new Scanner(con.getInputStream());
            String response = in.nextLine();
            return response;
        } catch (Exception e) {
            ExceptionHandler.handleException(e, "Error in getting response from API : " + requestURL + parameter);
        }
        return null;
    }
}
