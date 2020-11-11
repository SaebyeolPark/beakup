package algorithmHW;

public class Help {

	HelpNode[] a;
	private int m;

	public Help(int size) {
		a = new HelpNode[size];
		m = size;

	}

	public void put(int value, int n) {
		if ((n + 1) == m) {

			a[n] = new HelpNode(value, a[n]);
			return;
		}
		a[n] = new HelpNode(value, a[n + 1]);

	}

	public void remove() {

		HelpNode[] temp = new HelpNode[m];
		temp = null;
		int i = 0;

		System.out.println(a[1].next.value);
		while (a[i].next != null) {

			if (a[i].value == 0) {
				temp[i] = a[i];
				a[i] = temp[i].next;
			}

			i++;
		}
	}

	public void print() {
		for (int i = 0; i < m; i++) {
			HelpNode HelpNode = a[i];
			while (HelpNode != null) {
				System.out.print(HelpNode.value + " ");
				HelpNode = HelpNode.next;
			}
		}

	}
}
