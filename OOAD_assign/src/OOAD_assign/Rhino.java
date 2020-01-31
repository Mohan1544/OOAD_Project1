package OOAD_assign;

public class Rhino extends Pachyderm{
	String name;
	int status=0;
	public Rhino(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setStatus() {
		this.status=1;
	}
	
	public int getStatus() {
		return status;
	}
	
	public String makeNoise() {
		return "is making sounds like grunting,growling,mooing,squealing";
	}
}