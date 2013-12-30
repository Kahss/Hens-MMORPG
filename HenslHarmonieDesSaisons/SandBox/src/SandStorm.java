import java.net.URL;

public class SandStorm {
	public static void main(String[] args) {
		final URL test = SandStorm.class.getResource("");
		final String test2 = test.toString().substring("file:/".length(),test.toString().length());
		System.out.println(test);
		System.out.println(test2);
	}
}
