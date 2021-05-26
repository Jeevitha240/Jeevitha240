import java.util.*;
import java. util. Scanner;

 // Compiler version JDK 11.0.2

 class Second_largest
 {
   public static void main(String args[])
   { 
     Scanner sc=new Scanner(System.in); 
     System. out. println("Enter total no.of elements in array");
     int n=sc.nextInt();
     System. out. println("Enter"+" "+n+" "+"elements");
     int[] a=new int[n];
     for(int i=0;i<a.length;i++){
       a[i]=sc.nextInt();
     }     
           for(int k=0;k<a.length;k++) {
             for(int s=k+1;s<a.length;s++){
               if(a[k]>a[s]){
                 int temp=a[k];
                 a[k]=a[s];
                 a[s]=temp;
               }
             }
           }        
           for(int j = 0; j < a.length-1; j++){  
                if(a[j] == a[a.length-1]){  
                      
                   a[j]=0;
                }  }
         Arrays. sort(a);
     System. out. println(" ");
     System. out. println(a[a.length-2]);  
   }
 }
 
