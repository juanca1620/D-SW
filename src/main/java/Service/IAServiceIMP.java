package Service;

import Repository.IARepository;
import Repository.IARepositoryIMP;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class IAServiceIMP implements IAService{
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_KEY = dotenv.get("API_KEY");
    private static final String API_URL
            = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent";
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();
    private static IARepository repo = new IARepositoryIMP();


    

    private static String PREPROMTSQL = "A continuación, recibirás un promt de un usuario donde va a consultar en la siguiente base de datos: \n"
+ "create DATABASE gallinero;\n"
+ "USE gallinero;\n"
+ "CREATE TABLE roles(\n"
+ "  id int PRIMARY KEY,\n"
+ "  nombre VARCHAR(30)\n"
+ ");\n"
+ "INSERT INTO roles (id,nombre) VALUES\n"
+ "(1, 'AdminGeneral'),\n"
+ "(2, 'Cliente');\n"
+ "CREATE TABLE usuarios(\n"
+ "  id INT PRIMARY KEY,\n"
+ "  nombre VARCHAR(100),\n"
+ "  fecha_nacimiento DATE,\n"
+ "  contrasenna VARCHAR(255),\n"
+ "  id_rol INT,\n"
+ "  FOREIGN KEY (id_rol) REFERENCES roles(id)\n"
+ ");\n"
+ "CREATE TABLE ventas (\n"
+ "  id INT AUTO_INCREMENT PRIMARY KEY,\n"
+ "  fecha_venta DATE,\n"
+ "  cantidad_vendida INT,\n"
+ "  precio_venta FLOAT,\n"
+ "  id_usuario INT,\n"
+ "  id_produccion INT,\n"
+ "  FOREIGN KEY (id_usuario) REFERENCES usuarios(id),\n"
+ "  FOREIGN KEY (id_produccion) REFERENCES produccion(id)\n"
+ ");\n"
+ "CREATE TABLE produccion(\n"
+ "  id INT AUTO_INCREMENT PRIMARY KEY,\n"
+ "  cantidad_huevos INT,\n"
+ "  fecha_produccion DATE,\n"
+ "  id_lote INT,\n"
+ "  FOREIGN KEY (id_lote) REFERENCES lotes(id)\n"
+ ");\n"
+ "CREATE TABLE reportes(\n"
+ "  id INT AUTO_INCREMENT PRIMARY KEY,\n"
+ "  argumento TEXT,\n"
+ "  tipo_reporte INT,\n"
+ "  id_produccion INT,\n"
+ "  id_lote INT,\n"
+ "  FOREIGN KEY (id_produccion) REFERENCES produccion(id),\n"
+ "  FOREIGN KEY (id_lote) REFERENCES lotes(id),\n"
+ "  CHECK (\n"
+ "    (id_lote IS NOT NULL AND id_produccion IS NULL) OR\n"
+ "    (id_lote IS NULL AND id_produccion IS NOT NULL)\n"
+ "  )\n"
+ ");\n"
+ "CREATE TABLE lotes(\n"
+ "  id INT PRIMARY KEY,\n"
+ "  nombre VARCHAR(100),\n"
+ "  nombre_ubicacion VARCHAR(100)\n"
+ ");\n"
+ "INSERT INTO lotes (id, nombre, nombre_ubicacion) VALUES\n"
+ "(1, 'Lote 1', 'Ubicación 1'),\n"
+ "(2, 'Lote 2', 'Ubicación 2'),\n"
+ "(3, 'Lote 3', 'Ubicación 3'),\n"
+ "(4, 'Lote 4', 'Ubicación 4'),\n"
+ "(5, 'Lote 5', 'Ubicación 5'),\n"
+ "(6, 'Lote 6', 'Ubicación 6'),\n"
+ "(7, 'Lote 7', 'Ubicación 7'),\n"
+ "(8, 'Lote 8', 'Ubicación 8'),\n"
+ "(9, 'Lote 9', 'Ubicación 9'),\n"
+ "(10, 'Lote 10', 'Ubicación 10');\n"
+ "CREATE TABLE gallinas(\n"
+ "  id INT PRIMARY KEY,\n"
+ "  fecha_nacimiento DATE,\n"
+ "  estado_salud BOOLEAN,\n"
+ "  id_lote INT,\n"
+ "  FOREIGN KEY (id_lote) REFERENCES lotes(id)\n"
+ ");\n"
+ "CREATE TABLE alimentacion(\n"
+ "  id INT AUTO_INCREMENT PRIMARY KEY,\n"
+ "  tipo_alimento VARCHAR(30),\n"
+ "  cantidad_alimento INT,\n"
+ "  fecha_alimento DATE,\n"
+ "  id_lote INT,\n"
+ "  FOREIGN KEY (id_lote) REFERENCES lotes(id)\n"
+ ");\n"
+ "COSAS A TENER EN CUENTA:\n"
+ "- El cliente solo puede hacer consultas a través de tu medio.\n"
+ "- Si el cliente pide información de usuarios, devolverla sin la contraseña aunque la solicite.\n"
+ "- Si el cliente solicita gestionar o realizar operaciones no permitidas, retornar SOLAMENTE Petición inválida. \n"
+ "- Limitarse estrictamente a las instrucciones porque tu respuesta será tomada como un comando SQL ejecutable.\n"
+ "Ejemplo de respuesta válida: 'SELECT * FROM gallinas'.\n"
+ "!NO UTILIZAR '*' EN CONSULTAS A USUARIOS PORQUE PUEDE DEVOLVER LA CONTRASEÑA!\n"
+ "A continuación el promt del cliente:";


    
    
    
    public String giveSQLCode(String promt) {
        String promtCompleto = PREPROMTSQL + promt;
        
        JsonObject bodyRequest = new JsonObject();
        JsonObject content = new JsonObject();
        JsonObject part = new JsonObject();
        
        part.addProperty("text", promtCompleto);
        content.add("parts", gson.toJsonTree(part));
        bodyRequest.add("contents", gson.toJsonTree(content));
        
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_URL)).header("Content-Type", "application/json")
.header("x-goog-api-key", API_KEY).POST(HttpRequest.BodyPublishers.ofString(bodyRequest.toString())).build();
            
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject responseJson = new JSONObject(response.body());
            
            String mensajeIA = responseJson.getJSONArray("candidates").getJSONObject(0).getJSONObject("content").getJSONArray("parts").getJSONObject(0).getString("text");
            
            if (mensajeIA.equals("Petición inválida.")) {
                throw new IllegalArgumentException("La peticion que le hiciste a polli-bot no es valida");
            }
            return mensajeIA;

        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException("Oops! algo fallo con pollibot :(, intetalo mas tarde");
        }
    }
    

    public List<List<Object>> getTable(String query) {
        return repo.executeQuery(query);
    }
    
}
