import time  
  
start_time = time.time()
  
i = 1  
  
while i <= 1000000000:  
    i += 1  
  
end_time = time.time()  
  
span = end_time - start_time  
  
print("span:", span)  

# python 3.10.11 result: 56.5398