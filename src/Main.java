import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String newFile = "oscar_age_female.csv";
        ArrayList <Client> myClients = readFile(newFile);
        writeInNewFile(myClients);
        for (Client myClient : myClients){
            System.out.print("Name: " + myClient.getName() + "\n" +
                    "Year: " + myClient.getYear() + "\n" +
                    "Age: " + myClient.getAge() + "\n" +
                    "Movie: " + myClient.getMovie() + "\n" +
                    "=============================================\n");
        }


    }

    public static ArrayList<Client> readFile(String newFile) throws FileNotFoundException {
        File myFile = new File(newFile);
        Scanner scanner = new Scanner(myFile);
        var clients = new ArrayList<Client>();
        String line =  scanner.nextLine();
        while (scanner.hasNextLine()){
            line =  scanner.nextLine();
            String[] info = line.split(", ");
            clients.add(new Client(Integer.parseInt(info[0].trim()),
                    Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[3], info[4]));
        }
        scanner.close();
        return clients;
    }

    public static void writeInNewFile(ArrayList<Client> myClients) throws IOException {
        var writer = new FileWriter("result.txt", true);
        for (Client myClient : myClients) {
            writer.write("Name: " + myClient.getName() + "\n" +
                    "Year: " + myClient.getYear() + "\n" +
                    "Age: " + myClient.getAge() + "\n" +
                    "Movie: " + myClient.getMovie() + "\n" +
                    "=============================================\n");
        }
        System.out.println(myClients);
        writer.close();
    }
}