public class MathExp {
    public static void main(String[] args) {
        /**Method Description
sin(radians)  Returns the trigonometric sine of an angle in radians.
cos(radians)  Returns the trigonometric cosine of an angle in radians.
tan(radians)  Returns the trigonometric tangent of an angle in radians.
toRadians(degree)   Returns the angle in radians for the angle in degree.
toDegree(radians)   Returns the angle in degrees for the angle in radians.
asin(a)           Returns the angle in radians for the inverse of sine.
acos(a)           Returns the angle in radians for the inverse of cosine.
atan(a)           Returns the angle in radians for the inverse of tangent. 
eg-----Math.toDegrees(Math.PI / 2) returns 90.0
Math.toRadians(30) returns 0.5236 (same as π/6)
Math.sin(0) returns 0.0
Math.sin(Math.toRadians(270)) returns -1.0
Math.sin(Math.PI / 6) returns 0.5
Math.sin(Math.PI / 2) returns 1.0
Math.cos(0) returns 1.0
Math.cos(Math.PI / 6) returns 0.866
Math.cos(Math.PI / 2) returns 0
Math.asin(0.5) returns 0.523598333 (same as π/6)
Math.acos(0.5) returns 1.0472 (same as π/3)
Math.atan(1.0) returns 0.785398 (same as π/4)

Method Description
exp(x) Returns e raised to power of x (ex
).
log(x) Returns the natural logarithm of x (ln(x) = loge(x)).
log10(x) Returns the base 10 logarithm of x (log10(x)).
pow(a, b) Returns a raised to the power of b (ab
).
sqrt(x) Returns the square root of x (2x) for x 7 = 0.
TABLE 4.2 Exponent Methods in the Math Class
For example,
Math.exp(1) returns 2.71828
Math.log(Math.E) returns 1.0
Math.log10(10) returns 1.0
Math.pow(2, 3) returns 8.0
Math.pow(3, 2) returns 9.0
Math.pow(4.5, 2.5) returns 22.91765
Math.sqrt(4) returns 2.0
Math.sqrt(10.5) returns 4.24
*/
  /** double a = Math.log(Math.exp(5.5));
   double b = Math.exp(Math.log(5.5));
System.err.println("a is and b is  "+a+" "+b);  */

System.out.println('a' < 'b');
System.out.println('a' <= 'A');
System.out.println('a' > 'b');
System.out.println('a' >= 'A');
System.out.println('a' == 'a');
System.out.println('a' != 'b');
char a=(char)(97+ (1 +Math.random()*25));
System.err.println(a);
       }
    
}
