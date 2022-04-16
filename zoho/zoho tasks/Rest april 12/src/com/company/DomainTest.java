package com.company;

import java.io.IOException;
import java.net.*;

public class DomainTest {

    private DomainTest() {
    } // avoid instantiation

    public static boolean domainHandler(String url) throws Exception{ // domain checker
        try {
            URLConnection conn = new URL(url).openConnection(); // open connection - check if it's a valid URL
            conn.connect();
            return(false);
        } catch (IOException e) {
            try{ // if connection to google or amazon only fails as a row - when no internet
                boolean flag = (isHostAvailable("google.com") || isHostAvailable("amazon.com") || isHostAvailable("facebook.com")|| isHostAvailable("apple.com"));
                if(!flag){ // when google, amazon works but ours not - means server down
                    Format.format();
                }
                else if(flag && UriValidator.validate(url) && !isHostAvailable(url)){ // when google, amazon works and ours not - means server down
                    Format.format(503, "Service Unavailable");
                }
                else{
                    Format.format(400, "Invalid URL"); // invalid url means user has given bad url
                }
            }catch(IOException ee){
                Format.format(400, "Invalid URL");
            }
        }
        return(true);
    }

    private static boolean isHostAvailable(String hostName) throws IOException // check whether host is available by establishing a connection
    {
        try(Socket socket = new Socket())
        {
            int port = 80;
            InetSocketAddress socketAddress = new InetSocketAddress(hostName, port);
            socket.connect(socketAddress, 3000);

            return true;
        }
        catch(UnknownHostException unknownHost)
        {
            return false;
        }
    }
}
