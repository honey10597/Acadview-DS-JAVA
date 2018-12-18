function A(callback)
{
	callback();
	
}

var x = function B(){
	
	console.log('hello world!');
	
}

A(x);

A(
function()
{
	
	console.log('hello world');

	}

);