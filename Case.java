package assignment;

import java.util.Scanner;

class Execution{

    int count = 0;
    Scanner sc = new Scanner(System.in);
    public String[] entrySet(String[] arr,int n){
        while(true){
            for(int i=0;i<arr.length;i++){
                if(count!=n){
                String song= sc.nextLine();
                arr[i] = song;
                ++count;
                }
            }
                if(count==3){
                    int j=0;
                  arr[j]= arr[j+1];
                  arr[j+1]= arr[j+2];
                  String song= sc.nextLine();
                  arr[j+2] = song;
                }
                return arr;
        }
        
    }
}


    public class Case{
    public static void main(String[] args) {
       
        Execution exe = new Execution();
        int n = 3;
        String [] arr = new String[n];
         String[] arrResult = exe.entrySet(arr,n);
            for(String result: arrResult){
            System.out.println(result);
        }
    }  
} 



    
