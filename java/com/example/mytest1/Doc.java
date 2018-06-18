package com.example.mytest1;

public class Doc {
    private String userName;
    private String hospitalName;
    private int hospitalId;
    private int docId;
    private String data;

    public Doc(String userName,String hospitalName,String data,int
               hospitalId,int docId){
        this.userName=userName;
        this.hospitalName=hospitalName;
        this.data=data;
        this.hospitalId=hospitalId;
        this.docId=docId;
    }

    public String getData() {
        return data;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getUserName() {
        return userName;
    }

    public int getDocId() {
        return docId;
    }

    public int getHospitalId() {
        return hospitalId;
    }
}
