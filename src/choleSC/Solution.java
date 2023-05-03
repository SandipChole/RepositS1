package choleSC;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

class Solution {
	
    public static int findPostiveLostInteger(int[] a) {
        /* a is the input array, write your logic here and return the output. */
    	
        int len=a.length;
        for(int i=1;i<len;i++){
           int j=i;
            int p=a[i];
            while((j>0)&&(a[j-1]>p)){
             a[j]=a[j-1];
                j--;
            }
            a[j]=p;
            }
        for(int m=0;m<len;m++){
          System.out.println(a[m]);  
          
        }
     int y=0;
        for(int t=0;t<len;t++) {
        	
        	if(a[t]>0) {
        		for(int n=0;n<len;n++) {
        			int d=a[t];     			
        			 if(d==n) {
        				int x=a[n];
        				y=x+1;
        				break;
        				}
        			}
        		}
        	 
        	else if(a[t]<0){
        		for(int n=len-1;n>len-2;n--) {
        			int x=a[n];
        			int z=x+1;
        			y=z-(z)+1;
        			break;
            		}
        	}
       
        }
        return y;
      }     
    public static void main(String[] args){
        int[] a= {0,1,2,3,2};
		int fpi=findPostiveLostInteger(a);
		System.out.println(fpi+" is the first positive lost integer");
	}              
}