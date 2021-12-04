import java.util.Scanner;
class Trees {

    static int processSize[] = new int[4];
    static int addressSize[] = new int[6];
    static int firstfitArray[] = new int[4];
    static int haveStatusArray[] = new int[6];
    static Scanner sc = new Scanner(System.in);
    
    
  public static void main(String[] args) {
	  for (int j=0;j<4;j++){
		  
	  }
    
    for (int sizeProcess =0;sizeProcess<4;sizeProcess++){
    	
        System.out.print("Please input the size of PROCESS" + " " + (sizeProcess+1) + ": ");
        int storeProcessSizeInput = sc.nextInt();       
        processSize[sizeProcess] = storeProcessSizeInput; //storing a number of process size in array
       }
    
    
    //erase this later -->
    for(int i = 0; i<4; i++)
    {
            System.out.print(processSize[i] + " ");
        
        System.out.println();
    }     //<--erase this later 
    
    	System.out.println("---------------------------------------");
    	System.out.println("---------------------------------------");
  
	    for(int sizeAdress = 0;sizeAdress<6;sizeAdress++){ 
	    	
	      System.out.print("Please input the size of ADDRESS" +  " "  + (sizeAdress + 1) + " ");
	      int storeAddressSizeInput = sc.nextInt();  
	      	addressSize[sizeAdress] = storeAddressSizeInput; //storing a number of process size in array
	      }
	    
	    //erase this later -->
	    for(int i = 0; i<6; i++)
	    {
	      System.out.println(addressSize[i] + " ");
	    } 
	    
	    System.out.println("---------------------------------------");
    	System.out.println("---------------------------------------");
  
	    
	    firstFit();
	    
	    //erase this later -->
	    System.out.println("\nFirst Fit Algorithm");
	    for(int ss = 0; ss<4; ss++)
	    {
	      System.out.println(firstfitArray[ss] + " ");
	    } 
	    
  }
  
  	
  
  
  
  	static void firstFit() {
  		 			 
  		//transferring process array to haveStatus Array
  		
  		
  		for(int x = 0; x<4; x++) {
  			
  			for(int j = 0; j<6; j++) {
  				if(processSize[x] <= addressSize[j] && haveStatusArray[j] == 0) {
  		  			firstfitArray[x] = addressSize[j];
  		  			haveStatusArray[j]= 1;
  		  			System.out.println("tetx: "  + processSize[x]);
  		  		} 
  			}
  			
  		}  	   
  	}
  
    
}
