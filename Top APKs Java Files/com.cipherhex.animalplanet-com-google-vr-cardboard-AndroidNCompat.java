package com.google.vr.cardboard;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings.Secure;
import android.util.Log;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

public class AndroidNCompat
{
  private static final String ACTION_VR_LISTENER_SETTINGS = "android.settings.VR_LISTENER_SETTINGS";
  private static final boolean DEBUG = false;
  private static final String DEFAULT_VR_MODE_CLASS = "com.google.vr.vrcore.common.VrCoreListenerService";
  private static final String DEFAULT_VR_MODE_PACKAGE = "com.google.vr.vrcore";
  private static final String ENABLED_VR_LISTENERS = "enabled_vr_listeners";
  public static final int FLAG_VR_MODE_ENABLE_FALLBACK = 1;
  public static final int NMR1_SDK_LEVEL = 25;
  public static final int N_SDK_LEVEL = 24;
  private static final int PACKAGE_NOT_ENABLED = -2;
  private static final int PACKAGE_NOT_PRESENT = -1;
  private static final int SUCCESS = 0;
  private static final String TAG = AndroidNCompat.class.getSimpleName();
  private static int sSdkLevelOverride = 0;
  
  private AndroidNCompat() {}
  
  private static int checkForVrCorePresence(Context paramContext)
  {
    int j = 0;
    Object localObject = paramContext.getPackageManager().getInstalledApplications(0);
    int k = 0;
    localObject = ((List)localObject).iterator();
    do
    {
      i = k;
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while (!((ApplicationInfo)((Iterator)localObject).next()).packageName.equals("com.google.vr.vrcore"));
    int i = 1;
    if (i == 0) {
      i = -1;
    }
    do
    {
      return i;
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_vr_listeners");
      localObject = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
      if (paramContext == null) {
        break;
      }
      i = j;
    } while (paramContext.contains(((ComponentName)localObject).flattenToString()));
    return -2;
  }
  
  private static boolean handleVrCoreAbsence(Context paramContext, int paramInt)
  {
    if (paramInt == -1)
    {
      showWarningDialog(paramContext, R.string.dialog_vr_core_not_installed, R.string.go_to_playstore_button, new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface = new Intent("android.intent.action.VIEW");
          paramAnonymousDialogInterface.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
          paramAnonymousDialogInterface.setPackage("com.android.vending");
          try
          {
            AndroidNCompat.this.startActivity(paramAnonymousDialogInterface);
            return;
          }
          catch (ActivityNotFoundException paramAnonymousDialogInterface)
          {
            Log.e(AndroidNCompat.TAG, "Google Play Services is not installed, unable to download VrCore.");
          }
        }
      });
      return false;
    }
    if (paramInt == -2)
    {
      showWarningDialog(paramContext, R.string.dialog_vr_core_not_enabled, R.string.go_to_vr_listeners_settings_button, new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AndroidNCompat.this.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
        }
      });
      return false;
    }
    return true;
  }
  
  private static boolean isAtLeastN()
  {
    return (sSdkLevelOverride >= 24) || (Build.VERSION.SDK_INT >= 24);
  }
  
  private static boolean isAtLeastNMR1()
  {
    return (sSdkLevelOverride >= 25) || ("NMR1".equals(Build.VERSION.CODENAME)) || (Build.VERSION.SDK_INT >= 25);
  }
  
  public static void setSdkLevelForTesting(int paramInt)
  {
    sSdkLevelOverride = paramInt;
  }
  
  public static boolean setSustainedPerformanceMode(Activity paramActivity, boolean paramBoolean)
  {
    if (!isAtLeastN()) {
      return false;
    }
    if (!((PowerManager)paramActivity.getSystemService("power")).isSustainedPerformanceModeSupported())
    {
      Log.d(TAG, "Sustained performance mode is not supported on this device.");
      return false;
    }
    paramActivity = paramActivity.getWindow();
    if (paramActivity == null)
    {
      Log.e(TAG, "Activity does not have a window");
      return false;
    }
    paramActivity.setSustainedPerformanceMode(paramBoolean);
    return true;
  }
  
  public static boolean setVrModeEnabled(Activity paramActivity, boolean paramBoolean)
  {
    return setVrModeEnabled(paramActivity, paramBoolean, 1);
  }
  
  public static boolean setVrModeEnabled(Activity paramActivity, boolean paramBoolean, int paramInt)
  {
    if (!isAtLeastN()) {}
    for (;;)
    {
      return false;
      if (!paramActivity.getPackageManager().hasSystemFeature("android.software.vr.mode"))
      {
        Log.d(TAG, "VR mode is not supported on this device.");
        return false;
      }
      Object localObject = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
      try
      {
        paramActivity.setVrModeEnabled(paramBoolean, (ComponentName)localObject);
        return true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject = TAG;
        String str2 = String.valueOf(localNameNotFoundException);
        Log.w((String)localObject, String.valueOf(str2).length() + 25 + "No VR service component: " + str2);
        if (((paramInt & 0x1) != 0) && (handleVrCoreAbsence(paramActivity, checkForVrCorePresence(paramActivity))))
        {
          Log.w(TAG, "Failed to handle missing VrCore package.");
          return false;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        paramActivity = TAG;
        String str1 = String.valueOf(localUnsupportedOperationException);
        Log.w(paramActivity, String.valueOf(str1).length() + 23 + "Failed to set VR mode: " + str1);
      }
    }
    return false;
  }
  
  /* Error */
  public static void setVrThread(int paramInt)
  {
    // Byte code:
    //   0: invokestatic 260	com/google/vr/cardboard/AndroidNCompat:isAtLeastNMR1	()Z
    //   3: ifne +4 -> 7
    //   6: return
    //   7: ldc_w 262
    //   10: ldc_w 263
    //   13: iconst_1
    //   14: anewarray 44	java/lang/Class
    //   17: dup
    //   18: iconst_0
    //   19: getstatic 269	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   22: aastore
    //   23: invokevirtual 273	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   26: astore_1
    //   27: aload_1
    //   28: aconst_null
    //   29: iconst_1
    //   30: anewarray 4	java/lang/Object
    //   33: dup
    //   34: iconst_0
    //   35: iload_0
    //   36: invokestatic 276	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: aastore
    //   40: invokevirtual 282	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   43: pop
    //   44: return
    //   45: astore_1
    //   46: getstatic 50	com/google/vr/cardboard/AndroidNCompat:TAG	Ljava/lang/String;
    //   49: astore_2
    //   50: aload_1
    //   51: invokestatic 221	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   54: astore_1
    //   55: aload_2
    //   56: new 223	java/lang/StringBuilder
    //   59: dup
    //   60: aload_1
    //   61: invokestatic 221	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   64: invokevirtual 227	java/lang/String:length	()I
    //   67: bipush 30
    //   69: iadd
    //   70: invokespecial 229	java/lang/StringBuilder:<init>	(I)V
    //   73: ldc_w 284
    //   76: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload_1
    //   80: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 192	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   89: pop
    //   90: return
    //   91: astore_1
    //   92: getstatic 50	com/google/vr/cardboard/AndroidNCompat:TAG	Ljava/lang/String;
    //   95: astore_2
    //   96: aload_1
    //   97: invokestatic 221	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   100: astore_1
    //   101: aload_2
    //   102: new 223	java/lang/StringBuilder
    //   105: dup
    //   106: aload_1
    //   107: invokestatic 221	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   110: invokevirtual 227	java/lang/String:length	()I
    //   113: bipush 38
    //   115: iadd
    //   116: invokespecial 229	java/lang/StringBuilder:<init>	(I)V
    //   119: ldc_w 286
    //   122: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: aload_1
    //   126: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 192	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   135: pop
    //   136: return
    //   137: astore_1
    //   138: goto -92 -> 46
    //   141: astore_1
    //   142: goto -96 -> 46
    //   145: astore_1
    //   146: goto -54 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	paramInt	int
    //   26	2	1	localMethod	java.lang.reflect.Method
    //   45	6	1	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   54	26	1	str1	String
    //   91	6	1	localRuntimeException1	RuntimeException
    //   100	26	1	str2	String
    //   137	1	1	localRuntimeException2	RuntimeException
    //   141	1	1	localIllegalAccessException	IllegalAccessException
    //   145	1	1	localNoSuchMethodException	NoSuchMethodException
    //   49	53	2	str3	String
    // Exception table:
    //   from	to	target	type
    //   27	44	45	java/lang/reflect/InvocationTargetException
    //   7	27	91	java/lang/RuntimeException
    //   27	44	137	java/lang/RuntimeException
    //   27	44	141	java/lang/IllegalAccessException
    //   7	27	145	java/lang/NoSuchMethodException
  }
  
  private static void showWarningDialog(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    paramContext = new AlertDialog.Builder(paramContext, R.style.GvrDialogTheme);
    paramContext.setMessage(paramInt1).setTitle(R.string.dialog_title_warning).setPositiveButton(paramInt2, paramOnClickListener).setNegativeButton(R.string.cancel_button, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    paramContext.create().show();
  }
}
