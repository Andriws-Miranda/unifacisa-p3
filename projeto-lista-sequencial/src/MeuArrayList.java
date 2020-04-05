
public class MeuArrayList {

	private static final int ALLOCATION = 3;
	
	private Object[] arrayInterno = new Object[ALLOCATION];
	
	private int inseridos;
	
	public void add(Object obj) {

		if (arrayInterno.length<inseridos) {
			Object[] novoArray=new Object[arrayInterno.length+ALLOCATION];
			for(int i=0; i<arrayInterno.length;i++) {
				novoArray[i]=arrayInterno[i];
			}
			arrayInterno=novoArray;
		}
		arrayInterno[inseridos] = obj;
		inseridos++; 
	}

	public void remove(Object obj) {
		Object[] novoArray = new Object[arrayInterno.length-1];
		for(int i=0;i<arrayInterno.length;i++) {
			if(arrayInterno[i]!=obj) {
				novoArray[i]=arrayInterno[i];
			}else {
				continue;
			}
		}
		arrayInterno=novoArray;
		inseridos--;
	}

	public void remove(int index) {
		Object[] novoArray = new Object[arrayInterno.length-1];
		for(int i=0; i<arrayInterno.length;i++) {
			if(i!=index) {
				novoArray[i]=arrayInterno[i];
			}else {
				continue;
			}
		}
		arrayInterno=novoArray;
		inseridos--;
	}

	public int size() {
		return inseridos;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
}