package d4exercises;

public class IntArrayList implements IntList{
    private int counter = 0;
    private int[] arrayDefault;

    public IntArrayList() {
        this.arrayDefault = new int[10];
    }

    public int[] getArrayDefault() {
        return this.arrayDefault;
    }

    public void setArrayDefault(int[] arrayDefault) {
        this.arrayDefault = arrayDefault;
    }

    @Override
    public void add(int number) {

        if (this.arrayDefault.length == counter){
            int[] arrayNew = new int[counter + counter /2];
            for (int i = 0; i< counter; i++){
                arrayNew[i] = this.arrayDefault[i];
            }
            this.arrayDefault = arrayNew;
        }
        this.arrayDefault[counter] = number;
        counter++;
    }

    //Idea: array01.get(id)
    @Override
    public int get(int id) {

        if(id<0 || id>= counter) {
            System.err.println("This id is empty or doesn't exist currently");
            return 0;
        }else{
            return this.arrayDefault[id];
        }
    }
}
