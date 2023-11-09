/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nsoz.admin;

import com.nsoz.clan.Clan;
import com.nsoz.constants.CMDInputDialog;
import com.nsoz.constants.CMDMenu;
import com.nsoz.constants.ItemName;
import com.nsoz.convert.Converter;
import com.nsoz.db.jdbc.DbManager;
import com.nsoz.event.Event;
import com.nsoz.event.LunarNewYear;
import com.nsoz.item.Item;
import com.nsoz.item.ItemFactory;
import com.nsoz.map.Map;
import com.nsoz.map.MapManager;
import com.nsoz.mob.Mob;
import com.nsoz.mob.MobManager;
import com.nsoz.mob.MobTemplate;
import com.nsoz.model.Char;
import com.nsoz.model.InputDialog;
import com.nsoz.model.Menu;
import com.nsoz.model.WarMember;
import com.nsoz.network.Message;
import com.nsoz.network.Session;
import com.nsoz.option.ItemOption;
import com.nsoz.server.Config;
import com.nsoz.server.GameData;
import static com.nsoz.server.JFrameSendItem.checkNumber;
import com.nsoz.server.NinjaSchool;
import com.nsoz.server.Ranked;
import com.nsoz.server.Server;
import com.nsoz.server.ServerManager;
import com.nsoz.skill.Skill;
import com.nsoz.stall.StallManager;
import com.nsoz.store.ItemStore;
import com.nsoz.store.StoreManager;
import com.nsoz.util.Log;
import com.nsoz.util.NinjaUtils;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author kitakeyos - Hoàng Hữu Dũng
 */
public class AdminService {

    private static final AdminService instance = new AdminService();

    public static AdminService getInstance() {
        return instance;
    }
   
 
    public boolean process(Char p, String text) {
        
        return false;
    }
}
