import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		//array of ints mapping to desired histogram.
		int[] histogram = new int[10];
		
		//Input from file histogram.txt. Assuming that the file is located in same package.
		File inFile = new File("histogram.txt");
		Scanner scanfile = new Scanner(inFile);
		
		//int counter = 0;
		while (scanfile.hasNextInt()){
			int input = scanfile.nextInt();
			
			if((input > 0)&&(input<=10)){
				histogram[0]++; //1-10
			} else if(input <=20){
				histogram[1]++; //11-20
			} else if(input <=30){
				histogram[2]++; //21-30
			} else if(input <=40){
				histogram[3]++; //31-40
			} else if(input <=50){
				histogram[4]++; //41-50
			} else if(input <=60){
				histogram[5]++; //51-60
			} else if(input <=70){
				histogram[6]++; //61-70
			} else if(input <=80){
				histogram[7]++; //71-80
			} else if(input <=90){
				histogram[8]++; //81-90
			} else if(input <=100){
				histogram[9]++; //91-100
			}
			//counter = counter + 1;
		}
		
		scanfile.close();
		//System.out.println("Found "+ counter + " numbers!");
		printHistogram(histogram);
		
		
		
	}
	
	private static void printHistogram(int[] array) {
		 int leftBound = 1;
		 int rightBound = 10;
	     for (int range = 0; range < array.length; range++) {
	        System.out.printf("%2d-%-3d : " + createAsterisks(array[range])+"\n",leftBound,rightBound);
	        leftBound = leftBound+10;
	        rightBound = rightBound+10;
	    }
	}

	private static String createAsterisks(int num) {
		String val = "";
		for(int i=0;i<num;i++){
			val = val.concat("*");
		}
		return val;
		
	}
	
}
