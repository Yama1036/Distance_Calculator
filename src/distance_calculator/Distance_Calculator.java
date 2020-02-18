/*
 * Yama
 * Feb 18, 2020
 * Copy of Mr.Kaune's code
 */

package distance_calculator;
import javax.swing.*;


/**
 *
 * @author ayyam8774
 */
public class Distance_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String place1, place2;
        double lat1, lat2, lon1, lon2;
        String myInput;

        //Print a warning message to the user about degrees
        System.out.println("When entering latitude and "
		+"longitude, please use degrees.\nFor example: "
		+"43 degrees 40 minutes would be entered as "
		+"43.67.\nUse positive values for North latitudes"
		+"\n and West longitudes.  Use negative values "
		+"for South latitudes and East longitudes.\n");

        //Ask the user for the name of place 1
        place1 = JOptionPane.showInputDialog("Name of Place 1");

        //get latitude
        myInput = JOptionPane.showInputDialog("What is the "
		+"latitude of " + place1 + " in degrees?");
        lat1 = Double.parseDouble(myInput);

        //get longitude
        myInput = JOptionPane.showInputDialog("What is the "
		+"longitude of " + place1 + " in degrees?");
        lon1 = Double.parseDouble(myInput);

        //Ask the user for the name of place 2
        place2 = JOptionPane.showInputDialog("Name of Place 2");

        //get latitude
        myInput = JOptionPane.showInputDialog("What is the "
		+"latitude of " + place2 + " in degrees?");
        lat2 = Double.parseDouble(myInput);

        //get longitude
        myInput = JOptionPane.showInputDialog("What is the "
		+"longitude of " + place2 + " in degrees?");
        lon2 = Double.parseDouble(myInput);

        double distance;

        distance = 6378.8 * Math.acos(Math.sin(lat1/57.2958) *
		Math.sin(lat2/57.2958) +Math.cos(lat1 / 57.2958) *
		Math.cos(lat2/57.2958) * Math.cos(lon2/57.2958 -
		lon1/57.2958));

        //Display output
        System.out.println("Place 1: " + place1);
        System.out.println("Latitude of " + place1+": "+lat1);
        System.out.println("Longitude of " + place1+": "+lon1);
        System.out.println("--------------------------------");
        System.out.println("Place 2: " + place2);
        System.out.println("Latitude of " + place2+": "+lat2);
        System.out.println("Longitude of " + place2+": "+lon2);
        System.out.println("--------------------------------");
        System.out.println("The distance = " + distance+"km"
		+" as the crow flies");
    }
    
}
