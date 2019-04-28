var grocery = ["pop tarts", "ramen noodles", "chips", "salsa", "coffee"];

grocery.push("fruit loops");

grocery[4] = "fair trade coffee";

grocery.splice (2,2, "rice", "beans");

var cart = [];

var item = grocery.pop(); 
cart.push(item);

var item2 = grocery.shift();
cart.push(item2);

while (grocery.length > 0)
cart.push (grocery.pop());

cart.sort (). reverse ();

console.log (cart.toString());
