package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Login> conncectionList = new ArrayList<Login>();

        Login log1 = new Login(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), LocalDate.of(20204, 6, 4));
        Login log2 = new Login(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), LocalDate.of(20204, 7, 4));
        Login log3 = new Login(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), LocalDate.of(20204, 7, 20));
        Login log4 = new Login(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), LocalDate.of(20204, 8, 1));
        Login log5 = new Login(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), LocalDate.of(20204, 8, 2));
        Login log6 = new Login(new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31)), LocalDate.of(20204, 8, 1));

        conncectionList.add(log1);
        conncectionList.add(log2);
        conncectionList.add(log3);
        conncectionList.add(log4);
        conncectionList.add(log5);
        conncectionList.add(log6);

        Map<Client, Integer> connectionInfo = new HashMap<Client, Integer>();

        conncectionList.forEach(connection -> {
            connectionInfo.compute(connection.getClient(), (client, count) -> count == null ? 1 : count + 1);
        });

        connectionInfo.forEach((client, count) -> System.out.println(client.getLastName() + "-" + count) );
    }

}