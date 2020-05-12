
public class LinkedIntList {
	private IntNode first;
	private IntNode last;
	private int size;

	public static void main(String[] args) {
		LinkedIntList luca = new LinkedIntList();
		luca.addFirst(5);
		luca.addFirst(17);
	}

	public void addFirst(int value) {
		IntNode temp = new IntNode(value);
		this.last = temp;
		temp.next = this.first;
		this.first = temp;
		this.size = this.size + 1;
	}

	public void addLast(int value) {
		IntNode temp = new IntNode(value);
		if (size == 0) {
			this.addFirst(value);
			return;
		}
		last.next = temp;
		this.last = temp;
		this.size = this.size + 1;
	}

	public int getSize() {
		return this.size;
	}

	public void print() {
		IntNode temp;
		temp = this.first;
		System.out.print("[");
		while (!(temp == null)) {
			System.out.print(temp.value);
			temp = temp.next;
			if (!(temp == null)) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public int removeFirst() {
		IntNode temp;
		int temp1 = 0;
		this.first.value = temp1;
		temp = this.first.next;
		this.first = temp;
		this.size = this.size - 1;
		return temp1;
	}

	public int removeLast() {
		int count = 0;
		IntNode temp;
		IntNode temp1;
		temp = this.first;
		temp1 = this.first;
		while (!(temp == null)) {
			temp = temp.next;
			count = count + 1;
		}
		for (int i = 0; i < count; i++) {
			temp1 = temp1.next;
		}
		this.last = temp;
		this.size = this.size - 1;
		return temp1.value;
	}

	public void clear() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int get(int index) {
		int count = 0;
		IntNode temp;
		temp = this.first;
		while (!(temp == null)) {
			if (count == index) {
				return temp.value;
			}
			count = count + 1;
			temp = temp.next;
		}

		return 0;
	}

	public void set(int index, int value) {
		int count = 0;
		IntNode temp;
		temp = this.first;
		while (!(temp == null)) {
			if (count == index) {
				temp.value = value;
				return ;
			}
			temp = temp.next;
			count = count + 1;
		}
	}
}
