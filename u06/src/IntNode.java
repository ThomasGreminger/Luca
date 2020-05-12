
public class IntNode {
	int value;
	IntNode next;

	public IntNode(int arg) {
		value = arg;
	}

	public void print() {
		System.out.print("IntNote (" + this.value + ", " + this.next+ ")");
	}

}
