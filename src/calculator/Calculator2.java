
import java.util.*;

public class Calculator2{
    static Scanner input = new Scanner(System.in);
    static String response1, response2, myAns;
    static int choice1, choice2, choice3, choice4;
    
    static int n1, n2;
     static int z;
     static double x, y;
	 
     static double result1 = 0.0;
     static double result2 = 1.0;
     
     static double[]array1;
     static int[]array2;
    
    public static void main(String[]args){
        System.out.println("*****************************************");
        System.out.println("\tScientific Calculator\t\t*");
        System.out.println("*****************************************");
        
        
            System.out.println("\t\tWELCOME");
            System.out.print("Do you want to perform any computation?:");
        
            response1 = input.nextLine();

            if(response1.equals("yes")){
                displayMenu();
                run();
            }else{
                System.exit(0);
            }
        
        
        
    }
    
    public static void run(){
        System.out.print("\nENTER AN OPTION(1 - 11): ");
        choice1 = input.nextInt();
        
        switch(choice1){
            case 1:
		System.out.println("1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
                System.out.print(" MAKE A CHOICE: ");
                choice2 = input.nextInt();
                
                if(choice2 == 1){
                    System.out.print("How many numbers do you want to add?: ");
                    n1 = input.nextInt();
                    array1 = new double[n1];
                    
                    System.out.print("Enter the numbers: ");
                    
                    for(int i = 0; i < array1.length; i++){                        
                        array1[i] = input.nextDouble();
                    }
                    
                    System.out.printf("%s%.2f\n", "Sum is: ", add(array1));
                    
                    System.out.print("Do you want to perform any computation?:");
                    response2 = input.next();

                    if(response2.equals("yes")){
                        displayMenu();
                        run();
                    }else{
                        System.exit(0);
                    }
                    
                }else if(choice2 == 2){
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
					
                    System.out.printf("%.2f%s%.2f%s%.2f\n", num1, " - ", num2, " = ", sub(num1, num2));
                    
                    System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                    response2 = input.next();

                    if(response2.equals("yes")){
                        displayMenu();
                        run();
                    }else{
                        System.exit(0);
                    }
		}else if(choice2 == 3){
		    System.out.print("How many numbers do you want to multiply?: ");
                    n1 = input.nextInt();
                    array1 = new double[n1];
                    
                    System.out.print("Enter the numbers: ");
                    
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = input.nextDouble();
                    }
                    
                    System.out.printf("%s%.2f\n", "Product is: ", mul(array1));
                    
                    System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                    response2 = input.next();

                    if(response2.equals("yes")){
                        displayMenu();
                        run();
                    }else{
                        System.exit(0);
                    }
                }else{
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
					
                    System.out.printf("%.2f%s%.2f%s%.2f\n", num1, " / ", num2, " = ", div(num1, num2));
                    
                    System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                    response2 = input.next();

                    if(response2.equals("yes")){
                        displayMenu();
                        run();
                    }else{
                        System.exit(0);
                    }
		}		
		break;
		case 2:
                    System.out.println("1.Power(Square, Cube e.t.c)\n2.Root(Square roo, cube root etc.)");
                    System.out.print("Select option: ");
                    choice3 = input.nextInt();
					
                    if(choice3 == 1){
						System.out.print("Enter number: ");
						x = input.nextDouble();
						System.out.print("Enter exponent: ");
						y = input.nextDouble();
						System.out.printf("%.2f%s%.2f%s%.2f\n", x, "^", y, " = ", Math.pow(x, y));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();

                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice3 == 2){
						System.out.print("Enter number: ");
						x = input.nextDouble();
						System.out.print("Enter root: ");
						y = input.nextDouble();
						System.out.printf("%.f%s%.2f%s%.2f\n", y, "th root of ", x, " = ", Math.pow(x, 1/y));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else{
                        System.out.println("Not applicable");
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }
                    break;
		case 3:
                    System.out.println("1.Ceiling\n2.Floor\n3.Max Value\n4.Min Value\n5.Round");
                    System.out.print("Select option: ");
                    choice4 = input.nextInt();
                            
                    if(choice4 == 1){
                        System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Ceiling of ", x, " is ", Math.ceil(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice4 == 2){
                        System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n","Floor of ", x, " is ", Math.floor(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice4 == 3){
                        System.out.print("How many numbers do you want to get the Max Value?: ");
                        n1 = input.nextInt();
                        array1 = new double[n1];
                        
                        System.out.print("Enter the numbers: ");
                        for(int i = 0; i < array1.length; i++){
                            array1[i] = input.nextDouble();
                        }
                        
                        sort(array1);
                        
                        System.out.printf("%s%.2f\n", "The maximum number is: ", array1[array1.length - 1]);
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice4 == 4){
                        System.out.print("How many numbers do you want to get the Min Value?: ");
                        n1 = input.nextInt();
                        array1 = new double[n1];
                        
                        System.out.print("Enter the numbers: ");
                        for(int i = 0; i < array1.length; i++){
                            array1[i] = input.nextDouble();
                        }
                        
                        sort(array1);
                        
                        System.out.printf("%s%.2f\n", "The minimum number is: ", array1[0]);
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else{
                        System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Round of ", x, " is ", Math.round(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }
                    break;
                    
                    case 4:
                    System.out.println("1.Sine\n2.Cosine\n3.Asine\n4.Acosine\n5.Atan");
                    System.out.print("Select option: ");
                    choice4 = input.nextInt();
                            
                    if(choice4 == 1){
                         System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Sine of ", x, " is ", Math.sin(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice4 == 2){
                         System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Cosine of ", x, " is ", Math.cos(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice4 == 3){
                         System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f%s\n", "Asine of ", x, " is ", Math.asin(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else if(choice4 == 4){
                         System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Acosine of ", x, " is ", Math.acos(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }else{
                         System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Atan of ", x, " is ", Math.atan(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    }
                    break;
                    
                    case 5:
                        System.out.println("1.Exponential");
                        System.out.print("Enter number: ");
                        x = input.nextDouble();
                        System.out.printf("%s%.2f%s%.2f\n", "Sine of ", x, " is ", Math.exp(x));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    
                    break;
                        
                    case 6:
                        System.out.println("1.Pallindrome");
                        System.out.print("Enter number: ");
                        z = input.nextInt();
                        
                        palindrome(z);
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    break;
                    
                    case 7:
                        System.out.println("1.Armsrtong");
                        System.out.print("Enter number: ");
                        z = input.nextInt();
                        
                        armstrong(z);
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                        break;
                    case 8:
                        System.out.print("How many numbers do you want to average?: ");
                        n1 = input.nextInt();
                        array1 = new double[n1];
                        
                        System.out.print("Enter the numbers: ");
                        for(int i = 0; i < array1.length; i++){
                            array1[i] = input.nextDouble();
                        }
                        
                        System.out.printf("%s%.2f\n", "Average is: ", average(array1));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                    break;
                        
                    case 9:
                        System.out.print("How many numbers whose gcd you want to find?: ");
                        n1 = input.nextInt();
                        array2 = new int[n1];
                        
                        System.out.print("Enter the numbers: ");
                        for(int i = 0; i < array2.length; i++){
                            array2[i] = input.nextInt();
                        }
                        
                        System.out.printf("%s%.2f\n", "Greatest Common Divisor is ", findGCD(array2, array2.length));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                        break;
                       
                    case 10:
                        System.out.print("How many numbers whose lcm you want to find?: ");
                        n1 = input.nextInt();
                        array2 = new int[n1];
                        
                        System.out.print("Enter the numbers: ");
                        for(int i = 0; i < array2.length; i++){
                            array2[i] = input.nextInt();
                        }
                        System.out.printf("%s%.2f", "Least Common Multiple is ", findLCM(array2, array2.length));
                        
                        System.out.print("Do you want to perform another computation(Answer yes or no)?:");
                        response2 = input.next();
                        if(response2.equals("yes")){
                            displayMenu();
                            run();
                        }else{
                            System.exit(0);
                        }
                        break;
                    
                    case 11:
                        System.exit(0);
        } 
    }
    
	/* Method for displaying the main menu */
    public static void displayMenu(){
		System.out.println("_________________________________________");
        System.out.println("\n\tMain Menu\t\t\t |");
        System.out.println("_________________________________________");
        
        System.out.println("1. Arithmetic Functions\t\t\t |");
        System.out.println("2. Power Functions\t\t\t |");
        System.out.println("3. Approximation Functions\t\t |");
        System.out.println("4. Trigonometric Functions\t\t |");
        System.out.println("5. Exponential Functions\t\t |");
        System.out.println("6. Palindrome\t\t\t\t |");
        System.out.println("7. Amstrong Number\t\t\t |");
        System.out.println("8. Average Function\t\t\t |");
        System.out.println("9. GCD Function\t\t\t\t |");
        System.out.println("10. LCM Function\t\t\t |");
        System.out.println("11. EXIT\t\t\t\t |");
		System.out.println("_________________________________________");
        
    }
    
	/* Method for adding two numbers */
    public static double add(double[] a){
        for(int i = 0; i < a.length; i++){
            result1 += a[i];
        }
        return result1;
    }
	
	/* Method for multiplying two numbers */
	public static double mul(double[] a){
        for(int i = 0; i < a.length; i++){
            result2 *= a[i];
        }
        return result2;
    }
        
	
	/* Method for subtracting two numbers */
    public static double sub(double a, double b){
		return a - b;
    }
	
	/* Method for dividing two numbers */
    public static double div(double a, double b){
	return a / b;
    }
    
	/* Method for sorting n-element one-dimensional array */
    public static void sort(double[] a){
        double temp;
        
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    /* Method for checking if a number is a palindrome */
    public static void palindrome(int b){
        int r, sum = 0, temp;
        int n = z;
        temp = n;
        
        while(n > 0){
            r = n % 10; 
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("Pallindrome number");
        else
            System.out.println("Not Pallindrome");
    }
    
	/* Method for checking if a number is an Armstrong number*/
    public static int armstrong(int z){
        int number = z, originalNumber, reminder, result = 0;
        originalNumber = number;
        while(originalNumber != 0){
            reminder = originalNumber % 10;
            result += Math.pow(reminder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + "is an Armstrong number.");
        else
            System.out.println(number + "is not an Armstrong number");
        return z;
    }
    
	/* Method for computing average */
    public static double average(double[] a){
        double ave;
        double total = 0.0;
        for(int i = 0; i < a.length; i++){
            total += a[i];
        }
        ave = total / a.length;
            
        return ave;
    }
    
	/* Helper method for computing gcd */
    public static int gcd(int a, int b){
            if(a == 0)
                return b;
            return gcd(b % a, a);  
    }
    
	/* Method for computing GCD */
    public static int findGCD(int[]arr, int n){
        int result = arr[0];
        for(int i = 1; i < n; i++){
            result = gcd(arr[i], result);
        }
        
        return result;
    }
    
	/* Method for computing LCM */
    public static int findLCM(int[] arr, int n){
        int ans = arr[0];
        
        for(int i = 1; i < n; i++){
            ans = (((arr[i] * ans)) / gcd(arr[i], ans));
        }
        return ans;
    }

}