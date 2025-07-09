package com.bankDetailsInheritance;

public class SavingAccount extends Account {
	
	private float IntersetRate;
	
	public float getIntersetRate() {
		return IntersetRate;
	}
	public void setIntersetRate(float intersetRate) {
		IntersetRate = intersetRate;
	}
	public int getWithdrawalLimit() {
		return WithdrawalLimit;
	}
	public void setWithdrawalLimit(int withdrawalLimit) {
		WithdrawalLimit = withdrawalLimit;
	}
	private int WithdrawalLimit;

	
}
