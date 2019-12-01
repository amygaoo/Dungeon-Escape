package com.example.dungeonescape.maze;

import java.util.ArrayList;

/** Contains all data for the Maze Game. */
class MazeData {

    /** A 2D Array of MazeCell cells. */
    private MazeCell[][] cells;

    /** A list of coins that can be collected for score. */
    private ArrayList<MazeCoin> coins;

    /** The number of columns and rows in this Maze. */
    private int numMazeCols;
    private int numMazeRows;

    /** The size of each MazeCell in pixels. */
    private float cellSize;

    /** The horizontal and vertical margin from the edge of the screen to the walls of the maze */
    private float horizontalPadding;
    private float verticalPadding;

    MazeData(){}

    /** Calculates the cellSize based on the screen's dimensions.
     *
     * @param screenWidth the width of the phone screen in pixels.
     * @param screenHeight the height of the phone screen in pixels.
     */
    void calculateCellSize(int screenWidth, int screenHeight) {
        float newCellSize;
        float screenWidthDivHeight = screenWidth / screenHeight;
        float mazeColsDivRows = numMazeCols / numMazeRows;

        if (screenWidthDivHeight < mazeColsDivRows) {
            newCellSize = screenWidth / (numMazeCols + 1);
        } else {
            newCellSize = screenHeight / (numMazeRows + 1);
        }

        setCellSize(newCellSize);
    }

    /**
     * Calculates the cell's horizontal padding based on the screen's width and calculated cell size.
     *
     * @param screenWidth the width of the phone screen in pixels.
     */
    void calculateCellHorizontalPadding(float screenWidth) {
         setHorizontalPadding((screenWidth - (numMazeCols * cellSize)) / 2);
    }

    /**
     * Calculates the cell's vertical padding based on the screen's height and calculated cell size.
     *
     * @param screenHeight the height of the phone screen in pixels.
     */
    void calculateCellVerticalPadding(float screenHeight) {
        setVerticalPadding((screenHeight - (numMazeRows * cellSize)) / 2);
    }

    int getNumMazeCols() {
        return this.numMazeCols;
    }

    /** Sets the number of columns in this Maze.
     *
     * @param numMazeCols the number of columns.
     */
    void setNumMazeCols(int numMazeCols) {
        this.numMazeCols = numMazeCols;
    }

    int getNumMazeRows() {
        return this.numMazeRows;
    }

    /** Sets the number of rows in this Maze.
     *
     * @param numMazeRows the number of rows.
     */
    void setNumMazeRows(int numMazeRows) {
        this.numMazeRows = numMazeRows;
    }

    MazeCell[][] getCells() {
        return this.cells;
    }

    /** Sets the cells array to the inputted array.
     *
     * @param cells the 2D array of MazeCell objects.
     */
    void setCells(MazeCell[][] cells) {
        this.cells = cells;
    }

    ArrayList<MazeCoin> getCoins() {
        return this.coins;
    }

    /** Sets the MazeCoins array to the inputted array.
     *
     * @param coins the List of MazeCoins.
     */
    void setCoins(ArrayList<MazeCoin> coins) {
        this.coins = coins;
    }

    float getCellSize() {
        return this.cellSize;
    }

    /** Sets the cellSize in pixels.
     *
     * @param cellSize the float value of the cellSize.
     */
    private void setCellSize(float cellSize) {
        this.cellSize = cellSize;
    }

    float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /** Sets the horizontalPadding of the Maze.
     *
     * @param horizontalPadding the float value.
     */
    private void setHorizontalPadding(float horizontalPadding) {
        this.horizontalPadding = horizontalPadding;
    }

    float getVerticalPadding() {
        return this.verticalPadding;
    }

    /** Sets the verticalPadding of the Maze.
     *
     * @param verticalPadding the float value.
     */
    private void setVerticalPadding(float verticalPadding) {
        this.verticalPadding = verticalPadding;
    }
}
