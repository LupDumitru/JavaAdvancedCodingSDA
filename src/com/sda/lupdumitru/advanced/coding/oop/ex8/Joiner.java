package com.sda.lupdumitru.advanced.coding.oop.ex8;

import java.util.List;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }
    public String join(List<T> element){
        String result="";
        for(int i =0;i<element.size();i++){
            result=result+element.get(i).toString();
            if(i!=element.size()-1){
                result=result+separator;
            }

        }
        return result;
    }
}
