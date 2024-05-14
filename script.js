// const foo=()=>{
//     return 'Oy teri';
// }

// const result=foo();

//  console.log(result);

//  function fu(){
//     let a=1;
//     let b=2;
// c=3;
    
//       console.log(a);
//      console.log(b);
//      console.log(c);
//  }


//  const res=fu();
//  console.log(0o13323);

//  var arr=[];
//  console.log(arr.length);
// //  console.log(b);
//  console.log(c);

// var x=20;
// function foo() {
//     console.log(x);
//  x=10;
// }

// foo();
// console.log(x);

// foo();

// var foo=20;
// console.log(foo);
// function foo() {
//     console.log("calling foo");
// }

// foo();

// console.log(typeof(undefined));

// if(typeof(undefined)!=null){
//     console.log("not equal");
// }

// let i=100;
// if(1){
//     console.log(i);
//     let i=10;
// }

// console.log(i);

// console.log(3/0);

// console.log("Hello world");
// function check(){
//     var result="";
//     if(a==8){
//         result="Even";
//     }
//     else{
//         result="odd";
//     }
// }
// var a=8;
// var res;
// res=check();
// console.log(res);

// var a=10;
// if(a>10){
//     var b=90;
// }
// console.log(b); // Undefined

// var a=10;
// if(a>=10){
//     var c=120;
//     b=90;
//     console.log(b); // 90
//     var d=100;
// }
// var e=100;
// console.log(b);  // 90

// if(0){console.log("I am Zero");}  // print nothing as it is treated as false
// if('0'){console.log("I am Zero");} // I am Zero
// if(''){console.log("I am Zero");} // print nothing as it is treated as false
// console.log(Number("jdsvjsdjv")); // nan

// var a=1;
// while(a<=10)
//  console.log(a); // infinity

// function forLoop(start,end, step) {
//     for(var i=start;i<=end;i+=step){
//         console.log(i);
//     }
// }

 // forLoop(5,20,1);
 //forLoop(90,100,1);

//  var logValue=function logMsg(msg){
//     console.log(msg);
//  }
//  logValue(100); // 100
// console.log(logValue); // f logMsg(msg){ console.log(msg);}

// global and function scope

// function add(a) {
//     var b=90;
//     return a+b;
// }

// var sum=add(100);
// console.log(sum); // 190
// console.log(b); // prints nothing and var b has function scope and not accessible outside

// function add(a) {
//      b=90;
//     return a+b;
// }

// var sum=add(100);
// console.log(sum); // 190
// console.log(b);  // 90

// var books=["NCERT", 99,'s'];
// console.log(books.length); // 3

// books.push('77',5868);
// console.log(books.length); // 5

// books.pop();
// console.log(books.length); // 4

// books.shift();
// console.log(books[0]); // 99

// books.unshift("Hello");
// console.log(books[0]); // Hello

// for (let index = 0; index < books.length; index++) {
//     console.log(books[index]);
// }

// function loop(element){
//     console.log(element);
// }
// books.forEach(loop)


// books.forEach(element=>console.log(element));

// books.forEach(function (books,index){
//     console.log(books,index);
// })

// books.map(element=>console.log(element))

// var arr=[1,2,3,4,5];
// // arr.map((element)=>{console.log(element*element);})

// arr.splice(2,2,6,7); 
// arr.map((element)=>{console.log(element);}) //1,2,6,7,5

// console.log(arr);  // [1,2,6,7,5]
// arr=[];
// console.log(arr); // []

// var books={name:"RD sharma",price : 324.23, pages:233};
// // console.log(books);

// // Object.keys(books).forEach(element => {
// //     console.log(element,books[element]);
// // });

// var keys=Object.keys(books);
// var values=Object.values(books);
// // keys.forEach(key=>{
// //     console.log(key,books[key]);
// // });


//  // OR

//  for(var i=0;i<keys.length;i++){
//     console.log(keys[i],books[keys[i]]);
//  }


// Object inside Object

// var obj={user : {name:"Sandip", age:29}};
// console.log(obj);

// var res=document.querySelector('h1').textContent;
// console.log(res);

// document.querySelector("second").style.color='red';

//  document.querySelector("second").classList.add('orange');

// function add() {
//     console.log(arguments);
// }


