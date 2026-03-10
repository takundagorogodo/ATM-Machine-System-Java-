import java.util.ArrayList;
import java.util.List;

public class AtmOperationImpl implements AtmOperationsInterface {
     
    ATM atm = new ATM();

    List<String> ministmt = new ArrayList<>();

      @Override
      public void viewBalance(){
          System.out.println("Available balnce is :"+ atm.getBalance());
      }
      
       @Override
      public void withdrawAmount(double withdrawAmount){
        if((withdrawAmount %100==0)){
             if(withdrawAmount <=atm.getBalance()){
           ministmt.add("Withdrawn: " + withdrawAmount);
            System.out.println("Collect the Cash"+ withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount );
                viewBalance();
           }else{
            System.out.println("isufficient balance");
           } 
        }  
         
      }

      @Override
      public void depositAmount(double depositAmount){
        ministmt.add("Deposited: " + depositAmount);
        System.out.println(depositAmount + "Deposited Succesfully !!");
           atm.setBalance( atm.getBalance() + depositAmount );
           viewBalance(); 
      }
      @Override
      public void viewMiniStatement(){
         for(String s : ministmt){
    System.out.println(s);
}
      }
}
