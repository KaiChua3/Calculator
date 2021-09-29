var number = window.prompt("Enter your number: Addition +  Subtraction -    Multiply  *  Divide  /  ");
// BTW if you want to do subtraction use negative numbers
const num1 = parseInt(prompt('Enter the first number '));
const num2 = parseInt(prompt('Enter the second number '));
if (number == '+') {
  result = num1 + num2
}
else if (number == '/'){
	result = num1 / num2
	}
else if (number == '*'){
	result = num1 * num2
	}
else {
	result = num1 - num2
  }
alert(`${num1} ${number} ${num2} = ${result}`);
