package com.litmus7.app;

import com.litmus7.controller.InventoryController;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryController controller = new InventoryController();

        System.out.println("Starting single-threaded processing...");

        int processedCount[] = controller.triggerPhase1Processing();

        System.out.println("processing finished.");
        System.out.println("Total files processed: " + processedCount[0]);
        System.out.println("Files moved to processed: "+processedCount[1]);
        System.out.println("Files moved to error: "+processedCount[2]);
    }
}
