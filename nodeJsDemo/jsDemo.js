var startTime = Date.now();
  
var i = 1;  
  
while (i <= 1000000000) {  
    i++;  
}  
  
var endTime = Date.now();   
  
var span = endTime - startTime;   
  
console.log("span:", span); 

//node 18.12.0 result: 0.653
