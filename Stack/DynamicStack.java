package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); //It will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); //It will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        // this takes care of it being full
        if(this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2]; // Create a new array with double the size

            //copy all previous item into the new array
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[i]; // Copy elements from the old array to the new array
            }
            data = temp; // Update the reference to point to the new array
        }

        //at this point we know that array is not full
        //insert item into the stack
        return super.push(item); // Call the push method from CustomStack to add the item
    }
}
