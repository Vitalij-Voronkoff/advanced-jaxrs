package com.vvoronkov.rest.client;

import com.vvoronkov.messenger.model.Message;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        List<Message> response = client.target("http://localhost:8080/webapi/")
                .path("messages")
                .queryParam("year", 2017)
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Message>>() {
                });

        System.out.println(response);
    }
}
