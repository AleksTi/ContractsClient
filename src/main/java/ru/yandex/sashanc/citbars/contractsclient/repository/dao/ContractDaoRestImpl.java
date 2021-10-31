package ru.yandex.sashanc.citbars.contractsclient.repository.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.yandex.sashanc.citbars.contractsclient.models.dto.ContractDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class ContractDaoRestImpl implements IContractDao {
    private static final String URL_CONTRACT_SERVICE = "http://localhost:8080/contract/a";

    @Override
    public List<ContractDto> getContractList() {
        List<ContractDto> contractDtoList = Collections.emptyList();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            contractDtoList = objectMapper.readValue(getContractsFromRest(), new TypeReference<>(){});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return contractDtoList;
    }

    private String getContractsFromRest(){
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(URL_CONTRACT_SERVICE);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            if(connection.getResponseCode() != 200){
                throw new RuntimeException("Connection Error: " + connection.getResponseCode());
            }
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(content);
    }
}
