package algorithmHW;

public class HelpNode {

	int value;
	HelpNode next;

	public HelpNode(int value, HelpNode next) {
		this.value = value;
		this.next = next;
	}

	static HelpNode remove(HelpNode HelpNode, int value) {
		if (HelpNode == null)
			return null;
		System.out.println(HelpNode.value);
		if (HelpNode.value == value)
			return HelpNode.next;
		else {
			HelpNode.next = remove(HelpNode.next, value);
			return remove(HelpNode.next, value);
		}
	}

	static boolean contains(HelpNode HelpNode, int value) {
		if (HelpNode == null)
			return false;
		if (HelpNode.value == value)
			return true;
		return contains(HelpNode.next, value);
	}

}
