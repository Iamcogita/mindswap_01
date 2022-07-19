// 1 Write an algorithm to check if a 10 char password match with an inserted String.

const password = "0123456789" ;

function checkPassword(inputedPassword) {
    if( inputedPassword.length !== 10 )
    return false;
    if( inputedPassword !== password )
    return false;
    else
    return true;
    }
console.log( checkPassword("0123456789") );

// 2 Write an algorithm to generate 10 random numbers without repetitions between 0 and 9.

const array = [ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ] ;
const shuffledArray = array.sort((a, b) => 0.5 - Math.random());

console.log( array );

// 3 Write an algorithm to find the phone number that corresponds to a given name in a phone book.

const contacts = [
	{ name: 'Pedro', num: 918889988 },
	{ name: 'Tiago', num: 962225566 },
	{ name: 'David', num: 934445566 } ];

    
function phone(name){
for (let i = 0 ; i < contacts.length ; i++) {
    if ( contacts[i].name === name ) {
        return ( contacts[i].num ) };
        };
};

console.log( phone('David') );

// 4 Write an algorithm that converts a decimal number to its representation in the binary system.

function binary(number){
return number.toString(2);
};
console.log ( binary(420) ) ;

// 5 Write an algorithm that accepts as inputs a certain amount to be paid and the given money, and calculate all notes and coins (used in Portugal) to be given as change to the customer (minimising the amount of coins and notes).

function checkchange(value , money){
const currency = [ 500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1 , 0.5 , 0.2 , 0.1 , 0.05 , 0.02 , 0.01 ] ;
let change = money - value ;
const changeCount = [ ] ;

for(let i = 0 ; i < currency.length ; i ++ ){
    if ( currency[i] <= change ){
    changeCount.push(Math.trunc(change / currency[i] ));
    change = change - (currency[i] * (Math.trunc(change / currency[i] )));
    }
    else {
        changeCount.push(0);
    }
}
return changeCount;
}
console.log(checkchange(600, 1200));

// 6 Write an algorithm to, given an integer number N, calculate the sum of all even positive even numbers less than or equal to that number N.

function sumEvensmall( n ) {
    let sum = 0 ;
    for(let i = 0 ; i <= n ; i = i + 2 )
    sum = i + sum
    return sum ; 
}
console.log(sumEvensmall(10));