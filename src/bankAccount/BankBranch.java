package Stage07;

public class BankBranch{
	
	private int bsbNumber;
	private String address;
	private int postcode;
	
	public BankBranch(int bSB_number, String address, int postcode) {
		super();
		this.bsbNumber = bSB_number;
		this.address = address;
		this.postcode = postcode;
	}

	public int getBsbNumber() {
		return bsbNumber;
	}

	public String getAddress() {
		return address;
	}

	public int getPostcode() {
		return postcode;
	}
	
}
