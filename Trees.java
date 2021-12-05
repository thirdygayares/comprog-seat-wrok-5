import java.util.Scanner;
class Trees {

    static int processSize[] = new int[4];
    static int addressSize[][] = new int[2][6];
    static int firstfitArray[] = new int[4];
    static int bestfitArray[] = new int[4];
    static int haveStatusArray[] = new int[6]; //para di laktawan yung mayroon na 0 = default; 1=di na pwede icompare
    static Scanner sc = new Scanner(System.in);
    
    
  public static void main(String[] args) {
	  

	  //printing 1-6 for title of address size
	  for(int title=0; title<6; title++) {
		  addressSize[0][title] = (title+1);
	  }
	  
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
	      	addressSize[1][sizeAdress] = storeAddressSizeInput; //storing a number of process size in array
	      }	  
	    firstFit();  
	    bestFit();
  }
    
  	static void firstFit() {	 		
  		for(int x = 0; x<4; x++) {  
  			if(processSize[x] <= addressSize[1][0] && haveStatusArray[0] == 0) {
  	  			firstfitArray[x] = 1;
  	  			haveStatusArray[0]= 1;
  	  		} else if(processSize[x] <= addressSize[1][1] && haveStatusArray[1] == 0 ) {
  	  			firstfitArray[x] = 2;
  	  			haveStatusArray[1]= 1;
  	  		}  else if(processSize[x] <= addressSize[1][2]  && haveStatusArray[2] == 0 ) {
  	  			firstfitArray[x] = 3;
  	  			haveStatusArray[2]= 1;
  	  		}  else if(processSize[x] <= addressSize[1][3]  && haveStatusArray[3] == 0 ) {
  	  			firstfitArray[x] = 4;
  	  			haveStatusArray[3]= 1;
  	  		} else if(processSize[x] <= addressSize[1][4]  && haveStatusArray[4] == 0 ) {
  	  			firstfitArray[x] = 5;
  	  			haveStatusArray[4]= 1;
  	  		} else if(processSize[x] <= addressSize[1][5]  && haveStatusArray[5] == 0 ) {
  	  			firstfitArray[x] = 6;
  	  			haveStatusArray[5]= 1;
  	  		}  			
  			}	
  		
  		System.out.println("\nFirst Fit Algorithm\n");
	    for(int ffAlgorithm = 0; ffAlgorithm<4; ffAlgorithm++)
	    {
	      System.out.println("PROCESS " + (ffAlgorithm+1) +   " TO ADDRESS SIZE " + firstfitArray[ffAlgorithm] );
	    } 
	    System.out.println();//spacing
	    for(int vertical = 1; vertical<4; vertical++) {
	    	 System.out.print("PROCESS " + vertical + " | ADDRESS " + firstfitArray[vertical] + "-> " );
	    } System.out.print("PROCESS 4 | NULL ");
	      		
  	}
  	
  	static void bestFit() {  		
  		int bestFitArray[][] = new int[4][2];
  		int twoDAdress[][] = new int[6][2]; 
  		
  		//sorting		
		int titleTemp = 0, addressSizeTemp=0;
		for(int sortArray=0; sortArray<5; sortArray++) {
			for (int sortArray2=0;sortArray2<5; sortArray2++) {
					if(addressSize[1][sortArray2] > addressSize[1][sortArray2+1]) {
						addressSizeTemp = addressSize[1][sortArray2];
						addressSize[1][sortArray2] = addressSize[1][sortArray2+1];
						addressSize[1][sortArray2+1]= addressSizeTemp;
						
						titleTemp = addressSize[0][sortArray2];
						addressSize[0][sortArray2] = addressSize[0][sortArray2+1];
						addressSize[0][sortArray2+1]= titleTemp;
						
		     }
		   }
		}

		//testing
  		System.out.println("======For testing Purpose========");
		for(int h=0; h<addressSize.length; h++ ) {
			for(int x=0; x<addressSize[h].length; x++ ) {
				System.out.print(addressSize[h][x] + " ");
			}
			System.out.println();
		} System.out.println("======End For testing Purpose========"); 	//end for testing
		
		for(int x = 0; x<4; x++) {  
		  			if(processSize[x] <= addressSize[1][0] && haveStatusArray[0] != 2) {
		  				bestfitArray[x] =  addressSize[0][0];
		  	  			haveStatusArray[0]= 2;
		  	  		} else if(processSize[x] <= addressSize[1][1] && haveStatusArray[1] != 2 ) {
		  	  			bestfitArray[x] =  addressSize[0][1];
		  	  			haveStatusArray[1]= 2;
		  	  		}  else if(processSize[x] <= addressSize[1][2]  && haveStatusArray[2] != 2 ) {
		  	  			bestfitArray[x] =  addressSize[0][2];
		  	  			haveStatusArray[2]= 2;
		  	  		}  else if(processSize[x] <= addressSize[1][3]  && haveStatusArray[3] != 2 ) {
		  	  			bestfitArray[x] =  addressSize[0][3];
		  	  			haveStatusArray[3]= 2;
		  	  		} else if(processSize[x] <= addressSize[1][4]  && haveStatusArray[4] != 2 ) {
		  	  			bestfitArray[x] =  addressSize[0][4];
		  	  			haveStatusArray[4]= 2;
		  	  		} else if(processSize[x] <= addressSize[1][5]  && haveStatusArray[5] != 2 ) {
		  	  			bestfitArray[x] =  addressSize[0][5];
		  	  			haveStatusArray[5]= 2;
		  	  		}  			
  			}	
		
		System.out.println("\nBest Fit Algorithm\n");
	    for(int ffAlgorithm = 0; ffAlgorithm<4; ffAlgorithm++)
	    {
	      System.out.println("PROCESS " + (ffAlgorithm+1) +   " TO ADDRESS SIZE " + bestfitArray[ffAlgorithm] );
	    } 
	    System.out.println();//spacing
	    for(int vertical = 1; vertical<4; vertical++) {
	    	 System.out.print("PROCESS " + vertical + " | ADDRESS " + bestfitArray[vertical] + "-> " );
	    } System.out.print("PROCESS 4 | NULL ");
		
		
		
  	}
  	
  	
  	  	
}
