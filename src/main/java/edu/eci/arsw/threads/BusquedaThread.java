package edu.eci.arsw.threads;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;

import java.util.LinkedList;
import java.util.List;

public class BusquedaThread extends Thread{

    private String ip;

    private HostBlackListsValidator validator;
    public BusquedaThread(String ip){
        this.ip = ip;
    }

    public LinkedList<Integer> getOcurrencies(){
        return validator.getBlackListOcurrences();
    }


    @Override
    public void run(){
        for (int i=0;i<skds.getRegisteredServersCount() && ocurrencesCount<BLACK_LIST_ALARM_COUNT;i++){
            checkedListsCount++;

            if (skds.isInBlackListServer(i, ipaddress)){

                blackListOcurrences.add(i);

                ocurrencesCount++;
            }
        }
    }
}
