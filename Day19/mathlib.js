/*

Math.E  	Euler's number (≈ 2.718)
Math.PI 	Pi (≈ 3.14159)
Math.SQRT2 	Square root of 2
Math.SQRT1_2	Square root of 1/2
Math.LN2	Natural log of 2
Math.LN10	Natural log of 10
Math.LOG2E	Log base 2 of E
Math.LOG10E	Log base 10 of E

Math.abs(x)	    Absolute value
Math.ceil(x)	Round up to nearest integer
Math.floor(x)	Round down to nearest integer
Math.round(x)	Round to nearest integer
Math.trunc(x)	Remove decimal (ES6+)

Math.pow(x, y)	x to the power of y
Math.sqrt(x)	Square root
Math.cbrt(x)	Cube root (ES6+)
Math.hypot(...x)	√(x² + y² + ...), Euclidean distance

Math.min(...args)	Smallest of arguments
Math.max(...args)	Largest of arguments


Math.random()   Random number between 0–1

Math.sin(x)	    Sine
Math.cos(x)	    Cosine
Math.tan(x)	    Tangent
Math.asin(x)	Arcsine
Math.acos(x)	Arccosine
Math.atan(x)	Arctangent
Math.atan2(y, x)	Arctangent of y/x (quadrant aware)


Math.log(x)	    Natural log (base e)
Math.log2(x)	Log base 2
Math.log10(x)	Log base 10
Math.exp(x)	    e to the power of x
Math.expm1(x)	e^x − 1
Math.log1p(x)	log(1 + x)

Math.sign(x)	Sign of number (-1, 0, 1)
Math.clz32(x)	Leading zero bits in 32-bit integer
Math.fround(x)	Nearest 32-bit float
Math.imul(a, b)	32-bit integer multiplication



*/


//Arithmetic

//1.abs
/*
-It does not modify the original number, it returns the new values
- Useful in distance calculation

*/
console.log(Math.abs(-1));     //Math.abs() --> converts the non positive number to positive number
console.log(Math.abs("-5"));
console.log(Math.abs("Hello"));

//2.ceil
console.log("ceil");
console.log(Math.ceil(4.1));    //rounds up to the integer greater than x 
console.log(Math.ceil(7.9));     
console.log(Math.ceil(3));       
console.log(Math.ceil(-2.3));    
console.log(Math.ceil(-7.9));

//3.floor
console.log("floor");
console.log(Math.floor(4.1));   //rounds up to the integer smaller than x 
console.log(Math.floor(7.9));
console.log(Math.floor(-2.3));

//4.round
console.log("round");
console.log(Math.round(4.4)); // <.5 then round to down Or >=.5 rounds to up 
console.log(Math.round(-2.5));
console.log(Math.round(4.5));

//5.trunc
console.log("Trunc");       //Removes decimal part  
console.log(Math.trunc(4.9));
console.log(Math.trunc(6.5));
console.log(Math.trunc(-5.8));

//6. Power and Roots
console.log("Power and roots");
console.log(Math.pow(2, 3));     // 2^3 = 8
console.log(2 ** 3);             // 8 (same as pow)
console.log(Math.sqrt(16));      // √16 = 4
console.log(Math.cbrt(27));      // 3√27 = 3
console.log(Math.hypot(3, 4));   // 5 (Pythagorean theorem √(3² + 4²))
console.log(Math.clz32(16));     //00000000000000000000000000010000  = return 27 zerores

//7. Min and Max

console.log("Min and max");
console.log(Math.min(3, 5, -1));  // -1
console.log(Math.max(3, 5, -1));  // 5


//8. Random number

console.log("Random Number"); //Prints a random number from 0 to 1
console.log(Math.random());
//For a randon number from 1 to 10
console.log(Math.floor(((Math.random() *10) +1)));
//0.17621086925424745
console.log((0.97621086925424745*10)+1);


//9.Trignometric

//to get degree convert to the radians
// radians = degree * (Math.PI / 180))
//sin(30) = Math.sin(30 * (Math.pi/180))
console.log("Math.sin(angle):", Math.sin(30 * (Math.PI / 180)));           // Sine of 30°
console.log("Math.cos(angle):", Math.cos(30 * (Math.PI / 180)));           // Cosine of 30°
console.log("Math.tan(angle):", Math.tan(30 * (Math.PI / 180)));           // Tangent of 30°

/*
let x = 0.5;
let angle = Math.asin(x);  // ~0.5236 radians
console.log(angle);        // radians
console.log(angle * 180 / Math.PI); // degrees ≈ 30°
*/
// 1/2 = sin(30)  -->  asin((1/2) * (180/Math.PI))
console.log("Math.asin(y):", (Math.asin(0.49999999999999994) *(180/Math.PI))); //print radians  and degree after converting                // Arcsine of sin(30°)
console.log("Math.acos(x):", Math.acos(0.8660254037844387)*(180/Math.PI));                 // Arccosine of cos(30°)
console.log("Math.atan(x):", Math.atan(0.5773502691896257)*(180/Math.PI));                  // Arctangent of tan(30°)
// console.log("Math.atan2(y, x):", Math.atan2(y, x)); 



//10. Logarithm and Exponential

console.log("Logarithm and exponential");
console.log(Math.log(2));  //base e
console.log(Math.LN2); // log 2 to base e
console.log(Math.log(10));  //log 10 to bse e
console.log(Math.LN10);    //log 10 to base e
console.log(Math.LOG10E);  //log e to base 10
console.log(Math.LOG2E);   // log e to bse 2
console.log(Math.log2(8)); //base 2
console.log(Math.log10(2)); //base 10
console.log(Math.exp(1))  //e^1
console.log(Math.expm1(1)); // e^x -1 and more accurate than Math.exp(x)-1
console.log(Math.log1p(1)); //log(1+x)



