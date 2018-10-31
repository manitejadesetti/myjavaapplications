package annotations;

public interface Wheels {
	public void rotate(String wheelType);
	
	default void material() {
		System.out.println("Wheels are rotating");
	}

}
