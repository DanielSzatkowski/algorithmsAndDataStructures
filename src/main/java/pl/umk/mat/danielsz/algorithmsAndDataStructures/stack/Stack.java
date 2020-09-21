package pl.umk.mat.danielsz.algorithmsAndDataStructures.stack;

public class Stack {
    private int maxSize;
    private int top;
    private char[] stackArr;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;

        stackArr = new char[maxSize];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    void push(char c){
        if(!isFull()) {
            top++;
            stackArr[top] = c;
        } else {
            throw new RuntimeException("Stack is full!");
        }
    }

    public char pop(){
        if(!isEmpty()){
            top--;
            return stackArr[this.top + 1];
        } else {
            throw new RuntimeException("Stack is empty!");
        }
    }

    public char peek(){
        if(!isEmpty()){
            return stackArr[this.top];
        }

        throw new RuntimeException("Stack is empty!");
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);

        String string = "12345";
        for(int i = 0; i < 5; i++){
            char tmp = string.charAt(i);
            stack.push(string.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
