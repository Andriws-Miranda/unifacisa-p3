
public class MeuArrayList {

	private static final int ALLOCATION = 3;
	
	private Object[] arrayInterno = new Object[ALLOCATION];
	
	private int inseridos;
	
	public void add(Object obj) {

		arrayInterno[inseridos] = obj;
		inseridos++;
		if (arrayInterno.length<inseridos) {
			Object[] novoArray=new Object[ALLOCATION*2];
			for(int i=0; i<arrayInterno.length;i++) {
				novoArray[i]=arrayInterno[i];
			}
			arrayInterno=novoArray;
		}
	}

	public void remove(Object obj) {

		inseridos--;
	}

	public void remove(int index) {

		inseridos--;
	}

	public int size() {
		return inseridos;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
}
