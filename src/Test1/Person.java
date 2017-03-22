package Test1;

public class Person{
	private Axe axe;
	public void setAxe(Axe axe){
		this.axe=axe;
	}
	public void useAxe(){
		System.out.println("我打算去砍柴点火");
		System.out.println(axe.chop());
	}
}
