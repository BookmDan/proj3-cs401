package main.java;

import java.io.*;
import java.util.*;

public class CSVReader {
    private static HashMap<String, List<String>> map;

    public static void main(String[] args) {
        String path = "/Users/forsale/IdeaProjects/movieDB/src/main/java/movies.csv";
        String line = "";

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            map = new HashMap<String, List<String>>();
            while((line = br.readLine()) != null) {

                String[] values = line.split(",");
//                System.out.println(line);
//                System.out.println("index: " + values[0] + ", Year: " + values[12] + ", Score: " + values[13] + ", Rating: " + values[11] + ", Lang: " +  values[9]);
                String key = values[0];
                List<String> list = new ArrayList<String>();
//                for(int i =0; i < 14; i++ ) {
//                    list.add(values[i]);
//                }
                list.add(values[12]);
                list.add(values[13]);
                list.add(values[9]);
                list.add(values[11]);
//
//                System.out.println(key);
//                System.out.println(list);
                map.put(key, list);
//                System.out.println(map);
            }
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Year: ");
            String year = reader.readLine();

            System.out.print("Score: ");
            String imdb_score = reader.readLine();

            System.out.print("Language: ");
            String language = reader.readLine();
//            String language = reader.readLine().toLowerCase();
//            String s1 = language.substring(0,1).toUpperCase();
//            language = s1 + language.substring(1);

            System.out.print("Rating: ");
            String content_rating = reader.readLine().toUpperCase();

            System.out.println("Results: (Movies -> year:" + year + " score:" + imdb_score +  " language:" + language + " rating:" + content_rating + ")");

            for(Map.Entry<String, List<String>> i: map.entrySet()) {
                if(i.getValue().contains(year) && i.getValue().contains(imdb_score) ){ //&& i.getValue().contains(imdb_score) && i.getValue().contains(language) && i.getValue().contains(content_rating)) {
//                    if(i.getValue().contains(content_rating))
                    //System.out.println(entry.getValue());
                    System.out.println(
                            "--------------------" + "\n" +
                                    "id: " + i.getKey() + "\n" +
                                    "title_year: " + i.getValue().get(0) + "\n" +
                                    "imdb_score: " + i.getValue().get(1) + "\n" +
                                    "language: " + i.getValue().get(2) + "\n" +
                                    "content_rating: " + i.getValue().get(3) + "\n" +
                                    "--------------------" + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
