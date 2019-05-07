package com.ironsource.environment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

public class DeviceStatus
{
  private static String a = null;
  
  public DeviceStatus() {}
  
  private static long a(File paramFile)
  {
    paramFile = new StatFs(paramFile.getPath());
    if (Build.VERSION.SDK_INT < 19) {
      l = paramFile.getAvailableBlocks();
    }
    for (long l = paramFile.getBlockSize() * l;; l = paramFile.getBlockSizeLong() * l)
    {
      return l / 1048576L;
      l = paramFile.getAvailableBlocksLong();
    }
  }
  
  private static boolean a(ResolveInfo paramResolveInfo)
  {
    return (paramResolveInfo.activityInfo.applicationInfo.flags & 0x1) != 0;
  }
  
  private static boolean a(String paramString)
  {
    try
    {
      String[] arrayOfString = new String[8];
      arrayOfString[0] = "/sbin/";
      arrayOfString[1] = "/system/bin/";
      arrayOfString[2] = "/system/xbin/";
      arrayOfString[3] = "/data/local/xbin/";
      arrayOfString[4] = "/data/local/bin/";
      arrayOfString[5] = "/system/sd/xbin/";
      arrayOfString[6] = "/system/bin/failsafe/";
      arrayOfString[7] = "/data/local/";
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        boolean bool = new File(str + paramString).exists();
        if (bool) {
          return true;
        }
        i += 1;
      }
      return false;
    }
    catch (Exception paramString)
    {
      return false;
    }
  }
  
  public static int getActivityRequestedOrientation(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      return ((Activity)paramContext).getRequestedOrientation();
    }
    return -1;
  }
  
  public static String[] getAdvertisingIdInfo(Context paramContext)
  {
    Object localObject1 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    paramContext = ((Class)localObject1).getMethod("getAdvertisingIdInfo", new Class[] { Context.class }).invoke(localObject1, new Object[] { paramContext });
    Object localObject2 = paramContext.getClass().getMethod("getId", new Class[0]);
    localObject1 = paramContext.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
    localObject2 = ((Method)localObject2).invoke(paramContext, new Object[0]).toString();
    boolean bool = ((Boolean)((Method)localObject1).invoke(paramContext, new Object[0])).booleanValue();
    return new String[] { localObject2, "" + bool };
  }
  
  public static int getAndroidAPIVersion()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public static String getAndroidOsVersion()
  {
    return Build.VERSION.RELEASE;
  }
  
  public static int getApplicationRotation(Context paramContext)
  {
    return ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRotation();
  }
  
  public static JSONObject getAppsInstallTime(Context paramContext, boolean paramBoolean)
  {
    Object localObject1 = new Intent("android.intent.action.MAIN", null);
    ((Intent)localObject1).addCategory("android.intent.category.LAUNCHER");
    localObject1 = paramContext.getPackageManager().queryIntentActivities((Intent)localObject1, 0);
    JSONObject localJSONObject = new JSONObject();
    paramContext = paramContext.getPackageManager();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    int i = 0;
    for (;;)
    {
      if (i < ((List)localObject1).size())
      {
        Object localObject2 = (ResolveInfo)((List)localObject1).get(i);
        if (!paramBoolean) {}
        try
        {
          if (a((ResolveInfo)localObject2)) {
            break label161;
          }
          localObject2 = localSimpleDateFormat.format(new Date(paramContext.getPackageInfo(((ResolveInfo)localObject2).activityInfo.packageName, 4096).firstInstallTime));
          localJSONObject.put((String)localObject2, localJSONObject.optInt((String)localObject2, 0) + 1);
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
      return localJSONObject;
      label161:
      i += 1;
    }
  }
  
  public static long getAvailableExternalMemorySizeInMegaBytes()
  {
    long l = 0L;
    if (isExternalMemoryAvailableWritable()) {
      l = a(Environment.getExternalStorageDirectory());
    }
    return l;
  }
  
  public static long getAvailableInternalMemorySizeInMegaBytes()
  {
    return a(Environment.getDataDirectory());
  }
  
  public static long getAvailableMemorySizeInMegaBytes(String paramString)
  {
    return a(new File(paramString));
  }
  
  public static int getBatteryLevel(Context paramContext)
  {
    int j = 0;
    int m = -1;
    try
    {
      paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (paramContext != null) {}
      for (int i = paramContext.getIntExtra("level", -1);; i = 0)
      {
        if (paramContext != null) {
          j = paramContext.getIntExtra("scale", -1);
        }
        int k = m;
        if (i != -1)
        {
          k = m;
          if (j != -1) {
            k = (int)(i / j * 100.0F);
          }
        }
        return k;
      }
      return -1;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static int getDeviceDefaultOrientation(Context paramContext)
  {
    int i = getApplicationRotation(paramContext);
    int j = getDeviceOrientation(paramContext);
    if (((i != 0) && (i != 2)) || ((j == 2) || (((i == 1) || (i == 3)) && (j == 1)))) {
      return 2;
    }
    return 1;
  }
  
  public static float getDeviceDensity()
  {
    return Resources.getSystem().getDisplayMetrics().density;
  }
  
  public static int getDeviceHeight()
  {
    return Resources.getSystem().getDisplayMetrics().heightPixels;
  }
  
  public static String getDeviceLanguage(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().locale.getLanguage();
  }
  
  public static long getDeviceLocalTime()
  {
    return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
  }
  
  public static String getDeviceModel()
  {
    return Build.MODEL;
  }
  
  public static String getDeviceOEM()
  {
    return Build.MANUFACTURER;
  }
  
  public static int getDeviceOrientation(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation;
  }
  
  public static String getDeviceOs()
  {
    return "android";
  }
  
  public static int getDeviceTimeZoneOffsetInMinutes()
  {
    return -(TimeZone.getDefault().getOffset(getDeviceLocalTime()) / 60000);
  }
  
  public static int getDeviceWidth()
  {
    return Resources.getSystem().getDisplayMetrics().widthPixels;
  }
  
  public static File getExternalCacheDir(Context paramContext)
  {
    return paramContext.getExternalCacheDir();
  }
  
  public static List<ApplicationInfo> getInstalledApplications(Context paramContext)
  {
    return paramContext.getPackageManager().getInstalledApplications(0);
  }
  
  public static String getInternalCacheDirPath(Context paramContext)
  {
    Object localObject = null;
    File localFile = paramContext.getCacheDir();
    paramContext = localObject;
    if (localFile != null) {
      paramContext = localFile.getPath();
    }
    return paramContext;
  }
  
  public static String getMobileCarrier(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
  }
  
  /* Error */
  public static String getOrGenerateOnceUniqueIdentifier(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 10	com/ironsource/environment/DeviceStatus:a	Ljava/lang/String;
    //   6: invokestatic 417	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   9: ifne +12 -> 21
    //   12: getstatic 10	com/ironsource/environment/DeviceStatus:a	Ljava/lang/String;
    //   15: astore_0
    //   16: ldc 2
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: aload_0
    //   22: ldc_w 419
    //   25: iconst_0
    //   26: invokevirtual 423	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   29: astore_0
    //   30: aload_0
    //   31: ldc_w 425
    //   34: iconst_1
    //   35: invokeinterface 431 3 0
    //   40: ifeq +57 -> 97
    //   43: aload_0
    //   44: ldc_w 433
    //   47: ldc -108
    //   49: invokeinterface 437 3 0
    //   54: astore_1
    //   55: aload_1
    //   56: invokestatic 417	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   59: ifeq +45 -> 104
    //   62: invokestatic 443	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   65: invokevirtual 444	java/util/UUID:toString	()Ljava/lang/String;
    //   68: putstatic 10	com/ironsource/environment/DeviceStatus:a	Ljava/lang/String;
    //   71: aload_0
    //   72: invokeinterface 448 1 0
    //   77: astore_0
    //   78: aload_0
    //   79: ldc_w 433
    //   82: getstatic 10	com/ironsource/environment/DeviceStatus:a	Ljava/lang/String;
    //   85: invokeinterface 454 3 0
    //   90: pop
    //   91: aload_0
    //   92: invokeinterface 457 1 0
    //   97: getstatic 10	com/ironsource/environment/DeviceStatus:a	Ljava/lang/String;
    //   100: astore_0
    //   101: goto -85 -> 16
    //   104: aload_1
    //   105: putstatic 10	com/ironsource/environment/DeviceStatus:a	Ljava/lang/String;
    //   108: goto -11 -> 97
    //   111: astore_0
    //   112: aload_0
    //   113: invokevirtual 259	java/lang/Exception:printStackTrace	()V
    //   116: goto -19 -> 97
    //   119: astore_0
    //   120: ldc 2
    //   122: monitorexit
    //   123: aload_0
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	paramContext	Context
    //   54	51	1	str	String
    // Exception table:
    //   from	to	target	type
    //   21	97	111	java/lang/Exception
    //   104	108	111	java/lang/Exception
    //   3	16	119	finally
    //   21	97	119	finally
    //   97	101	119	finally
    //   104	108	119	finally
    //   112	116	119	finally
  }
  
  public static float getSystemVolumePercent(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    return paramContext.getStreamVolume(3) / paramContext.getStreamMaxVolume(3);
  }
  
  public static boolean isDeviceOrientationLocked(Context paramContext)
  {
    return Settings.System.getInt(paramContext.getContentResolver(), "accelerometer_rotation", 0) != 1;
  }
  
  public static boolean isExternalMemoryAvailableWritable()
  {
    return ("mounted".equals(Environment.getExternalStorageState())) && (Environment.isExternalStorageRemovable());
  }
  
  @TargetApi(19)
  public static boolean isImmersiveSupported(Activity paramActivity)
  {
    int i = paramActivity.getWindow().getDecorView().getSystemUiVisibility();
    return ((i | 0x1000) == i) || ((i | 0x800) == i);
  }
  
  public static boolean isRTL(Context paramContext)
  {
    paramContext = paramContext.getResources().getConfiguration();
    return (Build.VERSION.SDK_INT >= 17) && (paramContext.getLayoutDirection() == 1);
  }
  
  public static boolean isRootedDevice()
  {
    return a("su");
  }
}
