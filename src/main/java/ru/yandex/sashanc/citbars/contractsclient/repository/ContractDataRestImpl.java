package ru.yandex.sashanc.citbars.contractsclient.repository;

import org.json.JSONObject;
import ru.yandex.sashanc.citbars.contractsclient.models.Contract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;

public class ContractDataRestImpl implements IContractData{
    @Override
    public List<Contract> getContractList() {

        List<Contract> contractList = Collections.emptyList();
        JSONObject jsonObject = new JSONObject(getContractsFromRest());
        System.out.println(jsonObject);
        return contractList;
    }

    private String getContractsFromRest(){
        //TODO mock-заглушка для проверки запроса у сервмса
        String urlAdress = "https://api.openweathermap.org/data/2.5/onecall?lat=55.7887&lon=49.1221" +
                "&exclude=minutely,hourly,alerts&lang=ru&appid=c3901f61095e0b7da2e5edbe1f0bbf5d";
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(urlAdress);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            if(connection.getResponseCode() != 200){
                throw new RuntimeException("Connection Error: " + connection.getResponseCode());
            }
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    content.append(line+"\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(content);
    }
}
