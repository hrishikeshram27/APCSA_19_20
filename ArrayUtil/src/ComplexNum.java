public class ComplexNum implements Comparable<ComplexNum>{
	private double real; // real part
	private double imag; //imaginary part
	private double r;
	private double theta;
	
	//default constructor.
	//set real = imag = 0;
	ComplexNum()
	{
		real = 0;
		imag = 0;
		this.polarize();
	}
	
	//specific constructor
	//use this. keyword to set private variables
	ComplexNum(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
		this.polarize();
	}

	public double getReal(){return this.real;}
	public double getImag(){return this.imag;}
	public double getR(){return this.r;}
	public double getTheta(){return this.theta;}
	
	//add a complex number to this
	//complex number. return a ComplexNum
	public ComplexNum plus(ComplexNum a)
	{	
		ComplexNum b = new ComplexNum(this.real+a.getReal(), this.imag+a.getImag());
		return b;
	}
	
	//subtract
	public ComplexNum minus(ComplexNum a)
	{
		ComplexNum b = new ComplexNum(this.real-a.getReal(), this.imag-a.getImag());
		return b;
	}
	
	public ComplexNum times (ComplexNum a)
	{
		ComplexNum b = new ComplexNum((this.real*a.getReal())-(this.imag*a.getImag()), (this.imag*a.getReal())+(this.real*a.getImag()));
		return b;
	}
	
	// return the complex conjugate
	public ComplexNum conjugate()
	{
		ComplexNum b = new ComplexNum(this.real, this.imag*(-1));
		return b;
	}
	
	// return the rationalized version of this 
	// complex number.
	// 1/(a+bi) where a+bi is the current object
	public ComplexNum rationalize()
	{
		ComplexNum b = new ComplexNum(this.real/((this.real*this.real)+(this.imag*this.imag)), ((-1)*this.imag)/((this.real*this.real)+(this.imag*this.imag)));
		return b;
	}
	
	public void polarize()
	{
		this.r = (Math.sqrt(((this.real*this.real)+(this.imag*this.imag))));
		this.theta = (Math.atan(this.imag/this.real));
	}
	
	public boolean equals(ComplexNum a) {
		a.polarize();
		this.polarize();
		if(a.getR()==this.r)
			return true;
		return false;
	}
	
	public int compareTo(ComplexNum a) {
		a.polarize();
		this.polarize();
		if(Math.abs(a.getR()-this.r)<0.001)
			return 0;
		else if(this.r>a.getR())
			return 1;
		else
			return -1;
	}
	
	public static void bubbleSort(ComplexNum[] arr) {
		ComplexNum temp = new ComplexNum();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])==1) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public String toString(){
		return this.real + "+" + this.imag + "j";
	}
}