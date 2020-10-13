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

        var url = "https://d_abramkin.dev.local/";
        var urlParameters = "name=Jack&occupation=programmer";
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);

        try {

            var myurl = new URL(url);
            con = (HttpsURLConnection) myurl.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "Java client");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

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
