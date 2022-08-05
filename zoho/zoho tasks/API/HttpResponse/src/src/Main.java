package src;

import java.util.Scanner;

class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.next(); // get name from user to get nativity country code and country name
        String response = RequestHandler.getResponse("https://api.nationalize.io?name=", name); // get response from API
        System.out.println(response); // print response from API
        ResponseHandler.getOriginCountry(response); // get origin country code and country name from response and print it directly
    }
}


/*
 * {"name":"peter","country":[{"country_id":"NP","probability":0.5137347128500772
 * },{"country_id":"IN","probability":0.15104430167314423},{"country_id":"ID",
 * "probability":0.12768794596926214}]}
 */
