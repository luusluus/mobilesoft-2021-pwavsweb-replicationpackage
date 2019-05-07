package com.meevii.promotion;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.meevii.promotion.bean.AppModel;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class f
{
  public static int a(Context paramContext)
  {
    return b(paramContext).widthPixels;
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    float f = paramInt;
    return Math.round(paramContext.xdpi / 160.0F * f);
  }
  
  public static String a()
  {
    Calendar localCalendar = Calendar.getInstance();
    return new SimpleDateFormat("yyyyMMdd", Locale.US).format(localCalendar.getTime());
  }
  
  public static String a(String paramString)
    throws RuntimeException
  {
    try
    {
      paramString = MessageDigest.getInstance("MD5").digest(paramString.getBytes("UTF-8"));
      StringBuilder localStringBuilder = new StringBuilder(paramString.length * 2);
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        int k = paramString[i];
        if ((k & 0xFF) < 16) {
          localStringBuilder.append("0");
        }
        localStringBuilder.append(Integer.toHexString(k & 0xFF));
        i += 1;
      }
      return localStringBuilder.toString().toLowerCase();
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new RuntimeException("MD5 should be supported?", paramString);
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException(" UTF-8 should be supported?", paramString);
    }
  }
  
  public static void a(Context paramContext, AppModel paramAppModel)
  {
    if (paramAppModel == null) {}
    String str;
    do
    {
      return;
      str = paramAppModel.packageName;
    } while (TextUtils.isEmpty(str));
    if (!b(paramContext, str))
    {
      b(paramContext, paramAppModel);
      return;
    }
    paramAppModel = paramContext.getPackageManager().getLaunchIntentForPackage(str);
    paramAppModel.setAction("android.intent.action.VIEW");
    paramAppModel.setFlags(268435456);
    try
    {
      paramContext.startActivity(paramAppModel);
      return;
    }
    catch (ActivityNotFoundException paramAppModel)
    {
      Toast.makeText(paramContext, e.d.google_play_store_not_available, 1).show();
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      if (paramContext != null) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
    }
  }
  
  public static boolean a(Collection paramCollection)
  {
    return (paramCollection == null) || (paramCollection.isEmpty());
  }
  
  private static DisplayMetrics b(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  private static boolean b(Context paramContext, AppModel paramAppModel)
  {
    paramAppModel = Uri.parse(paramAppModel.url);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(paramAppModel);
    try
    {
      paramContext.startActivity(localIntent);
      return true;
    }
    catch (ActivityNotFoundException paramAppModel)
    {
      Toast.makeText(paramContext, e.d.google_play_store_not_available, 1).show();
      paramAppModel.printStackTrace();
    }
    return false;
  }
  
  private static boolean b(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager().getInstalledPackages(0).iterator();
    while (paramContext.hasNext()) {
      if (((PackageInfo)paramContext.next()).packageName.equals(paramString)) {
        return true;
      }
    }
    return false;
  }
}
