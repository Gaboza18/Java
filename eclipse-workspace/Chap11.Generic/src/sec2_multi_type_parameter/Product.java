package sec2_multi_type_parameter;

class Car {
}

class Tv {
}

public class Product<T, M> { // <제품의 종류 타입, 제품의 이름 타입>
	private T kind;
	private M model;

	public T getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
