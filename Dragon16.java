public class Dragon16 {
    private int x, y, width, height;

    public void moveLeft(){
        if (x>0){
            x--;
        } else{
            detectCollision(x, y);
        }
    }
    public void moveRight(){
        if (x< width -1){
            x++;
        }else{
            detectCollision(x, y);
        }
    }
    public void moveUp(){
        if (y>0){
            y--;
        }else{
            detectCollision(x, y);
        }
    }
    public void moveDown(){
        if (y< height -1){
            y++;
        }else{
            detectCollision(x, y);
        }
    }
    public void printPosition(){
        System.out.println("Posisi: (" + x +"," + y +")");    
    }
    private void detectCollision(int x, int y){
        System.out.println("GAME OVER");
    }
    public Dragon16(int starX, int starY, int gameWidth, int gameHeight){
        x = starX;
        y = starY;
        width = gameWidth;
        height = gameHeight;
    }
}
