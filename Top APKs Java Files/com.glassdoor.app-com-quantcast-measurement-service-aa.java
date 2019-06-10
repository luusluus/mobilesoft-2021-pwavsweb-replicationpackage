package com.quantcast.measurement.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.Iterator;
import java.util.List;

final class aa
{
  public static final String a = "QC_OUC";
  private static final String b = "QC-OPT-OUT";
  
  aa() {}
  
  static void a(Context paramContext, boolean paramBoolean)
  {
    c(paramContext, paramBoolean);
    a(paramContext, paramBoolean, true);
    y.a.a("QC_OUC", Boolean.valueOf(paramBoolean));
  }
  
  private static void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2 = Boolean.valueOf(false);
    Object localObject3 = paramContext.getPackageManager();
    Object localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject3 = ((PackageManager)localObject3).getInstalledPackages(0).iterator();
      localObject1 = localObject2;
      if (!((Iterator)localObject3).hasNext()) {
        break label192;
      }
      localObject2 = (PackageInfo)((Iterator)localObject3).next();
      if (((PackageInfo)localObject2).packageName.equals(paramContext.getPackageName())) {
        break label189;
      }
    }
    for (;;)
    {
      label189:
      label192:
      try
      {
        localObject2 = paramContext.createPackageContext(((PackageInfo)localObject2).packageName, 0);
        if (paramBoolean2)
        {
          File localFile = ((Context)localObject2).getFileStreamPath("QC-OPT-OUT");
          if ((localFile == null) || (!localFile.exists())) {
            break label200;
          }
          i = 1;
          if (i == 0) {
            continue;
          }
          c((Context)localObject2, paramBoolean1);
          break;
        }
        boolean bool = b((Context)localObject2, false);
        localObject1 = Boolean.valueOf(bool);
        try
        {
          bool = ((Boolean)localObject1).booleanValue();
          localObject2 = localObject1;
          if (bool)
          {
            if (!paramBoolean2) {
              c(paramContext, ((Boolean)localObject1).booleanValue());
            }
            return;
            localObject2 = localObject1;
          }
          localObject1 = localObject2;
        }
        catch (Exception localException1)
        {
          break label197;
        }
      }
      catch (Exception localException2) {}
      continue;
      label197:
      break;
      label200:
      int i = 0;
    }
  }
  
  static boolean a(Context paramContext)
  {
    return b(paramContext, true);
  }
  
  private static boolean b(Context paramContext)
  {
    paramContext = paramContext.getFileStreamPath("QC-OPT-OUT");
    return (paramContext != null) && (paramContext.exists());
  }
  
  /* Error */
  private static boolean b(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore 8
    //   8: aconst_null
    //   9: astore 6
    //   11: aconst_null
    //   12: astore 5
    //   14: aload_0
    //   15: ldc 11
    //   17: invokevirtual 110	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   20: astore 7
    //   22: aload 7
    //   24: astore 5
    //   26: aload 7
    //   28: astore 8
    //   30: aload 7
    //   32: astore 6
    //   34: aload 7
    //   36: invokevirtual 116	java/io/FileInputStream:read	()I
    //   39: istore_2
    //   40: iload_3
    //   41: istore_1
    //   42: iload_2
    //   43: ifeq +5 -> 48
    //   46: iconst_1
    //   47: istore_1
    //   48: iload_1
    //   49: istore_3
    //   50: aload 7
    //   52: ifnull +10 -> 62
    //   55: aload 7
    //   57: invokevirtual 119	java/io/FileInputStream:close	()V
    //   60: iload_1
    //   61: istore_3
    //   62: iload_3
    //   63: ireturn
    //   64: astore 6
    //   66: iload_1
    //   67: ifeq +13 -> 80
    //   70: aload 5
    //   72: astore 6
    //   74: aload_0
    //   75: iconst_0
    //   76: iconst_0
    //   77: invokestatic 23	com/quantcast/measurement/service/aa:a	(Landroid/content/Context;ZZ)V
    //   80: iload 4
    //   82: istore_3
    //   83: aload 5
    //   85: ifnull -23 -> 62
    //   88: aload 5
    //   90: invokevirtual 119	java/io/FileInputStream:close	()V
    //   93: iconst_0
    //   94: ireturn
    //   95: astore_0
    //   96: iconst_0
    //   97: ireturn
    //   98: astore_0
    //   99: iload 4
    //   101: istore_3
    //   102: aload 8
    //   104: ifnull -42 -> 62
    //   107: aload 8
    //   109: invokevirtual 119	java/io/FileInputStream:close	()V
    //   112: iconst_0
    //   113: ireturn
    //   114: astore_0
    //   115: iconst_0
    //   116: ireturn
    //   117: astore_0
    //   118: aload 6
    //   120: ifnull +8 -> 128
    //   123: aload 6
    //   125: invokevirtual 119	java/io/FileInputStream:close	()V
    //   128: aload_0
    //   129: athrow
    //   130: astore_0
    //   131: iload_1
    //   132: ireturn
    //   133: astore 5
    //   135: goto -7 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	paramContext	Context
    //   0	138	1	paramBoolean	boolean
    //   39	4	2	i	int
    //   4	98	3	bool1	boolean
    //   1	99	4	bool2	boolean
    //   12	77	5	localObject1	Object
    //   133	1	5	localIOException	java.io.IOException
    //   9	24	6	localObject2	Object
    //   64	1	6	localFileNotFoundException	java.io.FileNotFoundException
    //   72	52	6	localObject3	Object
    //   20	36	7	localFileInputStream	java.io.FileInputStream
    //   6	102	8	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   14	22	64	java/io/FileNotFoundException
    //   34	40	64	java/io/FileNotFoundException
    //   88	93	95	java/io/IOException
    //   14	22	98	java/io/IOException
    //   34	40	98	java/io/IOException
    //   107	112	114	java/io/IOException
    //   14	22	117	finally
    //   34	40	117	finally
    //   74	80	117	finally
    //   55	60	130	java/io/IOException
    //   123	128	133	java/io/IOException
  }
  
  /* Error */
  private static void c(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ldc 11
    //   5: iconst_3
    //   6: invokevirtual 123	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   9: astore_0
    //   10: iload_1
    //   11: ifeq +21 -> 32
    //   14: iconst_1
    //   15: istore_2
    //   16: aload_0
    //   17: astore_3
    //   18: aload_0
    //   19: iload_2
    //   20: invokevirtual 129	java/io/FileOutputStream:write	(I)V
    //   23: aload_0
    //   24: ifnull +7 -> 31
    //   27: aload_0
    //   28: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   31: return
    //   32: iconst_0
    //   33: istore_2
    //   34: goto -18 -> 16
    //   37: astore_0
    //   38: aload_3
    //   39: ifnull -8 -> 31
    //   42: aload_3
    //   43: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   46: return
    //   47: astore_0
    //   48: return
    //   49: astore_0
    //   50: aconst_null
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull +7 -> 60
    //   56: aload_3
    //   57: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   60: aload_0
    //   61: athrow
    //   62: astore_0
    //   63: return
    //   64: astore_3
    //   65: goto -5 -> 60
    //   68: astore 4
    //   70: aload_0
    //   71: astore_3
    //   72: aload 4
    //   74: astore_0
    //   75: goto -23 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	paramContext	Context
    //   0	78	1	paramBoolean	boolean
    //   15	19	2	i	int
    //   1	56	3	localContext1	Context
    //   64	1	3	localIOException	java.io.IOException
    //   71	1	3	localContext2	Context
    //   68	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	37	java/lang/Exception
    //   18	23	37	java/lang/Exception
    //   42	46	47	java/io/IOException
    //   2	10	49	finally
    //   27	31	62	java/io/IOException
    //   56	60	64	java/io/IOException
    //   18	23	68	finally
  }
}