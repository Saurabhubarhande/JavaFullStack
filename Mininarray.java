
public class Mininarray{

public static void main (String args[]){

int arr[]={17, 12, 1, 10, 54, 10, 89};
int min =arr[0];
for(int i=0; i<arr.length;i++){
if(arr[i]<min){
min=arr[i];
}
}
System.out.println(min);
}
}