
//This program goes to URL: http://cs.armstrong.edu/liang/data/Lincoln.txt

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Count_Words {

    public static void main(String[] args)throws IOException{
        System.out.println("Please entrer website or repository.");
        Scanner input=new Scanner(System.in);
        int count=Count_Words(input.next());
        System.out.println("There are "+count+" words in this text");

    }//End of main method
//-----------------------------------------------------------------------------------
    public static int Count_Words(String url)throws IOException {

        URL site = new URL(url);
        int count;
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(site.openStream()));) {
            String line;
            count = 0;
            while ((line = reader.readLine()) != null) {
                if (line.length() != 0) {
                    String[] input = line.split("\\s+");
                    count += input.length;
                }// End of if
            }//End of while
        }//End of try

        return count;
    }//End of Count_Words method
}//End of Count_Words class
