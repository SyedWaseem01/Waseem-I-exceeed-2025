console.log("Waseem");

//toString()
let a = 5;
console.log(typeof(a));
let b = a.toString();
console.log(typeof(b));

//valueOf()
let date  = new Date();
console.log(date);
console.log(date.valueOf());


//Push()
let fruit = ['apple','mango','guava'];
fruit.push("banana");
for(var i=0;i<fruit.length;i++)
{
    console.log(fruit[i]);
}

//Pop
fruit.pop();
for(var i=0;i<fruit.length;i++)
{
    console.log(fruit[i]);
}

//Slice

console.log(fruit.slice(1,2));

for(var i=0;i<fruit.length;i++)
{
    console.log(fruit[i]);
}


//Imperative
let num = [1,2,3,4,5];
let doublenum = [];
for(let i=0;i<num.length;i++)
{
    doublenum.push(num[i]*2);
}
console.log(doublenum);

//declarative
let nums = [1,2,3,4,5];
let doubnum = num.map(n => n*2);
console.log(doubnum);

//oops
let person = {
    name  : "Waseem",
    age : 21,
    greet : function(){
        return "Hello "+this.name;
    }
}

console.log(person.greet());

