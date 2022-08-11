package edu.eci.arsw.threads;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;

import java.util.List;

public class BusquedaThread extends Thread{

    private String ip;
    private List<>getOcurrencies
    public BusquedaThread(String ip){
        this.ip = ip;
    }

    @Override
    public void run(){
        HostBlackListsValidator validator = new HostBlackListsValidator();
        List<Integer> blackListOcurrences=validator.checkHost(ip);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
    }
}
