

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyFile {
    public static String getLine(BufferedReader y){
        HashMap<String, ArrayList<String> >g = new HashMap<>();
        String p = "";
        try {
            String line = y.readLine();
            System.out.println(line);
            String[] lines = line.split(" ",0);
            for (String word:lines) {
                String t = word.substring(0,1).toLowerCase();
                p = t;
                if (g.get(t)==null){
                    ArrayList<String> u = new ArrayList<>();
                    u.add(word);
                    g.put(t,u);
                }
                else{
                    g.get(t).add(word);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(g.size()==0){
            return "";
        }
        ArrayList<String> res = new ArrayList<>();
        while (true) {
            if(g.get(p)==null){
                break;
            }
            String current = g.get(p).remove(0);
            if (g.get(p).size()==0){
                g.remove(p);
            }
            res.add(current);
            p = current.substring(current.length()-1);
        }
        String returned = "";
        for (String t:res) {
            returned+=t + " ";
        }
        return returned;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        try {
            FileReader filereader = new FileReader(path);
            System.out.println(getLine(new BufferedReader(filereader)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}