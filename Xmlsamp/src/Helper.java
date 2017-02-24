import org.springframework.beans.factory.annotation.Required;


public class Helper {
Hello h1;
public int x;
public String y;
public Helper(HelloWorld h1,int x,String y)
{
	this.h1=h1;
	this.x=x;
	this.y=y;
}

public Helper(HelloWorld h1,String y,int x)
{
	this.h1=h1;
	this.x=x;
	this.y=y;
}


public void callMeth()
{
	h1.printHello(x,y);
}
}
