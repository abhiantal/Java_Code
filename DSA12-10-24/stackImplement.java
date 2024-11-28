//stack implementation using Array
class stack{
    static int max=4;
    int top;
    int stack[]=new int[max];

    stack(){
    top=-1;
    }
    boolean underflow(){
    return(top<0);
    }

    boolean push(int data){ 
        if(top>=(max-1)){
            System.out.println("stack is overflow push operation Can't");
            return false;
        }
        else{
            top=top+1;
            stack[top]=data;
            System.out.println("push operation done with "+data);
            return true;
        }
    }
int pop()
{
    if(top<0)
    {
        System.out.println("stack is underflow");
        return 0;
    }
    else
    {
        int temp=stack[top];
        top=top-1;
        return temp;
    }
}
int peek()
{
    if(top<0)
    {
        System.out.println("stack is underflow with peek");
        return 0;
    }
    else
    {
        int temp=stack[top];
        System.out.println("peek value of stack is "+temp);
        return temp;
    }
}
}

public class stackImplement {
    public static void main(String[] args) {
        stack st=new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //st.push(50);

        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop(); 
    
        st.peek();
      

    }
    
}
