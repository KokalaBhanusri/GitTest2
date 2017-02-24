import java.awt.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class HelloWorld implements Hello {
	private String name;
	public List lists;
	public Set<String> sets;
	public Map<String, String> maps;
	public Properties pro;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello(int x,String y) {
		System.out.println(" Hello ! " + name+"\n x="+x+"\n y ="+y);
	}

}
