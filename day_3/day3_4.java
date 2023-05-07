/*Write a program to calculate simple Interest(SI) and Compound Interest(CI)?
Principle : 1000
Rate of Interest : 15%
Time : 3 years
*/


class day3_4
{
	public static void main(String[] args)
	{
		double p=1000;
		double r=15;
		double t=3;
		double SI=(p*t*r)/100;
		System.out.println(SI);
		double res=1+r/100;
		double n=2*t;
		
		//CI=p(1+r/100)^tn-p
		double CI=p*Math.pow(res,n)-p;
		System.out.println(CI);
		
	}
}
