import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab7 {
    static double mode(String []arr){
        System.out.println("Mode: ");
        System.out.println("1. SepalLengthCm");
        System.out.println("2. SepalWidthCm");
        System.out.println("3. PetalLengthCm");
        System.out.println("4. PetalWidthCm");
        Scanner sc = new Scanner(System.in);
        int choice=Integer.parseInt(sc.nextLine());
        if(choice==1){
            
            for (int i = 0; i < arr.length; i++) {
                String temp=arr[i];
                String arr1[]=temp.split(",");
                
                
                
                
            }

            for (int i = 1; i < arr.length; i++) {
                String temp=arr[i];
                String arr1[]=temp.split(",");
                sum+=Double.parseDouble(arr1[1]);
            }
            return (double) (sum/(arr.length-1));


        }

        return 0;

    }
    static double meann(String []arr){
        
        System.out.println("Mean: ");
        System.out.println("1. SepalLengthCm");
        System.out.println("2. SepalWidthCm");
        System.out.println("3. PetalLengthCm");
        System.out.println("4. PetalWidthCm");
        Scanner sc = new Scanner(System.in);
        int choice=Integer.parseInt(sc.nextLine());
        if(choice==1){
            double sum=0.0;

            for (int i = 1; i < arr.length; i++) {
                String temp=arr[i];
                String arr1[]=temp.split(",");
                sum+=Double.parseDouble(arr1[1]);
            }
            return (double) (sum/(arr.length-1));


        }else if(choice==2){
            double sum=0.0;

            for (int i = 1; i < arr.length; i++) {
                String temp=arr[i];
                String arr1[]=temp.split(",");
                sum+=Double.parseDouble(arr1[2]);
            }
            return (double) (sum/(arr.length-1));


        }
        else if(choice==3){
            double sum=0.0;

            for (int i = 1; i < arr.length; i++) {
                String temp=arr[i];
                String arr1[]=temp.split(",");
                sum+=Double.parseDouble(arr1[3]);
            }
            return (double) (sum/(arr.length-1));


        }
        else if(choice==4){
            double sum=0.0;

            for (int i = 1; i < arr.length; i++) {
                String temp=arr[i];
                String arr1[]=temp.split(",");
                sum+=Double.parseDouble(arr1[4]);
            }
            return (double) (sum/(arr.length-1));


        }

    

        return 0;
    }
    static double median(String []arr){
        
        System.out.println("Median: ");
        System.out.println("1. SepalLengthCm");
        System.out.println("2. SepalWidthCm");
        System.out.println("3. PetalLengthCm");
        System.out.println("4. PetalWidthCm");
        Scanner sc = new Scanner(System.in);
        int choice=Integer.parseInt(sc.nextLine());
        if(choice==1){
            double sum=0.0;
            double temp=0.0;
            double []tempmode = new double[151];

            for (int i = 1; i < arr.length; i++) {
                String tempa=arr[i];
                String arr1[]=tempa.split(",");
                tempmode[i]=Double.parseDouble(arr1[1]);

            }
            for (int i = 0; i < tempmode.length; i++) {     
                for (int j = i+1; j < tempmode.length; j++) {     
                   if(tempmode[i] > tempmode[j]) {    
                       temp = tempmode[i];    
                       tempmode[i] = tempmode[j];    
                       tempmode[j] = temp;    
                   }     
                }     
            }  
            if(tempmode.length%2!=0){
                return tempmode[tempmode.length/2];

            }else{
                double tempsum=tempmode[tempmode.length/2-1]+tempmode[tempmode.length/2];
                return (tempsum/2);
            }
            


        }else if(choice==2){
            double sum=0.0;
            double temp=0.0;
            double []tempmode = new double[151];

            for (int i = 1; i < arr.length; i++) {
                String tempa=arr[i];
                String arr1[]=tempa.split(",");
                tempmode[i]=Double.parseDouble(arr1[2]);

            }
            for (int i = 0; i < tempmode.length; i++) {     
                for (int j = i+1; j < tempmode.length; j++) {     
                   if(tempmode[i] > tempmode[j]) {    
                       temp = tempmode[i];    
                       tempmode[i] = tempmode[j];    
                       tempmode[j] = temp;    
                   }     
                }     
            }  
            if(tempmode.length%2!=0){
                return tempmode[tempmode.length/2];

            }else{
                double tempsum=tempmode[tempmode.length/2-1]+tempmode[tempmode.length/2];
                return (tempsum/2);
            }


        }
        else if(choice==3){
            double sum=0.0;
            double temp=0.0;
            double []tempmode = new double[151];

            for (int i = 1; i < arr.length; i++) {
                String tempa=arr[i];
                String arr1[]=tempa.split(",");
                tempmode[i]=Double.parseDouble(arr1[3]);

            }
            for (int i = 0; i < tempmode.length; i++) {     
                for (int j = i+1; j < tempmode.length; j++) {     
                   if(tempmode[i] > tempmode[j]) {    
                       temp = tempmode[i];    
                       tempmode[i] = tempmode[j];    
                       tempmode[j] = temp;    
                   }     
                }     
            }  
            if(tempmode.length%2!=0){
                return tempmode[tempmode.length/2];

            }else{
                double tempsum=tempmode[tempmode.length/2-1]+tempmode[tempmode.length/2];
                return (tempsum/2);
            }


        }
        else if(choice==4){
            double sum=0.0;
            double temp=0.0;
            double []tempmode = new double[151];

            for (int i = 1; i < arr.length; i++) {
                String tempa=arr[i];
                String arr1[]=tempa.split(",");
                tempmode[i]=Double.parseDouble(arr1[4]);

            }
            for (int i = 0; i < tempmode.length; i++) {     
                for (int j = i+1; j < tempmode.length; j++) {     
                   if(tempmode[i] > tempmode[j]) {    
                       temp = tempmode[i];    
                       tempmode[i] = tempmode[j];    
                       tempmode[j] = temp;    
                   }     
                }     
            }  
            if(tempmode.length%2!=0){
                return tempmode[tempmode.length/2];

            }else{
                double tempsum=tempmode[tempmode.length/2-1]+tempmode[tempmode.length/2];
                return (tempsum/2);
            }


        }

    

        return 0;
    }

    public static void main(String[] args) {
        String[] arr = new String[151];
        try {

            Scanner sc = new Scanner(
                    new File("D:\\JAVA_LAB_EXEM\\lab7\\Iris.csv"));
            int irr = 0;
            while (sc.hasNext()) {
                arr[irr] = sc.next();
                irr++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        System.out.println("1. Mean ");
        System.out.println("Mean is"+meann(arr));
        System.out.println("2. Median");
        System.out.println("Median is"+median(arr));


    }

}