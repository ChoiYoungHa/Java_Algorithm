package Stream;

import Stream.Domain.Customer;

import java.util.HashMap;

public class ex_01 {
    public static void main(String[] args) {
        HashMap<String, Customer> map = new HashMap<>(); // new HashMap<>();
        map.put("id1", new Customer("id1", "pw1", 19, "강서", "VIP", "남자"));
        map.put("id2", new Customer("id2", "pw2", 15, "강남", "Basic", "남자"));
        map.put("id3", new Customer("id3", "pw3", 50, "강북", "VIP", "여자"));



    }
}
