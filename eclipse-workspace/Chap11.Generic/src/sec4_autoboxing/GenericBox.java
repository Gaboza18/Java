package sec4_autoboxing;

public class GenericBox<E> {

	private E content;

	public GenericBox(E content) {
		this.content = content;
	}

	public E getContent() {
		return content;
	}

	public void setContent(E content) {
		this.content = content;
	}

	public String toString() {
		return content + "(" + content.getClass() + ")";
	}
}
