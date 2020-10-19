import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
//port com.googlecode.*;
//*ort org.json.simple.parser.JSONParser;*/

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

//import static org.apache.http.client.protocol.ClientContext.COOKIE_STORE;

public class Swagger_6 {


    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        Swagger_6 http = new Swagger_6();

        System.out.println("\nTesting 2 - Send Http POST request");
        http.sendPost();


    }

    private void sendPost() throws Exception {

        //String url = "https://www.dochkisinochki.ru/catalog/filter?category=Podguzniki";
        String url = "https://www.dochkisinochki.ru/api/mobile/v3/auth/login";


        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
       // CookieStore cookieStore;
        org.apache.http.client.CookieStore cookieStore = null;
        
        con.setRequestMethod("POST");
        // con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        // con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setRequestProperty("X-User-Platform", "Android");
        con.setRequestProperty("X-User-DeviceID", "23227c0e-07f4-4fcc-87c1-699567275467");
        con.setRequestProperty("X-App-Version", "1.0.31");
        con.setRequestProperty("X-User-PT", "dVluRO0BvtY:APA91bGqV6LEqhkYSwoygC5g5xcJwo397La_UzTxYH3Miuv4Plh0v2lGgKPnEy2T_MWeWkvtSYfYCZVAGDo9T0jE8N0ymeW93KbjY28V80MugDKkR1BnIOrW6Zy5DGAL_4UKIr1ToUbW");
        con.setRequestProperty("X-User-CityID", "S:464");
        con.setRequestProperty("X-Protection-Token", "b020331243eb4ae868da0be671daf297a8e117e19b0ec9bd1e69031f1fdeb96ece77f9c0cd92904a");
        // con.setRequestProperty("X-App-Version","1.0.27");
        // con.setRequestProperty("X-App-Version","1.0.27");


        String urlParameters = "{\"identity\":\"+79261528493\",\"password\":\"qwerty123\"}";
        // String urlParameters ="{\"data\":{\"filters\":[{\"name\":\"\u0411\u0440\u0435\u043d\u0434\",\"code\":\"BRANDS\",\"type\":\"list\",\"sort\":100,\"values\":[{\"code\":\"rasprodaja_skidki\",\"value\":\"125235\",\"value_text\":\"\u0421\u043e \u0441\u043a\u0438\u0434\u043a\u043e\u0439\",\"sort\":20,\"is_vip\":false}]},{\"name\":\"\u0411\u0440\u0435\u043d\u0434\",\"code\":\"BRANDS\",\"type\":\"range\",\"sort\":100,\"min\":11,\"max\":99},{\"name\":\"\u0411\u0440\u0435\u043d\u0434\",\"code\":\"BRANDS\",\"type\":\"shops\",\"sort\":100,\"values\":[{\"code\":\"rasprodaja_skidki\",\"value\":\"125235\",\"value_text\":\"\u0421\u043e \u0441\u043a\u0438\u0434\u043a\u043e\u0439\",\"sort\":20,\"is_vip\":false}]}],\"subcategories\":[{\"name\":\"\u0422\u043e\u0432\u0430\u0440\u044b \u0434\u043b\u044f \u043a\u043e\u0448\u0435\u043a\",\"scode\":\"tovary_koshki\",\"sort\":100,\"subcategories\":[null]},{\"name\":\"\u0422\u043e\u0432\u0430\u0440\u044b \u0434\u043b\u044f \u043a\u043e\u0448\u0435\u043a\",\"scode\":\"tovary_koshki\",\"sort\":100,\"subcategories\":[null],\"filter\":{\"code\":\"rasprodaja_skidki\",\"value\":\"125235\",\"value_text\":\"\u0421\u043e \u0441\u043a\u0438\u0434\u043a\u043e\u0439\",\"sort\":20,\"is_vip\":false}}]},\"message\":{\"code\":\"validaion\",\"text\":\"validation error\",\"details\":[{\"parameter\":\"count\",\"code\":\"Validation.Incorrect.search.count\"}]}}";

       // CookieHandler.setDefault(new CookieManager());


        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;

        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);

            System.out.println(response.toString());


           // in.close();


            String url2 = "https://dochkisinochki.ru/api/mobile/v3/order/28116132";


            URL obj2 = new URL(url2);
            //HttpURLConnection conn = (HttpURLConnection) new URL("https://dochkisinochki.ru/api/mobile/v3/order/28116132").openConnection();
            HttpsURLConnection conn = (HttpsURLConnection) obj2.openConnection();


            conn.setDoInput(true);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("X-User-Platform", "Android");
           // conn.setRequestProperty("X-User-DeviceID", "23227c0e-07f4-4fcc-87c1-699567275467");
            conn.setRequestProperty("X-User-DeviceID", "23227c0e-07f4-4fcc-87c1-699567275467");
            conn.setRequestProperty("X-App-Version", "1.0.31");
            conn.setRequestProperty("X-User-PT", "dVluRO0BvtY:APA91bGqV6LEqhkYSwoygC5g5xcJwo397La_UzTxYH3Miuv4Plh0v2lGgKPnEy2T_MWeWkvtSYfYCZVAGDo9T0jE8N0ymeW93KbjY28V80MugDKkR1BnIOrW6Zy5DGAL_4UKIr1ToUbW");
            conn.setRequestProperty("X-User-CityID", "S:464");
            conn.setRequestProperty("X-Protection-Token", "b020331243eb4ae868da0be671daf297a8e117e19b0ec9bd1e69031f1fdeb96ece77f9c0cd92904a");
            HttpContext localContext = new BasicHttpContext();
            localContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
            //conn.setRequestProperty("X-App-Version","1.0.31");
            //  conn.setRequestMethod("POST");
            //  conn.setRequestMethod("POST");
            System.out.println("\nTesting 3");
            conn.setDoOutput(true);
            conn.setDoInput(true);
          //  String params2 = "";
            System.out.println("\nTesting 4");


            //String cookie = conn.getHeaderField("Set-Cookie");
            //  conn.setRequestProperty("Content-Length", "" + Integer.toString(params.getBytes().length));
            //OutputStream os = conn.getOutputStream();
           // byte[] data = params.getBytes("UTF-8");
           // os.write(data);
            //data = null;
           // System.out.println("\nTesting 5" + data.toString());



            conn.setDoOutput(true);
            DataOutputStream wr2 = new DataOutputStream(conn.getOutputStream());
          //  wr2.writeBytes(params2);
            wr2.flush();
            wr2.close();

            int responseCode2 = conn.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url2);
          //  System.out.println("Post parameters : " + params2);
            System.out.println("Response Code : " + responseCode2);

            BufferedReader in2 = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String inputLine2;

            StringBuilder response2 = new StringBuilder();

            while ((inputLine2 = in2.readLine()) != null) {
                response2.append(inputLine2);
                System.out.println(response2.toString());

                System.out.println("\nTesting 5");

            }


            in.close();
            in2.close();

            String str3 = null; // initialization string
            String str4 = null; // initialization string
            String data3 = response.toString(); // input  data json
            JsonParser parser3 = new JsonParser(); // for gson google


            JsonObject mainObject = parser3.parse(data3).getAsJsonObject();

            JsonArray rate = mainObject.getAsJsonArray("rows");


            for (JsonElement user : rate) {

                JsonObject userObject3 = user.getAsJsonObject();
                userObject3.get("rasprodaja_skidki");
                str3 = userObject3.get("name").toString();
                str4 = userObject3.get("subcategories").toString();

                System.out.println(str3 + " " + str4 + " " + "array first");

            }


            String djson3 = response.toString();

            // JSONParser parser33 = new JSONParser();

            // Object obj2 = parser33.parse(djson3);
            // JSONObject jsonObj3 = (JSONObject) obj2;

            // System.out.println(jsonObj3.get("acc_name") + " " + "name" );


            String fs = "123456789";
            String sub = fs.subSequence(3, 6).toString();
            String sub2 = fs.substring(3, 6);
            System.out.println(sub2); //456


        }

    }
}
