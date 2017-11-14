package edu.orangecoastcollege.escapethecatcher;

public class Player {
    private int mRow;
    private int mCol;

    /**
     * Handles player movement
     * Only moves the player if there is no obstruction
     * @param gameBoard The board which the player resides on
     * @param direction The direction the player is trying to move
     */
    public void move(int[][] gameBoard, String direction) {

        // TODO: Implement the logic for the move operation
        // TODO: If the gameBoard is obstacle free in the direction requested,
        // TODO: Move the player in the intended direction.  Otherwise, do nothing (player loses turn)
        switch (direction) {
            case "LEFT":
                if (gameBoard[mRow][mCol - 1] != 1)
                    --mCol;
                break;
            case "RIGHT":
                if (gameBoard[mRow][mCol + 1] != 1)
                    ++mCol;
                break;
            case "UP":
                if (gameBoard[mRow + 1][mCol] != 1)
                    ++mRow;
                break;
            case "DOWN":
                if (gameBoard[mRow - 1][mCol] != 1)
                    --mRow;
                break;
            default:
                break;

        }

    }

    public void setRow(int row) {
        mRow = row;
    }

    public int getRow() {
        return mRow;
    }

    public void setCol(int col) {
        mCol = col;
    }

    public int getCol() {
        return mCol;
    }

}
