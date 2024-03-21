package entities;

public class Deposit {

    private int accNumber;
    private String holder;
    private double deposit;

    public final double taxBank = 5;
    public Deposit(int accNumber, String holder, double deposit ){
        this.accNumber = accNumber;
        this.holder = holder;
        this.deposit = deposit;




    }

    public Deposit(int accNumber, String holder ){
        this.accNumber = accNumber;
        this.holder = holder;
        


    }

   

	public int getAccNumber(){
      return accNumber;
    };
    public int setAccNumber(int accNumber){
        return this.accNumber = accNumber;
    };

    public String getHolder(){
        return holder;
    };
    public void setHolder(String leo, String holder){
        this.holder = holder;
    };

    public double getDeposit(){
        return deposit;
    }

    public  double setDeposit(double deposit){
        return this.deposit = deposit;
    }


    public void addDeposit(double deposit){
        this.deposit += deposit;
    };
    
    
    

    public  void withdraw( double amount) {
    	double withdrawalFee = 5.0; // Taxa de saque
    	double totalAmount = amount + withdrawalFee;
    	deposit -= totalAmount;
       

    }


    public String toString() {
		return "Account data :"
				+ accNumber
				+ ", " 
				+"Holder: "
				+ holder 
				+ ", " 
				+ "Balance: $ "
				+deposit;
				
				
		       
				
	}
}

    

        
      




