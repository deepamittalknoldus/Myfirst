package LearningCoreJava;

 class TransactionCheckService {

	public boolean isAllowed(Account from, Account to, int amount) {
		
		if (from ==null || to == null || amount <=0)
		{
			return false;
		}
		
		else
		{
			return true;
		}
	}
}
