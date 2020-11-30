package test;

public class Stack {
    private int top =-1;
    private int stackSize=0;
    private char[] stackArray=null;

    public void createStack(int size){
        stackSize =size;
        stackArray = new char[size];
    }

    public void push(char element) {
        if (top != stackSize - 1) {
            stackArray[top + 1] = element;
            top++;
        } else {
            System.out.println("stack is full!");
        }
    }
    public  void pop(){
        if (!isEmpty()){
            top--;
        }else{
            System.out.println("stack is empty!");
        }
    }
    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        if (top==1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (stackSize!=-1) {
            if (top == stackSize - 1) {
                return true;
            } else {
                return false;
            }
        }else{
            System.out.println("stack is empty!");
            return false;
        }

    }
}
