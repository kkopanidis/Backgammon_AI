public class Chance_Node extends Node {
    /**
     * Kostas Kopanidis p3130098
     * Xrusa Mauraki p3130128
     * Lefteris Xatziarapis p3130255
     * */
	public byte dice1;
	public byte dice2;
	public double a;
	public double b;
	public double mean;
	public int digested;

    public Chance_Node(byte[]dice){
    	super();
    	dice1=dice[0];
    	dice2=dice[1];
    }
    //Hybrid Chance
	public Chance_Node(byte[] dice,double a,double b, double mean, int total, int depth){
		super();
        dice1 = dice[0];
        dice2 = dice[1];
        this.a = a;
        this.b = b;
        this.mean = mean;
        this.digested = total;
        this.depth = depth;
        this.val_set = false;
        State_Tree.processed+=digested;
	}

    public Chance_Node(Chance_Node node){
        this.dice1 = node.dice1;
        this.dice2 = node.dice2;
        this.a = node.a;
        this.b = node.b;
        this.mean = node.mean;
        this.digested = node.digested;
        this.depth = node.depth;
        this.val_set = false;
        this.value = node.value;
    }
	public void purge(){
        super.purge();
    }
	
	public byte getDice1() {
		return dice1;
	}

	public byte getDice2() {
		return dice2;
	}
	
	public double getPropability(byte dice1,byte dice2) {
		if (dice1==dice2){return 1.0/36;}
		return 2.0/36;
	}
	 public double getA() {
	        return a;
	    }
	    public double getB() {
	        return b;
	    }

	    public double getMean() {
	        return mean;
	    }

	    public int getTotal() {
	        return digested;
	    }

}
