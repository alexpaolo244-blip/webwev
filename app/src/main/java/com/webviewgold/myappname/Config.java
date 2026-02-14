package com.webviewgold.myappname;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Config {
    // كود الشراء للتجربة
    public static final String PURCHASECODE = "SHOFYOU-TRIAL-2026";

    // إعدادات موقعك
    public static final String HOST = "shofyou.com";
    public static String HOME_URL = "https://shofyou.com";

    // المتغيرات التي تسببت في الخطأ (يجب أن تبقى موجودة)
    public static final int SPECIAL_LINK_HANDLING_OPTIONS = 1;
    public static final boolean PREVENT_SLEEP = false;
    public static final boolean ENABLE_SWIPE_NAVIGATE = false;
    public static final boolean ENABLE_PULL_REFRESH = true;
    public static final boolean ENABLE_ZOOM = false;
    public static final boolean HIDE_VERTICAL_SCROLLBAR = false;
    public static final boolean HIDE_HORIZONTAL_SCROLLBAR = false;
    public static final boolean DISABLE_DARK_MODE = false;
    public static final boolean HIDE_NAVIGATION_BAR_IN_LANDSCAPE = false;
    public static final int MAX_TEXT_ZOOM = 0;
    public static final boolean EXIT_APP_BY_BACK_BUTTON_ALWAYS = false;
    public static final boolean EXIT_APP_BY_BACK_BUTTON_HOMEPAGE = true;
    public static final boolean EXIT_APP_DIALOG = true;
    public static String OFFLINE_SCREEN_BACKGROUND_COLOR = "#ffffff";
    public static boolean PREVENT_SCREEN_CAPTURE = false;
    public static final boolean UUID_ENHANCE_WEBVIEW_URL = false;
    public static boolean BLOCK_SELF_SIGNED_AND_FAULTY_SSL_CERTS = false;
    public static boolean LINK_DRAG_AND_DROP = true;
    public static final boolean LANDSCAPE_FULLSCREEN_VIDEO = false;
    public static final boolean PUSH_ENABLED = false;
    public static final boolean FIREBASE_PUSH_ENABLED = false;
    public static final String firebasechanneltopic = "NONE";
    public static final boolean SHOW_ADSENSE_AD = false;
    public static final boolean SHOW_BANNER_AD = false;
    public static final boolean SHOW_FULL_SCREEN_AD = false;
    public static final int SHOW_AD_AFTER_X = 5;
    public static final boolean INCREMENT_WITH_REDIRECTS = true;
    public static boolean USE_FACEBOOK_ADS = false;

    // إعدادات عامة
    public static final boolean ACTIVATE_PROGRESS_BAR = true;
    public static final String PHONE_ORIENTATION = "portrait";
    public static final String TABLET_ORIENTATION = "portrait";
    public static final String USER_AGENT = "";
    public static final boolean APPEND_LANG_CODE = false;
    public static final boolean AUTO_REFRESH_ENABLED = false;
    public static final boolean FALLBACK_USE_LOCAL_HTML_FOLDER_IF_OFFLINE = false;
    public static final int EXTERNAL_LINK_HANDLING_OPTIONS = 0;
    public static String[] ALWAYS_OPEN_IN_INAPP_TAB = new String[]{"https://www.alwaysopeninaninapptab.com"};
    public static final int QR_CODE_URL_OPTIONS = 0;
    public static final boolean CLEAR_CACHE_ON_STARTUP = false;
    public static final boolean CLEAR_CACHE_ON_EXIT = false;
    public static final boolean USE_LOCAL_HTML_FOLDER = false;
    public static final boolean IS_DEEP_LINKING_ENABLED = true;
    public static final boolean OPEN_NOTIFICATION_URLS_IN_SYSTEM_BROWSER = false;
    public static final boolean SPLASH_SCREEN_ACTIVATED = true;
    public static final int SPLASH_TIMEOUT = 1300;
    public static final boolean REMAIN_SPLASH_OPTION = false;
    public static final double SCALE_SPLASH_IMAGE = 25;
    static boolean blackStatusBarText = false;
    public static boolean SHOW_FIRSTRUN_DIALOG = true;
    public static boolean SHOW_FACEBOOK_DIALOG = false;
    public static boolean SHOW_RATE_DIALOG = true;
    public static final int RATE_DAYS_UNTIL_PROMPT = 3;
    public static final int RATE_LAUNCHES_UNTIL_PROMPT = 3;
    public static final int FACEBOOK_DAYS_UNTIL_PROMPT = 2;
    public static final int FACEBOOK_LAUNCHES_UNTIL_PROMPT = 4;
    public static final String FACEBOOK_URL = "https://www.facebook.com/OnlineAppCreator/";
    public static final boolean ALLOW_IMAGE_DOWNLOAD = true;
    public static final boolean PUSH_ENHANCE_WEBVIEW_URL = false;
    public static final boolean PUSH_RELOAD_ON_USERID = false;
    public static final boolean FIREBASE_PUSH_ENHANCE_WEBVIEW_URL = false;
    public static final boolean MANUAL_COOKIE_SYNC = false;
    public static final int COOKIE_SYNC_TIME = 5000;
    public static String[] MANUAL_COOKIE_SYNC_TRIGGERS = {};
    public static String[] GOOGLE_LOGIN_HELPER_TRIGGERS = {};
    public static String[] FACEBOOK_LOGIN_HELPER_TRIGGERS = {};
    public static String HOME_URL_LOGOUT = "https://www.example.com/logout";
    public static final boolean AUTO_INJECT_VARIABLES = false;

    public static List<String> downloadableExtension = Collections.unmodifiableList(
            Arrays.asList(".epub", ".pdf", ".pptx", ".docx", ".doc", ".xlsx", ".mp3", ".mp4", ".wav")
    );

    static boolean requireLocation = true;
    static boolean requireStorage = true;
    static boolean requireCamera = true;
    static boolean requireRecordAudio = true;
}
