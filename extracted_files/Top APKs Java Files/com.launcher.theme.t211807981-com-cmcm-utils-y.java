package com.cmcm.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.cmcm.adsdk.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class y
{
  private static y ᵢᵢ = new y();
  private Context ˋˋ = b.ᵢᵢ();
  private Object ˑˉ = new Object();
  private List ـˏ;
  private PackageManager ـᵢ = this.ˋˋ.getPackageManager();
  
  public y() {}
  
  public static y ᵢᵢ()
  {
    try
    {
      y localY = ᵢᵢ;
      return localY;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  private List ᵢᵢ(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/cmcm/utils/y:ˑˉ	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 46	com/cmcm/utils/y:ـˏ	Ljava/util/List;
    //   11: ifnonnull +15 -> 26
    //   14: aload_0
    //   15: aload_0
    //   16: getfield 38	com/cmcm/utils/y:ـᵢ	Landroid/content/pm/PackageManager;
    //   19: iload_1
    //   20: invokevirtual 51	android/content/pm/PackageManager:getInstalledPackages	(I)Ljava/util/List;
    //   23: putfield 46	com/cmcm/utils/y:ـˏ	Ljava/util/List;
    //   26: aload_2
    //   27: monitorexit
    //   28: aload_0
    //   29: getfield 46	com/cmcm/utils/y:ـˏ	Ljava/util/List;
    //   32: areturn
    //   33: astore_3
    //   34: aload_2
    //   35: monitorexit
    //   36: aload_3
    //   37: athrow
    //   38: astore_2
    //   39: goto -11 -> 28
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	y
    //   0	42	1	paramInt	int
    //   38	1	2	localException	Exception
    //   33	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   7	26	33	finally
    //   26	28	33	finally
    //   34	36	33	finally
    //   0	7	38	java/lang/Exception
    //   36	38	38	java/lang/Exception
  }
  
  public List ᵢᵢ(boolean paramBoolean)
  {
    Object localObject2 = ᵢᵢ(0);
    if ((localObject2 == null) || (((List)localObject2).isEmpty())) {
      return null;
    }
    synchronized (this.ˑˉ)
    {
      Object localObject3 = new ArrayList((Collection)localObject2);
      ArrayList localArrayList = new ArrayList();
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        localObject2 = ((List)localObject3).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (PackageInfo)((Iterator)localObject2).next();
          if ((paramBoolean) || (a.ᵢᵢ(((PackageInfo)localObject3).applicationInfo))) {
            localArrayList.add(((PackageInfo)localObject3).packageName);
          }
        }
      }
    }
    return localList;
  }
  
  public void ᵢᵢ(String paramString)
  {
    for (;;)
    {
      int i;
      synchronized (this.ˑˉ)
      {
        if (this.ـˏ != null)
        {
          i = 0;
          if (i < this.ـˏ.size())
          {
            if (!((PackageInfo)this.ـˏ.get(i)).packageName.equals(paramString)) {
              break label71;
            }
            this.ـˏ.remove(i);
          }
        }
        return;
      }
      label71:
      i += 1;
    }
  }
  
  public void ᵢᵢ(String paramString, Context paramContext)
  {
    for (;;)
    {
      try
      {
        int i;
        synchronized (this.ˑˉ)
        {
          if (this.ـˏ != null)
          {
            paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
            i = 0;
            if (i < this.ـˏ.size())
            {
              if (((PackageInfo)this.ـˏ.get(i)).packageName.equals(paramString)) {
                this.ـˏ.remove(i);
              }
            }
            else {
              this.ـˏ.add(paramContext);
            }
          }
          else
          {
            return;
          }
        }
        i += 1;
      }
      catch (Exception paramString)
      {
        return;
      }
    }
  }
}
