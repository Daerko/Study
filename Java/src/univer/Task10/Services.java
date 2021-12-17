package univer.Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Services {
    private List<User> listOfUsers;
    public void fromURL(String address) throws IOException {
        listOfUsers = new ArrayList<>();
        URL url = new URL(address);
        URLConnection connection = url.openConnection();
        try (
                BufferedReader buff = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("WINDOWS-1251")))) {
            buff.readLine();
            while (buff.ready()) {
                String text = buff.readLine();
                String[] words = text.split(";");
                listOfUsers.add(new User(words[0], words[1],
                        new BigDecimal(words[2].replace(",", ".")).setScale(2, RoundingMode.HALF_UP),
                        new BigDecimal(words[4].replace(",", ".")).setScale(2, RoundingMode.HALF_UP),
                        new BigDecimal(words[5].replace(",", ".")).setScale(2, RoundingMode.HALF_UP),
                        new BigDecimal(words[6].replace(",", ".")).setScale(2, RoundingMode.HALF_UP),
                        new BigDecimal(words[7].replace(",", ".")).setScale(2, RoundingMode.HALF_UP),
                        new BigDecimal(words[11].replace(",", ".")).setScale(2, RoundingMode.HALF_UP)));
            }
        }
    }
    public void getList(){
        for(User user : listOfUsers)
            print(user);
    }

    public User getMaxIncome(){
        User user = listOfUsers.get(0);
        for(int i = 0; i < listOfUsers.size()-1; i++)
            if(listOfUsers.get(i).getIncome().compareTo(listOfUsers.get(i+1).getIncome()) < 0)
                user = listOfUsers.get(i+1);
        return user;
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void print(User user){
        System.out.println(user);
    }
}
