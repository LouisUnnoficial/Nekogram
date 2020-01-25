/*
 * This is the source code of Telegram for Android v. 5.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2018.
 */

package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

public class BuildVars {

    public static boolean DEBUG_VERSION = false;
    public static boolean DEBUG_PRIVATE_VERSION = false;
    public static boolean LOGS_ENABLED = false;
    public static boolean USE_CLOUD_STRINGS = true;
    public static boolean CHECK_UPDATES = true;
    public static boolean TON_WALLET_STANDALONE = false;
    public static int BUILD_VERSION = 1851;
    public static String BUILD_VERSION_STRING = "5.14.0";
    public static int APP_ID = 1056817; //obtain your own APP_ID at https://core.telegram.org/api/obtaining_api_id
    public static String APP_HASH = "31511ac2e6289df4bc7d33a880e99475"; //obtain your own APP_HASH at https://core.telegram.org/api/obtaining_api_id
    public static String HOCKEY_APP_HASH = "your-hockeyapp-api-key-here";
    public static String HOCKEY_APP_HASH_DEBUG = "your-hockeyapp-api-key-here";
    public static String SMS_HASH = ""; //https://developers.google.com/identity/sms-retriever/overview
    public static String PLAYSTORE_APP_URL = "https://play.google.com/store/apps/details?id=tw.nekomimi.nekogram";

    static {
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", Context.MODE_PRIVATE);
            LOGS_ENABLED = sharedPreferences.getBoolean("logsEnabled", DEBUG_VERSION);
        }
    }
}
