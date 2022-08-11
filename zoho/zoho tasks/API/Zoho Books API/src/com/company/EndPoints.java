package com.company;

public enum EndPoints {

    GenerateGrantToken("https://accounts.zoho.com/oauth/v2/auth?"),
    AccessTokenTextFile("src/com/company/access_token.txt"),
    RefreshTokenTextFile("src/com/company/refresh_token.txt"),
    GenerateAccessAndRefreshToken("https://accounts.zoho.com/oauth/v2/token?"),
    RevokeAccessToken("https://accounts.zoho.com/oauth/v2/token?"),
    RevokeRefreshToken("https://accounts.zoho.com/oauth/v2/token/revoke?");

    private static final String BASE_URL = "https://books.zoho.com/api/v3/";

    private String url;

    EndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
    return (BASE_URL + url);
    }
}
