/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nsoz.server;

import com.nsoz.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AutoSaveData implements Runnable {

    @Override
    public void run() {
        while (Server.start) {
            try {
                Thread.sleep(GameData.DELAY_SAVE_DATA);
                Server.saveAll();
                Log.info("Lưu data tự động");

            } catch (InterruptedException ex) {
                Logger.getLogger(AutoSaveData.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
