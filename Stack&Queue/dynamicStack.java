public class dynamicStack extends customStack{
    
    public dynamicStack () {
        super(); //calling parent class constructor which has no argument
    }

    public dynamicStack(int size) {
        super(size); //calling parant class constructor which has one argument 
    }

    @Override
    public boolean push(int item) {
        
        if ( isFull() ) { //if it will full it will make a new array of 2x size and copy previous array element 

            int[] temp = new int[ data.length * 2];//made a new array of 2x length

            for (int i = 0; i < data.length; i++) { //copy previous array element into new array 
                
                temp[i] = data[i];


            }

            data = temp;//new array will become previou one 

        }
        
        //if is not full
        return super.push(item);
    }

    
}
