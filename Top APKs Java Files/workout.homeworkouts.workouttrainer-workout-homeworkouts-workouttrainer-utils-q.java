package workout.homeworkouts.workouttrainer.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public class q
{
  private static q a;
  
  private q() {}
  
  public static q a()
  {
    try
    {
      if (a == null) {
        a = new q();
      }
      q localQ = a;
      return localQ;
    }
    finally {}
  }
  
  public static Intent b(Context paramContext, String paramString)
  {
    try
    {
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      paramContext.setFlags(268435456);
      paramContext.setPackage("com.android.vending");
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      paramContext.setFlags(268435456);
    }
    return paramContext;
  }
  
  public void a(Context paramContext, String paramString)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(paramString));
      localIntent.setFlags(268435456);
      if (a(paramContext)) {
        localIntent.setPackage("com.android.vending");
      }
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public boolean a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getInstalledPackages(8192);
      if ((paramContext != null) && (paramContext.size() > 0))
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          PackageInfo localPackageInfo = (PackageInfo)paramContext.next();
          if (!TextUtils.isEmpty(localPackageInfo.packageName))
          {
            boolean bool = localPackageInfo.packageName.equals("com.android.vending");
            if (bool) {
              return true;
            }
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (RuntimeException paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
}
