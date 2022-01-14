package assignments.day6;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		
		auto.Java("JAVA 8.0");
		auto.Selenium("Selenium 4");
		auto.ruby();
		auto.python();

	}

	public void Selenium(String version) {
		System.out.println("The version being used now a days "+ version);
		
	}

	public void Java(String version) {
		System.out.println("The latest Java Update was for "+ version);
		
	}

	@Override
	public void ruby() {
		System.out.println("This is a relatively new Language");
		
	}

}
