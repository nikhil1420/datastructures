package com.stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); // it will call Custom stack()
    }

    public DynamicStack(int size) {
        super(size); // it will call customStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }


}
