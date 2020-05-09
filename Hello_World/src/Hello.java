
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world"); 
		// TODO Auto-generated method stub
		int a=2;
float b=2.5f;

int c=(int)((a*a)+(2*a*b)+(b*b));

System.out.println(c);

int i=12345;
int j=0,sum1=0,div;

while(i>0)
{
	int rem=i%10;
	sum1=sum1+rem;
	i=i/10;
}
System.out.println(sum1);
	}

}
