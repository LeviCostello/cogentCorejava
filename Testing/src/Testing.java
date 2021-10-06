public class Testing {
	public Testing(int x) {
		
	}
    public static void main(String[] args) {
    	//this program won't run because we are trying to call the 
    	//default constructor but it is not declared nor does it exist
    	Testing t1 = new Testing(0);
    }
}