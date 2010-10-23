import java.text.SimpleDateFormat;
import java.util.Date;


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
 * Oct 23, 2010  
 * chuong trinh chinh nen tach ra chi dung de tao va goi cac class doi tuong
 * khong nen gop phan tinh toan vao chuong trinh chinh
 */
public class Run {

  public static void main (String[] args) {
    if(args.length <= 0) {
      System.out.println("\n\n ban phai nhap kieu du lieu xml hoac access");
      return ;
    } else {
      if(!Data.TYPE_XML.equalsIgnoreCase(args[0]) || Data.TYPE_ACESS.equalsIgnoreCase(args[0])) return ;
    }
      
    Data d = new Data(args[0].toLowerCase()) ;
    try {
      
      /**
       * Doan code nay the hien tinh da hinh` trong java 
       * ta dung class abstract cha DataProvider de khai bao kieu cho doi tuong dl
       */
      DataProvider dl = null ;
      if(Data.TYPE_XML.equalsIgnoreCase(d.getDatatype())) {
        /**
         *  Tuy thuoc vao dieu kien cua cau if ta se co 1 doi tuong khoi tao theo 
         *  ngu canh su dung nao day , vi du o day ta co 1 instance object la XMLDataProvider
         */
        
        dl = new XMLDataProvider() ;
      } else if (Data.TYPE_ACESS.equalsIgnoreCase(d.getDatatype()) ) {
        /**
         *  Tuy thuoc vao dieu kien cua cau if ta se co 1 doi tuong khoi tao theo 
         *  ngu canh su dung nao day , vi du o day ta co 1 instance object la ACCESSDataProvider
         */
        dl = new ACCESSDataProvider() ;
      }
     
      /**
       * den phan nay ta goi ham da cai dat o abstract class 1 cach don gian vi o instance object nao
       * ta deu goi duoc ham nay vi ham nay ke thua ti lop cha
       */
      d = dl.mappingData(d, "xmldata.xml");
    
     
      d.tinhtoanSodara();
      
      System.out.println("\n");
      System.out.println("Ket qua ngay " + new SimpleDateFormat("dd/MM/yyy").format(new Date()));
      for(long i : d.getCapsodara()) {
        System.out.print(i + " ");
      }
      
     d.capnhatSodara();
      
      System.out.println("\n");
      System.out.println("Nhung so theo mu : ");
      
      for(long i : d.getTempdata().keySet()) {
        if(d.getTempdata().get(i) > 0)
        System.out.print(i + "x" + d.getTempdata().get(i) + " ");
      }
      
      System.out.println("\n");
      System.out.println("Nhung so chua ve : ");
      
      for(long i : d.getTempdata().keySet()) {
        if(d.getTempdata().get(i) == 0)
        System.out.print(i + " ");
      }
      System.out.println("\n");
      System.out.println("\n\n Ket thuc chuong trinh ! Chuc cac ban may man lan sau !");
      
      /**
       * ket thuc chuong trinh ta van co the goi ham save du lieu xuong 
       * vi cac ham nay hoan toan da duoc cai dat o interface du cho doi tuong moi duoc 
       * tao la gi di nua
       */
      dl.saveData(d) ;
      //Hoac la 
      dl = new ACCESSDataProvider() ;      
      dl.saveData(d) ;
      
      
    } catch (Exception e) {
      System.out.println("\n\n khong lay duoc data ");
      e.printStackTrace();
      return;
    }


   

  }

}
