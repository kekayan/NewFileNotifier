package com.kekayan;

import com.kekayan.interfaces.Observer;

import java.util.ArrayList;

public class SmsObserver implements Observer {
    @Override
    public void notifyMe(ArrayList events) {
        System.out.println("sms sending .... " + events );
    }
}
