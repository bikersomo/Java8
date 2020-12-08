package parallelStreams;

public class ParallelSum {

	private int total;
	public int getTotal() {	return total;	}

	public void setTotal(int total) {		this.total = total;	}
	
	public  int performSum(int input) {		return total+=input;	}
	
}
