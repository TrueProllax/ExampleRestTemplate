

package llax.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.client.RestTemplate;


public class ExampleRestTemplate {
    
    private static String keyApi = "-u53fdT_EvUWuG7IOBy04VTyqXGNqMwNNkZ3RL30tJYc4mbR";
    private static String url = "https://api.currentsapi.services/v1/latest-news?apiKey=" + keyApi;

    public static void main(String[] args) {
        
        RestTemplate restTemplate = new RestTemplate();
        
        Map <String, ArrayList> mapping = restTemplate.getForObject(url, Map.class);
        
        List <LinkedHashMap> listNews = mapping.get("news");
        
        for (LinkedHashMap item : listNews) {
            System.out.println(
                    "\t" + item.get("id") + "{\n" +
                        "\t\t title: " + item.get("title") + 
                    "\n}"
            );
            
        }
        
    }
}
