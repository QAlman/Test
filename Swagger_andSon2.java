import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.spi.HttpServerProvider;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
//import java.net.HttpsURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Swagger_andSon2 {

    private static HttpsURLConnection con;

    public static void main(String[] args) throws IOException {

       // var url = "https://d_abramkin.dev.local/";
      //  var url = "https://www.dochkisinochki.ru/api/mobile/catalog/";

        var url =  "https://www.dochkisinochki.ru/api/mobile/v3//auth/login";


        var urlParameters = "{\"identity\":\"+79261528493\",\"password\":\"qwerty123\"}";
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);

        try {

            var myurl = new URL(url);
            con = (HttpsURLConnection) myurl.openConnection();

            con.setDoOutput(true);
            //con.setRequestMethod("GET");
            con.setRequestMethod("POST");
         //   con.setRequestProperty("User-Agent", "Java client");
          //  con.setRequestProperty("User-Agent", USER_AGENT);
          //  con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
          //  con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            con.setRequestProperty("X-User-Platform", "Android");
            con.setRequestProperty("X-User-DeviceID", "4d3df290-f15f-4c57-bdf3-ca55cdf9453c");
            con.setRequestProperty("X-App-Version", "1.0.27");
            con.setRequestProperty("X-User-PT", "ex3qXgwrBhg:APA91bGLZvz8eXJ5NtUvE8PX5WHKxw3pQKv1_nXqEXJ1t0DVY32OD0EwCzgEifPjsSEZeYmhmnI1B9GEYL85g9IkY5SFCIm0zF97qMZ_C9zMR0k83ajplcydiR82Nvh1nuaS5oHmg0lq");
            con.setRequestProperty("X-User-CityID", "S:464");
            con.setRequestProperty("X-Protection-Token","b020331243eb4ae868da0be671daf297a8e117e19b0ec9bd1e69031f1fdeb96ece77f9c0cd92904a");
            // con.setRequestProperty("X-App-Version","1.0.27");
            //con.setRequestProperty("X-App-Version","1.0.27");

            try (var wr = new DataOutputStream(con.getOutputStream())) {

                wr.write(postData);
            }

            StringBuilder content;

            try (var br = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = br.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            System.out.println(content.toString());

        } finally {

            con.disconnect();
        }
    }
}
