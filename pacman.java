import java.util.Scanner;

class PacMan{
    private int posX; /*X es el suelo*/
    private int posY; /*Y es hacia arriba*/
    private int lifes;
    private int punctuation;

    public PacMan() {
        this.posX = 0;
        this.posY = 0;
        this.lifes = 0;
        this.punctuation = 0;
    }

    public void move(int newPosX, int newPosY){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuanto quieres moverte en X: ");
        int moveX = scanner.nextInt();
        System.out.print("Cuanto quieres moverte en en Y: ");
        int moveY = scanner.nextInt();

        newPosX += moveX;
        newPosY += moveY;

        this.posX = newPosX;
        this.posY = newPosY;

        System.out.println("Pac-Man se ha movido a la posición (" + this.posX + ", " + this.posY + ")");
    }
}

class Main {
    public static final void main(String[] args) {
        PacMan pacMan = new PacMan();
        pacMan.move(0, 0);
    }
}
