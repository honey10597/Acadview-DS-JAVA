var http=require('http');// loading module by using this we can call its inner function

http.createServer(function(req,res){
	
	res.writeHead(200,{'content':'text/html'});
	
	res.write('<head><style>p.double{border-style:double; background:yellow;}</style></head><body background-color:yellow;><p align="middle" class="double" bgcolor="red" ><font color="red" size="20" >POCO</font></p></body>'
	 
	 );
	
	res.end();
	
}).listen(34660,function(){console.log('Server started at port 34660')}); 