package com.example.demo.testclass;

public class DogImpl extends Dog{

    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "DogImpl{" +
                "uuid='" + uuid + '\'' +
                '}';
    }
}
