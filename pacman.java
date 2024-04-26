import java.util.Scanner;

class PacMan{
    private int posX; /*X es el suelo*/
    private int posY; /*Y es hacia arriba*/
    private int lifes;
    private int punctuation;

    public PacMan() {
        this.posX = 0;
        this.posY = 0;
        this.lifes = 3;
        this.punctuation = 0;
    }

    public void move(int newPosX, int newPosY){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Cuanto quieres moverte en X (solo puedes moverte una casilla): ");
            int moveX = scanner.nextInt();
            System.out.print("Cuanto quieres moverte en en Y (solo puedes moverte una casilla): ");
            int moveY = scanner.nextInt();

            newPosX += moveX;
            newPosY += moveY;

            this.posX = newPosX;
            this.posY = newPosY;

            System.out.println("Pac-Man se ha movido a la posición (" + this.posX + ", " + this.posY + ")");
            fruta();
        }
    }
    public void fruta() {
        this.punctuation += 100;
        System.out.println("Has recogido una cereza. Puntuación actual: " + punctuation);
    }
}


class Main {
    public static final void main(String[] args) {
        PacMan pacMan = new PacMan();
        pacMan.move(0, 0);
    }
}
