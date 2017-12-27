package com.kekayan;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        FilesMonitor filesmonitor = new FilesMonitor(); //subject

        TwitterObserver twitter = new TwitterObserver(); //observer1
        SmsObserver sms = new SmsObserver(); //observer1
        EmailObserver email = new EmailObserver(); //observer1

        filesmonitor.addObserver(twitter);
        filesmonitor.addObserver(sms);
        filesmonitor.addObserver(email);

        filesmonitor.watchservice();
    }
}
