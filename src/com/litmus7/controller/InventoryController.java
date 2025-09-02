package com.litmus7.controller;
import java.io.File;

import com.litmus7.services.InventoryService;

public class InventoryController {

    private final InventoryService service = new InventoryService();

    
    public int[] triggerPhase1Processing() {
        File[] files = service.getCsvFiles();
        if (files == null || files.length == 0) {
            System.out.println("No CSV files found in input folder.");
            int res[]= {0,0,0};
            return res;
        }
        
        int positive=0;
        int negative=0;
        int processedCount = 0;
        for (File file : files) {
            boolean result = service.processSingleFile(file);
            if (result) {
                positive++;
            } else
            {
            	negative++;
            }
            processedCount++;
        }

        int res[]= {processedCount,positive,negative};
        
        return res;
    }
}