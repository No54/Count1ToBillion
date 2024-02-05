package main  
  
import (  
 "fmt"  
 "time"  
)  
  
func main() {  
 startTime := time.Now()     
  
 i := 1  
  
 for i <= 1000000000 {  
 i++  
 }  
  
 endTime := time.Now()    
  
 span := endTime.Sub(startTime)     
  
 fmt.Println("span:", span) 
 //go 1.19.1 result: 0.2152
}