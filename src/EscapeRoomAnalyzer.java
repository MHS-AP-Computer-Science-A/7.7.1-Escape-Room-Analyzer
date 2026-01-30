import java.io.File;
import java.util.Scanner;

public class EscapeRoomAnalyzer
{
    public static void main(String[] args) throws Exception
    {
        // Create a Scanner to read from "escape_log.txt"
        // Scanner input = ???

        

        // Read the number of rooms from the file
        // int roomCount = ???


        System.out.println("ESCAPE ROOM SUMMARY");
        System.out.println("-------------------");

        int totalTime = 0;
        int fastestTime = Integer.MAX_VALUE;
        String fastestRoom = "";

        for (int i = 0; i < roomCount; i++)
        {
            // Read the room name (entire line)
            // String roomName = ???

            // Read the escape time (int)
            // int minutes = ???


            // --- Logic below is provided ---
            totalTime += minutes;

            if (minutes < fastestTime)
            {
                fastestTime = minutes;
                fastestRoom = roomName;
            }

            System.out.println(roomName + " - " + minutes + " minutes");
        }

        System.out.println();
        System.out.println("Fastest Room: " + fastestRoom);
        System.out.println("Average Time: " + (totalTime / roomCount) + " minutes");

        // Close the Scanner
    }
}
