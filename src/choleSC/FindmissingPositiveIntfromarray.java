package choleSC;
/*	wajp to find a missing first Positive int form an array .
	case 1.
	input: [0,1,2]
	output: 3
	case 2.
	input: [3,4,-1,1]
	output: 2
	case 3.
	input: [-4,-2,0,1,4]
	output: 2
*/
public class FindmissingPositiveIntfromarray {


    public static int findPostiveLostInteger(int[] a) {
        /* a is the input array, write your logic here and return the output. */
    	if(a.length==0) {
    		return 1;
    	}
    	int i=0;
    	while(i<a.length) {
    		if(a[i]>0 && a[i]<=a.length && a[i]!=a[a[i]-1]) {
    			int indexI=a[i]-1;
    			int x=a[i];
    			a[i]=a[indexI];
    			a[indexI]=x;
    		}
    		else {
    			i++;
    		}
    	}
    	for(i=0;i<a.length;i++) {
    		if(a[i]!=i+1) {
    			return i+1;
    		}
    	}
    	return a.length+1;
    	
      }     
    public static void main(String[] args){
        int[] a= {3,4,-1,2};
		int fpi=findPostiveLostInteger(a);
		System.out.println(fpi+" is the first positive lost integer");
	} 
	
}
