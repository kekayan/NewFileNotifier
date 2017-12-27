package com.kekayan;

import com.kekayan.interfaces.Observer;
import com.kekayan.interfaces.Subject;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class FilesMonitor extends Thread implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<String> events=new ArrayList<>();
    private int filescount;
    private WatchKey key;
    public FilesMonitor() {
        observers = new ArrayList<>();
        filescount=0;

    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.notifyMe(events);
        }
    }

    public void watchservice() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("E:/Test");
        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);

        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
               if(event.kind().toString().equals("ENTRY_CREATE"))//limited only for new file
                events.add(
                        "Event kind:" + event.kind()
                                + ". File affected: " + event.context() + ".");
            }
            if(events.size()>0)
            notifyAllObservers();
            key.reset();
            events.clear();

        }

    }




}
