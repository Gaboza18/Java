package sec2_multi_type_parameter;

public class ProductTest {

	public static void main(String[] args) {

		// Product p1 = new Product(); -> ���� ��ü���� ��
		Product<Tv, String> p1 = new Product<Tv, String>();

		p1.setKind(new Tv());
		p1.setModel("����Ʈ TV");

		Tv tv = p1.getKind();
		String tvModel = p1.getModel();

		Product<Car, String> c1 = new Product<Car, String>();

		c1.setKind(new Car());
		c1.setModel("�ƿ��");

		Car car = c1.getKind();
		String carModel = c1.getModel();

	}

}
