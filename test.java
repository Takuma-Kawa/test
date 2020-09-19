class Account{
  

private String name ;
   
private String no;
   
private long balance;
   
private Day kaisetu;

   
 
Account(String n,String num,long z,Day kaisetu){
	
name=n;
	no=num;
	balance=z;
	this.kaisetu=new Day(kaisetu);

	
    }
   

public Day getkaisetu(){
	
return new Day(kaisetu);}

    

    
String getName(){
	return name;
 
   }

   
String getNo(){
	return no;
  
  }

    
long getBalance(){
	return balance;
  
  }

 
  
void deposit(long k){
	balance += k;

 
   }

    
void withdraw(long k){
	balance -=k;
  
  }
   

public void putspec(){

	System.out.println("名前:"+ n);
	
　　　　System.out.println("番号:"+num);

	System.out.println("預金残高:"+z);


   
 }


}
