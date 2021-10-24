package ru.yandex.sashanc.citbars.contractsclient.models;

import java.time.LocalDate;

public class Contract {
    private Long id;
    private LocalDate dateContract;
    private LocalDate dateUsing;
    private String status;

    public static String getFieldName(String field){
        String fieldName = null;
        switch (field.toString()){
            case "id":
                fieldName = "ID";
                break;
            case "dateContract":
                fieldName = "Дата договора";
                break;
            case "dateUsing":
                fieldName = "Дата обновления";
                break;
            case "status":
                fieldName = "Статус договора";
                break;
        }
        return fieldName;
    }

    public Contract() {
    }

    public Contract(Long id, LocalDate dateContract, LocalDate dateUsing, String Status) {
        this.id = id;
        this.dateContract = dateContract;
        this.dateUsing = dateUsing;
        this.status = Status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public void setDateContract(LocalDate dateContract) {
        this.dateContract = dateContract;
    }

    public LocalDate getDateUsing() {
        return dateUsing;
    }

    public void setDateUsing(LocalDate dateUsing) {
        this.dateUsing = dateUsing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", dateContract=" + dateContract +
                ", dateUsing=" + dateUsing +
                ", status='" + status + '\'' +
                '}';
    }
}
