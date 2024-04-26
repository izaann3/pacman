class PacMan{
    private int posX = 0; /*X es el suelo*/
    private int posY = 0; /*Y es hacia arriba*/

    public move(int newPosX, int newPosY){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuanto quieres moverte en X: ");
        int moveX = scanner.nextInt();
        System.out.print("Cuanto quieres moverte en en Y: ");
        int moveY = scanner.nextInt();
    }
}
