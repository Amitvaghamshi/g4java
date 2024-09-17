package collectionpractice;

public interface Intr {

	void hello();
}

class IntrDemo implements Intr{
	
	@Override
   public void hello() {
		
	}
}


class C1 {
	void sayhii() {
		System.out.println("hii");
	}
}

class C2 extends C1{
	
	@Override
    void sayhii() {
		
	}
}


