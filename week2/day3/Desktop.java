package week2.day3;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("desktop size");
	}

	public static void main(String[] args)
	{
	 Desktop desk=new Desktop();
	 Computer comp =new Computer();
	 comp.computerModel();
	 desk.desktopSize();
	}
}
