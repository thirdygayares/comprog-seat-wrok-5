import java.util.Scanner;
class Trees {

    static int processSize[] = new int[4];
    static int addressSize[] = new int[6];
    static int firstfitArray[] = new int[4];
    static int haveStatusArray[] = new int[6]; //para di laktawan yung mayroon na 0 = default; 1=di na pwede icompare
    static Scanner sc = new Scanner(System.in);
    
    
  public static void main(String[] args) {
	
	  System.out.println("ENTER PROCESS SIZE");
	  //inputing size process
	  for (int sizeProcess =0;sizeProcess<4;sizeProcess++){
        System.out.print("PROCESS " + (sizeProcess+1) + ": ");
        int storeProcessSizeInput = sc.nextInt();       
        processSize[sizeProcess] = storeProcessSizeInput; //storing a number of process size in array
       }
    
	  System.out.println();
	  
	  System.out.println("ENTER ADDRESS SIZE");
	  //inputing size adress
	    for(int sizeAdress = 0;sizeAdress<6;sizeAdress++){ 
	    	
	      System.out.print("ADDRESS SIZE "  + (sizeAdress + 1) + ": ");
	      	int storeAddressSizeInput = sc.nextInt();  
	      	addressSize[sizeAdress] = storeAddressSizeInput; //storing a number of process size in array
	      }	  
	    firstFit();  
  }
    
  	static void firstFit() {	 		
  		for(int x = 0; x<4; x++) {  
  			if(processSize[x] <= addressSize[0] && haveStatusArray[0] == 0) {
  	  			firstfitArray[x] = 1;
  	  			haveStatusArray[0]= 1;
  	  		} else if(processSize[x] <= addressSize[1] && haveStatusArray[1] == 0 ) {
  	  			firstfitArray[x] = 2;
  	  			haveStatusArray[1]= 1;
  	  		}  else if(processSize[x] <= addressSize[2]  && haveStatusArray[2] == 0 ) {
  	  			firstfitArray[x] = 3;
  	  			haveStatusArray[2]= 1;
  	  		}  else if(processSize[x] <= addressSize[3]  && haveStatusArray[3] == 0 ) {
  	  			firstfitArray[x] = 4;
  	  			haveStatusArray[3]= 1;
  	  		} else if(processSize[x] <= addressSize[4]  && haveStatusArray[4] == 0 ) {
  	  			firstfitArray[x] = 5;
  	  			haveStatusArray[4]= 1;
  	  		} else if(processSize[x] <= addressSize[5]  && haveStatusArray[5] == 0 ) {
  	  			firstfitArray[x] = 6;
  	  			haveStatusArray[5]= 1;
  	  		}  			
  			}	
  		
  		System.out.println("\nFirst Fit Algorithm\n");
	    for(int ffAlgorithm = 0; ffAlgorithm<4; ffAlgorithm++)
	    {
	      System.out.println("PROCESS 1 TO ADDRESS SIZE" + firstfitArray[ffAlgorithm] );
	    } 
	    System.out.println();//spacing
	    for(int vertical = 1; vertical<4; vertical++) {
	    	 System.out.print("PROCESS " + vertical + " | ADDRESS " + firstfitArray[vertical] + "-> " );
	    } System.out.print("PROCESS 4 | NULL ");
	      		
  	}
  	  	
}
