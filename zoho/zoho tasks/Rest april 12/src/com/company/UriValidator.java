package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UriValidator { // using regex - costly but reliable


    private static final String URL_REGEX = "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)([).!';/?:,][[:blank:]])?$";

    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

    private UriValidator() {
    } // private constructor to prevent instantiation

    public static boolean urlValidator(String url)
    {
        if (url == null) {
            return(false);
        }

        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
    }

    public static boolean validate(String url)
    {
        // Validate an URL
        return urlValidator(url);
    }
}

/*

code for using regex to validate whether a url is valid or not

if(!UriValidator.validate(url)){
            Format.format(400, "Invalid URLL");
            return(true);
}
 */

/*            code for getting domain name

    public static String getUrlDomainName(String url) {
        String domainName = new String(url);

        int index = domainName.indexOf("://");

        if (index != -1) {
            // keep everything after the "://"
            domainName = domainName.substring(index + 3);
        }

        index = domainName.indexOf('/');

        if (index != -1) {
            // keep everything before the '/'
            domainName = domainName.substring(0, index);
        }

        // check for and remove a preceding 'www'
        // followed by any sequence of characters (non-greedy)
        // followed by a '.'
        // from the beginning of the string
        domainName = domainName.replaceFirst("^www.*?\\.", "");

        return domainName;
    }

*/
