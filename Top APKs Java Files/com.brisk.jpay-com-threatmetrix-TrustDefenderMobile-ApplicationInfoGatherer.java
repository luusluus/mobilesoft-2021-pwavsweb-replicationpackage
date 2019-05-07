package com.threatmetrix.TrustDefenderMobile;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

class ApplicationInfoGatherer
{
  private static final String TAG = StringUtils.getLogTag(ApplicationInfoGatherer.class);
  
  ApplicationInfoGatherer() {}
  
  static String checkThisPackage(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext != null)
    {
      paramContext = paramContext.sourceDir;
      Log.d(TAG, "sourceDir: " + paramContext);
      return getHashForPackage(paramContext);
    }
    return null;
  }
  
  /* Error */
  private static String getHashForPackage(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 68	com/threatmetrix/TrustDefenderMobile/NativeGatherer:getInstance	()Lcom/threatmetrix/TrustDefenderMobile/NativeGatherer;
    //   5: invokevirtual 72	com/threatmetrix/TrustDefenderMobile/NativeGatherer:isAvailable	()Z
    //   8: ifeq +11 -> 19
    //   11: invokestatic 68	com/threatmetrix/TrustDefenderMobile/NativeGatherer:getInstance	()Lcom/threatmetrix/TrustDefenderMobile/NativeGatherer;
    //   14: aload_0
    //   15: invokevirtual 75	com/threatmetrix/TrustDefenderMobile/NativeGatherer:hashFile	(Ljava/lang/String;)Ljava/lang/String;
    //   18: areturn
    //   19: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   22: ldc 77
    //   24: invokestatic 52	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   27: pop
    //   28: ldc 79
    //   30: invokestatic 84	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   33: astore 4
    //   35: new 86	java/io/FileInputStream
    //   38: dup
    //   39: aload_0
    //   40: invokespecial 89	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   43: astore_3
    //   44: sipush 8192
    //   47: newarray byte
    //   49: astore_0
    //   50: aload_3
    //   51: aload_0
    //   52: invokevirtual 95	java/io/InputStream:read	([B)I
    //   55: istore_1
    //   56: iload_1
    //   57: ifle +85 -> 142
    //   60: aload 4
    //   62: aload_0
    //   63: iconst_0
    //   64: iload_1
    //   65: invokevirtual 99	java/security/MessageDigest:update	([BII)V
    //   68: goto -18 -> 50
    //   71: astore_0
    //   72: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   75: ldc 101
    //   77: aload_0
    //   78: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   81: pop
    //   82: aload_3
    //   83: invokevirtual 108	java/io/InputStream:close	()V
    //   86: aload_2
    //   87: astore_0
    //   88: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   91: new 35	java/lang/StringBuilder
    //   94: dup
    //   95: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   98: ldc 110
    //   100: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_0
    //   104: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 52	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   113: pop
    //   114: aload_0
    //   115: areturn
    //   116: astore_0
    //   117: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   120: ldc 112
    //   122: aload_0
    //   123: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   126: pop
    //   127: aconst_null
    //   128: areturn
    //   129: astore_0
    //   130: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   133: ldc 114
    //   135: aload_0
    //   136: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   139: pop
    //   140: aconst_null
    //   141: areturn
    //   142: ldc 116
    //   144: iconst_1
    //   145: anewarray 4	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: new 118	java/math/BigInteger
    //   153: dup
    //   154: iconst_1
    //   155: aload 4
    //   157: invokevirtual 122	java/security/MessageDigest:digest	()[B
    //   160: invokespecial 125	java/math/BigInteger:<init>	(I[B)V
    //   163: bipush 16
    //   165: invokevirtual 128	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   168: aastore
    //   169: invokestatic 134	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   172: bipush 32
    //   174: bipush 48
    //   176: invokevirtual 138	java/lang/String:replace	(CC)Ljava/lang/String;
    //   179: astore_0
    //   180: aload_3
    //   181: invokevirtual 108	java/io/InputStream:close	()V
    //   184: goto -96 -> 88
    //   187: astore_2
    //   188: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   191: ldc -116
    //   193: aload_2
    //   194: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   197: pop
    //   198: goto -110 -> 88
    //   201: astore_0
    //   202: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   205: ldc -116
    //   207: aload_0
    //   208: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: aload_2
    //   213: astore_0
    //   214: goto -126 -> 88
    //   217: astore_0
    //   218: aload_3
    //   219: invokevirtual 108	java/io/InputStream:close	()V
    //   222: aload_0
    //   223: athrow
    //   224: astore_2
    //   225: getstatic 16	com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer:TAG	Ljava/lang/String;
    //   228: ldc -116
    //   230: aload_2
    //   231: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   234: pop
    //   235: goto -13 -> 222
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	238	0	paramString	String
    //   55	10	1	i	int
    //   1	86	2	localObject	Object
    //   187	26	2	localIOException1	java.io.IOException
    //   224	7	2	localIOException2	java.io.IOException
    //   43	176	3	localFileInputStream	java.io.FileInputStream
    //   33	123	4	localMessageDigest	java.security.MessageDigest
    // Exception table:
    //   from	to	target	type
    //   50	56	71	java/io/IOException
    //   60	68	71	java/io/IOException
    //   142	180	71	java/io/IOException
    //   28	35	116	java/security/NoSuchAlgorithmException
    //   35	44	129	java/io/FileNotFoundException
    //   180	184	187	java/io/IOException
    //   82	86	201	java/io/IOException
    //   50	56	217	finally
    //   60	68	217	finally
    //   72	82	217	finally
    //   142	180	217	finally
    //   218	222	224	java/io/IOException
  }
  
  void checkInstalledPackages(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    if (paramContext != null)
    {
      paramContext = paramContext.getInstalledApplications(0).iterator();
      while (paramContext.hasNext()) {
        getHashForPackage(((ApplicationInfo)paramContext.next()).sourceDir);
      }
    }
  }
  
  void checkRunningPackages(Context paramContext)
  {
    for (;;)
    {
      try
      {
        Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(Integer.MAX_VALUE);
        PackageManager localPackageManager = paramContext.getPackageManager();
        localObject = ((List)localObject).iterator();
        if (((Iterator)localObject).hasNext())
        {
          ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)((Iterator)localObject).next();
          if (localRunningTaskInfo.baseActivity != null)
          {
            paramContext = localRunningTaskInfo.baseActivity.toShortString();
            Log.d("Executed app", "Application executed : " + paramContext + "\t\t ID: " + localRunningTaskInfo.id + "");
            paramContext = localRunningTaskInfo.baseActivity.getPackageName();
            if (localPackageManager == null) {
              continue;
            }
            try
            {
              paramContext = localPackageManager.getPackageInfo(paramContext, 0).applicationInfo;
              if (paramContext == null) {
                continue;
              }
              getHashForPackage(paramContext.sourceDir);
            }
            catch (PackageManager.NameNotFoundException paramContext)
            {
              Log.d(TAG, "Failed: ", paramContext);
            }
          }
        }
        else
        {
          return;
        }
      }
      catch (SecurityException paramContext)
      {
        Log.e(TAG, "No perms: ", paramContext);
      }
      paramContext = "none";
    }
  }
}
