package com.jingxi.es.monitor;

import com.alibaba.fastjson.JSONObject;

import java.util.Calendar;


public class TestJingxi {



    public static void main(String[] args) throws InterruptedException {

        while (true) {
           Calendar calendar = Calendar.getInstance();

            int hour = calendar.get(Calendar.SECOND);


            if(hour< 10 || hour >= 30){

                System.out.println(hour);
            }
            calendar.clear();
            Thread.sleep(1000);
        }


    }


}
