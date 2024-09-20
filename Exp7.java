package MyMath;
public class Arithmetic 
{
public float add(float a, float b) 
{
return a + b;
}
public float subtract(float a, float b) 
{
return a - b;
}
public float multiply(float a, float b) 
{
return a * b;
}
public float divide(float a, float b) 
{
if (b == 0) 
{
throw new ArithmeticException("Division by zero is not
allowed.");
}
return a / b;
}
}
package MyMath;
public class Stat 
{
public float min(float[] values) 
{
float min = values[0];
for (float value : values) 
{
if (value < min) 
{
min = value;
}
}
return min;
}
public float max(float[] values) 
{
float max = values[0];
for (float value : values) 
{
if (value > max) 
{
max = value;
}
}
return max;
}
public int count(float[] values) 
{
return values.length;
}
public float sum(float[] values) 
{
float sum = 0;
for (float value : values) 
{
sum += value;
}
return sum;
}
public float average(float[] values) 
{
return sum(values) / count(values);
}
}
package MyMath;
public class Trig 
{
private double angle; 
public Trig(double angle) 
{
this.angle = angle;
}
private double toRadians() 
{
return Math.toRadians(angle);
}
public double getSine() 
{
return Math.sin(toRadians());
}

public double getCosine() 
{
return Math.cos(toRadians());
}

public double getTangent() 
{
return Math.tan(toRadians());
}

public double getSecant() 
{
return 1 / Math.cos(toRadians());
}

public double getCosecant() 
{
return 1 / Math.sin(toRadians());
}

public double getCotangent() 
{
return 1 / Math.tan(toRadians());
}
}
import MyMath.Trig;
import MyMath.Arithmetic;
import MyMath.Stat;
public class PackDemo 
{
public static void main(String[] args) 
{

Trig trig = new Trig(45); 


System.out.println("Sine of 45 degrees: " + trig.getSine());
System.out.println("Cosine of 45 degrees: " + trig.getCosine());
System.out.println("Tangent of 45 degrees: " + trig.getTangent());
System.out.println("Secant of 45 degrees: " + trig.getSecant());
System.out.println("Cosecant of 45 degrees: " +trig.getCosecant());
System.out.println("Cotangent of 45 degrees: " +trig.getCotangent());

Arithmetic arithmetic = new Arithmetic();
float a = 10.5f, b = 5.2f;
System.out.println("Addition of " + a + " and " + b + ": " +arithmetic.add(a, b));
System.out.println("Subtraction of " + a + " and " + b + ": " +arithmetic.subtract(a, b));
System.out.println("Multiplication of " + a + " and " + b + ": " +arithmetic.multiply(a, b));
System.out.println("Division of " + a + " and " + b + ": " +arithmetic.divide(a, b));

Stat stat = new Stat();
float[] numbers = {1.5f, 2.3f, 4.8f, 7.6f, 5.9f};
System.out.println("Min of array: " + stat.min(numbers));
System.out.println("Max of array: " + stat.max(numbers));
System.out.println("Count of elements: " + stat.count(numbers));
System.out.println("Sum of elements: " + stat.sum(numbers));
System.out.println("Average of elements: " +stat.average(numbers));
}
}