// var [_,_,z]=[1,2,3];
// console.log(z);

// var a=[1,2,3,4,5,6];
// var sum=a.reduce(add);

// function add(accumulator,element){
//     return accumulator+element;
// }

// console.log(sum);

// let arr = [1, 2, 3, 4 ];
// let newArr = arr.slice(1, 4); // Extracts elements from index 1 to 3 (end index is exclusive)
// console.log(newArr); // Output: [2, 3, 4]

// // Original array remains unchanged
// console.log(arr); // Output: [1, 2, 3, 4, 5]

// arr.splice(2, 1); // Removes one element at index 2
// console.log(arr); // Output: [1, 2, 4]

// arr.splice(1, 1, 'a', 'b'); // Inserts 'a' and 'b' at index 1
// console.log(arr); // Output: [1, 'a', 'b',3,4 ]


// Scaope Chaining

// var res=100;
// let f=90;
// function add(b){
//     var c=90;
//     return b+c;
// }

// if(f>0){
//     console.log(res); // 100  // global scope
//     console.log(f); // 90 - global scope
//     let c=120;
//     let sum=add(123);
//     console.log(sum); // 213 - after this the Sum is deleted as it comes out of the block scope

// }

// console.log(sum); // nothing as here sum is not defined

// let a=10;
// if(a>0){
//     let a=23;
//     console.log(a);
// }console.log(a);

// var arr=new Array("jai", 213, "33");
// console.log(arr);

// Input array
// let arr = [10, 20, 30, 40, 50, 60];
// // Callback function for reduce method
// function sumofArray(sum, num) {
//     // console.log(sum);
// 	return sum + num;
// }
// //Fucntion to execute reduce method 
// function myGeeks(item) {
// 	// Display output
// 	console.log(arr.reduce(sumofArray));
// }
// myGeeks();

 // Promise

//  let promise1=new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         console.log("Promise 1");
//     },1000);
//  })
//  let promise2=new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         console.log("Promise 2");
//     },2000);
//  })

//  let promise3=new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         console.log("Promise 3");
//     },3000);
//  })

//  Promise.allSettled([promise1,promise2,promise3]).then((res)=>{
//     console.log("Res >>>",res);
//  })

//  Promise.all([promise1,promise2,promise3]).then((res)=>{
//     console.log("Res >>>",res);
//  })


// const pro1 = new Promise((resolve, reject) => {
//     setTimeout(() => resolve("one"), 1000);
//   });
  
//   const pro2 = new Promise((resolve, reject) => {
//     setTimeout(() => resolve("two"), 2000);
//   });
  
//   const pro3 = new Promise((resolve, reject) => {
//     setTimeout(() => reject("rejected"), 3000);
//   });
  
//   Promise.allSettled([pro1, pro2, pro3])
//     .then((values) => {
//       console.log(values);
//     })
//     .catch((error) => {
//       console.log(error);
//     });

// const addition = (a, b) =>
//     new Promise((resolve, reject) => {
//       if (typeof a == "number" && typeof b == "number") {
//         resolve(a + b);
//       } else {
//         reject("Not a Number");
//       }
//     });
  
//   addition(10, 5)
//     .then((response) => {
//       console.log(response);
//     })
//     .catch((err) => {
//       console.log(err);
//     })
//     .finally(() => {
//       console.log("Numbers are added");
//     });

// ASYNC and AWAIT

// function asynchronous_operational_method() {
// 	let first_promise = 
// 		new Promise((resolve, reject) => resolve("Hello"));
// 	let second_promise = 
// 		new Promise((resolve, reject) => {
// 		setTimeout(() => {
// 			resolve(" GeeksforGeeks..");
// 		}, 1000);
// 	});
// 	let combined_promise = 
// 		Promise.all([first_promise, second_promise]);
// 	return combined_promise;
// }

// async function display() {
// 	let data = await asynchronous_operational_method();
// 	console.log(data);
// }
// console.log(1);
// display();
// console.log(12);

// Original object
// const calculator = {
//     add: function (a, b) {
//         return a + b;
//     }
// };

// // Monkey patching to add a new method
// calculator.subtract =  (a, b) =>{
//     return a - b;
// };

// console.log(calculator.add(5, 3));
// console.log(calculator.subtract(5, 3));

console.log(b);
let b=10;