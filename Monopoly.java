import java.util.Scanner;
import java.util.Arrays;
public class Monopoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
     System.out.println("player numbers:");
     int n=s.nextInt();
      
     Player[]players=new Player[n];
    Scanner x=new Scanner(System.in);
     for(int i=0;i<n;i++) {
    	System.out.println("P"+(i+1)+" enter your name:");
    	 players[i]=new Player(x.nextLine());
     }
     for(int i=0;i<n;i++) {
    	 System.out.println(players[i]);
     }
     //process(players);
	}
	
	public static void process(String[]players) {
	String[][]map=new Place[][];
     boolean over=false;
     while(!over) {
    	 
     }
	}

}
