package src.main.otros;

import com.github.lalyos.jfiglet.FigletFont;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BannerServer {

    public static void main(String[] args) throws Exception {

        // Crear servidor puerto 8091
        HttpServer server = HttpServer.create(new InetSocketAddress(8091),0);
        // Definir contexto banner
        server.createContext("/banner",new BannerHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Servidor arracando en http://localhost:8091/banner?name=EDWIN");

    }

    static class BannerHandler implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            try{
                if(!"GET".equals(exchange.getRequestMethod())){
                    exchange.sendResponseHeaders(405,-1); // Method Not Allowed
                    return;
                }

                // Extraer parámetro name de la query
                URI requestURI = exchange.getRequestURI();
                String query = requestURI.getQuery(); // e.g = "Edwin"
                Map<String, String> params = queryToMap(query);
                String name = params.getOrDefault("name", "ANONIMO").toUpperCase();

                // Generar ASCII-ART con Figlet
                String figlet = FigletFont.convertOneLine(name);

                // Convertir cada carácter visible a '*'
                String banner = Arrays.stream(figlet.split("\n"))
                        .map(line -> line.replaceAll("\\S", "*"))
                        .reduce((a,b)-> a + "\n"+ b)
                        .orElse("");

                System.out.println(banner);

                // Devolver como texto plano
                byte[] response = banner.getBytes("UTF-8");
                exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=UTF-8");
                exchange.sendResponseHeaders(200, response.length);
                try(OutputStream os = exchange.getResponseBody()){
                    os.write(response);
                }
            }catch (Exception e){
                e.printStackTrace();
                try{exchange.sendResponseHeaders(500,-1); }catch (Exception ex){}
            }

        }
    }


    //NOTA Utilidad para parsear querystring en un Map
    private static Map<String, String> queryToMap(String query){
        Map<String, String> result = new HashMap<>();
        if( query == null ) return result;
        for(String param : query.split("&")){
            String[] pair = param.split("=",2);
            if(pair.length ==2){
                result.put(pair[0], pair[1]);
            }
        }
        return result;
    }



}
