import java.io.FileInputStream;
import java.util.Properties;

/*
 * Copyright (C) 2003-2010 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * Oct 22, 2010  
 * class nay goi la lop triu tuong vi no co tu khoa abstract, no dung de the hien su khac nhau giua 
 * interface va abstract. Ban chat no van co the implements tu 1 interface nhung no co the cai dat 
 * hoac khong cai dat cac phuong thuc cua interface
 */
public abstract class DataProvider  implements DataLoader{
 
 
  public static final String MINUS = "-".intern();
  
  
  /**
   * Ham nay hoan toan duoc cai dat tai class nay day la diem khac biet chu yeu cua abstract class
   * cac ham cai dat hoac dinh nghia deu co the dung tat ca cac tu khoa nhu : protected, public, private ..
   * @param d
   * @param filePath
   * @return
   * @throws Exception
   */
  protected Data mappingData(Data d , String filePath) throws Exception{
    
    
    
    if(Data.TYPE_XML.equals(d.getDatatype())) {
    System.out.println("\n\n load data from xml data:  " + filePath);
    Properties prop = new Properties();
    prop.loadFromXML(new FileInputStream(filePath));
    
    d.giaidacbiet[0] = Long.valueOf(prop.getProperty(Data.KEY_DB));
    
    d.giainhat[0] = Long.valueOf(prop.getProperty(Data.KEY_NHAT));
    
    d.giainhi[0] = Long.valueOf(prop.getProperty(Data.KEY_NHI).split(MINUS)[0].trim());
    d.giainhi[1] = Long.valueOf(prop.getProperty(Data.KEY_NHI).split(MINUS)[1].trim());
    
    d.giaiba[0] = Long.valueOf(prop.getProperty(Data.KEY_BA).split(MINUS)[0].trim());
    d.giaiba[1] = Long.valueOf(prop.getProperty(Data.KEY_BA).split(MINUS)[1].trim());
    d.giaiba[2] = Long.valueOf(prop.getProperty(Data.KEY_BA).split(MINUS)[2].trim());
    d.giaiba[3] = Long.valueOf(prop.getProperty(Data.KEY_BA).split(MINUS)[3].trim());
    d.giaiba[4] = Long.valueOf(prop.getProperty(Data.KEY_BA).split(MINUS)[4].trim());
    d.giaiba[5] = Long.valueOf(prop.getProperty(Data.KEY_BA).split(MINUS)[5].trim());
    
    d.giaitu[0] = Long.valueOf(prop.getProperty(Data.KEY_TU).split(MINUS)[0].trim());
    d.giaitu[1] = Long.valueOf(prop.getProperty(Data.KEY_TU).split(MINUS)[1].trim());
    d.giaitu[2] = Long.valueOf(prop.getProperty(Data.KEY_TU).split(MINUS)[2].trim());
    d.giaitu[3] = Long.valueOf(prop.getProperty(Data.KEY_TU).split(MINUS)[3].trim());
    
    
    d.giainam[0] = Long.valueOf(prop.getProperty(Data.KEY_NAM).split(MINUS)[0].trim());
    d.giainam[1] = Long.valueOf(prop.getProperty(Data.KEY_NAM).split(MINUS)[1].trim());
    d.giainam[2] = Long.valueOf(prop.getProperty(Data.KEY_NAM).split(MINUS)[2].trim());
    d.giainam[3] = Long.valueOf(prop.getProperty(Data.KEY_NAM).split(MINUS)[3].trim());
    d.giainam[4] = Long.valueOf(prop.getProperty(Data.KEY_NAM).split(MINUS)[4].trim());
    d.giainam[5] = Long.valueOf(prop.getProperty(Data.KEY_NAM).split(MINUS)[5].trim());
    
    d.giaisau[0] = Long.valueOf(prop.getProperty(Data.KEY_SAU).split(MINUS)[0].trim());
    d.giaisau[1] = Long.valueOf(prop.getProperty(Data.KEY_SAU).split(MINUS)[1].trim());
    d.giaisau[2] = Long.valueOf(prop.getProperty(Data.KEY_SAU).split(MINUS)[2].trim());
    
    d.giaibay[0] = Long.valueOf(prop.getProperty(Data.KEY_BAY).split(MINUS)[0].trim());
    d.giaibay[1] = Long.valueOf(prop.getProperty(Data.KEY_BAY).split(MINUS)[1].trim());
    d.giaibay[2] = Long.valueOf(prop.getProperty(Data.KEY_BAY).split(MINUS)[2].trim());
    d.giaibay[3] = Long.valueOf(prop.getProperty(Data.KEY_BAY).split(MINUS)[3].trim());
      
    System.out.println("\n\n data loaded !  " );
    
    } else if(Data.TYPE_ACESS.equals(d.getDatatype())) {
      System.out.println("\n\n load data from access data here");
    }
    return d;
  }
  
  /**
   * cac ban hoan toan co the dinh nghia mot ham private dieu nay interface khong the lam duoc
   */
  private void coutMydata() {
    System.out.println("\n\n ham nay dung rieng cho abstract class !");
  }

}
