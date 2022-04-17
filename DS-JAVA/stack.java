import java.util.Arrays;
class stack{

     public static void main(String[] args) {
          System.out.println("hello");
          Stackk s=new Stackk(4);
                  s.push(1);
                  s.push(2);
                  s.push(3);
                  s.push(4);
                  s.show();
                  s.pop();
                  s.show();
     }
}

class Stackk{
     int top=-1;
     int size=10;
     int arr[]; 
     Stackk(int size){
          this.size=size;
          arr =new int[this.size];
     }
     public void push(int item){
                if(this.top==this.size-1){
                     System.out.println("null");
                     return;
                } 
                this.top+=1;
                arr[this.top]=item; 
                return; 
              }
                //pop fn
                public void pop(){
                     if(this.top==-1){
                          System.out.println("full");
                          return ;
                     } 
                     System.out.println(arr[this.top]+" removed");
                     this.arr[top]=0;
                     this.top-=1;
                       
                }
                //show stack
                public void show(){
                     if(this.top==-1){
                          System.out.println("empty");
                          return;
                          
                     }
                     System.out.println("stack: "+ Arrays.toString(arr)+" top: "+this.top);
                     
                }

}