import java.net.*;
import java.util.Scanner;

class httpRequest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String name = sc.next();
		try {
			URL url = new URL("https://api.nationalize.io?name=" + name);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			Scanner in = new Scanner(con.getInputStream());
			String response = in.nextLine();
			//System.out.println(response);
			String[] headers = response.split("\"country\":");
			String[] countries = headers[1].split("\"country_id\":");
			for (int i = 1; i < countries.length; i++) {
				String countryCode = countries[i].split("\"")[1];
				System.out.print(countryCode + " : ");
				System.out.println(CountryCodes.getCountryFromCode(countryCode));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
/*
 * {"name":"hari","country":[{"country_id":"NP","probability":0.5137347128500772
 * },{"country_id":"IN","probability":0.15104430167314423},{"country_id":"ID",
 * "probability":0.12768794596926214}]}
 */
