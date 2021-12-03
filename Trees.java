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
  		
  		int temp = 0;
  		 
  		
  		//transferring process array to haveStatus Array
  	
  		if(processSize[0] <= addressSize[0] && haveStatusArray[0] == 0) {
  			firstfitArray[0] = addressSize[0];
  			haveStatusArray[0]= 1;
//  			System.out.println("asp");
//  			System.out.println(processSize[0]);
//  			System.out.println(firstfitArray[0]);
//  			System.out.println(addressSize[0]);
  		} else if(processSize[0] <= addressSize[1] && haveStatusArray[1] == 0 ) {
  			firstfitArray[0] = addressSize[1];
  			haveStatusArray[1]= 1;
  			System.out.println("ddfp");
  		}  else if(processSize[0] <= addressSize[2]  && haveStatusArray[2] == 0 ) {
  			firstfitArray[0] = addressSize[2];
  			haveStatusArray[2]= 1;
  		}  else if(processSize[0] <= addressSize[3]  && haveStatusArray[3] == 0 ) {
  			firstfitArray[0] = addressSize[3];
  			haveStatusArray[3]= 1;
  		} else if(processSize[0] <= addressSize[4]  && haveStatusArray[4] == 0 ) {
  			firstfitArray[0] = addressSize[4];
  			haveStatusArray[4]= 1;
  		} else if(processSize[0] <= addressSize[5]  && haveStatusArray[5] == 0 ) {
  			firstfitArray[0] = addressSize[5];
  			haveStatusArray[5]= 1;
  		} 
  		
  		
 		if(processSize[1] <= addressSize[0] && haveStatusArray[0] == 0)  {
  			firstfitArray[1] = addressSize[0];
  			haveStatusArray[0]= 1;
//  			System.out.println("asp");
//  			System.out.println(processSize[0]);
//  			System.out.println(firstfitArray[0]);
//  			System.out.println(addressSize[0]);
  		} else if(processSize[1] <= addressSize[1] && haveStatusArray[1] == 0) {
  			firstfitArray[1] = addressSize[1];
  			haveStatusArray[1]= 1;
  			System.out.println("ddfp");
  		}  else if(processSize[1] <= addressSize[2] && haveStatusArray[2] == 0) {
  			firstfitArray[1] = addressSize[2];
  			haveStatusArray[2]= 1;
  		}  else if(processSize[1] <= addressSize[3] && haveStatusArray[3] == 0) {
  			firstfitArray[1] = addressSize[3];
  			haveStatusArray[3]= 1;
  		} else if(processSize[1] <= addressSize[4] && haveStatusArray[4] == 0) {
  			firstfitArray[1] = addressSize[4];
  			haveStatusArray[4]= 1;
  		} else if(processSize[1] <= addressSize[5] && haveStatusArray[5] == 0) {
  			firstfitArray[1] = addressSize[5];
  			haveStatusArray[5]= 1;
  		} 
  		
		if(processSize[2] <= addressSize[0] && haveStatusArray[0] == 0) {
  			firstfitArray[2] = addressSize[0];
  			haveStatusArray[0]= 1;
//  			System.out.println("asp");
//  			System.out.println(processSize[0]);
//  			System.out.println(firstfitArray[0]);
//  			System.out.println(addressSize[0]);
  		} else if(processSize[2] <= addressSize[1] && haveStatusArray[1] == 0) {
  			firstfitArray[2] = addressSize[1];
  			haveStatusArray[1]= 1;
  			System.out.println("ddfp");
  		}  else if(processSize[2] <= addressSize[2] && haveStatusArray[2] == 0) {
  			firstfitArray[2] = addressSize[2];
  			haveStatusArray[2]= 1;
  		}  else if(processSize[2] <= addressSize[3] && haveStatusArray[3] == 0) {
  			firstfitArray[2] = addressSize[3];
  			haveStatusArray[3]= 1;
  		} else if(processSize[2] <= addressSize[4] && haveStatusArray[4] == 0) {
  			firstfitArray[2] = addressSize[4];
  			haveStatusArray[4]= 1;
  		} else if(processSize[2] <= addressSize[5] && haveStatusArray[5] == 0) {
  			firstfitArray[2] = addressSize[5];
  			haveStatusArray[5]= 1;
  		} 
  		

		if(processSize[3] <= addressSize[0] && haveStatusArray[0] == 0) {
  			firstfitArray[3] = addressSize[0];
  			haveStatusArray[0]= 1;
//  			System.out.println("asp");
//  			System.out.println(processSize[0]);
//  			System.out.println(firstfitArray[0]);
//  			System.out.println(addressSize[0]);
  		} else if(processSize[3] <= addressSize[1] && haveStatusArray[1] == 0) {
  			firstfitArray[3] = addressSize[1];
  			haveStatusArray[1]= 1;
  			System.out.println("ddfp");
  		}  else if(processSize[3] <= addressSize[2] && haveStatusArray[2] == 0) {
  			firstfitArray[3] = addressSize[2];
  			haveStatusArray[2]= 1;
  		}  else if(processSize[3] <= addressSize[3] && haveStatusArray[3] == 0) {
  			firstfitArray[3] = addressSize[3];
  			haveStatusArray[3]= 1;
  		} else if(processSize[3] <= addressSize[4] && haveStatusArray[4] == 0) {
  			firstfitArray[3] = addressSize[4];
  			haveStatusArray[4]= 1;
  		} else if(processSize[3] <= addressSize[5] && haveStatusArray[5] == 0) {
  			firstfitArray[3] = addressSize[5];
  			haveStatusArray[5]= 1;
  		} 
  		
  		
  		
  		
  		
  		
//  	   for(int firstfitCondition = 0; firstfitCondition<6; firstfitCondition++){
//  		   	
//  		   	if(processSize[firstfitCondition] >= addressSize[firstfitCondition] && haveStatusArray[firstfitCondition]==0) {
//  		   			temp = addressSize[firstfitCondition];
//  		   			haveStatusArray[firstfitCondition]=1;
//  		   			System.out.println("first" + firstfitCondition);
//  		   	} else if (processSize[firstfitCondition] >= addressSize[firstfitCondition+1] && haveStatusArray[firstfitCondition]==0) {
//  		   		
//  		   	}
//  		   	
//  		  firstfitArray[firstfitCondition] = temp;  
//  	   }
//  	   
//  	   //testing
//  	  System.out.println("status");
//  	 for(int i = 0; i<6; i++){
//	  System.out.print(haveStatusArray[i] + " ");
//	    }  
//  	   
  	   
  	   
  	   
  	   
//  	   	if(processSize[0] >= addressSize[0]) {
//  	   		bestfit[0] =  addressSize[0];
//  	   	
//  	    }else if (processSize[1] >= addressSize[0]) {
//  	    	
//  	    }
  	   
  	}
  
  	
  
  
}
