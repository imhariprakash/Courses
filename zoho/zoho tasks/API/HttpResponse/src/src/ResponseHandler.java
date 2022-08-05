package src;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ResponseHandler {
    private ResponseHandler() {
        // to prevent instantiation
    }

    public static void getOriginCountry(String response){
        getCountryCode(response); // get origin country code and country name from response and print it directly
    }

    public static void getCountryCode(String response) {
        try {
            boolean isCountryFound = false; // flag to check if country is found in response(atleast one country is found)
            JsonObject jsonObject = new JsonParser().parse(response).getAsJsonObject(); // parse response to json object
            JsonArray jsonArray = jsonObject.getAsJsonArray("country"); // get country array from json object
            for (JsonElement country : jsonArray) {
                String countryCode = country.getAsJsonObject().get("country_id").getAsString();
                String countryName = null;
                if (countryCode != null) {
                    countryName = getCountryName(countryCode);
                    isCountryFound = true;
                    System.out.print(countryCode + " : ");
                }
                if (countryName != null) {
                    System.out.println(countryName);
                }
            }

            if (!isCountryFound) {
                ExceptionHandler.handleException("No country found for the name : " + jsonObject.get("name").getAsString());
            }
        } catch (Exception e) {
            ExceptionHandler.handleException(e, "Error in getCountryCode");
        }
    }

    public static String getCountryName(String countryCode) {
        try {
            String response = RequestHandler.getResponse("https://restcountries.com/v2/alpha/", countryCode);
            JsonObject jsonObject = new JsonParser().parse(response).getAsJsonObject();
            return jsonObject.get("name").getAsString();
        }catch (Exception e) {
            ExceptionHandler.handleException(e, "Error in getCountryName");
        }
        return null;
    }

}
