var startTime = DateTime.Now;

int i = 1;

while(i<=1000000000){
    i++;
}

var endTime = DateTime.Now;

var span = (endTime - startTime); 

Console.WriteLine("span:" + span); 

//.net8 result: 1.4821