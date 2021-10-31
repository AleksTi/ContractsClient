package ru.yandex.sashanc.citbars.contractsclient.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
@JsonDeserialize
public class ContractDto implements Serializable {
    @Override
    public String toString() {
        return "ContractDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contractDate='" + contractDate + '\'' +
                ", contractUsingDate='" + contractUsingDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("contractDate")
    private String contractDate;
    @JsonProperty("contractUsingDate")
    private String contractUsingDate;
    @JsonProperty("status")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractUsingDate() {
        return contractUsingDate;
    }

    public void setContractUsingDate(String contractUsingDate) {
        this.contractUsingDate = contractUsingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
