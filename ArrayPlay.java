
public class ArrayPlay {
    public static void main(String [] args) {
    // let's create some arrays
    int [ ] nums = new int[30];
    // what's in nums[3]? what is nums.length?
    System.out.println("nums[3] = " + nums[3] + " length = " + nums.length);
    nums[20] = 85;
    // what's in nums[20]? what's in nums[3]?
    System.out.println("nums[20] = " + nums[20] + " nums[3] = " + nums.length);

    Box [ ] pack = new Box[40];
    // what's in package[2]?
    System.out.println(" package[2] = " + pack[2]);
    int [ ] other = nums;
    // what is in nums[4]? what is in other[20]?
    pack[5] = new Box(45, "cardboard");
    // what is the value of package[5].type?
    // what is the value of package[4]?
    // can you draw the picture of all this?
        System.out.println(" package[5].type = " + pack[5].type );


    }
}
    class Box {
    int content;
    String type; //"cardboard" or "plastic"
    public Box(int value, String type) {
    this.content = value;
    this.type = type;
    }
}
    
    