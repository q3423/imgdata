package com.lw.imgdata.pojo.json;

import java.util.List;

/**
 * Created by asus on 2018/1/18.
 */
public class JsonData {
    private List<Tache> tacheList;

    private List<FormMessage> formRecheck;

    public List<Tache> getTacheList() {
        return tacheList;
    }

    public void setTacheList(List<Tache> tacheList) {
        this.tacheList = tacheList;
    }

    public List<FormMessage> getFormRecheck() {
        return formRecheck;
    }

    public void setFormRecheck(List<FormMessage> formRecheck) {
        this.formRecheck = formRecheck;
    }

    public JsonData(List<Tache> tacheList, List<FormMessage> formRecheck) {
        this.tacheList = tacheList;
        this.formRecheck = formRecheck;
    }

    public JsonData() {
        super();
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "tacheList=" + tacheList +
                ", formRecheck=" + formRecheck +
                '}';
    }


}
