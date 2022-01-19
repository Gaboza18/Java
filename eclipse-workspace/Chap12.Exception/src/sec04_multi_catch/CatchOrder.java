package sec04_multi_catch; // ������ RunConfiguration -> arguments �Է��ؼ� ��� ���!

/*
 *  command line argument �Է½� ���� ����ó��
 */
public class CatchOrder { // ���� catch��

	public static void main(String[] args) {

		// command line ���� 2���� ���ڸ� �Է��Ѵٰ� ����
		try {
			String data1 = args[0];
			String data2 = args[1];

			// �ΰ��� ���ڿ��� ���ڷ� ��ȯ
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println("result= " + result);

		} catch (ArrayIndexOutOfBoundsException e) { // �迭 �ε��� �� ���� �ʰ��ϰų� �����Ҷ� ����
			System.out.println("���� �Է°��� ������ �����մϴ�.");
			System.out.println("[������]: java ExceptionKindEx num1, num2");

		} catch (NumberFormatException e) { // �����Է������� ����
			System.out.println("���ڷ� ��ȯ�Ҽ� ���� �������Դϴ�.");

		} catch (Exception e) { // ���� ������ ���� ó���� �ڿ� ��ġ�Ѵ�.(1,2�� catch�� �̿��� �����Ǵ��Ѵ�))
			System.out.println("���࿡ ������ �߻��߽��ϴ�.");

		} finally {
			System.out.println("�ٽ�");
		}
	}

}
