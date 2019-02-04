public class Space {
    private Owner owner;
    private int x;
    private int y;
    private int width;
    private int height;
    private int rowID; // just in case this information is needed later
    private int columnID; // just in case this information is needed later

    public Space(int x, int y, int width, int height, int r, int c){
        owner = Owner.NONE;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rowID = r;
        this.columnID = c;
    }

    public Owner getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public void display(){
        // display the space with its label

    }

    public boolean handleClick(int mouseX, int mouseY){
        // if the click was in this space, and it's unclaimed, claim it for human
        boolean didHandle = false;

        return didHandle;
    }
}
