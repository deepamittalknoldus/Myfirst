package LearningCoreJava;

public class TransferSevice
{
	private final TransactionCheckService transactionCheckService;
	
	public TransferSevice(TransactionCheckService transactionCheckService)
	{
		this.transactionCheckService = transactionCheckService;
	}
	public void transfer (Account from, Account to, int amount) throws Exception
	{
	     if (transactionCheckService.isAllowed(from,to,amount))
	     {
	    	 performTransfer (from, to, amount);
	     }
	     else
	     {
	    	 throw new Exception("Denied");
	     }
	}
	private void performTransfer (Account from, Account to, int amount) throws Exception
	{
		if (from.getBalance ()>=amount)
		{
			from.debit (amount);
			to.credit (amount);
		}
		else
		{
			throw new Exception("Insufficient Balance");
		}
	}

}
