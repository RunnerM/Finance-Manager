package net.mpentek.finance_manager.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class FinanceManager implements Finance{


    private HttpClient client;
    @Override
    public void start(String Username,String Password) {
        String uri = "";//Todo: set target
        System.out.println("starting Http client.....");
        client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean addExpense() {

        return false;
    }

    
}
