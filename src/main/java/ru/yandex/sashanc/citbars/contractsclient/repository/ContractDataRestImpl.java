package ru.yandex.sashanc.citbars.contractsclient.repository;

import ru.yandex.sashanc.citbars.contractsclient.models.Contract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;

public class ContractDataRestImpl implements IContractData{
    @Override
    public List<Contract> getContractList() {

        List<Contract> contractList = Collections.emptyList();





        return contractList;
    }

    private String getContractsFromRest(){
        String urlAdress = "localhost:8080";
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConnection = url.openConnection();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
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
