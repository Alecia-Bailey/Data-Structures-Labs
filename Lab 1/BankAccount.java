
public class BankAccount {

		protected int id;
		protected float balance;
		protected Owner owner;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public float getBalance() {
			return balance;
		}
		public void setBalance(float balance) {
			this.balance = balance;
		}
		public Owner getOwner() {
			return owner;
		}
		public void setOwner(Owner owner) {
			this.owner = owner;
		}
		public BankAccount() {
			this.id= 0;
			this.balance=0.0f;
			this.owner= owner;
		}
		public BankAccount(int id,float balance, Owner owner) {
			super();
		}
		@Override
		public String toString() {
			return "BankAccount [id=" + id + ", balance=" + balance + ", owner=" + owner + "]";
		}
		
		
}
