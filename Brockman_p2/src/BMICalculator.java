import java.util.Scanner;


//public class
public class BMICalculator {
	
		static boolean metric;
		//static double[] userData = new double[2];
		static double height;
		static double weight;
		static String bmiCatagory;
		static double userBmi;
		static Scanner scan = new Scanner(System.in);
		
	
		public BMICalculator() {
			//boolean metric;
			//double height;
			//double weight; 
			//String bmiCatagory;
			//double userBmi;	
			//Scanner scan = new Scanner(System.in);
		}
		
		
		//public instance method readUSerData
		public void readUserData() {
			
			//uses readUnitType and readMeasurementData
			this.readUnitType();
			this.readMeasurementData(metric);
			}
		
		
		//private instance method called readUnitType
		private void readUnitType() {
			boolean correctType = false;
			//scan
			while (!correctType) {
				System.out.println("Are you using Metric or Imperial measurements?");
				String dataType = scan.nextLine();
			
				//store type
				if(dataType.equals("Metric")) {
					metric = true;
					correctType = true;
				}
				if(dataType.equals("Imperial")) {
					metric = false;	
					correctType = true;
				}
			}
		}
		
		
		//private instance method called readMeasurement data
		private void readMeasurementData(boolean metric) {
			
			//calls either readMetricData or readImperialData
			if (metric) {
				this.readMetricData();
			}
			else {
				this.readImpirialData();
			}
			
		}
		//private instance method readMetricData
		private void readMetricData() {
			//read user data
			//the program should exit if the user enters a negative height or weight
			System.out.println("Please enter your height in centimeteres");
			double h = scan.nextDouble();
			if (h<0)
				java.lang.System.exit(0);
			else
				height = h;
			
			System.out.println("Please enter your weight in kilograms");
			double w = scan.nextDouble();
			if (w<0)
				java.lang.System.exit(0);
			else
				weight = w;
		}
		
		//private instance method readImpirialData
		private void readImpirialData() {
			//read user height and weight
			//the program should exit if the user enters a negative height or weight
			System.out.println("Please enter your height in inches");
			double h = scan.nextDouble();
			if (h<0)
				java.lang.System.exit(0);
			else
				height = h;
			
			System.out.println("Please enter your weight in pounds");
			double w = scan.nextDouble();
			if (w<0)
				java.lang.System.exit(0);
			else
				weight = w;
		}
		
		//public instance method that calculates BMI and catagory
		public void calculateBmi() {
			if (metric) {
				userBmi = (weight/(height*height));
			}
			else {
				userBmi = ((703*weight)/(height*height));
			}
			this.calculateBmiCatagory();
			
		}
		//private instance method called calculateBmiCatagory
		private void calculateBmiCatagory(){
			if (userBmi<18.5)
				bmiCatagory = "underweight";
			if (userBmi>=18.5 && userBmi<25)
				bmiCatagory = "normal weight";
			if (userBmi>=25 && userBmi<30)
				bmiCatagory = "overweight";
			if (userBmi>=30)
				bmiCatagory = "obesity";
		}
			
		
		//public instance method displaysBmi that prints BMI and catagory
		public void displayBmi() {
			System.out.println("your BMI is: " + userBmi);
			System.out.println("your BMI catagory is: " + bmiCatagory);
			
		}
			//getWeight
		public double getWeight() {
			return weight;
		}
			//setWeight
		public void setWeight(double w) {
			w = weight;
		}
			//getHeight
		public double getHeight() {
			return height;
		}
			//setHeight
		public void setHeight(double h) {
			h = height;
		}
			//getBmi
		public double getBmi() {
			return userBmi;
		}
			//getBmiCategory
		public String getBmiCategory() {
			return bmiCatagory;
		}
}
