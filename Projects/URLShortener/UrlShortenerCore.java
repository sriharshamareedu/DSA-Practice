import java.util.HashMap;
import java.util.Map;

public class UrlShortenerCore{
    private Map<String, String> urlMap=new HashMap<>();
    private long counter=1000000000L;

    private static final String BASE62="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String encode(long num){
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(BASE62.charAt((int)(num % 62)));
            num/=62;
        }
        return sb.reverse().toString();
    }

    public String shortenUrl(String originalUrl){
        String shortCode=encode(counter);
        urlMap.put(shortCode,originalUrl);
        counter++;
        return "https://short.link/"+shortCode;
    }

    public String getOriginalUrl(String shortUrl){
        String shortCode=shortUrl.replace("https://short.link/", "");
        return urlMap.get(shortCode);
    }

    public static void main(String[] args){
        UrlShortenerCore shortener=new UrlShortenerCore();
        String shortLink=shortener.shortenUrl("https://www.linkedin.com/in/sri-harsha-119909251/overlay/contact-info/");
        System.out.println("Short Link: "+shortLink);
        String original=shortener.getOriginalUrl(shortLink);
        System.out.println("Original Link: "+original);
    }
}