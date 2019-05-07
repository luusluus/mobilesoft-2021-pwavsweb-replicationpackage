package hotchemi.android.rate;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

final class UriHelper
{
  private static final String AMAZON_APPSTORE = "amzn://apps/android?p=";
  private static final String GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=";
  
  private UriHelper() {}
  
  static Uri a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("https://play.google.com/store/apps/details?id=");
    localStringBuilder.append(paramString);
    return Uri.parse(localStringBuilder.toString());
  }
  
  static boolean a(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager().getInstalledApplications(0).iterator();
    while (paramContext.hasNext()) {
      if (((ApplicationInfo)paramContext.next()).packageName.equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  static Uri b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("amzn://apps/android?p=");
    localStringBuilder.append(paramString);
    return Uri.parse(localStringBuilder.toString());
  }
}
