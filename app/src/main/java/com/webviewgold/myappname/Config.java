package com.webviewgold.myappname;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Config {
    // 1. ضع أي كود هنا للتجربة (بما أنها نسخة Nulled)
    public static final String PURCHASECODE = "SHOFYOU-TRIAL-2026";

    /**
     * الإعدادات الرئيسية لموقعك Shofyou
     */
    // النطاق بدون https
    public static final String HOST = "shofyou.com";

    // الرابط الكامل للموقع
    public static final String HOME_URL = "https://shofyou.com";

    // اجعلها false لأنك تستخدم رابط أونلاين
    public static final boolean USE_LOCAL_HTML_FOLDER = false;

    // تعطيل البديل المحلي في حال الأوفلاين حالياً للتجربة
    public static final boolean FALLBACK_USE_LOCAL_HTML_FOLDER_IF_OFFLINE = false;

    // تفعيل شريط التحميل
    public static final boolean ACTIVATE_PROGRESS_BAR = true;

    // اتجاه الشاشة
    public static final String PHONE_ORIENTATION = "portrait";
    public static final String TABLET_ORIENTATION = "auto";

    // كاش المتصفح (اجعلها false ليبقى المستخدم مسجلاً لدخوله)
    public static final boolean CLEAR_CACHE_ON_STARTUP = false;
    public static final boolean CLEAR_CACHE_ON_EXIT = false;

    /**
     * إعدادات الإعلانات (معطلة بالكامل)
     */
    public static final boolean SHOW_BANNER_AD = false;
    public static final boolean SHOW_FULL_SCREEN_AD = false;
    public static final int SHOW_AD_AFTER_X = 999; 

    /**
     * شاشة الترحيب (Splash Screen)
     */
    public static final boolean SPLASH_SCREEN_ACTIVATED = true;
    public static final int SPLASH_TIMEOUT = 2500; 

    /**
     * الروابط الخارجية وتحديث الصفحة
     */
    public static final int EXTERNAL_LINK_HANDLING_OPTIONS = 0; // فتح كل شيء داخل التطبيق
    public static final boolean PULL_TO_REFRESH_ENABLED = true; // السحب للتحديث

    /**
     * الأذونات (Permissions)
     */
    static boolean requireLocation = true;
    static boolean requireStorage = true;
    static boolean requireCamera = true;
    static boolean requireRecordAudio = true;
}