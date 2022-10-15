package Semaforo;

public class SemaforoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread semafaro = new thread();
		
		for (int i=0; i<10; i++){
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		
		semafaro.desligarSemafaro();
	}

}
