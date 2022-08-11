package com.company;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class RequestHandler {

    private static final String API_KEY = "d";
    private static final String OAUTH_CONSUMER_KEY = "d";
    private static final String API_KEY_SECRET = "d";
    private static final String OAUTH_CONSUMER_SECRET = "d";
    private static final String BEARER_TOKEN = "d%d%d";

    private static final String CLIENT_SECRET = "d-d";

    private static final String CLIENT_ID = "d";

    private static final String ACCESS_TOKEN = "d-d";
    private static final String OAUTH_TOKEN = "d-d";

    private static final String ACCESS_TOKEN_SECRET = "d";
    private static final String OAUTH_TOKEN_SECRET = "d";

    private static String postMethod = "";
    private static String deleteMethod = "";

    private static String targetUserIid = "";
    private static String targetTweetIid = "";
    private static String ids = "";

    private static String text = "";

    private RequestHandler() {
    } // private constructor to prevent instantiation

    public static String handleRequest(String requestURL, String method) {
        switch(method){
            case "GET":
                return(makeGetRequest(requestURL));
            case "POST":
                return(makePostRequest(requestURL));
            case "DELETE":
                return(makeDeleteRequest(requestURL));
        }
        return "";
    }

    public static String makeGetRequest(String requestURL){
        try {
            Unirest.setTimeouts(0, 0);
            return(Unirest.get(requestURL)
                    .header("Authorization", "Bearer " + BEARER_TOKEN)
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("charset", "utf-8")
                    .header("Accept-Encoding", "")
                    .header("User-Agent", "")
                    .header("ids", ids)
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .asJson()).getBody().getObject().toString();
        } catch (Exception e) {
            ErrorHandler.handleError(e, "Error in makeRequest()");
        }
        return null;
    }

    public static String makePostRequest(String requestURL){
        switch (postMethod){
            case "TWEET_POST":
                return(makeTweetPostRequest(requestURL));
            case "FOLLOW_POST":
                return(makeFollowPostRequest(requestURL));
            case "LIKE_POST":
                return(makeLikePostRequest(requestURL));
            default:
                return("");
        }
    }

    public static String makeTweetPostRequest(String requestURL){
        try {
            Unirest.setTimeouts(0, 0);
            return(Unirest.post(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%d%d%3D\"")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("charset", "utf-8")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .body("{\n    \"text\": \"" + text + "\"\n}")
                    .asJson()).getBody().getObject().toString();
        } catch (Exception e) {
            ErrorHandler.handleError(e, "Error in makeRequest()");
        }
        return null;
    }

    public static String makeFollowPostRequest(String requestURL){
        try {
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.post(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%3D\"")
                    .header("Content-Type", "application/json")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .body("{\n    \"target_user_id\": \"" + targetUserIid + "\"\n}")
                    .asString();
            return response.getBody();
        } catch (Exception e) {
            ErrorHandler.handleError(e, "Error in makeRequest()");
        }
        return null;
    }

    private static String makeLikePostRequest(String requestURL) {
        try{
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.post(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%3D\"")
                    .header("Content-Type", "application/json")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .body("{\n    \"tweet_id\": \"" + targetTweetIid + "\"\n}")
                    .asString();
            return response.getBody();
        } catch (Exception e) {
            ErrorHandler.handleError(e, "Error in makeRequest()");
        }
        return null;
    }

    public static String makeDeleteRequest(String requestURL){
        switch(deleteMethod){
            case "TWEET_DELETE":
                return(makeTweetDeleteRequest(requestURL));
            case "FOLLOW_DELETE":
                return(makeFollowDeleteRequest(requestURL));
            case "LIKE_DELETE":
                return(makeLikeDeleteRequest(requestURL));
            default:
                return("");
        }
    }

    public static String makeTweetDeleteRequest(String requestURL){
        try {
            System.out.println("requestURL: " + requestURL);
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.delete(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%d%3D\"")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .header("Accept", "*/*")
                    .header("Accept-Encoding", "gzip, deflate, br")
                    .header("Connection", "keep-alive")
                    .header("User-Agent", "PostmanRuntime/7.26.2")
                    .asString();
            return response.getBody();
        } catch (Exception e) {
            ErrorHandler.handleError(e, "Error in makePostDeleteRequest()");
        }
        return null;
    }

    public static String makeFollowDeleteRequest(String requestURL){
        try{
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.delete(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%3D\"")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .body("")
                    .asString();

            return response.getBody();
        }catch(Exception e){
            ErrorHandler.handleError(e, "Error in makeFollowDeleteRequest()");
        }
        return null;
    }

    public static String makeLikeDeleteRequest(String requestURL){
        try{
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.delete(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%3D\"")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .asString();
            return response.getBody();
        }catch (Exception e) {
            ErrorHandler.handleError(e, "Error in makeLikeDeleteRequest()");
        }
        return null;
    }


    public static String getBearerToken() {
        return BEARER_TOKEN;
    }

    public static String getAPIKey() {
        return API_KEY;
    }

    public static String getAPIKeySecret() {
        return API_KEY_SECRET;
    }

    public static String getIds() {
        return ids;
    }

    public static void setIds(String ids) {
        RequestHandler.ids = ids;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        RequestHandler.text = text;
    }

    public static String getTargetUserIid(){
        return targetUserIid;
    }

    public static void setTargetUserIid(String targetUserIid){
        RequestHandler.targetUserIid = targetUserIid;
    }

    public static String getPostMethod(){
        return postMethod;
    }

    public static void setPostMethod(String postMethod){
        RequestHandler.postMethod = postMethod;
    }

    public static String getDeleteMethod(){
        return deleteMethod;
    }

    public static void setDeleteMethod(String deleteMethod){
        RequestHandler.deleteMethod = deleteMethod;
    }

    public static String getTargetTweetId(){
        return targetTweetIid;
    }

    public static void setTargetTweetId(String targetTweetIid){
        RequestHandler.targetTweetIid = targetTweetIid;
    }

}


/*
    RequestConfig globalConfig = RequestConfig.custom()
        .setCookieSpec(CookieSpecs.IGNORE_COOKIES).build();

    HttpClient httpclient = HttpClients.custom().setDefaultRequestConfig(globalConfig).build();
    Unirest.setHttpClient(httpclient);



    return(Unirest.delete(requestURL)
                    .header("Authorization", "OAuth oauth_consumer_key=\"d\",oauth_token=\"d-d\",oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"d\",oauth_nonce=\"d\",oauth_version=\"1.0\",oauth_signature=\"d%2Fox%d%3D\"")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("charset", "utf-8")
                    .header("Cookie", "guest_id=v1%d; guest_id_ads=v1%d; guest_id_marketing=v1%d; personalization_id=\"d==\"")
                    .header("connection", "keep-alive")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .asJson()).getBody().getObject().toString();
 */
