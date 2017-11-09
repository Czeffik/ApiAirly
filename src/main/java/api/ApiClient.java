package api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.Sensor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ApiClient {
    private final static String apiKey = "fae55480ef384880871f8b40e77bbef9";
    private final static String accept = "application/json";
    final static private Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public ApiClient(){}

    public List<Sensor> getSensors() throws UnirestException {
        JSONArray jsonArray = getAllSensors();
        List<Sensor> listWithSensors = new ArrayList<>();
        for (int index = 0; index < jsonArray.length(); index++) {
            JSONObject jsonObject = jsonArray.getJSONObject(index);
            Sensor sensor = new Sensor(jsonObject);
            listWithSensors.add(sensor);
        }
        return listWithSensors;
    }

    public List<Sensor> getListWithPollutionLevel(List<Sensor> listWithSensors, int pollutionLevel){
        List<Sensor> listWithSensorsWithPollutionLevel = new ArrayList<>();
        for(Sensor sensor : listWithSensors){
            if (sensor.getPollutionLevel()==pollutionLevel){
                listWithSensorsWithPollutionLevel.add(sensor);
            }
        }
        return listWithSensorsWithPollutionLevel;
    }

    private JSONArray getAllSensors() throws UnirestException {
        LOGGER.info("GET " + "https://airapi.airly.eu/v1/sensors/current?southwestLat=-89&southwestLong=-89&northeastLat=89&northeastLong=89");
        HttpResponse<JsonNode> response = Unirest.get("https://airapi.airly.eu/v1/sensors/current?southwestLat=-89&southwestLong=-89&northeastLat=89&northeastLong=89")
                .header("apikey", apiKey)
                .header("Accept", accept)
                .asJson();
        LOGGER.info("Status:  " + response.getStatus());
        LOGGER.info("RESPONSE:  " + response.getBody());
        return response.getBody().getArray();
    }

    public JsonNode getMeasurements(int id) throws UnirestException {
        LOGGER.info("GET " + "https://airapi.airly.eu/v1/sensor/measurements?sensorId=" + id);
        HttpResponse<JsonNode> response = Unirest.get("https://airapi.airly.eu/v1/sensor/measurements?sensorId=" + id)
                .header("apikey", apiKey)
                .header("Accept", accept)
                .asJson();
        LOGGER.info("Status:  " + response.getStatus());
        LOGGER.info("RESPONSE:  " + response.getBody());
        return response.getBody();
    }
}
