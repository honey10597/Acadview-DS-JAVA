/*

  ( 1 ).

function test(x){
	
	console.log(x);
	
}
test('anbc');
 
 
 ( 2 ).

var z=function(){  // annonimous fxn
	console.log('hello world');
	
}
z();

console.log(z);


  ( 3. )

var z=function(){
	console.log('inside z function');
	console.log('hello world');
}

function test(x){
	console.log('inside test function');
	x();
	console.log('test function agagin');
}
test(z);




  ( 4 ).
  */
  function test(x){
	  console.log('Inside test function');
	  
	  x();
	  console.log('test function again');
  }
  
  test(function()
  {
	  console.log('hello world');
  }
  )