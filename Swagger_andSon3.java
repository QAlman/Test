import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class Swagger_3 {

    private final String USER__AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        Swagger_3 http = new Swagger_3();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();

        System.out.println("\nTesting 2 - Send Http POST request");
        http.sendPost();

    }

    private void sendPost() {
    }

    //HTTP GET request
    private void sendGet() throws Exception {

        String url = "https://dochkisinochki.ru/api/mobile/v3/catalog/filter?category=igrushki-dlya-novorozhdennykh&categories=igrushki-dlya-vannoy&categories=muzykalnye-mobili-dlya-krovatok";

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);

        //add request header
        request.addHeader("User-Agent", USER__AGENT);
        request.addHeader("X-User-Platform", "Android");
        request.addHeader("X-User-DeviceID","4d3df290-f15f-4c57-bdf3-ca55cdf9453c");
        request.addHeader("X-App-Version","1.0.31");
        request.addHeader("X-User-PT","ex3qXgwrBhg:APA91bGLZvz8eXJ5NtUvE8PX5WHKxw3pQKv1_nXqEXJ1t0DVY32OD0EwCzgEifPjsSEZeYmhmnI1B9GEYL85g9IkY5SFCIm0zF97qMZ_C9zMR0k83ajplcydiR82Nvh1nuaS5oHmg0lq");
        request.addHeader("X-User-CityID","S:464");
        request.addHeader("X-Protection-Token","b020331243eb4ae868da0be671daf297a8e117e19b0ec9bd1e69031f1fdeb96ece77f9c0cd92904a");

        HttpResponse response = client.execute(request);
        //String urlParameters = "";


        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "{}";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());

    }
}
