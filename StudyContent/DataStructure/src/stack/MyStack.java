package stack;

public class MyStack {
    private int[] stack; // 데이터를 저장할 배열
    private int size = 0; // 데이터 개수

    public MyStack() {
        stack = new int[8];
    }

    public MyStack(int size) {
        stack = new int[size];
    }

    /* 2024-03- Jang */
    public void push(int data) {
        /* 저장 공간이 부족할 경우 2배로 늘릴 것! */
    }

    /* 2024-03- Lee */
    public int pop() {
        return 0;
    }

    /* 2024-03- Jeon */
    //최근에 추가 된 데이터를 조회 만약, 스택이 비어있을 경우 "스택이 비어있습니다." 출력

    public int peek() {
        if(size == 0){
            System.out.println("스택이 비어있습니다!");

            return -1;
        }
        
        return stack[size];
    }

    public void printStack() {
        System.out.print("Stack: ");
        for (int temp : stack) {
            System.out.print(temp + " ");
        }
        System.out.println(" Size: " + stack.length);
    }
}