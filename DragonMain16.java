public class DragonMain16 {
    public static void main(String[] args) {
        Dragon16 drag = new Dragon16(2, 4, 15,15);
        drag.moveLeft();
        drag.moveRight();
        drag.moveUp();
        drag.moveDown();

        drag.printPosition();
    }
    
}
